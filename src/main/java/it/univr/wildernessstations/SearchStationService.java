package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;

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
        Optional<Station> station = Optional.ofNullable(stationRepository.findById(id));
        if (station.isPresent()){
            return String.format("redirect:/station?id=%d", id);
        } else {
            return "stationNotFound";
        }
    }
}
