package com.meli.atividadeblog.service;

import com.meli.atividadeblog.dto.BlogDto;
import com.meli.atividadeblog.entity.Blog;

import java.util.List;

public interface BlogService {

    BlogDto getBlog(String titulo) throws Exception;

    List<BlogDto> getAllBlog();

    void saveBlog(Blog blog);

}
