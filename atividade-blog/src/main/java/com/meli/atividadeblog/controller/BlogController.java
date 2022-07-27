package com.meli.atividadeblog.controller;

import com.meli.atividadeblog.dto.BlogDto;
import com.meli.atividadeblog.entity.Blog;
import com.meli.atividadeblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/{titulo}")
    public ResponseEntity<BlogDto> getBlog(@PathVariable String titulo) throws Exception {
        return ResponseEntity.ok().body(blogService.getBlog(titulo));
    }

    @GetMapping("/all")
    public ResponseEntity<List<BlogDto>> getAllBlog() {
        return ResponseEntity.ok(blogService.getAllBlog());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveBlog(@RequestBody Blog blog) {
        blogService.saveBlog(blog);
    }
}
