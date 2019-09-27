package top.blove.service.impl;

import org.springframework.stereotype.Service;
import top.blove.entity.User;
import top.blove.mapper.UserMapper;
import top.blove.service.IUserService;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 18:32
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Service
public class UserService extends BLService<UserMapper, User> implements IUserService {
}
