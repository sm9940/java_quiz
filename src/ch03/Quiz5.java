package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        int lengthTop =5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double)(lengthTop+lengthBottom) * height / 2 ;
        System.out.println(area);

        // 1. (lengthTop+lengthBottom) * height / 2.0 O
        // 2. (lengthTop+lengthBottom) * height * 1.0 / 2 O
        // 3. (double)(lengthTop+lengthBottom) * height / 2 O
        // 4. (double)( (lengthTop+lengthBottom) * height / 2) x
        //((length+lengthBottom) * height /2)가 int값으로 먼저 계산 되어서
        // double로 강제 변환되기 때문에 52.5가 아닌 52.0으로 데이터 손실이 난다
    }
}
