package ch02;

public class Quiz5 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
//        char var4 = (char) strValue;

        //String 은 객체고 참조타입
        //char 기본타입이므로 형변환이 되지않는다
    }
}
