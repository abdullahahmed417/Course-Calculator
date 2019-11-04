import java.lang.NumberFormatException;

import java.util.Scanner;

public class CourseCalculator {

    public static void main(String[] args) {
        int loop = 1;
        int totalPercentage = 0;
        boolean exit = false;
        
        Scanner scanner = new Scanner(System.in);

        while(loop < 4){
            System.out.print("Assignment " + loop + " mark: ");
            String input = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(input);
                if (number >= 0 && (number <= 15 && loop < 3 || number <= 20 && loop == 3 )){
                    totalPercentage+=number;
                    loop++;
                }else {
                    System.out.println("You can't get less than 0 or marks more than the maximum mark!");
                }

            }catch(NumberFormatException e){
                if (input.equals("stop")){
                    exit=true;
                    System.out.println("Exited!");
                    break;
                }else {
                    System.out.println("Please enter a number and not characters");
                    continue;
                }
            }
        }
        if (!exit){
            System.out.println("Percentage to pass the finals: " + (50 - totalPercentage) + "%");
        }


    }
}
