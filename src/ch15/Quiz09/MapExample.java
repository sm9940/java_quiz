package ch15.Quiz09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            for (int i = 0; i < keySet.size(); i++) {
                String k = keyIterator.next();
                Integer v= map.get(k);
                maxScore =v;
               if(maxScore<v){
                   v=maxScore;
               }
                   System.out.println(v);
            }


        }

    }
}
