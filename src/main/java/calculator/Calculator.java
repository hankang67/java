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
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    private List<Double> circleAreas;


    //2-6 생성자
    public Calculator() {
        results = new ArrayList<>();
        circleAreas = new ArrayList<>();
    }

    private static double radius;
    //static: 한 번 입력된 반지름의 값은 변하지 않아서
    private final static double PI = 3.14;
    // final: 3.14는 절대로 변하지 않으니까

    //계산
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
            case '%':
                result = num1 % num2;
                break;
            default:
                throw new OperationException("잘못된 연산자입니다.");
        }
        results.add(result); // 결과 저장
        return result;
    }


    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */

    // Getter
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }
    public List<Double> getCircleAreas() {
        return new ArrayList<>(circleAreas);
    }

    // Setter
    public void setResults(List<Double> results) {
        this.results = results;
    }
    public void getCircleAreas(List<Double> circleAreas) {
        this.circleAreas = circleAreas;
    }




    //2-4 remove
    public void remove() throws OperationException{
        if (!results.isEmpty()) {
            results.remove(0); // 가장 먼저 저장된 결과 삭제
        } else {
            throw new OperationException("저장된 결과가 없습니다.");
        }
    }

    //2-5 저장된 연산 결과를 조회하는 기능을 가진 메서드를 구현해보자
    public void inquiry() throws OperationException{
        System.out.println("저장된 결과 :");
        if (results. isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            for (int i = 0; i< results.size();i++){
                System.out.println(results.get(i));
            }
        }
    }

    //2-7 Calculator 클래스에 반지름을 매개변수로 전달받아 원의 넓이를 계산하여 반환해주는 메서드를 구현
    public double calculateCircle(double radius) {
       double area = PI * radius * radius;
        circleAreas.add(area);
       return area;
    }

    //원의 넓이 조회
    public void inquiryCircleAreas() {
        System.out.println("저장된 원의 넓이:");
        if (circleAreas.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            for (int i = 0; i < circleAreas.size(); i++) {
                System.out.println(circleAreas.get(i));
            }
        }
    }


}



