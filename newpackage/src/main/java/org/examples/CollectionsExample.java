package org.examples;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List example
        ListExample();

        // Set example
        SetExample();

        // Queue example
        QueueExample();

        // Map example
        MapExample();
    }

    public static void ListExample() {
        System.out.println("List Example:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");




        List<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.add(1, "Blueberry");
        linkedList.remove(2);

        System.out.println("Modified ArrayList: " + arrayList);
        System.out.println("Modified LinkedList: " + linkedList);
        System.out.println();
    }

    public static void SetExample() {
        System.out.println("Set Example:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        hashSet.add("Date");
        treeSet.remove("Banana");

        System.out.println("Modified HashSet: " + hashSet);
        System.out.println("Modified TreeSet: " + treeSet);
        System.out.println();
    }

    public static void QueueExample() {
        System.out.println("Queue Example:");
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);

        String head = queue.poll(); // Retrieves and removes the head
        System.out.println("Head: " + head);
        System.out.println("Queue after poll: " + queue);

        queue.add("Date");
        System.out.println("Queue after add: " + queue);
        System.out.println();
    }

    public static void MapExample() {
        System.out.println("Map Example:");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(3, "Another");

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);

        hashMap.put(4, "Date");
        treeMap.remove(2);

        System.out.println("Modified HashMap: " + hashMap);
        System.out.println("Modified TreeMap: " + treeMap);
        System.out.println();
    }
}
