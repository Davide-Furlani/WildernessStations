package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.MeasurementsRepository;
import org.springframework.ui.Model;

public class InfoDataService implements BaseService{

    private final MeasurementsRepository measurementsRepository;
    private final Model model;

    public InfoDataService(MeasurementsRepository measurementsRepository, Model model) {
        this.measurementsRepository = measurementsRepository;
        this.model = model;
    }

    public String serve() {

        model.addAttribute("msCount", measurementsRepository.findAll().size());
        model.addAttribute("minTemp", measurementsRepository.getMinTemperature());
        model.addAttribute("maxTemp", measurementsRepository.getMaxTemperature());
        model.addAttribute("avgTemp", measurementsRepository.getAvgTemperature());
        model.addAttribute("minAtmP", measurementsRepository.getMinAtmpressure());
        model.addAttribute("maxAtmP", measurementsRepository.getMaxAtmpressure());
        model.addAttribute("avgAtmP", measurementsRepository.getAvgAtmpressure());
        model.addAttribute("minWS", measurementsRepository.getMinWindspeed());
        model.addAttribute("maxWS", measurementsRepository.getMaxWindspeed());
        model.addAttribute("avgWS", measurementsRepository.getAvgWindspeed());
        model.addAttribute("stCount", measurementsRepository.countDistinctStation());

        return "infoData";
    }

}
