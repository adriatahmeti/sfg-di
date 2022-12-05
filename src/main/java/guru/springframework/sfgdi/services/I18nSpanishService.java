package guru.springframework.sfgdi.services;

//@Service("i18nService")
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
