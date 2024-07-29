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

            //1-8 “inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력합니다.
            //선택하는게 더 좋을 듯
            System.out.print("계속 계산하려면 아무 문자나 입력하세요. (1: exit, 2: remove, 3: inquiry, 4: continue): ");
            String check = sc.next();
            switch (check) {
                case "1": // exit
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("저장된 결과:");
                    for (int i = 0; i < results.size(); i++) {
                        System.out.println(results.get(i));
                    }
                    sc.close();
                    return;

                case "2": // remove
                    if (!results.isEmpty()) {
                        results.remove(0); // 가장 먼저 저장된 결과 삭제
                        System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                    } else {
                        System.out.println("저장된 결과가 없습니다.");
                    }
                    break;

                case "3": // inquiry
                    System.out.println("저장된 결과:");
                    for (int i = 0; i < results.size(); i++) {
                        System.out.println(results.get(i));
                    }
                    break;


                case "4": // continue
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 계속 계산을 진행합니다.");
                    break;
            }


            }
        }
    }

