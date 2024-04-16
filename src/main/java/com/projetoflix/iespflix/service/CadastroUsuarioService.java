package com.projetoflix.iespflix.service;

import com.projetoflix.iespflix.model.Usuario;
import com.projetoflix.iespflix.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class CadastroUsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public CadastroUsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO) {
        //String email = usuarioDTO.getEmail();

        // Criar uma nova instância de Usuario com os dados fornecidos
        Usuario novoUsuario = new Usuario();

        // Salvar o novo usuário no banco de dados usando o repositório
        return usuarioRepository.save(novoUsuario);
    }
}
