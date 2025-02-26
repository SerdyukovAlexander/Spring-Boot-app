package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Post
{
    @Id
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Integer likes, Date creationDate)
    {
        this.id=id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public Post(){

    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public String getText()
    {
        return text;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setLikes(Integer likes)
    {
        this.likes = likes;
    }
}
