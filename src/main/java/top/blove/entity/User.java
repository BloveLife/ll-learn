package top.blove.entity;

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
public class User extends BLCURDEntity {
    private static final long serialVersionUID = -1042994509787786106L;

    private String name;
    private String code;
    private String password;
    private String sex;
    private Integer age;
}
