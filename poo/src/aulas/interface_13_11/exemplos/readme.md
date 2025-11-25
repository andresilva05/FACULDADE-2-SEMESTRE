# Exercício: complete o exemplo e crie o arquivo readme.md

# Interface
Este roteiro de implementação demonstra o uso de **interfaces**, **implementação de métodos** e **poliformismo**.

## Veículo
A interface Veiculo representa o contrato que qualquer tipo de veiculo deve seguir.
Ela define **o que** precisa ser feito, mas não **como** será feito.

```java
public interface Veiculo {
    void acelerar();

    void frear();
}
```

## Carro
Classe que representa um carro do tipo veiculo

```java
public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando com motor!");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando com ABS!");
    }
}
```

## Bicicleta
Classe que representa bicicleta do tipo veiculo

```java
public class Bicicleta implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando com pedal!");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando com os freios manuais!");
    }
}
```

## App
Classe que iterage com usuario. Ela hospeda o método `main()` e outros métodos que atuam com a coleta de dados. Essa
classe não possui **regra de negócio**, apenas organiza entradas e saídas.

```java
public class App {
    public static void main(String[] args) {

        // Polimorfismo: mesmas chamadas, comportamentos diferentes
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        System.out.println("--- Testando Carro ---");
        v1.acelerar();
        v1.frear();

        System.out.println("\n--- Testando Bicicleta ---");
        v2.acelerar();
        v2.frear();
    }
}