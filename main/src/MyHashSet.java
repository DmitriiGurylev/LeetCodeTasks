package src;

import java.util.LinkedList;

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
public class MyHashSet {
    int size;
    LinkedList<Integer>[] buckets;

    public MyHashSet() {
        this.size = 1000;
        this.buckets = new LinkedList[this.size];
    }

    public MyHashSet(int size) {
        this.size = size;
        this.buckets = new LinkedList[this.size];
    }

    public void add(int key) {
        int p = position(key);
        if (buckets[p] == null) {
            buckets[p] = new LinkedList<>();
        }
        LinkedList<Integer> bucket = buckets[p];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int p = position(key);
        LinkedList<Integer> bucket = buckets[p];
        if (bucket != null && bucket.contains(key)) {
            bucket.remove((Object) key);
        }
    }

    public boolean contains(int key) {
        int p = position(key);
        LinkedList<Integer> bucket = buckets[p];
        return bucket != null && bucket.contains(key);
    }

    private int position(int k) {
        return k % this.size;
    }
}