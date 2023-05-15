package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//컨트롤러 선언
@Controller
public class FirstController {
    @GetMapping("/hi")//접속할 url 입력
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "동글");
        return "greetings"; //templates/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "둥글");
        return "goodbye";
    }
}
