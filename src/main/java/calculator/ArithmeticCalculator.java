package calculator;
//일반 사칙연산 계산

public class ArithmeticCalculator extends Calculator{
    //부모클래스의 생성자를 호출하자
    public ArithmeticCalculator() {
        super();
    }
    @Override
    public double calculate(double num1, double num2, char operator) throws OperationException {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new OperationException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
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
