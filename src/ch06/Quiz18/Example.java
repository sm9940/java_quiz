package ch06.Quiz18;

public class Example
{
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    //static int cv2 = iv; // 첫번째 컴파일 에러:정적 필드에 인스턴스 필드를 가져와서


    static void staticMethod1() {
        System.out.println(cv);
      //  System.out.println(iv); // 두번째 컴파일 에러: 정적 메소드에 인스턴스 필드를 가져와서
    }


    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }


    static void staticMethod2() {
        staticMethod1();
     //   instanceMethod1();   // 세번째 컴파일 에러 :정적 메소드에 인스턴스 메소드를 가져와서
    }


    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}

