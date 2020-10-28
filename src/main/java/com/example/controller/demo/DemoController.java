package com.example.controller.demo;

import com.example.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ddyy
 * @Date 2020/10/16 0016 16:43
 */
@RestController
@RequestMapping
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/listString")
    public String listString(Model model){
        List<String> list = demoService.listString();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }
}
