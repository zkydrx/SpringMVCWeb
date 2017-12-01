package com.google.springmvc.dao;

import com.google.springmvc.repository.domain.SpringmvcUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-29
 * Time: 13:11
 * Description:
 */
@Service
public interface UserDao
{
    /**
     * 添加user
     * @param springmvcUserEntity
     * @return
     */
    boolean insertUser(SpringmvcUserEntity springmvcUserEntity);

    /**
     * 删除user
     * @param id
     * @return
     */
    boolean deleteUser(String id);

    /**
     * 修改user
     * @param springmvcUserEntity
     * @return
     */
    boolean updateUser(SpringmvcUserEntity springmvcUserEntity);


    /**
     * 查找user
     * @param name
     * @return
     */
    List<SpringmvcUserEntity> listUser(String name);

}
