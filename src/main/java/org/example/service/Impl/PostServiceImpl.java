package org.example.service.Impl;

import org.example.entity.Post;
import org.example.repository.Impl.PostRepositoryImpl;
import org.example.repository.PostRepository;
import org.example.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    private PostRepository postRepository = new PostRepositoryImpl();
    @Override
    public void savePost(Long userId, Post post) {
        postRepository.savePost(userId,post);
        System.out.println("post has saved");
    }

    @Override
    public List<Post> getPostsByUserId(Long userId) {
        return postRepository.getPostsByUserId(userId);
    }

    @Override
    public Post searchPost(String query) {
        return postRepository.searchPost(query);
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deletePostById(id);
        System.out.println("post has deleted");
    }
}
