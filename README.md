# Projeto ACME

## Primeira Entrega

### Descrição
Nesta entrega, foi desenvolvido um projeto que simula a empresa ACME com duas entidades principais: `Funcionario` e `FuncionarioTerceirizado`.

### Funcionalidades Implementadas
1. **Entidade Funcionario**
   - Nome
   - Telefones (0 a N telefones)
   - Endereço
   - Salário
   - Setor (DESENVOLVIMENTO, DEVOPS, BANCO DE DADOS)
   - Cargo (ESTAGIÁRIO, JÚNIOR, PLENO, SÊNIOR)

2. **Entidade FuncionarioTerceirizado**
   - Nome
   - Telefones (0 a N telefones)
   - Endereço
   - Salário
   - Setor (DESENVOLVIMENTO, DEVOPS, BANCO DE DADOS)
   - Cargo (ESTAGIÁRIO, JÚNIOR, PLENO, SÊNIOR)
   - Empresa Contratada
   - Tempo Previsto de Permanência

3. **Reajuste Salarial**
   - Implementado um método para reajuste salarial que se aplica apenas aos funcionários da empresa ACME.

## Segunda Entrega

### Descrição

Nesta segunda etapa do projeto, identificamos e corrigimos “bad smells” no código e aplicamos princípios de Clean Code para melhorar a legibilidade e manutenção do projeto.

### Refatorações Realizadas

1. **Remoção de Comentários Desnecessários**: Todos os comentários foram removidos para manter o código limpo.
2. **Melhoria nos Nomes**: Nomes de variáveis e métodos foram mantidos claros e descritivos.
3. **Eliminação de Código Repetido**: Consolidamos a criação de listas de telefones diretamente na criação dos funcionários.
4. **Divisão do Método Main**: O método `main` foi dividido em métodos auxiliares menores para melhorar a legibilidade e manutenção (`criarFuncionarios`, `criarFuncionariosTerceirizados`, `reajustarSalarios`, `exibirFuncionarios`).
5. **Uso de Lambdas e Streams**: Substituímos os loops `for` por `forEach` e `streams` para tornar o código mais conciso e moderno.
6. **Redução de Getters e Setters**: Removemos getters e setters desnecessários, mantendo apenas os que são utilizados.

## Terceira Entrega

### Descrição

Na terceira e última etapa do projeto, foram implementados dois padrões criacionais, um padrão estrutural e um padrão comportamental para aprimorar a estrutura do código e demonstrar a aplicabilidade de padrões de design no projeto.

### Padrões Implementados

1. **Singleton (Padrão Criacional)**: 
   - Implementado na classe `Empresa` para garantir que apenas uma instância da empresa ACME seja criada.

2. **Factory Method (Padrão Criacional)**: 
   - Implementado nas classes `FuncionarioACMEFactory` e `FuncionarioTerceirizadoFactory` para criar instâncias de `Funcionario` e `FuncionarioTerceirizado`.

3. **Adapter (Padrão Estrutural)**: 
   - Implementado na classe `FuncionarioAdapterImpl` para adaptar a exibição dos dados dos funcionários.

4. **Observer (Padrão Comportamental)**: 
   - Implementado nas classes `Funcionario` e `RHObserver` para monitorar e notificar mudanças no salário dos funcionários.

### Exemplo de Saída

O código foi ajustado para exibir informações adicionais, incluindo as notificações do RH e a utilização do padrão Adapter:

```plaintext
Funcionários ACME:
Nome: Alice, Telefones: [999988877, 36252877], Endereço: Rua dos Abacateiros, 77, Salário: 3300.00, Setor: DESENVOLVIMENTO, Cargo: JUNIOR
Nome: Beto, Telefones: [987597469, 22664646], Endereço: Rua Bartolomeu Bermeijo, 100, Salário: 5500.00, Setor: DEVOPS, Cargo: PLENO
Nome: Carol, Telefones: [967591674, 32598989], Endereço: Rua Clelia, 270, Salário: 7700.00, Setor: BANCO_DE_DADOS, Cargo: SENIOR

Funcionários Terceirizados:
Nome: David, Telefones: [971208123, 21776897], Endereço: Rua Doutor Camaleao, 630, Salário: 2000.00, Setor: DESENVOLVIMENTO, Cargo: ESTAGIARIO
Nome: Estevao, Telefones: [972812258, 40566897], Endereço: Rua Escandinavia, 983, Salário: 6000.00, Setor: DEVOPS, Cargo: PLENO
Nome: Fabricio, Telefones: [987128198, 40043535], Endereço: Rua Doutor Camaleao, 630, Salário: 8000.00, Setor: BANCO_DE_DADOS, Cargo: SENIOR

RH notificado: Salário do Alice foi reajustado para 3300.0
RH notificado: Salário do Beto foi reajustado para 5500.0
RH notificado: Salário do Carol foi reajustado para 7700.0

Informação adaptada do primeiro funcionário:
Funcionario: Alice, Setor: DESENVOLVIMENTO, Cargo: JUNIOR

### Observações
- Este projeto não utiliza banco de dados.
- O código foi desenvolvido utilizando interfaces para garantir a flexibilidade e escalabilidade.
- A implementação dos padrões de design melhora a escalabilidade e manutenção do projeto.

### Como Executar
1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Compile e execute a classe `Main` para ver os resultados.

```markdown
javac -d out/ -sourcepath src/ src/main/java/br/com/infnet/Main.java
java -cp out/ br.com.infnet.Main
