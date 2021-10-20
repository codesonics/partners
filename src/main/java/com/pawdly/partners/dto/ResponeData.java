package com.pawdly.partners.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponeData<T> {
    private Boolean success;
    private String message;
    private T data;
}