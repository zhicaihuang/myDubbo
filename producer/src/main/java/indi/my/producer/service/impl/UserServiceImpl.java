package indi.my.producer.service.impl;

import indi.my.producer.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@org.springframework.stereotype.Service
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "Tim";
    }
}
