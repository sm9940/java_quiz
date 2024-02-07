package ch02;

public class Quiz4 {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';
        int intValue = byteValue;
int intValue1 = charValue;
//서로 가용범위가 달라서 자료손실이 일어날수 있음
// 특히 short는 최상위 부호비트를 음수를 표현하는데 사용함
//short shortValue = charValue;
double doubleValue = byteValue;

    }
}
