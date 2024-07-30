package calculator;
import java.util.*;

public class CircleCalculator extends Calculator{
    private final static double PI = 3.14;
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    private List<Double> circleAreas;

    //부모클래스로부터 호출
    public CircleCalculator() {
        super();
        circleAreas = new ArrayList<>();
    }

    @Override
    //2-7 Calculator 클래스에 반지름을 매개변수로 전달받아 원의 넓이를 계산하여 반환해주는 메서드를 구현
    public double calculate(double num1, double num2, char operator) throws OperationException{
        //추상 클래스인 Calculator를 상속받은 클래스는 반드시 calculate 메서드를 구현해야함.
        throw new UnsupportedOperationException("a");
    }
    //고마워요 stackoverflow 근데 이거 왜 이러는 지 잘 모르겠음.

    public double calculateCircle(double radius) {
        double area = PI * radius * radius;
        circleAreas.add(area);
        results.add(area);
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
