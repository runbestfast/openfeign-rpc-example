package com.code.farmer.openfeign.sample.service.Impl;

import com.code.farmer.openfeign.sample.interfaces.entity.User;
import com.code.farmer.openfeign.sample.interfaces.service.IFeignService;
import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FeignServiceImpl implements IFeignService {


    @Override
    public List<User> testGet(String sRegion) throws IOException {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        user.setAge(20);
        user.setSex(0);

        User user2 = new User();
        user2.setId(2);
        user2.setName("zhangsan2");
        user2.setAge(21);
        user2.setSex(1);

        List<User> userList = Lists.list(user, user2);
        return userList;
    }
}
