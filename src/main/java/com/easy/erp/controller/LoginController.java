package com.easy.erp.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping(value = { "/", "/login" })
    public ModelAndView login(@RequestParam(value = "error", defaultValue = "false") boolean loginError, ModelMap model,
                              HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();

        HttpSession session = request.getSession();
        //String userName = getUserName(session);
        if (loginError) {
//            if (StringUtils.isNotEmpty(userName) && userService.loginDisabled(userName)) {
//                model.addAttribute("accountLocked", Boolean.TRUE);
//                modelAndView.setViewName("login");
//                return modelAndView;
//            }
        }

        modelAndView.setViewName("/auth/login");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView loginPost() {
        System.out.println("Login POST");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/home");
        return modelAndView;
    }


}
