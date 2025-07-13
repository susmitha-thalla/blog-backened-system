package com.codtech.blog.service;

import com.codtech.blog.model.Blog;
import com.codtech.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    /**
     * Creates and saves a new blog.
     * @param blog The blog to create.
     * @return The saved blog.
     */
    @Override
    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    /**
     * Retrieves all blogs from the repository.
     * @return List of all blogs.
     */
    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    /**
     * Retrieves a blog by its ID.
     * @param id The blog ID.
     * @return The found blog.
     * @throws NoSuchElementException if blog not found.
     */
    @Override
    public Blog getBlogById(Long id) {
        return blogRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Blog not found with id: " + id));
    }
}
