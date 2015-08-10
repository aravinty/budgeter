package org.isay.budgeter.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ayogalin on 8/9/15.
 */
@Controller
public class FileLoadController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name) {

        //returns the view name
        return "helloworld";

    }

}
