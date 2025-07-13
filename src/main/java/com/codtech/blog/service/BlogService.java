package com.codtech.blog.service;

import com.codtech.blog.model.Blog;
import java.util.List;

public interface BlogService {
    Blog createBlog(Blog blog);
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
}
