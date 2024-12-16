package com.crs.controller;

import com.crs.entity.Comment;
import com.crs.entity.Post;
import com.crs.repository.CommentRepository;
import com.crs.repository.PostRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentController (PostRepository postRepository, CommentRepository commentRepository){

        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }
    public String createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
    ){
        Post post = postRepository.findById(postId).get();
        comment.setPost(post);
        commentRepository.save(comment);
        return "Comment created successfully";
    }

}

