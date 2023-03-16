package com.example.geekgarden.controller;

import com.example.geekgarden.dto.DtoRequest;
import com.example.geekgarden.dto.DtoResponse;
import com.example.geekgarden.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/primes")
    public DtoResponse getPrimes(@RequestBody DtoRequest request){
        return testService.getPrimes(request);
    }

    @GetMapping(value = "/sort")
    public DtoResponse getSortNumber(@RequestBody DtoRequest request){
        return testService.getSortNumber(request);
    }

}
