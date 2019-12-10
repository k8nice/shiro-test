package com.nice.dao;

import com.nice.domain.User;

import java.util.List;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is shiro-test.
 * The current package name is com.nice.dao.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/12/10 11:38
 */
public interface UserDao {
    User getUserByUserName(String userName);

    List<String> queryRolesByUserName(String userName);
}
