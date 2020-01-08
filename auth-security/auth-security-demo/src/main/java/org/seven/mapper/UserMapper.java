package org.seven.mapper;

import org.apache.ibatis.annotations.Select;
import org.seven.domain.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Seven.Lin
 * @date 2020/1/6 16:28
 */
public interface UserMapper extends Mapper<User> {
    @Select("select * from user where phone=#{phone}")
    User selectByPhone(String phone);

    User selectByNick(String nick);

}