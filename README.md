# Conversor de Moedas

Esta aplicação é um conversor de moedas que utiliza a API ExchangeRate para obter as taxas de conversão entre diferentes moedas. O usuário pode inserir a moeda base, a moeda para a qual deseja converter, e o valor a ser convertido. A aplicação então realiza a conversão e exibe o resultado.

## Estrutura do Projeto

O projeto está organizado em pacotes para separar a lógica de controle, modelos e a classe principal:

- `com.br.alura.conversor.controle`: Contém a classe `Conversor` que é responsável por realizar a conversão de moedas utilizando a API ExchangeRate.
- `com.br.alura.conversor.modelos`: Contém a classe `Moeda` que é usada para modelar os dados retornados pela API.
- `Principal`: Contém a classe principal que interage com o usuário e utiliza a classe `Conversor` para realizar as conversões.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
3. Adicione a biblioteca `Gson` ao seu projeto para fazer o parsing do JSON retornado pela API. Você pode baixar a biblioteca [aqui](https://github.com/google/gson).
4. Na classe `Conversor`, substitua `YOUR_API_KEY` pela sua chave de API do ExchangeRate.

### Executando a Aplicação

1. Compile o projeto.
2. Execute a classe `Principal`.

### Exemplo de Uso

Quando a aplicação for executada, ela solicitará que você insira:

- A moeda base no formato de sigla (exemplo: BRL, USD, EUR).
- A moeda de comparação.
- O valor da moeda base que deseja converter.

A aplicação então realizará a conversão e exibirá o resultado.

### Exemplo de Execução

```sh
Digite a moeda base no formato SIGLA (exemplo: BRL/USD/EUR): USD
Digite a moeda de comparação: BRL
Digite o valor da moeda base que você deseja converter: 100
Moeda { Sigla = USD, Moeda comparada = BRL, última atualização de cotação: 2023-06-26T00:00:00Z, Conversão unitária da moeda = 5.12, Conversão final desejada = 512.0 }
Deseja continuar (SIM = 1 / NÃO = 0)? 0
Finalizando conversor...
