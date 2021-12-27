import calculations.CalculationsImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            System.out.println("3. Binary to Decimal");
            int modus = Integer.parseInt(scanner.nextLine());
            switch (modus) {
                case 1 -> decimalToBinary(modus);
                case 2 -> ipDecimalToBinary(modus);
                case 3 -> binaryToDecimal(modus);
                case 4 -> decimalToHexa(modus);
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

    private static void decimalToBinary(Integer modus) {
        inputCalculateOutputForm("Enter a decimal number: ", modus, "Binary: ");
    }

    private static void ipDecimalToBinary(Integer modus) {
        inputCalculateOutputForm("Enter a IPv4 address (e.g. 121.69.186.253): ", modus, "Binary: ");
    }

    private static void binaryToDecimal(Integer modus) {
        inputCalculateOutputForm("Enter Binary: ", modus, "Decimal: ");
    }

    private static void decimalToHexa(int modus) {
        inputCalculateOutputForm("Enter a decimal number: ", modus, "Hexa: ");
    }

    private static void inputCalculateOutputForm(String enterText, Integer modus, String outputText){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(enterText);
        try {
            String readLine = br.readLine();
            String binarySum = execModusMethod(readLine, modus);
            System.out.println(outputText+binarySum);
        } catch(NumberFormatException | IOException nfe) {
            System.err.println("Invalid Format!");
        }
    }

    private static String execModusMethod(String readLine, Integer modus){
        CalculationsImpl calculations = new CalculationsImpl();
        return switch (modus) {
            case 1 -> calculations.decimalToBinary(readLine);
            case 2 -> calculations.ipDecimalToBinary(readLine);
            case 3 -> calculations.binaryToDecimal(readLine);
            default -> null;
        };
    }
}
