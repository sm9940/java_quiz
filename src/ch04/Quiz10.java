package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
            int balance = 0;
        while(run) {
            System.out.println("----------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("----------------------");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.println("선택 >" + strNum);
              String input = scanner.nextLine();
              balance += Integer.parseInt(input);
                System.out.println("예금액 > " + input);
            } else if (strNum.equals("2")) {
                System.out.println("선택 >" + strNum);
                String output = scanner.nextLine();
                balance -= Integer.parseInt(output);
                System.out.println("출금액 >" + output);
            } else if (strNum.equals("3")) {
                System.out.println("선택 >" + strNum);
                System.out.println("잔고 >"+ balance);
            } else {
                System.out.println("선택 >" + strNum);
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
