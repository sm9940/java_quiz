package ch04;

public class Quiz7 {
    public static void main(String[] args) {
        int sum1= 1;
        int sum2 = 1;
        int sum3 = 0;
        System.out.print(sum1+","+sum2);
        for(int x = 3 ; x<=10; x++){
            sum3 = sum1 + sum2;
            System.out.print("," + sum3);
            sum1 = sum2;
            sum2 = sum3;
        }
    }
}
