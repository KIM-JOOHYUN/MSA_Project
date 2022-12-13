package gcu.kakao.hellomsa.servicea.Service;

import org.springframework.stereotype.Service;

@Service
public class Aservice {
    public String hello(String userId){
        return "Hello, "+userId+"!! Nice to meet you~ This is A RESTFUL API :)";
    }
}
