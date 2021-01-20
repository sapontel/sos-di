package siho.springframework.sosdi.services;

import org.springframework.stereotype.Service;
import siho.springframework.sosdi.services.GreetingService;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hellor Wporld - Setter";
    }
}
