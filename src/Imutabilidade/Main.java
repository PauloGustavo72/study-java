package Imutabilidade;

public class Main {

    public static void main(String[] args) {

        String nome = "Paulo Gustavo";

        addSobreNome(nome);

        System.out.println(nome);
    }

    private static void addSobreNome(String nome) {
        nome += " hahaha";
    }
}
