package br.com.testes_de_mutacao.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private int age;

    public boolean isAnAdult() {
        return age >= 18;
    }
}
