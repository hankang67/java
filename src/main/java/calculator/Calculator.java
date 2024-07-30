package calculator;
import java.util.*;

class OperationException extends Exception {
    public OperationException(String message) {

        super(message);
    }
}

//사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스
public abstract class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    public List<Double> results;


    //생성자
    public Calculator() {
        results = new ArrayList<>();
    }

    // Getter
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    //Setter
    public void setResults(List<Double> results) {
        this.results = results;
    }

    //계산
    public abstract double calculate(double num1, double num2, char operator) throws OperationException;

    //메소드
    public void remove() throws OperationException {
        if (!results.isEmpty()) {
            results.remove(0); // 가장 먼저 저장된 결과 삭제
        } else {
            throw new OperationException("저장된 결과가 없습니다.");
        }
    }

    //2-5 저장된 연산 결과를 조회하는 기능을 가진 메서드를 구현해보자
    public void inquiry() throws OperationException {
        System.out.println("저장된 결과 :");
        if (results.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            for (int i = 0; i < results.size(); i++) {
                System.out.println(results.get(i));
            }
        }
    }
}











































