package br.com.testes_de_mutacao.tests;

import br.com.testes_de_mutacao.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void newSuccess() {
        String name = "Victor";
        int age = 29;

        User user = new User();
        user.setName(name);
        user.setAge(age);

        Assertions.assertEquals(name, user.getName());
        Assertions.assertEquals(age, user.getAge());
    }

    @Test
    void isAnAdultTrue() {
        String name = "Victor";
        int age = 18;

        User user = new User();
        user.setName(name);
        user.setAge(age);

        Assertions.assertTrue(user.isAnAdult());
    }
}
