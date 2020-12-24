package cn.com.sherhom.mybatis.nospring.dao;

import cn.com.sherhom.mybatis.nospring.entity.UserPO;

/**
 * @author Sherhom
 * @date 2020/12/24 14:20
 */
public interface UserDao {
    UserPO getById(Long id);
}
