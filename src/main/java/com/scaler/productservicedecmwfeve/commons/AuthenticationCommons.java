package com.scaler.productservicedecmwfeve.commons;

import com.scaler.productservicedecmwfeve.dtos.UserDto;
import com.scaler.productservicedecmwfeve.inheritancedemo.joinedtable.User;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationCommons {

    private RestTemplate restTemplate;

    public  AuthenticationCommons(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public UserDto validateToken(String token) {
        ResponseEntity<UserDto> userDtoResponseEntity =  restTemplate.postForEntity(
                "http://localhost:8181/users/validate/" + token,
                null,
                UserDto.class
        );
        if(userDtoResponseEntity.getBody() == null) {
            return null;
        }
        return userDtoResponseEntity.getBody();
    }
}
