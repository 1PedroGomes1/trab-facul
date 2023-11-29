package com.example.PedroHGomes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PedroHGomes.domains.Cadastro;


public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

}
