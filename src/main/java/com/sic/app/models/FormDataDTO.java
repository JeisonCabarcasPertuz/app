package com.sic.app.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FormDataDTO {
    private String firstName;
    private String lastName;
    private String modelPc;
    private String email;
    private LocalDateTime createdDate;
}
