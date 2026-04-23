package org.example.repository;

import org.example.entity.Comment;

import java.util.List;

public interface CommentRepository {
    void SaveComment(Long userId, Comment comment);
    List<Comment> findCommentByPostId(Long postId);
    void updateComment(Long commentId, String newText);
    void deleteComment(Long id);
}
