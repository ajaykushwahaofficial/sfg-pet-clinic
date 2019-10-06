package sfgpetclinicweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"","/","index","index.html"})
    public String getListOfVets() {
        System.out.println("request recevied");
        return "vets/index";
    }
}
