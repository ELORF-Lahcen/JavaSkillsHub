package object_oriented.java_constructor.parameterized_constructor;

public class Dog {

    private String name;
    private String color;

    public Dog(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Mikel", "Brown");

        System.out.println("Dog's Name : " + myDog.getName());
        System.out.println("Dog's Color : " + myDog.getColor());
    }
}
