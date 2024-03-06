package ch12.Quiz06;

import java.util.StringTokenizer;

public class Quiz06 {
    public static void main(String[] args) {
        String s ="아이디,이름,패스워드";
        StringTokenizer stringTokenizer= new StringTokenizer(s,",");

  while (stringTokenizer.hasMoreTokens()){
      System.out.println(stringTokenizer.nextElement());
  }

    }

}
