package ch02;

public class Quiz3 {
    public static void main(String[] args) {
        //문자열 + 문자열 = 문자열문자열
        System.out.println("1" + "2");
        //char형 + char형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('A'+'B');

        //char형 + int형 = int형으로 자동 타입 변환이 일어난다.
        System.out.println('1'+2);

        //char형 + char형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('1'+'2');

        //String + 다른타입 = 항상 문자열
        System.out.println('J'+"ava");

    }
}
