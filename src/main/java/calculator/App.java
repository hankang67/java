package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double[] save = new double[10]; // 결과를 저장할 배열
        int count = 0;

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
            // 1-5  결과 저장 1-6 요소 옮기기 추가
            if (count < save.length) {
                save[count] = result;
                count++;
            } else {
                for (int i = 1 ; i < save.length ; i++){
                    save[i - 1] = save [i] ;
                }
                save[save.length - 1] = result;

            }

            // 계산을 계속할지 안할지
            System.out.print("더 계산하려면 아무문자나 입력하세요. (exit 입력 시 종료)");

            String check = sc.next();
            if (check.equals("exit")) {
                break;
            }
        }
        //결과 출력
        System.out.println("Save:");
        for (int i =0 ;i<count;i++){
            System.out.println((i + 1) + ": " + save[i]);
        }
    }
}
