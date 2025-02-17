package object_oriented.java_constructor.constructor_with_default_values;

import java.util.Date;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make,String model, int year) {
        this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;
        this.model = (model == null || model.isEmpty()) ? "Unknown Model": model;
        this.year = (year <= 0) ? 2000 : year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2024);
        System.out.println(car1.toString());

        System.out.println();

        Car car2 = new Car("", "", -2000);
        System.out.println(car2.toString());
    }
}
