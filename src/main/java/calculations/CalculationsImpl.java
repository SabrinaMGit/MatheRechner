package calculations;

public class CalculationsImpl implements Calculations{

    @Override
    public String decimalToBinary(Integer decimal) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        return decimalToBinary.calculate(decimal);
    }

    @Override
    public void binaryToDecimal() {

    }

    @Override
    public void decimalToHexadecimal() {

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
