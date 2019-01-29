package thingy.temp.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Yaaaay");
    }
}