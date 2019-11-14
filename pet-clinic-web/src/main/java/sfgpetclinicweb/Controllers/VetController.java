package sfgpetclinicweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgpetclinicweb.servicces.VetService;
import sfgpetclinicweb.servicces.map.VetMapService;

@Controller
@RequestMapping("/vets")
public class VetController {

    private VetService vetMapService;

    public VetController(VetService vetMapService){
        this.vetMapService=vetMapService;
    }

    @RequestMapping({"","/","index","index.html"})
    public String getListOfVets(Model model) {
        model.addAttribute("vets",vetMapService.findAll());
        return "vets/index";
    }
}
