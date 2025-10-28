package rvt;

public class Objects {
    public static void main(String[] args) {
        Student[] studentArr = new Student[3];
        studentArr[0] = new Student("Jānis", 12);
        studentArr[1] = new Student("Speķis", 24);
        studentArr[2] = new Student("Sergejs Grigorjevs", 48);

        System.out.println(studentArr[2].getName());
        System.out.println(studentArr[2].age);
        studentArr[0].introduce();

    }
}

