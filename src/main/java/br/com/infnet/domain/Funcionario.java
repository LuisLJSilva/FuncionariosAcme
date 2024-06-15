package br.com.infnet.domain;

import br.com.infnet.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;
    private List<Observer> observers = new ArrayList<>();

    public Funcionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notificarObservers() {
        observers.forEach(observer -> observer.atualizar(this));
    }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
        notificarObservers();
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
}
