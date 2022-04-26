package org.example;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramingApproachDeclvsIntr{

    static class Person{

        private String gender;
        private String name;

        public Person(String gender, String name) {
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String args[]){
       List<Person> person=List.of(new ProgramingApproachDeclvsIntr.Person("MALE","SAURAV"),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","APARNA"),
                new ProgramingApproachDeclvsIntr.Person("FEMALE","MANJU"),
               new ProgramingApproachDeclvsIntr.Person("MALE","AMIT");
               new ProgramingApprochDeclcsIntr.Person("MALE", "YUVA");
                 new ProgramingApprochDeclcsIntr.Person("FEMALE", "BHOOMIKA"));
                


       //Imperative
        //loop to take out females from the list of persons
        List<Person> personfemale=new ArrayList<>();

        System.out.println("Imperative programing");
        for(Person p:person){ //
            if("FEMALE".equalsIgnoreCase(p.gender)) //
            personfemale.add(p);
        }
        //loop to print females stored
        for(Person p:personfemale){
            System.out.println(p);
        }


        //Declarative
        System.out.println("Declarative programing");
        person.stream().filter(i-> "FEMALE".equalsIgnoreCase(i.gender)).collect(Collectors.toList()).forEach(System.out::println);


    }
}


