package rvt;

public class Student {
    private String name;
    int age;
    // konstruktora metode
    // tiek izsaukta objekta veidošanas laikā
    // Java izveido priekš mums tukšo konstruktora metodi
    public Student(String name_, int age_){
        System.out.println("Student has been created!");
        name = name_;
        age = age_;
    }

    public String getName() {
        return name;
    }

    public void introduce(){
        System.out.print("Name: " + name + ", Age: " + age);
    }
}

