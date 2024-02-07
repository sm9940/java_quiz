package ch02;

public class Quiz8 {
    public static void main(String[] args) {

        int v1 = 1;
        System.out.println("v1:" + v1);


        if(true) {
            int v2 = 2;
            if(true) {
                int v3 = 2;
                System.out.println("v1:" + v1);
                System.out.println("v2:" + v2);
                System.out.println("v3:" + v3);
            }


            System.out.println("v1:" + v1);
            System.out.println("v2:" + v2);
            //System.out.println("v3:" + v3); //<- 오류 괄호 안에 변수가 있기 때문에 v3의 값을 가져오지 못한다
        }


        System.out.println("v1:" + v1);
       // System.out.println("v2:" + v2); //<- 오류 괄호 안에 변수가 있기 때문에 v2의 값을 가져오지 못한다

    }
}
