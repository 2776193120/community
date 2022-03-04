package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: lafe
 * @Date: 2022/03/04/8:54
 * @motto: 你总会欠缺点努力
 * @Description:
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 根据功能适用的程度 我们设置了userId 我的帖子以及首页面的所有帖子展示
     * @param userId
     * @param offset 每一页起始行的行号
     * @param limit 每一页最多显示多少条数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 如果需要动态的拼接sql且参数中只有一个 那么必须使用@Param注解
     * @Param("userId")给参数起一个别名 有些参数过长在写mysql语句时会不太方便
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
