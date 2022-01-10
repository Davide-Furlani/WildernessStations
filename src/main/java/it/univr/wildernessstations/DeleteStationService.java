package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

public class DeleteStationService implements BaseService{

    private final StationRepository stationRepository;
    private final Model model;
    private final long id;

    public DeleteStationService(StationRepository stationRepository, long id, Model model) {
        this.stationRepository = stationRepository;
        this.model = model;
        this.id = id;
    }

    public String serve() {
        stationRepository.deleteById(id);
        model.addAttribute("stations", stationRepository.findAll());
        return "homepage";
    }

}