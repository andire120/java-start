package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 2000000L; //long -> double
        System.out.println("doubleValue = " + doubleValue);
    } //작은 범위 -> 큰 범위로의 대입은 자바가 허용
}
