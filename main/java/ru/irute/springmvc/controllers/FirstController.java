package ru.irute.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// при добавлении @RequestMapping("/first") адрес к методу контроллера FirstController  будет /first/hello
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value ="name", required = false) String name,
                            @RequestParam(value ="surname", required = false) String surname,
                            Model model){
        //System.out.println("hello, "+name+ " "+surname);

        // обратимся к  Model  и положим пару ключ-значение в эту модель с помощью метода
        //addAttribute, получим отображение данных ключ "massage"- значение("hello, "+name+ " "+surname) с помощью th
        model.addAttribute("massage", "hello, "+name+ " "+surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
