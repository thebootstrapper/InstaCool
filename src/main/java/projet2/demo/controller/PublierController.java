package projet2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static projet2.demo.controller.LoginController.idCurrentUser;

@Controller
public class PublierController {
    @RequestMapping(value="publier",method = RequestMethod.GET)
    protected String loginGet(
            Model model
    ) throws Exception {


        if (idCurrentUser==0)
            return "redirect:/login";

        System.out.print("dans le controller publier");
        return "publier";
    }
}
