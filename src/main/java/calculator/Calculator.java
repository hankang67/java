package calculator;
import java.util.*;

class OperationException extends Exception {
    public OperationException(String message) {
        super(message);
    }
}

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Double> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public double calculate(double num1, double num2, char operator) throws OperationException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
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
            default:
                throw new OperationException("잘못된 연산자입니다.");
        }
        results.add(result); // 결과 저장
        return result;
    }
    public List<Double> getResults() {
        return results;
    }
}