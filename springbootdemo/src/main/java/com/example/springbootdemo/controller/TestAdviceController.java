package com.example.springbootdemo.controller;

import com.example.springbootdemo.annotation.SecurityParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestAdviceController {
    /*
     * 自动解密，并将返回信息加密
     * @param info
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    @SecurityParameter
    public Object save(@RequestBody String json) {
        System.out.println("解密的字符串是-------"+json);
        return json;
    }

}
