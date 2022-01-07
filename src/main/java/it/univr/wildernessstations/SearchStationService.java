package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

import java.util.Optional;

public class SearchStationService implements BaseService {

    private final StationRepository stationRepository;
    private final long id;
    private final Model model;

    public SearchStationService(StationRepository stationRepository, long id, Model model) {
        this.stationRepository = stationRepository;
        this.id = id;
        this.model = model;
    }

    @Override
    public String serve() {
        Optional<Station> station = Optional.ofNullable(stationRepository.findById(id));
        if (station.isPresent()){
            model.addAttribute("station", station.get());
            return "station";
        } else {
            return "stationNotFound";
        }
    }
}
