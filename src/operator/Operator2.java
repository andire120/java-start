package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기

        String result1 = "hello" + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b = " + 10; //int와 string를 결합하면 int가 string로 바뀜.
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }
}
