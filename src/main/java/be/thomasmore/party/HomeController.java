package be.thomasmore.party;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @Value("${value.from.file}")
    private String valueFromFile;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("valueFromFile",valueFromFile);
        return "test";
    }

}
