import calculations.CalculationsImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class MainClass {

    private MainClass() {
    }

    public static void main ( String [] arguments )
    {
        int exitCode = 0;
        while(exitCode != 1){
            decimalToBinary();
            System.out.println("Do you want to repeat? y/n");
            Scanner scanner = new Scanner(System.in);
            String repeat = scanner.nextLine();
            exitCode = repeatYesOrNo(repeat);
        }
    }

    private static int repeatYesOrNo(String repeat){
        if("y".equals(repeat)){
            return 0;
        } else {
            return 1;
        }
    }

    private static void decimalToBinary() {
        CalculationsImpl calculations = new CalculationsImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a decimal number:");
        try {
            Integer decimal = Integer.parseInt(br.readLine());
            String binarySum = calculations.decimalToBinary(decimal);
            System.out.println("Binary : "+binarySum);
        } catch(NumberFormatException | IOException nfe) {
            System.err.println("Invalid Format!");
        }
    }
}
