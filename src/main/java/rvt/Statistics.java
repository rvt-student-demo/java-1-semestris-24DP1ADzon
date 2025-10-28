package rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
            // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        sum += number;
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum(){
        return sum;
    }   

    public double average(){
        return (double) sum / count;
    }
}