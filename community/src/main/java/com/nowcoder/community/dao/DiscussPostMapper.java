package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: lafe
 * @Date: 2021/12/16/19:23
 * @motto: 你总会欠缺点努力
 * @Description:
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    // @Param注解用于给参数取别名,由于有的参数名字较长 我们写sql语句的时候可以使用注解里面的数据
    // 若动态的拼接sql，如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);
}
