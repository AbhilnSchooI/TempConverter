import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempC;
        double tempF;
        boolean enteredTemp = true;
        boolean valid = true;
        double num = 0;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();
                tempF = (tempC * 9 / 5) + (32);

                System.out.printf("%-10s %7.2f", "Degrees C:", tempC);
                System.out.printf("\n%-10s %7.2f", "Degrees F:", tempF);
                System.out.println();
            }else{
                while(valid){
                    if (scan.hasNextDouble()) {
                        tempC = scan.nextDouble();
                        tempF = (tempC * 9 / 5) + (32);

                        System.out.printf("%-10s %7.2f", "Degrees C:", tempC);
                        System.out.printf("\n%-10s %7.2f", "Degrees F:", tempF);
                        System.out.println();
                        break;
                    }
                    System.out.println("you have entered an invalid temperature value. Please try again.");
                    scan.nextLine();
                }
            }

            scan.nextLine();
            System.out.println("do you want to continue? (Y/N)");
            String keepGoing = scan.nextLine();

            if(keepGoing.equalsIgnoreCase("N")){
                enteredTemp = false;
            }

        } while (enteredTemp);

    }
}