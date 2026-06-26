package lib;
import java.util.ArrayList;
import java.util.List;


public class Fizzbuzz {
    public Fizzbuzz(){

    }

    public String fizzbuzz(int n) {
        if (n %15 == 0) return "FizzBuzz";
        else if(n % 5 == 0) return "Buzz";
        else if (n % 3 == 0) return "Fizz";
        else return Integer.toString(n);
    }

    public List<String> fizzbuzz(int n, int m){
        ArrayList<String> liste = new ArrayList<>();

        for(int i = n; i <= m; i++){
            liste.add(fizzbuzz(i));
        }

        return liste;
    }
    
    
}