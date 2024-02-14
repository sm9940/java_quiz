package ch05;

public class Quiz8 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = array[0];
        int min = array[1];
        for (int i = 0; i < array.length ; i++) {
    if(max<array[i]) max = array[i];
     if(min>array[i]) min = array[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
