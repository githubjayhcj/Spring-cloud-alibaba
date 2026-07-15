package com.example.accessdata.ServiceImpl;

import com.example.accessdata.domain.User;
import com.example.accessdata.mapper.UserMapper;
import com.example.accessdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Author: hongchenjie-(Evins)
 * @Data: 2026/7/16 03:45
 * @Version: 1.0.0
 * @Description: TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
