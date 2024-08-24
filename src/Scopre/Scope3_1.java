package Scopre;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
//비효율적 메모리 사용 및 코드 복잡성 증가 때문에 스코프가 존재한다.