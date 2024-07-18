package leap.trav_earth.controller;

import leap.trav_earth.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/stay")
    public String stayMainPage() {
        return "stayMainPage";
    }

    @GetMapping("/restaurant")
    public String restaurantMainPage() {
        return "restaurantMainPage";
    }

    @GetMapping("/activity")
    public String activityMainPage() {
        return "activityMainPage";
    }

    @GetMapping("/localActivity")
    public String localActivityMainPage() {
        return "localActivityMainPage";
    }

    @GetMapping("/traffic")
    public String trafficMainPage() {
        return "trafficMainPage";
    }

    @GetMapping("/popUp")
    public String popUpMainPage() {
        return "popUpMainPage";
    }

    @GetMapping("/attraction")
    public String attractionMainPage() {
        return "attractionMainPage";
    }

    @GetMapping("/other")
    public String otherMainPage() {
        return "otherMainPage";
    }

}
