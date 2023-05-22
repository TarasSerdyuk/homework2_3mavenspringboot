package com.example.homework2_3mavenspringboot.Controller;

import com.example.homework2_3mavenspringboot.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class CalculationController {
    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }
 @GetMapping
 public String showHello(){
        return "Добро пожаловать в калькулятор";
 }

@GetMapping("/plus")
   public String plus(@RequestParam int num1, @RequestParam int num2){
        return calculationService.plus(num1, num2);
   }
   @GetMapping("/minus")
   public String minus(@RequestParam int num1, @RequestParam int num2){
        return calculationService.minus(num1, num2);
   }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return calculationService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide (@RequestParam double num1, @RequestParam double num2){
        return calculationService.divide(num1, num2);
    }

}