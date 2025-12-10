package rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name) {
        super(name); // Izsauc Person()
    }
    public Teacher(String name, String adress, int salary) {
        super(name, adress); // Izsauc Person()
        this.salary = salary;
    }

    int getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {     
        return super.toString() + "\n\tsalary " + this.getSalary() + " euro/month";
    }
    
}
