package com.example.springinaction.controller;

import com.example.springinaction.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        log.info("model={}",model);
        model.addAttribute("order",new Order());
        log.info("model={}",model);
        return "orderForm";
    }
}