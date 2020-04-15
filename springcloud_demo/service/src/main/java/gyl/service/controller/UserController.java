package gyl.service.controller;

import gyl.service.entity.Dictionary;
import gyl.service.service.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @program: springcloud_demo
 * @description: userController
 * @author: gyl
 * @create: 2020-04-12 16:17
 **/
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private DictionaryService dictionaryService;
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name){
        String s="hi "+name+",i am from "+port;
        System.out.println(s);
        return s;
    }

    @RequestMapping("/list")
    public String select(Model model) {
       List<Dictionary> dictionaries=dictionaryService.findAllDictionary();
        for (Dictionary dictionary:dictionaries) {
            log.info(dictionaries.toString());
        }
        model.addAttribute("dictionaries",dictionaries);
        return "list";
    }
    @RequestMapping("/login")
    public String login(String username,String password,Model model){
        System.out.println("name:"+username);
        System.out.println("password:"+password);
        if ("gyl".equals(username)&&"123456".equals(password)){
            System.out.println("success");


            return "forward:list";
        }
        return "redirect:../index.jsp";
    }
    @RequestMapping("/toUpdate")
    public String toEdit(Model model,int id){
        Dictionary dictionary=dictionaryService.findDictionaryById(id);
        model.addAttribute("dic",dictionary);
        return "update";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/update")
    public String update(Dictionary dictionary){
        dictionaryService.updateDictionary(dictionary);
        return "forward:list";
    }
    @RequestMapping("/add")
    public String add(Dictionary dictionary){
        dictionary.setCreateTime(new Date());
        dictionaryService.addDictionary(dictionary);
        return "forward:list";
    }

    @RequestMapping("/deleteById")
    public String deleteById(int id){
        dictionaryService.deleteDictionaryById(id);
        return "forward:list";
    }
}
