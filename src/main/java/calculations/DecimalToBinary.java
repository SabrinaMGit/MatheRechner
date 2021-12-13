package calculations;

import java.util.ArrayList;
import java.util.Collections;

public class DecimalToBinary {

    public String calculate(Integer decimal) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int startValue = decimal;
        int roundErgebnis = -1;
        while(roundErgebnis != 0){
            System.out.println("rE: "+roundErgebnis);

            double ergebnis = startValue * 1.0 / 2;
            System.out.println("Ergebnis: "+ergebnis);

            roundErgebnis = (int) ergebnis;
            System.out.println("Gerundetes Ergebnis: "+roundErgebnis);

            if(ergebnis % 1 == 0) {
                //ist gerade
                arrayList.add(0);
                System.out.println(startValue+" : 2 = "+ roundErgebnis+" Rest: 0");
            } else {
                //ist ungerade
                arrayList.add(1);
                System.out.println(startValue+" : 2 = "+ roundErgebnis+" Rest: 1");

            }
            startValue = roundErgebnis;
        }
        Collections.reverse(arrayList);
        return arrayList.toString();
    }
}