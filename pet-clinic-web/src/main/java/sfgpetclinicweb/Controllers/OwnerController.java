package sfgpetclinicweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgpetclinicweb.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerMapService;

    public OwnerController(OwnerService ownerMapService){
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
