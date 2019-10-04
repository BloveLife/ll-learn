package top.blove.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:00
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Getter
@Setter
public class BLCURDEntity extends BLEntity {
    private static final long serialVersionUID = 3389929084684304286L;

    protected String createUser;

    protected Date createTime;
}
