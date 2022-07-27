package com.meli.atividadeblog.dto;

import com.meli.atividadeblog.entity.Blog;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BlogDto {

    private String titulo;
    private String autor;
    private String dataPublicacao;

    public BlogDto(Blog blog) {
        this.titulo = blog.getTitulo();
        this.autor = blog.getAutor();
        this.dataPublicacao = blog.getDataPublicacao();
    }

}
