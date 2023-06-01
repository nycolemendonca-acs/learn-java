package com.santana.java.back.end.controller;

import com.santana.java.back.end.dto.UserDTO;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")

// Cadastro de usuários
public class UserController {
    public static List<UserDTO> usuarios = new ArrayList<>();

    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Eduardo");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua a");
        userDTO.setEmail("eduardo@email.com");
        userDTO.setTelefone("1234-3454");
        userDTO.setDataCadastro(LocalDateTime.now());

        UserDTO	userDTO2 = new UserDTO();
        userDTO2.setNome("Luiz");
        userDTO2.setCpf("456");
        userDTO2.setEndereco("Rua b");
        userDTO2.setEmail("luiz@email.com");
        userDTO2.setTelefone("1234-3454");
        userDTO2.setDataCadastro(LocalDateTime.now());

        UserDTO	userDTO3 = new UserDTO();
        userDTO3.setNome("Bruna");
        userDTO3.setCpf("678");
        userDTO3.setEndereco("Rua c");
        userDTO3.setEmail("bruna@email.com");
        userDTO3.setTelefone("1234-3454");
        userDTO3.setDataCadastro(LocalDateTime.now());

        UserDTO userDTO4 = new UserDTO();
        userDTO4.setNome("Carlos");
        userDTO4.setCpf("987");
        userDTO4.setEndereco("Avenida 2");
        userDTO4.setEmail("carlos@email.com");
        userDTO4.setTelefone("1234-3454");
        userDTO4.setDataCadastro(LocalDateTime.now());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
        usuarios.add(userDTO4);
    }

    // Retorna uma lista de usuários
    @GetMapping
    public List<UserDTO> getUsers() {
        return usuarios;
    }

    // Retorna determinado CPF
    @GetMapping("/{cpf}")
    public UserDTO getUsersFiltro(@PathVariable String cpf) {
        return usuarios
                .stream()
                .filter(userDTO -> userDTO.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(("Usuário não encontrado.")));
    }

    // Recebe informações de um usuário e o insere na lista
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO inserir(@RequestBody @Valid UserDTO userDTO) {
        userDTO.setDataCadastro((LocalDateTime.now()));
        usuarios.add(userDTO);
        return userDTO;
    }

    // Deleta um usuário
    @DeleteMapping("/{cpf}")
    public boolean remover(@PathVariable String cpf) {
        return usuarios
                .removeIf(userDTO -> userDTO.getCpf().equals(cpf));
    }
}
