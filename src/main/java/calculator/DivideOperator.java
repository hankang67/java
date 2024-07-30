package calculator;

public class DivideOperator {
    public double operator(double num1, double num2) throws OperationException {
        if (num2 == 0) {
            throw new OperationException("0이 아닌 정수");
        }
        return num1 / num2;
    }
}
