package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        /* 적합한 컬렉션 타입의 변수 선언 1-7*/
        List<Double> results = new ArrayList<>();

        while (true) {
            // 첫 번째 숫자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();
            //사칙연산
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 계산
            if (operator == '+') {
                result = num1 + num2;
                System.out.println("결과: " + num1 + "+" + num2 + "=" + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("결과: " + num1 + "-" + num2 + "=" + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("결과: " + num1 + "*" + num2 + "=" + result);
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("결과: " + num1 + "/" + num2 + "=" + result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
            } else if (operator == '%') {
                result = num1 % num2;
                System.out.println("결과: " + num1 + "%" + num2 + "=" + result);
            } else {
                System.out.println("잘못된 연산자입니다.");
                continue;
            }
            // 1-7 결과 저장( LIST )
            results.add(result);

            // 계산을 계속할지 안할지
            System.out.print("더 계산하려면 아무문자나 입력하세요. (exit 입력 시 종료,remove 입력 시 가장 먼저 입력된 저장결과가 삭제됩니다.");

            String check = sc.next();

            //1-7 remove 입력 받으면 가장 먼저 저장된 결과가 삭제될 것
            if (check.equals("exit")) {
                break;
            } else if (check.equals("remove")) {
                if (!results.isEmpty()) {
                    results.remove(0);
                    System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                } else {
                    System.out.println("비어있는 저장목록입니다.");
                }
            }
        }
        //결과 출력
        System.out.println("Save:");
        for (int i =0 ;i<results.size();i++){
            System.out.println((i + 1) + ": " + results.get(i));
        }
    }
}
