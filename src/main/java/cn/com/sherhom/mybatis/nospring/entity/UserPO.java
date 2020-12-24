package cn.com.sherhom.mybatis.nospring.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Sherhom
 * @date 2020/12/24 11:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPO {
    Long id;
    String name;
    Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
