package calculator;
//일반 사칙연산 계산

public class ArithmeticCalculator extends Calculator{
    //부모클래스의 생성자를 호출하자
    public ArithmeticCalculator() {
        super(new AddOperator(), new SubtractOperator(), new MultiplyOperator(), new DivideOperator());
    }

    @Override
    public double calculate(double num1, double num2, char operator) throws OperationException {
        double result;
        switch (operator) {
            case '+':
                return addOperator.operator(num1, num2);
            case '-':
                return subtractOperator.operator(num1, num2);
            case '*':
                return multiplyOperator.operator(num1, num2);
            case '/':
                return divideOperator.operator(num1, num2);
            case '%':
                result = num1 % num2;
                break;
            default:
                throw new OperationException("잘못된 연산자입니다.");
        }
        results.add(result); // 결과 저장
        return result;
    }
}
