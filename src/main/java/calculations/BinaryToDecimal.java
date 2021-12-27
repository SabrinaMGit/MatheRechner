package calculations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinaryToDecimal {

    public String calculate(String binary){
        String reverse = new StringBuilder(binary).reverse().toString();
        String[] splitedStringToArray = reverse.split("(?!^)");
        final double[] sum = {0.0};
        IntStream.iterate(0, i -> i + 1).limit(binary.length()).forEach(i -> {
            double result = Integer.parseInt(splitedStringToArray[i]) * Math.pow(2,i);
            sum[0] = result + sum[0];
        });
        return Arrays.toString(sum);
    }
}
