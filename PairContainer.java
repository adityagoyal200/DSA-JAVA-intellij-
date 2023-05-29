class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
public class PairContainer{
    public static void main(String[] args) {
        Pair<String, Integer> personInfo = new Pair<>("Aditya goyal", 21);
        System.out.println("Person Name: " + personInfo.getKey());
        System.out.println("Person Age: " + personInfo.getValue());
    }
}
