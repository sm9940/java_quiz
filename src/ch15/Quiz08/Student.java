package ch15.Quiz08;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;

public class Student {
    public int studentNum;
    public String name;


    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Student target){ //Object obj =new Member();
            //객체의 데이터를 비교
            //name과 age값이 같으면 true를 리턴
            return(target.studentNum==studentNum);
        } else {
            return false;
        }
    }

}
