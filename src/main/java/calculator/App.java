package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();


        System.out.println("사칙연산 기호를 입력하세요.");
        /*chatAt(idx) : charAt 메서드는 매개변수로 char 타입으로 변환 하고자 하는 문자열의 위치를 받는다.*/
        char operator = sc.next().charAt(0);
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + num1 + "+" + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + num1 + "-" + num2 + "=" + result);

                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + num1 + "*" + num2 + "=" + result);

                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("결과: " + num1 + "/" + num2 + "=" + result);

                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("다시 입력해주세요.");
        }

    }
}

