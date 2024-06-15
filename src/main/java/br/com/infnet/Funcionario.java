package br.com.infnet;

import java.util.List;

public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

}
