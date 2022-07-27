package com.meli.atividadeblog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    private Integer id;
    private String titulo;
    private String autor;
    private String dataPublicacao;

}
