package ru.irute.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    // аннотация GetMapping передает URL адрес, который будет переходить в этот метод контроллера

    @GetMapping("/hello-world")
    public String sayHallo(){
        // в этом методе можем перенаправлять куда либо, обращаться к модели, доставать данные из базы данных
        return "hello_world";
    }
}
