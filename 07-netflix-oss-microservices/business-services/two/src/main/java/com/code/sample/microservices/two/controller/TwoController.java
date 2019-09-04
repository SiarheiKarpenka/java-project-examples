package com.code.sample.microservices.two.controller;

import com.code.sample.microservices.two.TwoServiceAPI;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController implements TwoServiceAPI {

    @Override
    public String getSomething1(@PathVariable("id") String id) {
        return "{result:2.1}";
    }

    @Override
    public String getSomething2(@PathVariable("id") String id) {
        return "{result:2.2}";
    }
}
