package hackerrank;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));
    }
    public static String dayOfProgrammer(int year) {

        int mainDay = 256;

        int otherMonthSumApartFromFebruary = 215;
        // Write your code here
        if(year >=1700 && year <= 1917){
            if(year % 4 == 0){
                otherMonthSumApartFromFebruary+=29;
            }
            else{
                otherMonthSumApartFromFebruary+=28;
            }
        }
        if(year == 1918){
            otherMonthSumApartFromFebruary+=14;
        }

        if(year >=1919 && year <=2700){
            if(year % 400 == 0 ||((year%4==0)&&(year%100!=0))){
                otherMonthSumApartFromFebruary+=29;
            }
            else{
                otherMonthSumApartFromFebruary+=28;
            }
        }
        int finalDay = mainDay-otherMonthSumApartFromFebruary;
        return  String.format("%2d.%s.%4d",finalDay,"09",year);
    }
}
