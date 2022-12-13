package gcu.kakao.hellomsa.serviceb.Service;

import org.springframework.stereotype.Service;

@Service
public class Bservice {
    public String hello(String userId){
        return "Bye, "+userId+"!! See you next time~ This is B RESTFUL API:)";
    }
}
