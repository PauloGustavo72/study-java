Links de boas referencias:
1. https://www.devmedia.com.br/thread-safe-java-entendendo-o-conceito-e-usando-em-sua-aplicacao/28858
2. https://www.baeldung.com/java-thread-safety



* Por padrão, um método ou uma classe sem estado já se enquadra como **thread-safety**. Por conta de não dividir recurso externo, já garante que se duas ou mais threads acessarem esse método ao mesmo tempo, devolverá o mesmo resultado.


* Outra forma de thread-safety é a classe imutavel. Uma vez que seus atributos são **final** nenhuma outra classe poderá atualiza-los. E atributos read-only não oferecem risco se lidos por mais de uma thread ao mesmo tempo.


* Classes que **herdam de Thread** ou atributos que são criados a partir de um ThreadLocal são por padrão **thread-safety**.
  * Exemplo ThreadLocal:
``` java
public class StateHolder {
    
    private final String state;

    // standard constructors / getter
} 

public class ThreadState {
    
    public static final ThreadLocal<StateHolder> statePerThread = new ThreadLocal<StateHolder>() {
        
        @Override
        protected StateHolder initialValue() {
            return new StateHolder("active");  
        }
    };

    public static StateHolder getState() {
        return statePerThread.get();
    }
}
```