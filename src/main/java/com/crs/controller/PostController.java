package com.crs.controller;

import com.crs.entity.Post;
import com.crs.repository.CommentRepository;
import com.crs.repository.PostRepository;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/api/v1/posts")
    public class PostController {

        private PostRepository postRepository;
        private CommentRepository commentRepository;

        public PostController(PostRepository postRepository, CommentRepository commentRepository) {
            this.postRepository = postRepository;
            this.commentRepository = commentRepository;

        }

        @PostMapping
        public String createPost(
                @RequestBody Post post

        ) {
            postRepository.save(post);
            return "saved";

        }

       @DeleteMapping
    public void deletePost() {
           postRepository.deleteById(1L);
       }
    }
