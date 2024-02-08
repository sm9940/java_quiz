package ch03;

public class Quiz6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        //x는 10이기 때문에 7보다 크고 y는 5이기 때문에  y가 5보다 작거나 같다에 충족되기때문에 true가 나올것이다
        System.out.println((x>7) && (y<=5));
        //x%3은 2가 아니라 1이기때문에 거짓이고 y%2는 1이 맞기때문에 두 조건 다 거짓이기때문에 false가 나올것이다
        System.out.println((x%3==2)|| (y%2 != 1));
    }
}
