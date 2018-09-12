package com.study.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层测试用例
 *
 * @author orange
 * @Time 2018/9/12 0012
 */
@RestController
public class DemoController {

    @RequestMapping("/test/home")
    public String home() {
        return "springBoot";
    }
}
