import java.util.*;

public class CollectionTests {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
            hashMap.put(i, i);
            linkedHashMap.put(i, i);
            treeMap.put(i, i);
        }

        System.out.println("Test Array and Linked list's");
        System.out.println("ADD");

        double a1 = System.nanoTime() / 1000000000d;
        arrayList.add(1);
        double a2 = System.nanoTime() / 1000000000d;
        System.out.printf("arrayList time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedList.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedList time: %.5E;  \n", a2 - a1);

        System.out.println("SET");

        a1 = System.nanoTime() / 1000000000d;
        arrayList.add(1, 100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("arrayList time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedList.add(1, 100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedList time: %.5E;  \n", a2 - a1);

        System.out.println("REMOVE");

        a1 = System.nanoTime() / 1000000000d;
        arrayList.remove(100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("arrayList time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedList.remove(100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedList time: %.5E;  \n", a2 - a1);

        //

        System.out.println("Test HashSet, LinkedHashSet, TreeSet");
        System.out.println("ADD");

        a1 = System.nanoTime() / 1000000000d;
        hashSet.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashSet.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeSet.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeSet time: %.5E;  \n", a2 - a1);

        System.out.println("SET");

        a1 = System.nanoTime() / 1000000000d;
        hashSet.add(10000000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashSet.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeSet.add(10000000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeSet time: %.5E;  \n", a2 - a1);

        System.out.println("REMOVE");

        a1 = System.nanoTime() / 1000000000d;
        hashSet.add(1);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashSet.remove(100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashSet time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeSet.remove(100000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeSet time: %.5E;  \n", a2 - a1);

        //

        System.out.println("Test HashMap, LinkedHashMap, TreeMap");
        System.out.println("ADD");

        a1 = System.nanoTime() / 1000000000d;
        hashMap.put(1000000, 1000000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashMap.put(1000000, 1000000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeMap.put(1000000, 1000000);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeMap time: %.5E;  \n", a2 - a1);

        System.out.println("SET");

        a1 = System.nanoTime() / 1000000000d;
        hashMap.put(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashMap.put(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeMap.put(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeMap time: %.5E;  \n", a2 - a1);

        System.out.println("REMOVE");

        a1 = System.nanoTime() / 1000000000d;
        hashMap.remove(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("hashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        linkedHashMap.remove(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("linkedHashMap time: %.5E;  ", a2 - a1);

        a1 = System.nanoTime() / 1000000000d;
        treeMap.remove(10000001, 10000001);
        a2 = System.nanoTime() / 1000000000d;
        System.out.printf("treeMap time: %.5E;  \n", a2 - a1);


    }
}
