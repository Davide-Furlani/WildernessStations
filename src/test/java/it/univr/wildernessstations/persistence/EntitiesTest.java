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
        List<Station> allStations = stationRepository.findAll();
        assertEquals(allStations.size(), 1);
        assertEquals(allStations.get(0).getLatitude(), 10.0, 0.001);
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
        assertEquals(m.getTimeStamp(), mm.getTimeStamp());
        assertEquals(m.getStation(), mm.getStation());
    }



}
