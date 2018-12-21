package gps.initial.springboot2oauth2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ServiceDemoController {
    @RequestMapping("servicio")
    public Date getDate() {
        return new Date();
    }
}
