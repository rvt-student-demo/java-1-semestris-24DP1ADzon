package rvt;

public class Person {

    private String name;
    private String adress;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, null, 0, 0, 0);
    }

    public Person(String name, String adress){
        this(name, adress, 0, 0, 0);
    }

    public Person(String name, String adress, int age, int height, int weight) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public String getAdress(){
        return this.adress;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + "\n\t" + this.adress;
    }
}