package rvt;

public class Student {
    private String name;
    private int age;
    // konstruktora metode
    // tiek izsaukta objekta veidošanas laikā
    // Java izveido priekš mums tukšo konstruktora metodi
    public Student(String name_, int age_){
        System.out.println("Student has been created!");
        name = name_;
        age = age_;
    }

    public int getAge(){ // getter
        return this.age;
    }

    public String getname(){ // getter
        return this.name;
    }

    public void setAge(int age){ // setter
        this.age = age;
    }

    public void setName(String name){ // setter
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "String"; // toString() metodei vienmēr jābūt public
    }

    public void introduce(){
        System.out.print("Name: " + name + ", Age: " + age);
    }
}

