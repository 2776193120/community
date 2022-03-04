package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: lafe
 * @Date: 2021/12/12/17:56
 * @motto: 你总会欠缺点努力
 * @Description:mybatis的注解为mapper
 */

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
