package com.example.homework2_3mavenspringboot.service.impl;

import com.example.homework2_3mavenspringboot.service.CalculationService;
import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {
    @Override
    public String plus(int value, int value2) {
        int sum = value + value2;
        return value + " + " + value2 + " = " + sum;
    }

    @Override
    public String minus(int value, int value2) {
        int minus = value - value2;
        return value + " - " + value2 + " = " + minus;
    }

    @Override
    public String multiply(int value, int value2) {
        int multiply = value * value2;
        return value + " * " + value2 + " = " + multiply;
    }

    @Override
    public String divide(double value, double value2) {
        double divide = 0;
        if (value2 == 0) {
            return "Делить на 0 нельзя ";
        } else {
            divide = value / value2;
            return value + " / " + value2 + " = " + divide;
        }
    }
}
