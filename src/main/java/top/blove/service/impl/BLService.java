package top.blove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.blove.mapper.BLMapper;
import top.blove.service.IBLService;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 18:32
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
public class BLService<M extends BLMapper<T>, T> extends ServiceImpl<M, T> implements IBLService<T> {
}
