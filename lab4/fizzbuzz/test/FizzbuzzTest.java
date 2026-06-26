package test;
import static org.junit.jupiter.api.Assertions.assertEquals ;
import org.junit.jupiter.api.Test;
import java.util.List;

import lib.Fizzbuzz;

public class FizzbuzzTest {
    Fizzbuzz fbConverter = new Fizzbuzz();

    @Test// test que 1 retourne "1"
    void test1(){
        String result = fbConverter.fizzbuzz(1);
        assertEquals("1",result);
    }
    @Test 
    void test2(){
        String result = fbConverter.fizzbuzz(2);
        assertEquals("2",result);
    }
    @Test
    void test3(){
        String result = fbConverter.fizzbuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    void test6(){
        String result = fbConverter.fizzbuzz(6);
        assertEquals("Fizz",result);
    }

    @Test
    void test9(){
        String result = fbConverter.fizzbuzz(9);
        assertEquals("Fizz",result);
    }
    
    @Test
    void test15(){
        String result = fbConverter.fizzbuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void test_listfizzbuzz(){
        List<String> result = fbConverter.fizzbuzz(1, 2);
        assertEquals(List.of("1", "2"), result);
    }

    @Test
    void test5(){
        String result = fbConverter.fizzbuzz(5);
        assertEquals("Buzz", result);
    }

    

    

    


}