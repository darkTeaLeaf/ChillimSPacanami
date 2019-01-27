package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    private final VisitsRepository visitsRepository;
    private final UserService userService;

    public IndexController(VisitsRepository visitsRepository, UserService userService) {
        this.visitsRepository = visitsRepository;
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public User regForm(@RequestBody User user) {
        try {
            System.out.print(user.login);
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

//    @GetMapping("/registration")
//    public ModelAndView addStudent(){
//        Map<String, String> model = new HashMap<>();
//        model.put("responce", "Added");
//        return new ModelAndView("registration.html", model);
//    }

//    @PostMapping("/registration")
//    public ModelAndView addStudent(@ModelAttribute User user){
//      System.out.println(user);
//        userService.addUser(user);
//        Map<String, String> model = new HashMap<>();
//        model.put("response", "Added");
//        return new ModelAndView("index.html", model);
//    }


//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public ModelAndView index(User user) {
//        userService.addUser(user);
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "Alexey");
//        return new ModelAndView("index", model);

//    }

//    @PostMapping("/")
//    public ModelAndView index(User user) {
//        System.out.print(user.login);
//        userService.addUser(user);
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "Alexey");
//        return new ModelAndView("index", model);
//    }
//
//    @GetMapping("/")
//    public ModelAndView index() {
//        Map<String, Iterable> model = new HashMap<>();
//        Iterable <User> list = userService.fetchAll();
//        model.put("name", list);
//        return new ModelAndView("index", model);
//    }
}
