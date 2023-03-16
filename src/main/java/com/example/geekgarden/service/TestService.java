package com.example.geekgarden.service;

import com.example.geekgarden.dto.DtoRequest;
import com.example.geekgarden.dto.DtoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
@Slf4j
public class TestService {
    public DtoResponse getPrimes(DtoRequest request){
        if(request.getInputNumber() <= 1){
           throw new RuntimeException("Bukan Bilangan Prima");
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= request.getInputNumber(); i++){
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return DtoResponse.builder()
                .listNumber(primes)
                .build();
    }

    private static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public DtoResponse getSortNumber(DtoRequest request){
        ArrayList<Integer> number = request.getListNumber();
        Collections.sort(number);
        return DtoResponse.builder()
                .listNumber(number)
                .build();
    }

}
