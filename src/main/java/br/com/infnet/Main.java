package br.com.infnet;

import br.com.infnet.adapter.FuncionarioAdapter;
import br.com.infnet.adapter.FuncionarioAdapterImpl;
import br.com.infnet.domain.Cargo;
import br.com.infnet.domain.Funcionario;
import br.com.infnet.domain.FuncionarioTerceirizado;
import br.com.infnet.domain.Setor;
import br.com.infnet.factory.FuncionarioACMEFactory;
import br.com.infnet.factory.FuncionarioFactory;
import br.com.infnet.factory.FuncionarioTerceirizadoFactory;
import br.com.infnet.observer.RHObserver;
import br.com.infnet.singleton.Empresa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstance("ACME Corp");

        FuncionarioFactory acmeFactory = new FuncionarioACMEFactory();
        FuncionarioFactory terceirizadoFactory = new FuncionarioTerceirizadoFactory("Empresa GFT", 12);

        List<Funcionario> funcionarios = criarFuncionarios(acmeFactory);
        List<FuncionarioTerceirizado> terceirizados = criarFuncionariosTerceirizados(terceirizadoFactory);

        RHObserver rhObserver = new RHObserver();
        funcionarios.forEach(f -> f.adicionarObserver(rhObserver));

        exibirFuncionarios("Funcionários ACME:", funcionarios);
        exibirFuncionarios("Funcionários Terceirizados:", terceirizados);

        reajustarSalarios(funcionarios);
        System.out.println();

        System.out.println("Informação adaptada do primeiro funcionário:");
        FuncionarioAdapter adapter = new FuncionarioAdapterImpl(funcionarios.get(0));
        System.out.println(adapter.getDescricao());
    }

    private static List<Funcionario> criarFuncionarios(FuncionarioFactory factory) {
        return Arrays.asList(
                factory.criarFuncionario("Alice", Arrays.asList("999988877", "36252877"), "Rua dos Abacateiros, 77", 3000, Setor.DESENVOLVIMENTO, Cargo.JUNIOR),
                factory.criarFuncionario("Beto", Arrays.asList("987597469", "22664646"), "Rua Bartolomeu Bermeijo, 100", 5000, Setor.DEVOPS, Cargo.PLENO),
                factory.criarFuncionario("Carol", Arrays.asList("967591674", "32598989"), "Rua Clelia, 270", 7000, Setor.BANCO_DE_DADOS, Cargo.SENIOR)
        );
    }

    private static List<FuncionarioTerceirizado> criarFuncionariosTerceirizados(FuncionarioFactory factory) {
        return Arrays.asList(
                (FuncionarioTerceirizado) factory.criarFuncionario("David", Arrays.asList("971208123", "21776897"), "Rua Doutor Camaleao, 630", 2000, Setor.DESENVOLVIMENTO, Cargo.ESTAGIARIO),
                (FuncionarioTerceirizado) factory.criarFuncionario("Estevao", Arrays.asList("972812258", "40566897"), "Rua Escandinavia, 983", 6000, Setor.DEVOPS, Cargo.PLENO),
                (FuncionarioTerceirizado) factory.criarFuncionario("Fabricio", Arrays.asList("987128198", "40043535"), "Rua Doutor Camaleao, 630", 8000, Setor.BANCO_DE_DADOS, Cargo.SENIOR)
        );
    }

    private static void reajustarSalarios(List<Funcionario> funcionarios) {
        funcionarios.forEach(f -> f.reajustarSalario(10));
    }

    private static void exibirFuncionarios(String titulo, List<? extends Funcionario> funcionarios) {
        System.out.println(titulo);
        funcionarios.stream()
                .map(f -> String.format("Nome: %s, Telefones: %s, Endereço: %s, Salário: %.2f, Setor: %s, Cargo: %s",
                        f.getNome(), f.getTelefones(), f.getEndereco(), f.getSalario(), f.getSetor(), f.getCargo()))
                .forEach(System.out::println);
        System.out.println();
    }
}