package br.com.testes_de_mutacao.tests;

import br.com.testes_de_mutacao.translators.UserTranslator;
import br.com.testes_de_mutacao.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTranslatorTest {

    @Test
    void ofWithSuccess() {
        String name = "Victor";
        int age = 28;

        User user = UserTranslator.of(name, age);

        Assertions.assertNotNull(user);
        Assertions.assertEquals(name, user.getName());
    }
}
