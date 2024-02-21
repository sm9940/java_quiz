package ch06.Quiz24;

import ch06.Quiz23.Account;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];
    public static void main(String[] args) {
        boolean run = true;
        while (run){
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.고객등록|2.모든 고객 리스트 확인|3.포인트 사용|4.포인트 적립|5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택 > ");
            int selectNum = scanner.nextInt();

            switch (selectNum){
                case 1 : customerRegister(); break;
                case 2 : customerConfirm(); break;
                case 3 : withdraw();break;
                case 4 : deposit(); break;
                case 5 : run = false;
                break;
            }
        }
    }

    //1. 고객등록
    private static void customerRegister(){
        System.out.println("--------");
        System.out.println("고객등록");
        System.out.println("--------");
        System.out.println("고객명: ");
        String Name =scanner.next();
        System.out.println("핸드폰번호: ");
        String Phone = scanner.next();
        System.out.println("집주소: ");
        String Address = scanner.next();
        System.out.println("포인트: ");
       int Point = scanner.nextInt();
        Customer customer = new Customer(Name,Phone,Address,Point);

        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i]==null){
                customerArray[i]=customer;
        System.out.println("결과: 고객 등록이 완료되었습니다");

                break;
            }
        }
    }
    //2. 모든 고객리스트 확인
    public static void customerConfirm(){
        System.out.println("--------------");
        System.out.println("고객 리스트 확인");
        System.out.println("--------------");

        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i] != null){
                System.out.println(customerArray[i].getName()+" "+customerArray[i].getPhone()+" "+customerArray[i].getPoint());
            } else {
                break;
            }
        }

    }
    //3. 포인트사용
    private static void withdraw(){
        System.out.println("---------");
        System.out.println("포인트 사용");
        System.out.println("---------");
        System.out.print("핸드폰 번호: ");
        String Phone = scanner.next();
        System.out.print("포인트 사용: ");
        int Point = scanner.nextInt();
        Customer account = findCustomer(Phone);
        if (account == null){
            System.out.println("결과: 고객 정보가 없습니다.");
        }
        if(Point>=500 && account.getPoint()>=Point){
            account.setPoint(account.getPoint()-Point);
            System.out.println("결과:포인트 사용이 완료되었습니다. 잔여 포인트: "+account.getPoint());
        } else {
            System.out.println("사용불가");
        }
    }
    //4. 포인트 적립
    private static void deposit(){
        System.out.println("---------");
        System.out.println("포인트 적립");
        System.out.println("---------");
        System.out.print("핸드폰 번호: ");
        String Phone = scanner.next();
        System.out.print("포인트 적립: ");
        int Point = scanner.nextInt();
       Customer account = findCustomer(Phone);
       if (account == null){
           System.out.println("결과: 고객 정보가 없습니다.");
       }

       if(Point>=2000){
           account.setPoint((int) (account.getPoint()+(Point+0.1*Point)));
       }
        System.out.println("결과:적립이 완료되었습니다. 잔여 포인트: "+ account.getPoint());
    }
    //5. 핸드폰 번호로 해당 고객 객체 찾기
    private static Customer findCustomer(String Phone){
    Customer customer= null ;
        for (int i = 0; i < customerArray.length; i++) {
            if(customerArray[i]!=null){
                String dbNumber = customerArray[i].getPhone();
                if (dbNumber.equals(Phone)){
                    customer = customerArray[i];
                    break;
            }

            }
        }
        return customer;
    }
}
