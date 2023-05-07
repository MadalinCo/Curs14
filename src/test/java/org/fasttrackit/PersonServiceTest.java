package org.fasttrackit;

import org.junit.jupiter.api.Test;

public class PersonServiceTest {
    @Test
    public void instantiatePersonClass(){
        Person person = new Person(-25,"?;",1000);
    }
    @Test
    public void getPersonState(){
        Person person = new Person(-25,"?;",1000);
        person.getId();
        person.getName();
        person.getAge();
    }
    @Test
    public void getAPersonWithRealisticAgeRange(){
        Person person = new Person(-25,"?;",1000);

    }
    @Test
    public void instantiatePersonServiceClass(){
        PersonService personService = new PersonService();
    }
    public void getAPersonWithASpecificId(){
        Person person = new Person(null,"a",12);

    }
}
