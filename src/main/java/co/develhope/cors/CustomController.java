package co.develhope.cors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = {"http://localhost:3000"})
public class CustomController {


    @GetMapping("/custom")
    public String getCustom(){
        return "Hello from custom";
    }

}