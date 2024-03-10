package com.scaler.resttemplatepractice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProduct {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}