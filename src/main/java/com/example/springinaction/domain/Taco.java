package com.example.springinaction.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=5,message = "name must be at least 5 character long")
    private String name;
    @Size(min=1,message = "Your must choose at least 1 ingredient")
    private List<String> ingrateients;
}
