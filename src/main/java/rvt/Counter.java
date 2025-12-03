package rvt;

public class Counter {

    public static void main(String[] args) {
        Counter counter1 = new Counter();   
        Counter counter2 = new Counter(5);
        
        counter1.increase();
        counter1.increase(2);
        System.out.println(counter1.value());        
        counter1.increase(1);
        System.out.println(counter1.value());        

        counter2.decrease();
        counter2.decrease(3);
        System.out.println(counter2.value());
        counter2.increase(8);
        counter2.increase();
        System.out.println(counter2.value());

    }

    private int counter;

    public Counter(){
        this.counter = 0;
    }

    public Counter(int startValue){
        this.counter = startValue;
    }

    public int value(){
        return this.counter;
    }

    public void increase(){
        this.counter++;
    }

    public void increase(int num){
        this.counter += num;
    }

    public void decrease(){
        this.counter--;
    }

    public void decrease(int num){
        this.counter -= num;
    }
}
