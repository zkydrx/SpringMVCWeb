package com.google.springmvc.service;

import com.google.springmvc.pojo.UserDto;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-29
 * Time: 15:31
 * Description:
 */
@Service
public interface UserService
{
    /**
     * 注册用户
     * @param userDto
     */
    boolean insertuser(UserDto userDto);
}
