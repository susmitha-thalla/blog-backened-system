package com.codtech.blog.repository;

import com.codtech.blog.model.Comment;
import com.codtech.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlog(Blog blog);
}
