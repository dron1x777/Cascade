package org.example.repository;

import org.example.entity.Post;

import java.util.List;

public interface PostRepository {
    void savePost(Long userId, Post post);
    List<Post> getPostsByUserId(Long userId);
    Post searchPost(String query);
    void deletePostById(Long id);
}
