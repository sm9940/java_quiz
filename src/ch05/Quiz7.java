package ch05;

public class Quiz7 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("합계: "+ sum);
    }
}
