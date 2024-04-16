package com.projetoflix.iespflix.controller;

import com.projetoflix.iespflix.model.Usuario;
import com.projetoflix.iespflix.service.CadastroUsuarioService;
import com.projetoflix.iespflix.service.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class UsuarioController {
    private final CadastroUsuarioService cadastroUsuarioService;

    @Autowired
    public UsuarioController(CadastroUsuarioService cadastroUsuarioService) {
        this.cadastroUsuarioService = cadastroUsuarioService;
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = cadastroUsuarioService.cadastrarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }
}
