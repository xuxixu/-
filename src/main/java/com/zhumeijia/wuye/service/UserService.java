package com.zhumeijia.wuye.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhumeijia.wuye.entity.Role;
import com.zhumeijia.wuye.entity.User;

import java.util.Set;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    User findUserById(String id);

    int userCount(String loginName);

    void saveUserRoles(String id, Set<Role> roleLists);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void lockUser(User user);
}
