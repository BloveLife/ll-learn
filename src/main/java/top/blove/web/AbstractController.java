package top.blove.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:38
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
public abstract class AbstractController implements CURDConstants {
    private HttpServletRequest request;
    private HttpServletResponse response;
}
