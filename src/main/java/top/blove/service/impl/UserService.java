package top.blove.service.impl;

import org.springframework.stereotype.Service;
import top.blove.entity.User;
import top.blove.mapper.UserMapper;
import top.blove.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 18:32
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Service
public class UserService extends BLService<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(final Long id) {
        return getById(id);
    }

    @Override
    public List<User> listUsers(final User user) {
        return userMapper.listUsers(user);
    }
}
