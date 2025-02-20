package com.example.demo.model;

public class Post
{
    private String text;
    private Integer likes;

    // Конструктор
    public Post(String text)
    {
        this.text = text;
        this.likes = 0; // Изначально 0 лайков
    }

    // Геттер для text
    public String getText()
    {
        return text;
    }

    // Геттер для likes
    public Integer getLikes()
    {
        return likes;
    }
}
