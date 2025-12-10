package rvt;

public class Student2 extends Person {
    private double stipendija;
    private int credits;

    public Student2(String name) {
        super(name);
    }
    public Student2(String name, String adress) {
        super(name, adress);
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits += 1;
    }

    @Override
    public String toString(){
        return super.toString() + "\n\tStudy credits " + credits();

    }
}
