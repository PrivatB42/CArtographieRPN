package com.esatic.cartographieprn.Controller;

import com.esatic.cartographieprn.model.Userp;
import com.esatic.cartographieprn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user/save")
    public String saveUser(Userp user) {
        service.saveUser(user);
        return "redirect:/loginc";
    }

    @PostMapping("/loginnn")
    public String getUserByName(Userp user) {
        Userp userbd = service.getUserMail(user);
        if ( userbd == null && user.getPassword() == userbd.getPassword()) {
            System.out.println("not connected");
            return "redirect:/loginc";
        }else{
            System.out.println("connected");
            return "redirect:/enregistrement";
        }
    }

    @GetMapping("/loginc")
    public String loginpage(Model model) {
        model.addAttribute("user", new Userp());
        return "login";
    }

    @GetMapping("/inscription")
    public String inscription(Model model) {
        model.addAttribute("user", new Userp());
        return "signup";
    }

}
