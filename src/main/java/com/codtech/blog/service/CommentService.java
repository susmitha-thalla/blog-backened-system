package com.codtech.blog.service;

import com.codtech.blog.model.Blog;
import com.codtech.blog.model.Comment;
import java.util.List;

public interface CommentService {
    Comment addCommentToBlog(Blog blog, Comment comment);
    List<Comment> getCommentsByBlog(Blog blog);
}
