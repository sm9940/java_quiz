package ch09.Quiz02;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사합니다.");
            }
        };
        action.work();
    }
}