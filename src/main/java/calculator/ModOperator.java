package calculator;

public class ModOperator{
    public double operator(double num1, double num2) throws OperationException {
        if (num2 == 0) {
            throw new OperationException("0으로 나눌 수 없습니다.");
        }
        return num1 % num2;
    }
}
