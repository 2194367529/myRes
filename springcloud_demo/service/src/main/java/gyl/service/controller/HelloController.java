package gyl.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud_demo
 * @description: test frign
 * @author: gyl
 * @create: 2020-04-13 21:52
 **/
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String hello(@RequestParam String name){
        String s="hi "+name+",i am from "+port;
        System.out.println(s);
        return s;
    }
}
