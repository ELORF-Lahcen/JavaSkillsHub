package objectoriented.javaconstructor.defaultconstructor;

public class Cat {

    private String name;
    private int age;
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();

        System.out.println("Cat's Name : " + myCat.getName());
        System.out.println("Cat's Age : " + myCat.getAge());
    }
}
