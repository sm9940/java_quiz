package ch02;

public class Quiz7 {
    public static void main(String[] args) {
        String str = "5";
        byte var1 = Byte.parseByte(str);
        int var2 = Integer.parseInt(str);
        float var3 = Float.parseFloat(str);
        double var4 = Double.parseDouble(str);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
