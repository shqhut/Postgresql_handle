package com.wayz.handle.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping(value = "/handlePlaceId")
    public String PlaceIdHandlerView(){
       return "handlePlaceId";
    }
}
