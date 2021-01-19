package siho.springframework.sosdi.controllers;

import siho.springframework.sosdi.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
