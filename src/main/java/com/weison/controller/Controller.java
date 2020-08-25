package com.weison.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping(path = "/users", consumes = "application/json")
    public String queryUsers(@RequestBody String userName) {
        log.info("-------users--------");
        return "";
    }
}
