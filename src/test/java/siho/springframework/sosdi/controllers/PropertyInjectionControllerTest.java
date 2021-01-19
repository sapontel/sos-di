package siho.springframework.sosdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import siho.springframework.sosdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
