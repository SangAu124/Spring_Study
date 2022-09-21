package study.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import study.spring.web.Domain.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
//    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping(value = {"/hi", "/abcd", "/dgsw.do"})
    public String hi() {
        return "hi";
    }

    @RequestMapping("/clock")
    public ModelAndView clock() {
        ModelAndView modelAndView = new ModelAndView("clock");

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy년 MM월 dd일 HH시:mm분:ss초");
        String time = simpleDateFormat.format(new Date());
        modelAndView.addObject("now", time);

        Person person = new Person();
        person.setName("김상은");
        person.setAge(18);

        modelAndView.addObject("person", person);

        return modelAndView;
    }
}
