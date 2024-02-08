package ch03;

public class Quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase =(char)((ch >=65 && ch<=90)?(ch+32):ch);

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);

    }
}
