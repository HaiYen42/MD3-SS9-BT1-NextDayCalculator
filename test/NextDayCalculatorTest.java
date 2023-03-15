import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void findNextDay() {
        int year=2018;
        int month=1;
        int day=1;

        LocalDate expected= LocalDate.of(2018, 1,2);
        LocalDate result= NextDayCalculator.findNextDay(year, month,day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Find next day of 31")
    void findNextDay2(){
        int year = 2018;
        int month= 1;
        int day =31;

        LocalDate expected= LocalDate.of(2018, 2, 1);
        LocalDate result= NextDayCalculator.findNextDay(year, month, day);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay3(){
        int year= 2018;
        int month= 4;
        int day= 30;

        LocalDate result= NextDayCalculator.findNextDay(year, month, day);
        LocalDate expected= LocalDate.of(2018, 5,1);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay4(){
        int year= 2018;
        int month= 2;
        int day= 28;

        LocalDate result= NextDayCalculator.findNextDay(year, month, day);
        LocalDate expected= LocalDate.of(2018, 3, 1);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay5(){
        int year= 2020;
        int month= 2;
        int day= 29;

        LocalDate result= NextDayCalculator.findNextDay(year, month, day);
        LocalDate expected= LocalDate.of(2020, 3, 1);
        assertEquals(expected, result);
    }

    @Test
    void findNextDay6(){
        int year= 2018;
        int month= 12;
        int day= 31;

        LocalDate result= NextDayCalculator.findNextDay(year, month, day);
        LocalDate expected= LocalDate.of(2019, 1,1);
        assertEquals(result, expected);
    }


}