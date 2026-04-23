package org.example.service;

import org.example.entity.Comment;

import java.util.List;

public interface CommentService {
    void SaveComment(Long userId, Comment comment);
    List<Comment> findCommentByPostId(Long postId);
    void updateComment(Long commentId, String newText);
    void deleteComment(Long id);
}
