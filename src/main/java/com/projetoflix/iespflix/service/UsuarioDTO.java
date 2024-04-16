package com.projetoflix.iespflix.service;

import lombok.Data;

@Data
public class UsuarioDTO {
    private String nomeCompleto;
    private String nascimento;
    private String email;
    private String senha;
    private String numeroCartao;
    private String validadeCartao;
    private String codigoSegurancaCartao;
    private String nomeTitularCartao;
    private String cpfOuCnpj;

}
