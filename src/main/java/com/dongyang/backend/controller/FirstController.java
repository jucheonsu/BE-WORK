package com.dongyang.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/home")
    public String firstPage() {
        return "index";
    }

    @GetMapping("/hi")
    public String hello(Model mo) {
        mo.addAttribute("userName","윤준진");
        return "hi";
    }

    @GetMapping("/quote")
    public String quoteMethod(Model mo) {
        String[] varQuote={
                "가장 큰 영광은 한 번도 실패하지 않음이 아니라, 실패할 때마다 다시 일어나는 데 있다.",
                "자신을 이기는 자가 가장 강한 자다.",
                "어디를 가든지 마음을 다해 가라.",
                "남이 나를 알아주지 않음을 걱정하지 말고, 내가 능력이 없음을 걱정하라.",
                "멈추지 않는다면 얼마나 천천히 가는지는 중요하지 않다."
        };
        int ranNum = (int) (Math.random() * varQuote.length);
        mo.addAttribute("quoteResult", varQuote[ranNum]);
        return "quote";
    }
}
