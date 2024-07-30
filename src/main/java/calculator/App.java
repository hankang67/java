package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Calculator calculator = new Calculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();



        while (true) {
            try {
                System.out.println("(1: 사칙연산, 2:원의 넓이) : ");
                String check = sc.next();

                switch (check) {
                    case "1":
                        // 첫 번째 숫자 입력 받기
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        double num1 = sc.nextDouble();
                        // 두 번째 숫자 입력 받기
                        System.out.print("두 번째 숫자를 입력하세요: ");
                        double num2 = sc.nextDouble();
                        //사칙연산
                        System.out.print("사칙연산 기호를 입력하세요: ");
                        char operator = sc.next().charAt(0);

                        // 계산
                        double result = arithmeticCalculator.calculate(num1, num2, operator);
                        System.out.println("결과: " + num1 + operator + num2 + "=" + result);
                        break;


                    case "2" :
                        /* 원의 넓이를 구하는 경우 반지름을 입력받아 원의 넓이를 구한 후 출력*/
                        /* 원의 넓이 저장 */
                        /* 저장된 원의 넓이 값들 바로 전체 조회 */
                        System.out.println("원의 반지름을 입력하세요.");
                        double  radius = sc.nextDouble();
                        double area = circleCalculator.calculateCircle(radius);
                        System.out.println("원의 넓이: " + area);

                        circleCalculator.inquiryCircleAreas();

                        break;

                    default:
                        System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                        break;
                }







            } catch (OperationException e){
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
                    try {
                        arithmeticCalculator.inquiry();
                        circleCalculator.inquiryCircleAreas();

                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    sc.close();
                    return;

                case "2": // remove
                    try {
                        arithmeticCalculator.remove();
                        circleCalculator.remove();
                        System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");

                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case "3": // inquiry
                    try {
                        arithmeticCalculator.inquiry();
                        circleCalculator.inquiryCircleAreas();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
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

