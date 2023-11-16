package primeiro.projeto.projetoinicial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello
 */
@RestController
public class hello {

    @GetMapping(value="/")
    public String getMethodName(){
        return "<button type=\"button\" class=\"btn btn-primary\">Primary</button>";
    }
    
}