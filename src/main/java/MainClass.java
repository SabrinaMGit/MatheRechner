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
        Scanner scanner = new Scanner(System.in);
        int exitCode = 0;
        while(exitCode != 1){
            System.out.println("What do you want to calculate?");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. IP Decimal to Binary");
            Integer modus = Integer.valueOf(scanner.nextLine());
            switch (modus){
                case 1: decimalToBinary(); break;
                case 2: ipDecimalToBinary(); break;
            }
            System.out.println("Do you want to repeat? y/n");
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

    private static void ipDecimalToBinary() {
        CalculationsImpl calculations = new CalculationsImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a IPv4 address (e.g. 121.69.186.253):");
        try {
            String ip = br.readLine();
            String binarySum = calculations.ipDecimalToBinary(ip);
            System.out.println("Binary : "+binarySum);
        } catch(NumberFormatException | IOException nfe) {
            System.err.println("Invalid Format!");
        }
    }
}
