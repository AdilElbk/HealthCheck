package ma.soprabanking.dbep.healthcheck.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @Autowired
    private Health health;
    @GetMapping("/home")
    public String home(){
        return "It is running !";
    }
   @GetMapping("/healthcheck")
   public String healthcheck(){
        return health.toString();
   }
}
