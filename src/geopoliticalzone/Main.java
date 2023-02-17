package geopoliticalzone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the state: ");
        try {
            String state = scanner.nextLine();
            System.out.println("The geo-political of the state you selected is "+GeoPoliticalZone.getPoliticalZone(state));
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }


    }
}
