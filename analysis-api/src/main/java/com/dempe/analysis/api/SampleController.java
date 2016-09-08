package com.dempe.analysis.api;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/9/8
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}