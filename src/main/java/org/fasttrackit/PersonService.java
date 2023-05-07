package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    /*
    public  Person addPerson(Person person){

    }
    public Person removePerson(int id){

    }
    */
    public static List<Person> getAllPersons(){
        List<Person>people = new ArrayList<>();
        for(Person person: people){
            people.add(person);
        }
        return  people;
    }

    public List<Person> getPersonsOlderThan(int age){
        List<Person> people = new ArrayList<>();
        for(Person person: people){
            if(person.getAge()>0||person.getAge()<120) {
                people.add(person);
            }
        }
        return people;
    }
    public List<String> getAllPersonNames(){
        List<String>  allPersonNames = new ArrayList<>();
        List<Person> people = PersonService.getAllPersons();

        for (Person person:people){
            allPersonNames.add(person.getName());
        }
        return allPersonNames;
    }

    public Person getPerson(String name ) {

        List<Person> people = PersonService.getAllPersons();
        Person personFound = null;
        for (Person person : people) {
            if (name == person.getName()) {
                personFound = new Person(person.getId(), person.getName(), person.getAge());
            }
        }
        return personFound;

    }

}
