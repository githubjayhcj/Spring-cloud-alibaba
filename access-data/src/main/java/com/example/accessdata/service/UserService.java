package com.example.accessdata.service;

import com.example.accessdata.domain.User;

/**
 * @ClassName: UserService
 * @Author: hongchenjie-(Evins)
 * @Data: 2026/7/16 03:44
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface UserService {

    public User findByName(String name);
}
