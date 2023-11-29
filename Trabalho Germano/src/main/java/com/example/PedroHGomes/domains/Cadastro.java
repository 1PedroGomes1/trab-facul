package com.example.PedroHGomes.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomeFantasia;
    private String razaoSocial;
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;
    private String telefone;
    private String email;
    private String contato;

    // Construtores, getters e setters

    // Construtor vazio
    public Cadastro() {
    }

    // Construtor com todos os campos
    public Cadastro(String nomeFantasia, String razaoSocial, String logradouro, String cidade,
                    String estado, String bairro, String telefone, String email, String contato) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.telefone = telefone;
        this.email = email;
        this.contato = contato;
       
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
    
    

}
