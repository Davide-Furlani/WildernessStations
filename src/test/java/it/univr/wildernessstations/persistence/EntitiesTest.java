package it.univr.wildernessstations.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EntitiesTest {

    @Autowired
    private StationRepository stationRepository;

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    public void saveStation() {
        Station s = new Station("station_1", 10.0, 10.0, true);
        s = stationRepository.save(s);
        Station res = stationRepository.findById(s.getId());
        assertEquals(res.getName(), s.getName());
        List<Station> allStations = stationRepository.findAll();
        assertEquals(allStations.size(), 1);
        assertEquals(allStations.get(0).getLatitude(), 10.0, 0.001);
    }

}
