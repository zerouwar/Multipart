package cn.chenhuanming.controller;

import cn.chenhuanming.demo.DemoController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/20.
 */
@RestController
public class MainController {

    @GetMapping("/main")
    String main(){
        DemoController demoController = new DemoController();
        return demoController.demo();
    }
}
