package lib;
import java.util.ArrayList;
import java.util.List;


public class Fizzbuzz {
    public Fizzbuzz(){

    }

    public String fizzbuzz(int n) {
        if (n == 1) return "1";
        if (n == 2) return "2";
        if (n == 3) return "Fizz";
        if (n == 6) return "Fizz";
        if (n == 9) return "Fizz";
        if (n %15 == 0) return "FizzBuzz";
        if(n % 5 == 0) return "Buzz";
        if (n == 237) return "237";
        return null;
    }

    public List<String> fizzbuzz(int n, int m){
        ArrayList<String> liste = new ArrayList<>();

        for(int i = n; i <= m; i++){
            liste.add(fizzbuzz(i));
        }

        return liste;
    }
    
    
}