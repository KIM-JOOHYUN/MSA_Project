package gcu.kakao.hellomsa.serviceb.Controller;

import gcu.kakao.hellomsa.serviceb.Service.Bservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bcontroller {
    @Autowired
    private Bservice bservice;

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        return bservice.hello(user);
    }

    @RequestMapping("/")
    public String hellob(){
        return "hellob";
    }
}
