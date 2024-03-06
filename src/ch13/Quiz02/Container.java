package ch13.Quiz02;

public class Container <K,M>{
    private K Key;
    private M Value;

    public K getKey() {
        return Key;
    }
public void set(K key, M Value){
        Key = key;
        this.Value = Value;
}


    public M getValue() {
        return Value;
    }


}
