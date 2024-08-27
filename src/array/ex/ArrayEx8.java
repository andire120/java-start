package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 10;
        String[] prductNames = new String[max];
        int[] prductPrice = new int[max];
        int productCount = 0;

        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int chose = scanner.nextInt();
            scanner.nextLine();

            if(chose == 1) {
                if(productCount >= max) {
                    System.out.println("더 이상 상품을 입력할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                prductNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                prductPrice[productCount] = scanner.nextInt();

                productCount++;
            }
            else if(chose == 2) {
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(prductNames[i] + " : " + prductPrice[i] + "원");
                    }
            }
            else if(chose == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else System.out.println("번호를 잘못 입력하셨습니다.");
        }
    }
}
