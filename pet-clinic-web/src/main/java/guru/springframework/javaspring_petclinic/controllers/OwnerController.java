package guru.springframework.javaspring_petclinic.controllers;

import guru.springframework.javaspring_petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/owners")
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/owners/find", "/oups"})
    public String findOwners() {
//        model.addAttribute("find", ownerService.findByLastName())

        return "notImplemented";
    }
}
