package gcu.kakao.hellomsa.servicea.Controller;

import gcu.kakao.hellomsa.servicea.Service.Aservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Acontroller {
    
    @Autowired
    private Aservice aservice;

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        return aservice.hello(user);
    }

    @RequestMapping("/")
    public String helloa(){
        return "helloa";
    }
}
