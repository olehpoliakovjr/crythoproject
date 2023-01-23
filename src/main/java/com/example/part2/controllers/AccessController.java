package com.example.part2.controllers;

import com.example.part2.models.CryptoUser;
import com.example.part2.repositories.CryptoUserRepository;
import com.example.part2.repositories.TokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class AccessController {
    @Autowired
    CryptoUserRepository cryptoUserRepository;
    private final TokenRepository tokenRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("login")
    public String login(){
        return "authorize";
    }

    @PostMapping("loggedHome")
    public String logging(String email, String password,Model model) {
     try {
         if (cryptoUserRepository.findByEmail(email).getPass().equals(password) && cryptoUserRepository.findByEmail(email).getEmail().equals(email)) {
             model.addAttribute("username", cryptoUserRepository.findByEmail(email).getUsername());
             return "loggedHome";
         }
     }catch (Exception e){
         e.printStackTrace();
     }
        return "usernotfound";
    }


    @GetMapping("logged")
    public String logged(@ModelAttribute("email") String email){
        return "loggedHome";
    }

    @GetMapping("signup")
    public String registration(Model model){
        model.addAttribute("newUser", new CryptoUser());
        return "registration";
    }


    @PostMapping("/save")
    public String create (@ModelAttribute("newUser") CryptoUser cryptoUser){
        cryptoUser.setRoles("ROLE_USER");
        cryptoUserRepository.save(cryptoUser);
        return "redirect:/login";
    }

    @GetMapping("tokens")
    public String login(Model model){
        model.addAttribute("tokens",tokenRepository.findAll());
        return "tokens";
    }


}
