import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateNextDateExceptionTest
{

    // 1500 02 31 IllegalArgumentException
    
    @Test
    void test_february_31_day(){
        assertThrows (
            IllegalArgumentException.class,
            () -> new Date(1500,02,31)
        );
        
    }
    @Test
    void test_february_29_day(){
        assertThrows (
            IllegalArgumentException.class,
            () -> new Date(1500,02,29)
        );
        
    }

    @Test
    void negative_year(){
        assertThrows (
            IllegalArgumentException.class,
            () -> new Date(-1,10,20)
        );
        
    }

    @Test
    void more_than_twelveMonth(){
        assertThrows (
            IllegalArgumentException.class,
            () -> new Date(1458,15,12)
        );
        
    }

    @Test
    void negative_day(){
        assertThrows (
            IllegalArgumentException.class,
            () -> new Date(1975,6,-50)
        );
        
    }




}