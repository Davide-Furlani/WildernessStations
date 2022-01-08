package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

import java.util.Optional;

public class SearchStationService implements BaseService {

    private final StationRepository stationRepository;
    private final long id;

    public SearchStationService(StationRepository stationRepository, long id) {
        this.stationRepository = stationRepository;
        this.id = id;
    }

    @Override
    public String serve() {
        if (stationRepository.existsById(id)){
            return String.format("redirect:/station?id=%d", id);
        } else {
            return "stationNotFound";
        }
    }
}
