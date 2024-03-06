package ch12.Quiz05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";



        for (int i = 0; i <= 100 ; i++) {
            str = new StringBuilder()
                    .append(str+=i)
                    .toString();


        }

        System.out.println(str);
    }
}

