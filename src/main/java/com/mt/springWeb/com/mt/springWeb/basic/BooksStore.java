package com.mt.springWeb.com.mt.springWeb.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksStore {
    @RequestMapping(value = "/recommended")
    public List<String> readingList(){
        List<String> result = new ArrayList<>();
        result.add("Gand of four");
        result.add("Effective java");
        result.add("Domain Driven Design");
        result.add("Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)");

        return result;
    }
}
