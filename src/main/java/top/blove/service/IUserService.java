package top.blove.service;

import top.blove.entity.User;

import java.util.List;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 18:29
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
public interface IUserService extends IBLService<User> {
    User getUser(Long id);

    List<User> listUsers(User user);
}
