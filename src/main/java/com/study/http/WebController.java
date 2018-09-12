package com.study.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Web控制器
 *
 * @author orange
 * @Time 2018/9/12 0012
 */
@Controller
public class WebController {

    @RequestMapping(value = "/api/v1/web", method = RequestMethod.GET)
    public Object index() {

        return "index";
    }
}
