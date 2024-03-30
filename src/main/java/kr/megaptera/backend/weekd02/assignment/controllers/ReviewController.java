package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @PostMapping("/{id}")
    public String create(@RequestBody String body){
        return "{\"action\": \"리뷰 작성\", \"body\": \""
                + body.replace("\"", "\\\"") + "\"}";
    }

    @PatchMapping
    public String update(@PathVariable("id") String id, @RequestBody String body){
        return "{\"action\": \"리뷰 수정:" + id + "\", \"body\": \""
                + body.replace("\"", "\\\"") + "\"}";
    }

    @DeleteMapping
    public String delete(@PathVariable("id") String id){
        return "게시물 삭제: " + id;
    }
}
