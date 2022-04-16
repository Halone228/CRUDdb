package own.halone.cruddb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;
import own.halone.cruddb.DataBase.Users.User;
import own.halone.cruddb.DataBase.Users.UserServiceImpl;


@Controller
public class GetControllers {
    @Autowired private UserServiceImpl userService;
    @GetMapping("/")
    public String mainView(Model model){
        model.addAttribute("users",userService.getAll());
        return "main";
    }
    @GetMapping("/create")
    public String createView(){return "create";}
    @GetMapping("/delete/{id}")
    public RedirectView deleteUser(@PathVariable(name="id") long id){
        User user = userService.getById(id).orElse(new User());
        userService.delete(user);
        return new RedirectView("/");
    }
    @GetMapping("/update/{id}")
    public String updateView(@PathVariable(name="id") long id,Model model){
        model.addAttribute("user",userService.getById(id).get());
        return "update";
    }
}
