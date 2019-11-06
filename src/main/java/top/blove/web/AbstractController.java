package top.blove.web;

import lombok.Getter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Desc:
 * User: Blove
 * Date: 2019/9/27
 * Time: 15:38
 * Mail:<a href="yanlong@hyphoneit.com">Yanlong</a>.
 */
@Getter
public abstract class AbstractController implements CURDConstants {
    private HttpServletRequest request;
    private HttpServletResponse response;

    @ModelAttribute
    public void setRequestAndResponse(final HttpServletRequest request, final HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @InitBinder
    public void initBinder(final WebDataBinder binder) {
        binder.setAutoGrowNestedPaths(true);
        binder.setAutoGrowCollectionLimit(1024 * 256);
    }
}
