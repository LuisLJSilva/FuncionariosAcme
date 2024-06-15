package br.com.infnet.observer;

import br.com.infnet.domain.Funcionario;

public class RHObserver implements Observer {
    @Override
    public void atualizar(Funcionario funcionario) {
        System.out.println("RH notificado: Salário do " + funcionario.getNome() + " foi reajustado para " + funcionario.getSalario());
    }
}
