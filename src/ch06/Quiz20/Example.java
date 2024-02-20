package ch06.Quiz20;

class Example {

    //isNumber() 메소드 작성
static boolean isNumber (String str){
    if(str.equals(null) || str.equals(" ")) return false;
    for (int i = 0; i < str.length(); i++) {
        if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) return false;

    }
    return true; //for문을 무사히 빠져나왔다는건 str값이 모두 숫자

}
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}

