package com.meli.atividadeblog.service;

import com.meli.atividadeblog.dto.BlogDto;
import com.meli.atividadeblog.entity.Blog;
import com.meli.atividadeblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public BlogDto getBlog(String titulo) throws Exception {
        return new BlogDto(blogRepository.getBlog(titulo));
    }

    @Override
    public List<BlogDto> getAllBlog() {
        return blogRepository.getAllBlog().stream()
                .map(BlogDto::new).collect(Collectors.toList());
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.saveBlog(blog);
    }

}
