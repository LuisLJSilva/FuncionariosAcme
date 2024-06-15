package br.com.infnet;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = criarFuncionarios();
        List<FuncionarioTerceirizado> terceirizados = criarFuncionariosTerceirizados();

        reajustarSalarios(funcionarios);

        exibirFuncionarios("Funcionários ACME:", funcionarios);
        exibirFuncionarios("Funcionarios Terceirizados:", terceirizados);
    }

    private static List<Funcionario> criarFuncionarios() {
        return Arrays.asList(
                new Funcionario("Alice", Arrays.asList("999988877", "36252877"), "Rua dos Abacateiros, 77", 3000, Setor.DESENVOLVIMENTO, Cargo.JUNIOR),
                new Funcionario("Beto", Arrays.asList("987597469", "22664646"), "Rua Bartolomeu Bermeijo, 100", 5000, Setor.DEVOPS, Cargo.PLENO),
                new Funcionario("Carol", Arrays.asList("967591674", "32598989"), "Rua Clelia, 270", 7000, Setor.BANCO_DE_DADOS, Cargo.SENIOR)
        );
    }

    private static List<FuncionarioTerceirizado> criarFuncionariosTerceirizados() {
        return Arrays.asList(
                new FuncionarioTerceirizado("David", Arrays.asList("971208123", "21776897"), "Rua Doutor Camaleao, 630", 2000, Setor.DESENVOLVIMENTO, Cargo.ESTAGIARIO, "Empresa GFT", 12),
                new FuncionarioTerceirizado("Estevao", Arrays.asList("972812258", "40566897"), "Rua Escandinavia, 983", 6000, Setor.DEVOPS, Cargo.PLENO, "Empresa Accenture", 8),
                new FuncionarioTerceirizado("Fabricio", Arrays.asList("987128198", "40043535"), "Rua Doutor Camaleao, 630", 8000, Setor.BANCO_DE_DADOS, Cargo.SENIOR, "Empresa Bad Smells", 24)
        );
    }

    private static void reajustarSalarios(List<Funcionario> funcionarios) {
        funcionarios.forEach(f -> f.reajustarSalario(10));
    }

    private static void exibirFuncionarios(String titulo, List<? extends  Funcionario> funcionarios){
        System.out.println(titulo);
        funcionarios.stream()
                .map(f -> String.format("Nome: %s, Telefones: %s, Endereço: %s, Salário: %.2f, Setor: %s, Cargo: %s",
                        f.getNome(), f.getTelefones(), f.getEndereco(), f.getSalario(), f.getSetor(), f.getCargo()))
                .forEach(System.out::println);
        System.out.println();
    }
}