package ma.soprabanking.dbep.healthcheck.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/healthCheck")
    public String HealthCheckDemo(){
        return "It is running !";
    }
}
