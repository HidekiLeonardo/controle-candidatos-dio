# Processo Seletivo - Simulação de Contato com Candidatos

Este projeto é uma simulação de um processo seletivo automatizado que avalia candidatos com base em suas expectativas salariais, realiza seleção de candidatos e tenta entrar em contato com os selecionados.

## Tecnologias Utilizadas
- Linguagem: Java
- Pacote: `java.util.Random`, `java.util.concurrent.ThreadLocalRandom`

## Funcionalidades
O programa possui as seguintes funcionalidades:

### 1. Análise de Candidatos
A função `analisarCandidato(double salarioPretendido)` compara o valor salarial esperado pelo candidato com um salário base definido (R$ 2000,00) e decide se o candidato deve ser contatado.

### 2. Seleção de Candidatos
A função `selecaoCandidatos()` analisa uma lista de candidatos e escolhe até 5 deles, desde que sua pretensão salarial esteja dentro do orçamento da empresa.

### 3. Impressão dos Selecionados
A função `imprimirSelecionados()` exibe no console os candidatos selecionados.

### 4. Tentativa de Contato
A função `entrandoEmContato(String candidato)` tenta contatar cada candidato até 3 vezes. Caso ele atenda, o contato é considerado bem-sucedido.

## Como Executar o Projeto
1. Clone este repositório para sua máquina local.
2. Compile e execute o arquivo `ProcessoSeletivo.java` utilizando um ambiente compatível com Java.

```sh
javac ProcessoSeletivo.java
java ProcessoSeletivo
```

3. Observe os resultados no console.

## Possíveis Melhorias
- Implementar entrada de dados via usuário ao invés de utilizar listas fixas de candidatos.
- Criar um banco de dados para armazenar informações sobre os candidatos.
- Melhorar a simulação de contato com respostas mais realistas.

## Autor
Este código foi criado para fins didáticos e de simulação de processos de seleção de candidatos.

