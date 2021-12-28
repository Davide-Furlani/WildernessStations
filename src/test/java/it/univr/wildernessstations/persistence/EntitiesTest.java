package it.univr.wildernessstations.persistence;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EntitiesTest {

    @Autowired
    private StationRepository stationRepository;

    @Test
    public void saveStation() {
        Station s = new Station("station_1", 10.0, 10.0, true);
        s = stationRepository.save(s);
        Optional<Station> res = stationRepository.findById(s.getId());
        if (res.isPresent()) {
            Station ss = res.get();
            assertEquals(ss.getName(), s.getName());
        } else {
            fail();
        }
    }

}
