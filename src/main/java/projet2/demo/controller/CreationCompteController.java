package projet2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import projet2.demo.dao.UserDao;
import projet2.demo.entity.User;

@Controller
public class CreationCompteController {


    @Autowired
    private UserDao userDao;

    @RequestMapping(value="creationCompte",method = RequestMethod.GET)
    protected ModelAndView createGet(
//            Map<String, Object> model
            String message
    ) throws Exception {
        System.out.print("dans le controller compte creation");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("creationCompte");
        mv.addObject("userForm",new User());
        return mv;
    }

    @RequestMapping(value="creationCompte",method = RequestMethod.POST)
    protected  String CreatePost(@ModelAttribute("userForm") User user, BindingResult result, Model model) {

//       sessoin.add(message)

        User userCreated=null;
        try{
            userCreated=userDao.save(user);
        }catch (Exception e){

        }

        if (userCreated!=null) {
            System.out.println("valilder");
//           session ( isconnected=true)
            return "redirect:/login";
        } else {
            System.out.println(" NON valilder");
//            String message = "Vos identifiants sont incorrects !";
            String message = user.toString();
//             this.CreateGet(message);
//            session ( isconnected=false)
//            model.addAttribute("message",message);
//            model.addAttribute("message",new String("Vos identifiants sont incorrectes!"));
            return "login";
        }
    }

}
