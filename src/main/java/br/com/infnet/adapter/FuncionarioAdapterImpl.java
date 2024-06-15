package br.com.infnet.adapter;

import br.com.infnet.domain.Funcionario;

public class FuncionarioAdapterImpl implements FuncionarioAdapter {
    private Funcionario funcionario;

    public FuncionarioAdapterImpl(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String getDescricao() {
        return "Funcionario: " + funcionario.getNome() + ", Setor: " + funcionario.getSetor() + ", Cargo: " + funcionario.getCargo();
    }
}
