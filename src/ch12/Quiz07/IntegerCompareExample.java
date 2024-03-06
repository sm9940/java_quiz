package ch12.Quiz07;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);//값이 -128~128사이에 있는 값이라 자동으로 값을 비교함
        System.out.println(obj3.equals(obj4));

    }
}
