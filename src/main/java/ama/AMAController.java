package ama;

import ama.Model.AMA;
import ama.Model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AMAController {

    @GetMapping("/")
    public String getHomePage() {
        return "AMAHomePage";
    }

    @GetMapping("/create")
    public String getCreationPage(Model m) {
        m.addAttribute("questionCategories", Category.getValues());
        m.addAttribute("ama", new AMA());
        return "AMACreationPage";
    }

    @PostMapping("/create")
    public String createAMA(@ModelAttribute(name = "ama") AMA ama) {
        return "AMASoloPage";
    }
}