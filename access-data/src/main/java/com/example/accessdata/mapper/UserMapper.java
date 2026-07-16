package com.example.accessdata.mapper;

import com.example.accessdata.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: UserMapper
 * @Author: hongchenjie-(Evins)
 * @Data: 2026/7/16 01:53
 * @Version: 1.0.0
 * @Description: TODO
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Long id);

    User findByName(@Param("name") String name);

    int add(User user);
}
