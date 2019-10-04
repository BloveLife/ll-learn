package top.blove.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:00
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Getter
@Setter
@TableName("SYS_USER")
public class User extends BLCURDEntity {
    private static final long serialVersionUID = -1042994509787786106L;

    private String name;
    private Integer age;
}
