import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class DateNextDateOkTest
{
    
    @Test
    void test_next_date_normal_day(){
        Date d = new Date(1700, 6, 20);
        Date next = d.nextDate();
        assertEquals(new Date(1700 , 6, 21), next);
    }

    @Test
    void test_next_date_end_month_31_days(){
        Date d = new Date(2026, 1, 31);
        Date next = d.nextDate();
        assertEquals(new Date( 2026, 2, 1), next);
    }

    @Test
    void test_next_date_end_month_30_days(){
        Date d = new Date(1, 4, 30);
        Date next = d.nextDate();
        assertEquals(new Date( 1, 5, 1), next);
    }

    @Test
    void test_next_date_end_feb_bissextile(){
        Date d = new Date(2000, 2, 29);
        Date next = d.nextDate();
        assertEquals(new Date( 2000, 3, 1), next);
    }

    @Test
    void test_next_date_end_feb_no_bissextile(){
        Date d = new Date(4001, 2, 28);
        Date next = d.nextDate();
        assertEquals(new Date( 4001, 3, 1), next);
    }

    @Test
    void test_next_date_end_feb_no_bissextile_siecle(){
        Date d = new Date(1500 , 2, 28);
        Date next = d.nextDate();
        assertEquals(new Date( 1500, 3, 1), next);
    }

    @Test
    void test_next_date_end_year(){
        Date d = new Date(5, 12, 31);
        Date next = d.nextDate();
        assertEquals(new Date( 6, 1, 1), next);
    }



}