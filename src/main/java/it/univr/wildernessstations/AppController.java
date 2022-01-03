package it.univr.wildernessstations;

import it.univr.wildernessstations.persistence.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private StationRepository stationRepository;

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/homepage")
    public String homepage(Model model) {
        HomepageService homepageService= new HomepageService(stationRepository, model);
        return homepageService.serve();
    }

    @RequestMapping("/station")
    public String station(@RequestParam(name = "id", required = true) Long id, Model model) {
        StationService stationService= new StationService(stationRepository, id, model);
        return stationService.serve();
    }

}
