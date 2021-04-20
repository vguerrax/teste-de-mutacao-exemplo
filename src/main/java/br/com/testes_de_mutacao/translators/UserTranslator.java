package br.com.testes_de_mutacao.translators;

import br.com.testes_de_mutacao.models.User;

public class UserTranslator {

    private UserTranslator() {}

    public static User of(String name, int age) {
        User user = new User();

        user.setName(name);
        user.setAge(age);

        return user;
    }
}
