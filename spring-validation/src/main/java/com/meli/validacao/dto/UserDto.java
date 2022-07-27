package com.meli.validacao.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

    //@Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do aluno deve começar com letra maiúscula.")
    @NotBlank(message = "O nome é um campo obrigatório.")
    private String name;

    @NotBlank(message = "E-mail obrigatório.")
    @Email(message = "O e-mail deve ser válido.")
    private String email;

    @Min(value = 18, message = "A idade mínima é 18 anos.")
    private int idade;

}
