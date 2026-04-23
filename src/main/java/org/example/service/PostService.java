package org.example.service;

import org.example.entity.Post;

import java.util.List;

public interface PostService {
    void savePost(Long userId, Post post);
    List<Post> getPostsByUserId(Long userId);
    Post searchPost(String query);
    void deletePostById(Long id);
}
