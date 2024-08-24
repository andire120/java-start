package Scopre;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //전역변수
        if(true) {
            int x = 20; //지역변수
            System.out.println("in m = " + m);
            System.out.println("in x = " + x);
        }
        //System.out.println("main x" + x); 변수 x에 접근 불가
        System.out.println("main m = " + m);

    }
}
