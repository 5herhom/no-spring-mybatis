package cn.com.sherhom.mybatis.nospring.entity.PO;

import cn.com.sherhom.mybatis.nospring.entity.PO.basic.UserBasicPO;
import cn.com.sherhom.mybatis.nospring.entity.PO.example.UserExtensionExample;
import com.alibaba.fastjson.JSON;


public class UserPO extends UserBasicPO {
    public UserExtensionExample toExample(){
        UserExtensionExample example = new UserExtensionExample();
        UserExtensionExample.Criteria criteria = example.getFirstCriteria();
        if(getId()!=null){
            criteria.andIdEqualTo(getId());
        }
        if(getName()!=null){
            criteria.andNameEqualTo(getName());
        }
        if(getAge()!=null){
            criteria.andAgeEqualTo(getAge());
        }
        if(getKey()!=null){
            criteria.andKeyEqualTo(getKey());
        }
        if(getCreateTime()!=null){
            criteria.andCreateTimeEqualTo(getCreateTime());
        }
        if(getUpdateTime()!=null){
            criteria.andUpdateTimeEqualTo(getUpdateTime());
        }
        return example;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}