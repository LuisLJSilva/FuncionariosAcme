package br.com.infnet.factory;

import br.com.infnet.domain.Cargo;
import br.com.infnet.domain.Funcionario;
import br.com.infnet.domain.FuncionarioTerceirizado;
import br.com.infnet.domain.Setor;

import java.util.List;

public class FuncionarioTerceirizadoFactory extends FuncionarioFactory {
    private String empresaContratada;
    private int tempoPrevistoDePermanencia;

    public FuncionarioTerceirizadoFactory(String empresaContratada, int tempoPrevistoDePermanencia) {
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
    }

    @Override
    public Funcionario criarFuncionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        return new FuncionarioTerceirizado(nome, telefones, endereco, salario, setor, cargo, empresaContratada, tempoPrevistoDePermanencia);
    }
}
