package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class SubtrService {
    public Result subtr(int a, int b) {
        int subtr = a - b;
        return new Result(subtr);
    }
}
