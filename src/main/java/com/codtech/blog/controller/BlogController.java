package com.codtech.blog.controller;

import com.codtech.blog.model.Blog;
import com.codtech.blog.model.Comment;
import com.codtech.blog.service.BlogService;
import com.codtech.blog.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    private final BlogService blogService;
    private final CommentService commentService;

    public BlogController(BlogService blogService, CommentService commentService) {
        this.blogService = blogService;
        this.commentService = commentService;
    }

    /**
     * Creates a new blog post.
     * @param blog The blog to create.
     * @return The created blog.
     */
    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    /**
     * Retrieves all blogs.
     * @return List of all blogs.
     */
    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    /**
     * Adds a comment to a specific blog.
     * @param blogId The blog ID.
     * @param comment The comment to add.
     * @return The added comment.
     */
    @PostMapping("/{blogId}/comments")
    public Comment addComment(@PathVariable Long blogId, @RequestBody Comment comment) {
        Blog blog = blogService.getBlogById(blogId);
        return commentService.addCommentToBlog(blog, comment);
    }

    /**
     * Retrieves all comments for a specific blog.
     * @param blogId The blog ID.
     * @return List of comments for the blog.
     */
    @GetMapping("/{blogId}/comments")
    public List<Comment> getCommentsByBlog(@PathVariable Long blogId) {
        Blog blog = blogService.getBlogById(blogId);
        return commentService.getCommentsByBlog(blog);
    }
}
