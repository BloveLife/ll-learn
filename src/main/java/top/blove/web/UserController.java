package top.blove.web;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.blove.entity.User;
import top.blove.service.IUserService;
import top.blove.service.impl.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:38
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController extends BLController {
    @Resource
    private IUserService userService;

    public static void main(String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/api-server.xml");
        final IUserService userService = (UserService) ctx.getBean("userService");
        log.debug("debug日志级别");
        log.info("info日志级别");
        log.warn("warn日志级别");
        log.error("error日志级别");

        final User user = saveUser(userService);

        System.err.println("========创建完成========");
//
        listUsers(userService, user);
    }

    private static void listUsers(final IUserService userService, final User user) {
        final List<User> users = userService.listUsers(user);
        if (CollectionUtil.isNotEmpty(users)) {
            users.forEach(item -> log.info(item.toString()));
        }
    }

    private static User saveUser(final IUserService userService) {
        final User user = packUser();
        System.err.println(userService.save(user));
        return user;
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

    @RequestMapping(value = "/getuser")
    public User getUser(final User user) {
        if (ObjectUtil.isNull(user.getId())) {
            log.error("参数id不能为空");
            return null;
        }
        return userService.getUser(user.getId());
    }

    @GetMapping("/list")
    public List<User> listUsers(final User user) {
        final List<User> users = userService.listUsers(user);
        log.info("创建时间:" + users.get(0).getCreateTime());
        return userService.listUsers(user);
    }
}
