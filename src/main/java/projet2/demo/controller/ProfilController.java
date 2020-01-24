package projet2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import projet2.demo.dao.PhotoDao;
import projet2.demo.dao.UserDao;
import projet2.demo.entity.Photo;
import projet2.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

import static projet2.demo.controller.LoginController.idCurrentUser;

@Controller
public class ProfilController {

    @Autowired
    PhotoDao photoDao;

    @Autowired
    UserDao userDao;


    @RequestMapping(value="profil",method = RequestMethod.GET)
    protected String loginGet( @RequestParam("id") long id,
            Model model
    ) throws Exception {


        if (idCurrentUser==0)
            return "redirect:/login";

        List<Photo> TabPhoto = new ArrayList<Photo>();
        int nbLigne=0;
        int nbPublication=0;
        User user=null;


        System.out.print("\ndans le controller profil:"+id+"\n");
        System.out.print("\ndans le controller profil:"+id+"\n");

        try{


            Iterable<Photo> itPhoto = photoDao.findByIdUser(id);
            for( Photo p : itPhoto){
                TabPhoto.add(p);
            }


            if(TabPhoto.size() % 2 == 0 )
                nbLigne= TabPhoto.size() / 2 ;
            else
                nbLigne=TabPhoto.size() /2 +1;

            nbPublication=TabPhoto.size();

            user = userDao.findUserById(id);


        }catch (Exception e){
            System.out.print("dans l eception lors de la rechrche des photos de l user");
            System.out.print(e.getMessage());
        }


        model.addAttribute("TabPhoto",TabPhoto);
        model.addAttribute("nbLigne",nbLigne);
        model.addAttribute("nbPublication",nbPublication);
        model.addAttribute("user",user);
//        mv.addObject("index",0);
        return "profilPage";
    }
}
