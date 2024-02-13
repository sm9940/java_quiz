package ch04;

public class Quiz1 {
    public static void main(String[] args) {
        int x=11;
        if(10<x && x<20){
            System.out.println(x);
        }
        char ch = 'z';
        if(ch != ' '){
            System.out.println(ch);
        }
        char ch1 = 'X';
        if(ch1 == 'X'|| ch1 == 'x') {
            System.out.println(ch1);
        }
        char ch2 = '3';
        if (ch2>='0'&& ch2<='9'){
            System.out.println(ch2);
        }
        char ch3 = 't';
        if(('a'<=ch3 && ch3<='z')||('A'<=ch3 && ch3<='Z')){
            System.out.println(ch3);
        }
        int year =2000;
        if((year%400==0)||(year%4==0&&year%100!=0)){
            System.out.println(year);
        }
        boolean powerOn = false;
        if(!powerOn){
            System.out.println(powerOn);
        }
        String str = "yes";
        if(str=="yes"){
            System.out.println(str);
        }
    }}
