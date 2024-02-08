package ch03;

public class Quiz1 {
    public static void main(String[] args) {
      int x = 10;
      int y = 20;
      int z = (++x) + (y--);

      //x는  전위여서 먼저 더해진 값인 11 y는 후위여서 -가 안된 20이 더해져서
        //답은 31
        System.out.println(z);
    }
}
