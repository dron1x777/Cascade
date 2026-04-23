package org.example.service.Impl;

import org.example.entity.Comment;
import org.example.repository.CommentRepository;
import org.example.repository.Impl.CommentRepositoryImpl;
import org.example.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository = new CommentRepositoryImpl();

    @Override
    public void SaveComment(Long userId, Comment comment) {
        commentRepository.SaveComment(userId,comment);
        System.out.println("comment has saved");
    }

    @Override
    public List<Comment> findCommentByPostId(Long postId) {
        return commentRepository.findCommentByPostId(postId);
    }

    @Override
    public void updateComment(Long commentId, String newText) {
        commentRepository.updateComment(commentId,newText);
        System.out.println("cooment has updated");
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteComment(id);
        System.out.println("comment has deleted");
    }
}
