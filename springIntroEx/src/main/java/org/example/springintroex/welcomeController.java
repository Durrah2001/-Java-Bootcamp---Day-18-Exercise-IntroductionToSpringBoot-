package org.example.springintroex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {


    @GetMapping(path = "/name")
    public String name(){
        return "My name is Durrah";
    }


    @GetMapping(path = "/age")
    public String age(){
        return "My age is 22";
    }

    @GetMapping(path = "/check/status")
    public String checkStatus(){
        return "Everything is OK";
    }

    @GetMapping(path = "/health")
    public String checkHealth(){
        return "Server health is up and running";
    }


    String [] arrNames = {"Durrah", "Nada", "Dema"};

    @GetMapping(path = "/names")
    public String [] names(){
        return arrNames;
    }













}
