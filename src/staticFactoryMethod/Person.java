package staticFactoryMethod;

public class Person {

    private final String name;
    private final String cpf;


    private Person(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public static Person createFromName(String name){
        return new Person(name, null);
    }

    public static Person createFromCPF(String cpf){
        return new Person(null, cpf);
    }


}
