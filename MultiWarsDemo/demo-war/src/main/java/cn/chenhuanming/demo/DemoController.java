package cn.chenhuanming.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/20.
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "Hello,Multi-Wars Project!";
    }
}
