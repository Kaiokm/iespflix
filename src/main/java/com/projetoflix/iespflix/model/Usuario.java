package com.projetoflix.iespflix.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeCompleto;
    private String nascimento;
    private String email;
    private String senha;
    private String confirmarSenha;
    private String numeroCartao;
    private String validadeCartao;
    private String codigoSegurancaCartao;
    private String nomeTitularCartao;
    private String cpfOuCnpj;
}
