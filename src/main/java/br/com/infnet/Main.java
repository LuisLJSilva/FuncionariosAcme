package br.com.infnet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        //Adicionando funcionarios
        funcionarios.add(new Funcionario("Alice", Arrays.asList("11999988877", "1136252877"), "Rua dos Abacateiros, 77", 3000, Setor.DESENVOLVIMENTO, Cargo.JUNIOR));
        funcionarios.add(new Funcionario("Beto", Arrays.asList("987597469", "22664646"), "Rua Bartolomeu Bermeijo, 100", 5000, Setor.DEVOPS, Cargo.PLENO));
        funcionarios.add(new Funcionario("Carol", Arrays.asList("967591674", "32598989"), "Rua Clelia, 270", 7000, Setor.BANCO_DE_DADOS, Cargo.SENIOR));

        List<FuncionarioTerceirizado> terceirizados = new ArrayList<>();

        // Adicionando funcionários terceirizados
        terceirizados.add(new FuncionarioTerceirizado("David", Arrays.asList("971208123", "21776897"), "Rua Doutor Camaleao, 630", 4000, Setor.DESENVOLVIMENTO, Cargo.JUNIOR, "Empresa GFT", 12));
        terceirizados.add(new FuncionarioTerceirizado("Estevao", Arrays.asList("972812258", "40566897"), "Rua Escandinavia, 983", 6000, Setor.DEVOPS, Cargo.PLENO, "Empresa Accenture", 12));
        terceirizados.add(new FuncionarioTerceirizado("Fabricio", Arrays.asList("987128198", "40043535"), "Rua Doutor Camaleao, 630", 8000, Setor.BANCO_DE_DADOS, Cargo.SENIOR, "Empresa Bad Smells", 12));

        // Reajuste salarial para funcionarios da empresa ACME
        for (Funcionario f : funcionarios){
            f.reajustarSalario(10); // 10% de reajuste
        }

        // Exibindo informações dos funcionarios
        System.out.println("Funcionarios da ACME:");
        for (Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome() + "Salario: " + f.getSalario());
        }

        System.out.println("\nFuncionários Terceirizados:");
        for(FuncionarioTerceirizado t : terceirizados){
            System.out.println("Nome: " + t.getNome() + ", Salário: " + t.getSalario() + ", Empresa Contratada: " + t.getEmpresaContratada());
        }

    }
}