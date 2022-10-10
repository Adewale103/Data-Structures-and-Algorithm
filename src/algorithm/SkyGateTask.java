package algorithm;

public class SkyGateTask {
    public static void main(String[] args) {
        String[] records = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] records2 = {"Kim Ramos 4 5 6", "Giovanni Landry 10 10"};
        String[] records3 = {"Henrietta Moon;5;5;8", "Edwin Bonilla;100"};

        System.out.println(solution(records));
        System.out.println(solution(records2));
        System.out.println(solution(records3));
    }
    private static String solution(String[] students){
        StringBuilder finalResult = new StringBuilder();
        for (String student : students) {
            String resultFromStudent = execute(student);
            finalResult.append(resultFromStudent).append(";");
        }
        return finalResult.substring(0,finalResult.length()-1);

    }
    private static String execute(String student){
        StringBuilder StudentName = new StringBuilder();
        int i = 0;
        while (!Character.isDigit(student.charAt(i)) && student.charAt(i) != ';'){
            StudentName.append(student.charAt(i));
            i++;
        }
        int sum = 0;
        int average = 0;
        int count = 0;
        for (int j = 0; j < student.length(); j++) {
            if((j < (student.length()-2)) && Character.isDigit(student.charAt(j)) && (Character.isDigit(student.charAt(j+1)))
                    && (Character.isDigit(student.charAt(j+2)))){
                    sum += 0;
                count++;
            }
            else if((j < (student.length()-1)) && Character.isDigit(student.charAt(j)) && (Character.isDigit(student.charAt(j+1)))
                    && (!Character.isDigit(student.charAt(j-1)))){
                    String firstNumber = String.valueOf(student.charAt(j));
                    String secondNumber = String.valueOf(student.charAt(j+1));
                    String combinedNumber = firstNumber+secondNumber;
                    if(Integer.parseInt(combinedNumber) <= 10){
                        sum += Integer.parseInt(combinedNumber);
                    }
                    count++;
                }
            else if(Character.isDigit(student.charAt(j)) &&( (student.charAt(j-1) == ' ') || (student.charAt(j-1) == ';'))){
                sum += Integer.parseInt(String.valueOf(student.charAt(j)));
                count++;
            }
        }
        if(count > 0) {
            average = sum / count;
        }
        if(!Character.isLetter(StudentName.charAt(StudentName.length() - 1))){
            StudentName = new StringBuilder(StudentName.substring(0, (StudentName.length() - 1)));
        }
        return String.format("%s-%d",StudentName,average);
    }
}
