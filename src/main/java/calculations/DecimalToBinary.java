package calculations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class DecimalToBinary {

    private int startValue;

    public String calculate(String decimal) {
        ArrayList<Integer> binaryList = new ArrayList<>();
        int startValue = Integer.parseInt(decimal);
        int roundErgebnis = -1;
        while(roundErgebnis != 0){
            System.out.println("rE: "+roundErgebnis);

            double ergebnis = startValue * 1.0 / 2;
            System.out.println("Ergebnis: "+ergebnis);

            roundErgebnis = (int) ergebnis;
            System.out.println("Gerundetes Ergebnis: "+roundErgebnis);

            if(ergebnis % 1 == 0) {
                //ist gerade
                binaryList.add(0);
                System.out.println(startValue+" : 2 = "+ roundErgebnis+" Rest: 0");
            } else {
                //ist ungerade
                binaryList.add(1);
                System.out.println(startValue+" : 2 = "+ roundErgebnis+" Rest: 1");
            }
            startValue = roundErgebnis;
        }
        Collections.reverse(binaryList);
        return binaryList.toString();
    }

    public String ipCalculation(String ip){
        System.out.println("IP: "+ip);
        String[] splitIp = ip.split("\\.");
        Stream<String> ipParts = Arrays.stream(splitIp);
        ArrayList<String> binaryList = new ArrayList<>();

        ipParts.forEach(ipPart -> {
            System.out.println("SplitIp: "+ipPart);
            binaryList.add(ipCalculationPart(Integer.valueOf(ipPart)));
        });

        return binaryList.toString();
    }

    public String ipCalculationPart(Integer decimal){
        this.startValue = decimal;
        List<Integer> list = Arrays.asList(128, 64, 32, 16, 8, 4, 2, 1);
        ArrayList<Integer> binaryList = new ArrayList<>();
        list.forEach(deneryValue -> {
            System.out.println(""+this.startValue+ " - "+deneryValue);
            if(this.startValue >= deneryValue){
                System.out.println("DeneryValue is smaller.");
                binaryList.add(1);
                int calculation = this.startValue;
                this.startValue = calculation - deneryValue;
                System.out.println(""+calculation+ " - "+deneryValue+" = "+ this.startValue);
            } else {
                System.out.println("DeneryValue is bigger.");
                binaryList.add(0);
            }
        });
        return binaryList.toString();
    }
}