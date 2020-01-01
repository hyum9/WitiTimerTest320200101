package com.witi.reactjs.controller;

import com.witi.reactjs.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RequestMapping("/member")
@RestController
public class MemberController {

    @GetMapping("/test")
    public Member memberTest()
    {
        return new Member(0L, "Witi", 20, "Rippler", new Date());
    }

    @GetMapping("/test2")
    public ArrayList<Member> memberTest2()
    {
        return new ArrayList(Arrays.asList(
                new Member(1L, "Witi", 20, "Rippler", new Date()),
                new Member(2L, "Sim", 50, "S", new Date()),
                new Member(3L, "Kwon", 47, "Na", new Date()),
                new Member(4L, "Kang", 23, "Mo", new Date()),
                new Member(5L, "Kim", 13, "yun", new Date())
        ));
    }

}
