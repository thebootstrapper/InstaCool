package projet2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import projet2.demo.MotForm;
import projet2.demo.dao.PhotoDao;
import projet2.demo.dao.UserDao;
import projet2.demo.entity.Photo;
import projet2.demo.entity.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static projet2.demo.controller.LoginController.idCurrentUser;

@Controller
public class researchController {
    @Autowired
    UserDao userDao;
    @Autowired
    PhotoDao photoDao;

    @RequestMapping(value="search",method = RequestMethod.GET)
    protected String searchGet(
            Model mv
    ) throws Exception {


        if (idCurrentUser==0)
            return "redirect:/login";

        System.out.print("dans le controller search");
        MotForm motForm = new MotForm("");
        mv.addAttribute("motForm",motForm);

        List TabUser = new ArrayList<User>();
        mv.addAttribute("TabUser",TabUser);
        return "search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("motForm")MotForm motForm,
                         BindingResult result, ModelAndView model) {


        List TabUser = new ArrayList<User>();
        List TabNbPublications = new ArrayList<Integer>();
        try{
            System.out.print("\n le mot a rechercher est:"+motForm.getMot().toString()+"\n");

            if(  motForm.getMot()!=""){
                Iterable<User> itUser = userDao.recherche(motForm.getMot());


                System.out.print("\n Resultats de la rehercehe :"+itUser.toString()+"\n");

                int nbPublication=0;
                for( User u : itUser){
                    TabUser.add(u);
                    for (Photo p :photoDao.findByIdUser(u.getId())){
                        nbPublication++;
                    }
                    TabNbPublications.add(nbPublication);
                    nbPublication=0;
                }
            }
            else{

                System.out.print("\n mot VIDE! \n");
            }
        }
        catch (Exception e){
            System.out.print("\n"+" Exception lors de la rechreche avec le mot :" +motForm.getMot() +"\n");
            System.out.print(e.getMessage());
        }
        model.addObject("TabUser",TabUser);
        model.addObject("TabNbPublications",TabNbPublications);


        model.setViewName("search");
        return model;

        }

}
