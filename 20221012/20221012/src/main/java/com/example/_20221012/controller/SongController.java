package com.example._20221012.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/song")
public class SongController {

    @RequestMapping("/add")
    public String add() {
        return "song/add";
    }

}
