package top.blove.web;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.blove.entity.User;
import top.blove.service.IUserService;
import top.blove.service.impl.UserService;

import java.util.List;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:38
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Slf4j
public class UserController extends BLController {

    public static void main(String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/api-server.xml");
        final IUserService userService = (UserService) ctx.getBean("userService");
        final User user = packUser();
        System.err.println(userService.save(user));

        log.info("===================");
        System.err.println("最新成功添加的用户:" + userService.getUser(user.getId()));

        final List<User> users = userService.listUsers(user);
        if (CollectionUtil.isNotEmpty(users)) {
            users.forEach(item -> System.err.println(item));
        }
    }

    private static User packUser() {
        final User user = new User();
        user.setId(IdWorker.getId());
        user.setName("Blove");
        user.setAge(30);
        user.setCreateTime(DateTime.now());
        user.setCreateUser("Blove");
        return user;
    }
}
