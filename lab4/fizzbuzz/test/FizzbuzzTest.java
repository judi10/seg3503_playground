package test;
import static org.junit.jupiter.api.Assertions.assertEquals ;
import org.junit.jupiter.api.Test;

import lib.Fizzbuzz;

public class FizzbuzzTest {
    Fizzbuzz fbConverter = new Fizzbuzz();

    @Test// test que 1 retourne "1"
    void test1(){
        String result = fbConverter.converter(1);
        assertEquals("1",result);
    }
    @Test 
    void test2(){
        String result = fbConverter.converter(2);
        assertEquals("2",result);
    }
    @Test
    void test3(){
        String result = fbConverter.converter(3);
        assertEquals("Fizz",result);
    }

    @Test
    void test6(){
        String result = fbConverter.converter(6);
        assertEquals("Fizz",result);
    }

    @Test
    void test9(){
        String result = fbConverter.converter(9);
        assertEquals("Fizz",result);
    }

    

    

    


}