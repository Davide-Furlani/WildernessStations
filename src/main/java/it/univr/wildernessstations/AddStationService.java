package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

public class AddStationService implements BaseService{

    private final StationRepository stationRepository;
    private final String name;
    private final Double latitude;
    private final Double longitude;
    private final Model model;

    public AddStationService(StationRepository stationRepository, String name, Double latitude, Double longitude, Model model) {
        this.stationRepository = stationRepository;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.model = model;
    }

    @Override
    public String serve() {
        Station s = new Station(name, longitude, latitude, false);
        s = stationRepository.save(s);
        model.addAttribute("station", s);
        return "station";
    }
}
