package ch03;

public class Quiz2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90))? "가": "나";
        System.out.println(result);
        //score가 90이상이 아닐시 "가" 그것이 아닐시 "나"이기때문에
        //score가 90이상이 아니기 때문에 result값은 "가"가 나올것이다
    }
}
