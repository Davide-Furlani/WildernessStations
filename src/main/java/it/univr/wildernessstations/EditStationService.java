package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.ui.Model;

public class EditStationService implements BaseService{

    private final StationRepository stationRepository;
    private final Model model;
    private final long id;
    private String name;
    private double latitude;
    private double longitude;
    private boolean state;

    public EditStationService(StationRepository stationRepository, long id, Model model) {
        this.stationRepository = stationRepository;
        this.model = model;
        this.id = id;
    }
    public EditStationService(StationRepository stationRepository, long id, String name, double latitude, double longitude, boolean state, Model model) {
        this.stationRepository = stationRepository;
        this.model = model;
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.state = state;
    }

    public String serve() {
        model.addAttribute("station", stationRepository.findById(id));
        return "editStation";
    }

    public String serveInsert(){
        Station s = stationRepository.findById(id);
        s.setId(id);
        s.setName(name);
        s.setLatitude(latitude);
        s.setLongitude(longitude);
        s.setState(state);
        stationRepository.save(s);

        model.addAttribute("station", s);
        return "station";
    }

}
