package main;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "James Jones";
        person.age = 34;

        Car car = new Car();
        car.model = "Tesla Road Runner";
        car.owner = person;

        System.out.println("Car Details: ------------\n" +
                "Car owner: " + car.owner.name + "\n" +
                "Car Model: " + car.model);
    }
}
