package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/request")
public class RequestMappingController {
    @RequestMapping(value = {"/target","/success"})
    public String target(){
        return "target";
    }

    @RequestMapping(value = {"/test"},method = {RequestMethod.POST})
    public String Stringtarget(){
        return "target";
    }
}
