package cn.com.sherhom.mybatis.nospring;

import cn.com.sherhom.mybatis.nospring.entity.UserPO;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author Sherhom
 * @date 2020/12/24 11:48
 */
@Slf4j
public class MainRun {
    public static void main(String[] args) throws IOException {
        oneWay();
    }

    public static void oneWay(){
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        SqlSession session = factory.openSession();
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        UserPO user = session.selectOne(
                "cn.com.sherhom.mybatis.nospring.dao.UserDao.getById", 1l);
        log.info(user.toString());

    }
}
