import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate findNextDay(int year, int month, int day){
        LocalDate localDate= LocalDate.of(year, month, day);
        return localDate.plusDays(1);
    }
}
