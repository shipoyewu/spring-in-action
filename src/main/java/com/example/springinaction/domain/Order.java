package com.example.springinaction.domain;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
@Data
public class Order {
    @NotBlank(message="Name is required")
    private String name;
    @NotBlank(message="Street is required")
    private String street;
    @NotBlank(message="City is required")
    private String city;
    @NotBlank(message="State is required")
    private String state;
    @NotBlank(message="Zip code is required")
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
}