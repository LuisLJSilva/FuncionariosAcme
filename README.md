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
