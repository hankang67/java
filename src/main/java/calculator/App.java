package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            try {
                // 첫 번째 숫자 입력 받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();
                //사칙연산
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                // 계산
                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + num1 + operator + num2 + "=" + result);
            }catch (OperationException e){
                System.out.println(e.getMessage());
                continue;
            }

            //1-8 “inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력합니다.
            //선택하는게 더 좋을 듯
            System.out.print("(1: exit, 2: remove, 3: inquiry, 4: continue): ");
            String check = sc.next();
            switch (check) {
                case "1": // exit
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("저장된 결과:");
                    for (int i = 0; i < calculator.getResults().size(); i++) {
                        System.out.println(calculator.getResults().get(i));
                    }
                    sc.close();
                    return;

                case "2": // remove
                    try {
                        calculator.remove();
                        System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");

                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case "3": // inquiry
                    System.out.println("저장된 결과:");
                    for (int i = 0; i < calculator.getResults().size(); i++) {
                        System.out.println(calculator.getResults().get(i));
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

