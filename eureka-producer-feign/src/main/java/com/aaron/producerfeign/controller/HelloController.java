package com.aaron.producerfeign.controller;

import com.aaron.producerfeign.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }

}
