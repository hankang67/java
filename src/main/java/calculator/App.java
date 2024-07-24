package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;

            while(true){
                // 첫 번째 숫자 입력 받기
                System.out.println("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                System.out.println("숫자를 입력해주세요.");


                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextInt();
                //사칙연산
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                // 계산
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
                        System.out.println("잘못된 연산자 =입니다.");
                        continue;
                }
                // 계산을 계속할지 안할지
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                String check = sc.next();
                if (check.equals("exit")) {
                    break;
                }
            }


    }
}

