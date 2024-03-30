package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myPage")
public class UserController {

    @GetMapping
    public String list(){
        return "내 정보\n";
    }

    @PatchMapping
    public String update(@PathVariable("id") String id, @RequestBody String body){
        return "{\"action\": \"내정보 수정:" + id + "\", \"body\": \""
                + body.replace("\"", "\\\"") + "\"}";
    }
}
