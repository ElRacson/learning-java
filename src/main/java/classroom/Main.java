package classroom;

public class Main {
    public static void main(String[] args) {

        // How to create object

        Car myFirstCar = new Car();

        // How to print object?

        System.out.println(myFirstCar);

        // Set carBrand
        myFirstCar.setCarBrand("Audi");
        System.out.println(myFirstCar);

        // Set all other fields
        myFirstCar.setModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Race Blue");
        System.out.println(myFirstCar);

        // Create a new object car, set all fields and print object out;

        Car mySecondCar = new Car();
        System.out.println(mySecondCar);

        myFirstCar.setModel("Volvo");
        System.out.println(mySecondCar);

        myFirstCar.setModel("S60");
        myFirstCar.setProductionYear(2020);
        myFirstCar.setMileage(8);
        myFirstCar.setColor("Dark Red");
        System.out.println(mySecondCar);


        Car myBmwCar = new Car("BMW", "X5", 2020, 130_000, "black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Octavia")
                .setProductionYear(2022)
                .setMileage(6)
                .setColor("Mamba Green")
                .build();

        System.out.println(mySkoda);

        mySkoda.start();

        mySkoda.drive(1_000);
        mySkoda.drive(2_000);

        Cat barsik = new Cat("Barsik", "Male", 1, "Ginger");
        System.out.println(barsik);
        barsik.setAge(2);
        barsik.sleep();
        barsik.walk();


    }
}
