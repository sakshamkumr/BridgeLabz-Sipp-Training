
import java.util.*;

class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
class CustomHashMap<K, V> {
    private int capacity = 10;
    private List<HashNode<K, V>> bucket;

    public CustomHashMap() {
        bucket = new ArrayList<>(Collections.nCopies(capacity, null));
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        HashNode<K, V> head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = bucket.get(index);
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = head;
        bucket.set(index, newNode);
    }

    public V get(K key) {
        int index = getIndex(key);
        HashNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        HashNode<K, V> head = bucket.get(index);
        HashNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) prev.next = head.next;
                else bucket.set(index, head.next);
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}

class CustomHashMapDemo {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Value for A: " + map.get("A"));
        map.remove("A");
        System.out.println("Value for A after removal: " + map.get("A"));
    }
}