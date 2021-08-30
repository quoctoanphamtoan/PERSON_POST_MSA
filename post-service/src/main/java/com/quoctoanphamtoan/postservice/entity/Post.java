package com.quoctoanphamtoan.postservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Long id;
    private String name;
    private Integer age;
    private String title;
    private Integer quantity;
    private double price;
}
