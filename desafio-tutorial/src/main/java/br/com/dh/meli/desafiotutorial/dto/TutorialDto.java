package br.com.dh.meli.desafiotutorial.dto;

import br.com.dh.meli.desafiotutorial.model.Tutorial;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TutorialDto {

    private String title;

    private String description;

    private Boolean publicationStatus;

    public TutorialDto(Tutorial tutorial) {
        this.title = tutorial.getTitle();
        this.description = tutorial.getDescription();
        this.publicationStatus = tutorial.getPublicationStatus();
    }

}
