package com.meli.atividadeblog.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.meli.atividadeblog.entity.Blog;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BlogRepository {

    String db = "src/main/resources/db.json";

    public Blog getBlog(String titulo) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Blog> listaBlog = null;
        try {
            listaBlog = Arrays.asList
                    (mapper.readValue(new File(db), Blog[].class));

        } catch (Exception ignored) {

        }
        for (Blog blog : listaBlog) {
            if (blog.getTitulo().equals(titulo)) {
                return blog;
            }
        }
        throw new Exception("Blog não localizado");
    }

    public List<Blog> getAllBlog() {
        ObjectMapper mapper = new ObjectMapper();
        List<Blog> listaBlog = null;
        try {
            listaBlog = Arrays.asList
                    (mapper.readValue(new File(db), Blog[].class));

        } catch (Exception ignored) {

        }
        return listaBlog;
    }

    public void saveBlog(Blog novoBlog) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Blog> listaBlog = null;
        try {
            listaBlog = Arrays.asList
                    (mapper.readValue(new File(db), Blog[].class));
            List<Blog> listaCopiada = new ArrayList<>(listaBlog);
            listaCopiada.add(novoBlog);
            writer.writeValue(new File(db), listaCopiada);
        } catch (Exception ex) {
            System.out.println("Errooo");
        }
    }
}