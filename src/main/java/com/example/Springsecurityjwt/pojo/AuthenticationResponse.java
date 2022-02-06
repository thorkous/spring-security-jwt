package com.example.Springsecurityjwt.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    private final String jwt;

}
