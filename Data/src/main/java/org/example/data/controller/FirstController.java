package org.example.data.controller;

import org.example.data.list.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
    @PostMapping("/mean")
    public float mean(@RequestBody List data){
        double mean = data.mean();
        return (float) mean;


    }
    @PostMapping("/variance")
    public double variance(@RequestBody List data){
        double variance = data.variance();
        return variance;

    }
    @PostMapping("/describe")
    public String both(@RequestBody List data){
        double mean = data.mean();
        double variance = data.variance();
        return "mean = " +(float) mean + "variance = " +   variance;


    }
}


