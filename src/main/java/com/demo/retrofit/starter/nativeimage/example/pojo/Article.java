package com.demo.retrofit.starter.nativeimage.example.pojo;

import lombok.Data;

@Data
public class Article {

    private String id;

    private String title;

    private String content;

    private UserInfo author;

}