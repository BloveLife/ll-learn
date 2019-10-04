package top.blove.mapper;

import org.springframework.stereotype.Repository;
import top.blove.entity.User;

import java.util.List;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:37
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Repository
public interface UserMapper extends BLMapper<User> {
    List<User> listUsers(User user);

}
