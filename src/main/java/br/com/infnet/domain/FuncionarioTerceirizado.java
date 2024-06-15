package br.com.infnet.domain;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoDePermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoDePermanencia) {
        super(nome, telefones, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public int getTempoPrevistoDePermanencia() {
        return tempoPrevistoDePermanencia;
    }
}
