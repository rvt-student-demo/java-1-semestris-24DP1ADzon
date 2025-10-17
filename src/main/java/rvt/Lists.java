package rvt;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        addingElements();

    }

public static void addingElements(){
        // int x = 20; <-- Primitīvs int
        // Integer y = 15; <-- int objekts (reference mainīgais)
        ArrayList<String> strArray = new ArrayList<>(); // Dinamiskie masīvi nevar saturēt primitīvos elementus
        strArray.add("dog");
        strArray.add("cat");
        strArray.add(0, "guinea pig");
        strArray.remove(1);
    
        for(int x = 0; x < strArray.size(); x++){
            System.out.println(strArray.get(x));
        }
    }
}


