package projet2.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import projet2.demo.dao.AmiDao;
import projet2.demo.dao.PhotoDao;
import projet2.demo.dao.UserDao;
import projet2.demo.entity.Photo;
import projet2.demo.entity.User;

import static projet2.demo.controller.LoginController.idCurrentUser;


@Controller
public class HomeController {


    @Autowired
    private UserDao userDao;

    @Autowired
    private PhotoDao photoDao;

    @Autowired
    private AmiDao amiDao;



    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Map<String, Object> model) throws Exception {
        if (idCurrentUser==0)
            return "redirect:/login";
        System.out.print("dans le controller index");

        try{

            /*
           Photo photo =photoDao.save(new Photo(18,"photo1.jpg","alt","jpg","date"));
           Photo photo2 =photoDao.save(new Photo(18,"photo2.jpg","alt","jpg","date"));
           Photo photo3 =photoDao.save(new Photo(18,"photo3.jpg","alt","jpg","date"));
           Photo photo4 =photoDao.save(new Photo(18,"photo4.jpg","alt","jpg","date"));
           Photo photo5 =photoDao.save(new Photo(18,"photo5.jpg","alt","jpg","date"));
*/
            List<Photo> TabPhoto = new ArrayList<Photo>();
            List<User>  TabUser =  new ArrayList<User>();
            ;
           Iterable<Photo> itPhoto =photoDao.findAll();
              System.out.print("lz nmbre de photos:"+ itPhoto.toString());
           for( Photo p : itPhoto){
               try {
                   TabPhoto.add(p);
                   TabUser.add(userDao.findUserById(p.getIdUser()));
               }catch (Exception ex){
                   System.out.print("dans l eception lors de la rechrche de l user coorespoindant à la photo");
                   System.out.print(ex.getMessage());
               }
           }

            System.out.print("lz nmbre de photos:"+ TabPhoto.size());
//             System.out.print(" PHTOTOS : "+it);

            Iterable<User> it = userDao.findAll();
//            User user = userDao.save( new User("noim","prenllnl","emaklll","pswwwd"));
//            System.out.print(user);
//            mv.addObject("name",user);
//            String display = user.toString();



//            String display = it.toString();
            model.put("TabPhoto",TabPhoto);
            model.put("TabUser",TabUser);
            model.put("currentUser",userDao.findUserById(idCurrentUser));
        }
        catch (Exception e){
            System.out.print("dans l eception");
            System.out.print(e.getMessage());
        }
        return "index";
    }
/*

   @PostMapping(value="/user")
    public ModelAndView doActions(
            @ModelAttribute("user") User user
//            @ModelAttribute String nom
//            BindingResult result
           ,  Map<String, Object> map
   ){

//        System.out.print("\n"+ user.toString()+"\n");
        System.out.print("\n"+  user.toString() +"\n");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("user", user.toString() );
//       mv.  ("name",user.toString());
        return mv;
//        return "index";
    }
*/



   @RequestMapping(value="/deconnexion")
   public ModelAndView deconnexion(){
       idCurrentUser=0;
       ModelAndView mv = new ModelAndView();
       mv.setViewName("redirect:login");
       return mv;
        }


}
