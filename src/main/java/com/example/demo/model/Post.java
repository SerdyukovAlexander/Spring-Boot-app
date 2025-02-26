package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

import java.util.Date;
@Entity
public class Post {
    @Id

    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text, Integer likes, Date creationDate){
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }
    public Post(){

    }
    public void setId(Long id){
        this.id = id;
    }


    public void setText(String text){
        this.text = text;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }

    public String getText(){
        return text;
    }
    public Long getId(){
        return id;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }
}