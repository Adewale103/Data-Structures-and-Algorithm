package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaDateTime {
    public static void main(String[] args) {
        System.out.println(findDay(1,6,2023));

    }
    public static String findDay(int month, int day, int year){
        String simpleDateFormat;
        try{simpleDateFormat = new SimpleDateFormat("EEEE")
                .format(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-"+month+"-"+day))
                .toUpperCase();}
        catch(ParseException ex){
            return null;
        }
        return simpleDateFormat;

    }
}
