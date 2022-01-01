package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

public class HomepageService implements BaseService{

    private final StationRepository stationRepository;
    private final Model model;

    public HomepageService(StationRepository stationRepository, Model model) {
        this.stationRepository = stationRepository;
        this.model = model;
    }

    public String serve() {
        model.addAttribute("stations", stationRepository.findAll());
        return "homepage";
    }

}
