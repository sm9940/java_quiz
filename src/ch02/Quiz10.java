package ch02;

public class Quiz10 {
    public static void main(String[] args) {
        int b = 256; //허용범위가 -128~127까지이기 때문에 잘못되었다
        char c = ' '; //‘’에 공백이 없기 때문에 틀렸다
        String answer = "no"; //char 의 문자는 하나만 들어갈수 있기 때문에 no는 안된다
        double d = 1.4e3f; //1.4 * 10^3
        System.out.println((int)' ');
    }
}
