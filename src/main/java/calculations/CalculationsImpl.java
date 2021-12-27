package calculations;

public class CalculationsImpl implements Calculations{

    @Override
    public String decimalToBinary(String decimal) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        return decimalToBinary.calculate(decimal);
    }

    @Override
    public String ipDecimalToBinary(String ip) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        return decimalToBinary.ipCalculation(ip);
    }

    @Override
    public String binaryToDecimal(String binary) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        return binaryToDecimal.calculate(binary);
    }

    @Override
    public String decimalToHexadecimal(String decimal) {
        DecimalToHexa decimalToHexa = new DecimalToHexa();
        return decimalToHexa.calculate(decimal);
    }

    @Override
    public void hexadecimalToDecimal() {

    }

    @Override
    public void binaryToHexadecimal() {

    }

    @Override
    public void hexadecimalToBinary() {

    }
}
