package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자
        int a = 1,b = 0;

        b = ++a; //a를 증가시키고, b에 대입
        System.out.println("a = " + a + ", b = " + b);


        //후의 증감 연산자
        a = 1;
        b = 0;

        b = a++;  //b에 대입하고, a의 값을 증가시킴.
        System.out.println("a = " + a + ", b = " + b);
    }
}
