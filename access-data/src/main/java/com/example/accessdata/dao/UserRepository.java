package com.example.accessdata.dao;

import com.example.accessdata.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: UserRepository
 * @Author: hongchenjie-(Evins)
 * @Data: 2026/7/15 19:13
 * @Version: 1.0.0
 * @Description: TODO
 */
public interface UserRepository extends CrudRepository<User, Integer> {


}
