import java.util.ArrayList;
import java.util.HashMap;

class MySet {
    private HashMap<Integer, Object> myset;
    private static final Object OOO = new Object();

    public MySet() {
        this.myset = new HashMap<>();
    }

    public void add(Integer number) {
        this.myset.putIfAbsent(number, OOO);
    }

    public void delete(Integer number) {
        this.myset.remove(number);
    }

    public void print() {
        myset.forEach((k, v) -> System.out.print(k + " "));
        System.out.println();
    }

    public void unite(MySet otherSet) {
        otherSet.myset.forEach((k, v) -> this.add(k));
    }

    public int size() {
        return this.myset.size();
    }

    public int get(int index) {
        return (int) this.myset.keySet().toArray()[index];
    }

    public ArrayList<Integer> toList() {
        return new ArrayList<Integer>(this.myset.keySet());
    }

    public ArrayList<Integer> toListUpToElement(int element) {
        if (!myset.containsKey(element))
            return null;
        ArrayList<Integer> output = new ArrayList<>();
        for (int k : myset.keySet()) {
            output.add(k);
            if (k == element)
                break;
        }
        return output;
    }
}