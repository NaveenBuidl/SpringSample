package com.scaler.SampleDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// above annotation obviates the need for developer controlling the objects and injecting dependencies
// Spring initialised the controller
public class HelloController {

    // GET call -> /hello -> Hello World
    // basically if someone does an HTTP GET call to /hello they
    // should get Hello World with a status code of ->200 OK
    @GetMapping("/hello")
    // public void helloWorld() {
    public ResponseEntity helloWorld() {
        // String hello = "Naveen! Hello World";
        // return ResponseEntity.ok(hello);
        Person p = new Person("Naveen", "Hello World" );
        return ResponseEntity.ok(p);
    }
}
