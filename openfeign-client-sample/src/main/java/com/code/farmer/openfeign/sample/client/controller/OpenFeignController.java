package com.code.farmer.openfeign.sample.client.controller;

import com.code.farmer.openfeign.sample.client.service.OpenFeignService;
import com.code.farmer.openfeign.sample.interfaces.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * controller for test
 */
@RestController
@RequestMapping("/client")
public class OpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;

    @RequestMapping("/user")
    public List<User> user() throws IOException {
       return openFeignService.testGet(null);
    }


}
