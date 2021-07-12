package com.sda.javafundamentals.generics;

import com.sda.javafundamentals.generics.model.Car;
import com.sda.javafundamentals.generics.model.Person;
import com.sda.javafundamentals.generics.repository.IdentifiableRepository;

public class Main {
    public static void main(String[] args) {
        IdentifiableRepository<Car> carRepository = new IdentifiableRepository<Car>();
        IdentifiableRepository <Person> personIdentifiableRepository = new IdentifiableRepository<Person>();
        Car car = new Car();
        car.setColor("Red");
        car.setVIN("1212343432");

        Person person = new Person();
        person.setName("Diana");
        person.setCNP("123");

        personIdentifiableRepository.addItem(person);
        carRepository.addItem(car);

        System.out.println(carRepository.getItemByID("1212343432"));

        System.out.println(carRepository.getItemByID("2"));


        carRepository.removeItem("1212343432");

        System.out.println(carRepository.getItemByID("1212343432"));
    }
}
