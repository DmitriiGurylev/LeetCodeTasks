package src;

import java.util.function.Function;

/**
 * Your MyArrayList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(index, val);
 * obj.addAtTail(index, val);
 * obj.add(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class MyOptional {

    String value;

    public MyOptional() {
        this.value = null;
    }

    public MyOptional(String value) {
        this.value = value;
    }

    public MyOptional map(Function<String, String> f) {
        if (value == null) {
            return new MyOptional();
        }
        return new MyOptional(f.apply(value));
    }

    public String orElse(String s) {
        if (value == null) {
            return s;
        }
        return value;
    }
}
