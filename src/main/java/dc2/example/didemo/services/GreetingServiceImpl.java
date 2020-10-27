package dc2.example.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_WORD = "Hello word!!!!";
    @Override
    public String sayGreeting() {
        return HELLO_WORD;
    }
}
