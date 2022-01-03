package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

public class StationService implements BaseService{

    private final StationRepository stationRepository;
    private final Model model;
    private final long id;

    public StationService(StationRepository stationRepository, long id, Model model) {
        this.stationRepository = stationRepository;
        this.model = model;
        this.id = id;
    }

    public String serve() {
        model.addAttribute("station", stationRepository.findById(id));
        return "station";
    }

}
