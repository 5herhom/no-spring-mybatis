package cn.com.sherhom.mybatis.nospring.dao.basic;

import cn.com.sherhom.mybatis.nospring.entity.PO.UserPO;
import cn.com.sherhom.mybatis.nospring.entity.PO.example.UserPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Sherhom
 * @date 2020/12/25 16:18
 */
public interface UserBasicDao {
    long countByExample(UserPOExample example);

    int deleteByExample(UserPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    List<UserPO> selectByExample(UserPOExample example);

    UserPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPO record, @Param("example") UserPOExample example);

    int updateByExample(@Param("record") UserPO record, @Param("example") UserPOExample example);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}
