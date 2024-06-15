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

### Observações
- Este projeto não utiliza banco de dados.
- O código foi desenvolvido de forma simples, sem a necessidade de interfaces adicionais.

### Como Executar
1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Compile e execute a classe `Main` para ver os resultados.

```markdown
javac -d out/ -sourcepath src/ src/main/java/br/com/infnet/Main.java
java -cp out/ br.com.infnet.Main
