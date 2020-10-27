package dc2.example.didemo.controllers;

import dc2.example.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getMessage(){
        return greetingService.sayGreeting();
    }
}
