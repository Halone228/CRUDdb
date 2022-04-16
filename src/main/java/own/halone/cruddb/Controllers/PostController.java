package own.halone.cruddb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import own.halone.cruddb.DataBase.Users.User;
import own.halone.cruddb.DataBase.Users.UserServiceImpl;

import java.util.HashMap;

@RestController
public class PostController {
    @Autowired private UserServiceImpl userService;
    @PostMapping("/createNew")
    public RedirectView createNew(@ModelAttribute User usr){
        userService.save(usr);
        return new RedirectView("/");
    }
    @PostMapping("/update")
    public RedirectView updateuser(@ModelAttribute User usr){
        userService.save(usr);
        return new RedirectView("/");
    }
}
