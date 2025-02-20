package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService
{
    public List<Post> listAllPosts()
    {
        return List.of(
                new Post("Первый пост", new Date()),
                new Post("Второй пост", new Date()),
                new Post("Третий пост", new Date())
        );
    }
}