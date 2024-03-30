package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {

    @GetMapping
    public String list(){
        return "장바구니 목록\n";
    }
    @PostMapping
    public String addCarts(){
        return "상품 추가\n";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        return "장바구니 상품 삭제: " + id + "\n";
    }
}
