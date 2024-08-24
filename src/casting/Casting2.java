package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; 컴파일 오류 발생
        intValue = (int) doubleValue; //큰 범위 -> 작은범위의 경우 명시적으로 데이터타입을 명시하면 됨.
        System.out.println(intValue);
    }
}
