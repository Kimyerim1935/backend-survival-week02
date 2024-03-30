package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
    @GetMapping("/login")
    public String login(){
        return "로그인 성공\n";
    }

    @GetMapping("/logout")
    public String logout(){
        return "로그아웃 성공\n";
    }

    @PostMapping("/signIn")
    public String SignIn(@RequestBody String body){
        return "{\"action\": \"회원가입 성공\", \"body\": \""
                + body.replace("\"", "\\\"") + "\"}";
    }

}
