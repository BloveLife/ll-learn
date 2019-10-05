package top.blove.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Date createTime;
}
