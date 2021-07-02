package com.example.demo.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;

}
