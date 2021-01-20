package siho.springframework.sosdi.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import siho.springframework.sosdi.services.GreetingService;

@Profile({"ES","default"})
//@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
