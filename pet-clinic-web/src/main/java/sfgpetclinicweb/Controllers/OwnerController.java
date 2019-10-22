package sfgpetclinicweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgpetclinicweb.servicces.map.OwnerMapService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService){
        this.ownerMapService=ownerMapService;
    }

   /* @RequestMapping({"","/","index","index.html"})
    public String getListOfOwner(Model model) {
        model.addAttribute("owners",ownerMapService.findAll());
        return "owner/index";
    }*/

    @RequestMapping("/find")
    public String getAllOwnersList(Model model){
        System.out.println("Check :");
        model.addAttribute("owners",ownerMapService.findAll());
        return "owner/index";
    }
}
