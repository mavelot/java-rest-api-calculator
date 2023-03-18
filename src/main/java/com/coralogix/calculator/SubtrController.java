package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.SubtrService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subtr")
public class SubtrController {

    @Autowired
    private SubtrService subtrService;

    @GetMapping
    public Result subtr(@RequestParam int a, @RequestParam int b) {
        return subtrService.subtr(a, b);
    }
}
