package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.Station;
import it.univr.wildernessstations.persistence.StationRepository;

public class AddStationService implements BaseService{

    private final StationRepository stationRepository;
    private final String name;
    private final Double latitude;
    private final Double longitude;

    public AddStationService(StationRepository stationRepository, String name, Double latitude, Double longitude) {
        this.stationRepository = stationRepository;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String serve() {
        Station s = new Station(name, longitude, latitude, false);
        s = stationRepository.save(s);
        return String.format("redirect:/station?id=%d", s.getId());
    }
}
