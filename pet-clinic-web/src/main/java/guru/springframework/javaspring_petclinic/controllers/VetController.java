package guru.springframework.javaspring_petclinic.controllers;

import guru.springframework.javaspring_petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets")
    public String listVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
