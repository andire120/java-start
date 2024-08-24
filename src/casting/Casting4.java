package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; //int + long은 long + long으로 자동 형변환 (double도 동일함)
        System.out.println("div3 = " + div3);

        double div4 =(double) 3 / 2; //소수까지 구하고 싶으면 명시적 형변환을 해야함.
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
