package gyl.sericefeign.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud_demo
 * @description: controller类
 * @author: gyl
 * @create: 2020-04-13 21:16
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
//    @GetMapping(value = "/hi")
//    public String sayHi(@RequestParam String name){
//        return schedualServiceHi.sayHiFromClientOne(name);
//
//    }
}
