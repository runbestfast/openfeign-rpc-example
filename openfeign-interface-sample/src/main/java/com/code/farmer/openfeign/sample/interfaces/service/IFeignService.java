package com.code.farmer.openfeign.sample.interfaces.service;

import com.code.farmer.openfeign.sample.interfaces.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

public interface IFeignService {

    @RequestMapping(value = "/service/user")
    List<User> testGet(@RequestParam(required = false) String name) throws IOException;

}
