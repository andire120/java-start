package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmout = 1000;
        balance += depositAmout;
        System.out.println(depositAmout + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        int withdrawAmout = 2000;
        if(balance >= withdrawAmout) {
            balance -= withdrawAmout;
            System.out.println(withdrawAmout + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        else System.out.println(depositAmout + "원을 출금하려 했으나 잔액이 부족합니다.");

        System.out.println("최종 잔액: " + balance + "원");
    }
}
