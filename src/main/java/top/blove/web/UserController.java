package top.blove.web;

import top.blove.entity.User;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:38
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
public class UserController extends BLController {
    public static void main(String[] args) {
        final User user = new User();
        System.err.println(user.getSex());
    }
}
