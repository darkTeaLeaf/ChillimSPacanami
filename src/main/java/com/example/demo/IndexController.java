package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
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

        @PostMapping("/")
    public ModelAndView index(User user) {
        System.out.print(user.login);
        userService.addUser(user);
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");
        return new ModelAndView("index", model);
    }

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
