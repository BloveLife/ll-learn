package top.blove.entity;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:00
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Data
@TableName("SYS_USER")
public class User extends BLCURDEntity {
    private static final long serialVersionUID = -1042994509787786106L;

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + DateUtil.formatDateTime(createTime) +
                ", id=" + id +
                '}';
    }
}
