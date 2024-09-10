package com.infnet.Tp3ReactiveSpringQ5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
}
