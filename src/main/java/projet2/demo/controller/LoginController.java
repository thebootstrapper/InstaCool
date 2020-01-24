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

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    public static long idCurrentUser=0;

    @Autowired
    private UserDao userDao;


    @RequestMapping(value="login",method = RequestMethod.GET)
    protected ModelAndView loginGet(
//            Map<String, Object> model
    ) throws Exception {
        System.out.print("dans le controller login");
        ModelAndView mv = new ModelAndView();
        mv.addObject("userForm",new User());
        mv.addObject("message",new String(""));
        mv.setViewName("login");
        return mv;
    }


    @RequestMapping(value="login",method = RequestMethod.POST)
    protected  String loginPost(@ModelAttribute("userForm") User user, BindingResult result, Model model) {

//       sessoin.add(message)
//        HttpSession session = request.getSession( true );

        User currentUser=null;
        try{
            currentUser= userDao.findByEmailAndPassword(user.getEmail(),user.getPassword());

        }catch (Exception e){
            System.out.println("DAns le catche ");
        }

        if ( currentUser!=null) {
            System.out.println("CURRENTE USER =" + currentUser);
            System.out.println("valilder");
            idCurrentUser=currentUser.getId();
//           session ( isconnected=true)
            return "redirect:/";
        }
        else{
            System.out.println(" NON valilder");
            String message = "Vos identifiants sont incorrects !";
//            String message = user.toString();
//             this.CreateGet(message);
//            session ( isconnected=false)
            model.addAttribute("message",message);
//            model.addAttribute("message",new String("Vos identifiants sont incorrectes!"));
            return "login";
        }
    }

}
