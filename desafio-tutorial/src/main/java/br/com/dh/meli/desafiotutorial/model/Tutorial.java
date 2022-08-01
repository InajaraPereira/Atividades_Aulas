package br.com.dh.meli.desafiotutorial.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_tutorial")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80, nullable = false, unique = true)
    private String title;

    @Column(length = 200)
    private String description;

    @Column(name = "status", nullable = false)
    private Boolean publicationStatus;

}
