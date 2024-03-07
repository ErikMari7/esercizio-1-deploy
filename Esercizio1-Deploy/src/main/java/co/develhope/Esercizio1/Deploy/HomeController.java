package co.develhope.Esercizio1.Deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getName(){
        String devName = "Erik";
        return devName;
    }
}
