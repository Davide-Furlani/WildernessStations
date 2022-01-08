package it.univr.wildernessstations.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EntitiesTest {

    @Autowired
    private StationRepository stationRepository;
    @Autowired
    private MeasurementsRepository measurementsRepository;

    @Test
    public void saveStation() {
        Station s = new Station("station_1", 10.0, 10.0, true);
        s = stationRepository.save(s);
        Station res = stationRepository.findById(s.getId());
        assertEquals(res.getName(), s.getName());
    }

    @Test
    public void allStations() {
        Station s = new Station("station_1", 10.0, 10.0, true);
        stationRepository.save(s);
        List<Station> stations = stationRepository.findAll();
        assertTrue(stations.size() >= 1);
        assertEquals(stations.get(stations.size() - 1).getLatitude(), 10.0, 0.001);
    }

    @Test
    public void existsStation() {
        Station s = new Station("station_1", 10.0, 10.0, true);
        s = stationRepository.save(s);
        assertTrue(stationRepository.existsById(s.getId()));
    }

    @Test
    public void saveMeasurement() {
        Station s = new Station("station_1", 1.0, 1.0, false);
        s = stationRepository.save(s);
        Measurements m = new Measurements(s, 1.0, 1.0, 1.0, new Timestamp(1));
        Measurements mm = measurementsRepository.save(m);
        assertEquals(m.getTemperature(), mm.getTemperature(), 0.001);
        assertEquals(m.getAtmPressure(), mm.getAtmPressure(), 0.001);
        assertEquals(m.getWindSpeed(), mm.getWindSpeed(), 0.001);
        assertEquals(m.getTimestamp(), mm.getTimestamp());
        assertEquals(m.getStation(), mm.getStation());
    }

    @Test
    public void measurementsInfo() {
        double minTemp = 10;
        double maxTemp = 25;
        double avgTemp = 17.26;
        int distinctStations = 10;
        assertEquals(minTemp, measurementsRepository.getMinTemperature(), 0.001);
        assertEquals(maxTemp, measurementsRepository.getMaxTemperature(), 0.001);
        assertEquals(avgTemp, measurementsRepository.getAvgTemperature(), 0.001);
        assertEquals(distinctStations, measurementsRepository.countDistinctStation());
    }

}
