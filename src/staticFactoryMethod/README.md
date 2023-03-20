# Static Method Factory

Esse padrão visa encapsular o construtor. O objetivo é deixar o construtor private e criar métodos cujos os nomes são mais intuitivos.

## Qual a motivação que gerou esse pattern ?
Construtores com muitos parâmetros são ruin para leitura, exemplo:
```java 
Pessoa p = new Pessoa("João", 12, "111.222.333-44", "12982658287");
```
Visando melhorar a legibilidade, agora se criou contrutores como:
```java
Pessoa p = Pessoa.createFromNome("João");
Pessoa p = Pessoa.createFromCPF("111.222.333-44");
```

## Quais benefícios em se usar esse pattern ?
* Melhor legibilidade do código
* Possibilidade de controlar regras internas da classe, como [por exemplo número de conexões com base de dados](https://stackoverflow.com/questions/929021/what-are-static-factory-methods/929045#929045)

