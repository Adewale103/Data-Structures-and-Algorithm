package practice;

public class ConvertDaysToYearAndDay {
    public static void main(String[] args) {
        int numberOfDays = 396;
        System.out.println(convertDay(numberOfDays));
    }

    public static String convertDay(int numberOfDays) {
        int numberOfYears;
        if (numberOfDays > 360) {
            numberOfYears = numberOfDays / 360;
            numberOfDays = numberOfDays % 360;
            String result = computeNumberOfDays(numberOfDays);
            if(numberOfYears == 1){
                return String.format("%d year, %s",numberOfYears,result);
            }
            return String.format("%d years, %s",numberOfYears,result);
        }
        if(numberOfDays == 360){
            numberOfYears = 1;
            return String.format("%d year",numberOfYears);
        }
        String result = computeNumberOfDays(numberOfDays);
        if(numberOfDays == 1){
            return String.format("%d day",numberOfDays);
        }
        return String.format("%s ",result);

    }

    public static String computeNumberOfDays(int numberOfDays) {
        int numberOfMonths;
        if(numberOfDays > 30){
            numberOfMonths = numberOfDays/30;
            numberOfDays = numberOfDays%30;
            if(numberOfMonths == 1){
                return String.format("%d month, %d days",numberOfMonths,numberOfDays);
            }
            if(numberOfDays == 1){
                return String.format("%d months, %d day",numberOfMonths,numberOfDays);
            }

            return String.format("%d months, %d days",numberOfMonths,numberOfDays);
        }
        if(numberOfDays == 1){
            return String.format("%d day",numberOfDays);
        }
        return String.format("%d days",numberOfDays);

    }
}
