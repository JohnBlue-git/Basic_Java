/*
Auther: John Blue
Time: 2022/4
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: Java bulid in Containers
Reference: ...
*/

import java.util.*;
//import java.util.Iterator;
//import java.util.Collections;
//import java.util.TreeMap;
//import java.util.LinkedHashMap;
//import java.util.NoSuchElementException;

public class Container {
  // !!! have to be static
  public static void show(Collection<String> VL) {
    for(String value : VL) {
        System.out.print(value + ", ");
    }
    System.out.println();
  }

  // main
  public static void main(String[] args) {
    // Array
    List<String> arr = new ArrayList<String>();
    arr.add("list one");// 0
    arr.add("list two");// 1
    arr.add("list thre");// 2
    arr.add("list four");// 3
    arr.remove(3);
    arr.set(2, "list three");
    System.out.print("Array: ");
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + ", ");
    }
    System.out.println();
    for (String ss : arr) {
      System.out.print(ss + ", ");
    }
    System.out.println();
    Iterator it = arr.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println();
    System.out.println();

    // Stack
    Stack<String> stk = new Stack<String>();
    stk.push("stack one");
    stk.push("stack two");
    stk.push("stack three");
    System.out.print("Stack: ");
    System.out.println(stk);
    System.out.println("peek: " + stk.peek());
    System.out.print("item: ");
    while (!stk.isEmpty()) {// stk.empty() alternative
      System.out.print(stk.pop() + ", ");
    }
    System.out.println();
    System.out.println();

    // Queue
    Queue<String> que = new LinkedList<String>();// Queue is just an interface
    que.add("queue one");//queue.offer("queue one");
    que.add("queue two");
    que.add("queue three");
    System.out.print("Queue: ");
    System.out.println(stk);
    System.out.println("peek: " + que.peek());
    System.out.print("item: ");
    while (!que.isEmpty()) {
      System.out.print(que.poll() + ", ");// que.remove() alternative
    }
    System.out.println();
    System.out.println();

    // LinkedList
    LinkedList<String> list = new LinkedList<String>();
    list.add("LinkedList Runoob");
    list.addFirst("LinkedList Google");
    list.addLast("LinkedList Tesla");
    System.out.print("LinkedList: ");
    System.out.println(list);
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + ", ");
    }
    System.out.println();
    System.out.println("first: " + list.getFirst());
    System.out.println("last: " + list.getLast());
    list.removeFirst();
    list.removeLast();
    System.out.print("LinkedList: ");
    System.out.println(list);
    System.out.println();

    // TreeSet
    Set<String> tree_set = new TreeSet<String>();
    tree_set.add("one");
    tree_set.add("two");
    tree_set.add("three");
    System.out.print("TreeSet: ");
    if (!tree_set.isEmpty()) {
      show(tree_set);
    }
    System.out.println();

    // HashSet
    Set<String> hash_set = new HashSet<String>();
    hash_set.add("one");
    hash_set.add("two");
    hash_set.add("three");
    hash_set.add("negative");
    System.out.print("HashSet: ");
    show(hash_set);
    System.out.println("remove(- 1) ...");
    if (hash_set.contains("- 1")) {
      hash_set.remove("- 1");//remove(K, V)
    }
    System.out.println();
    //hash_map.removeAll(collection);// ???	This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.
    //hash_map.retainAll(collection);// ???	This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.
    //hash_set.clear();

    // TreeMap
    Map<String, String> tree_map = new TreeMap<String, String>();
    tree_map.put("3", "root");
    tree_map.put("3", "root duplicate");
    tree_map.put("6", "left");
    tree_map.put("9", "right");
    System.out.print("TreeMap: ");
    if (!tree_map.isEmpty()) {
      show(tree_map.keySet());
      show(tree_map.values());
    }
    System.out.println();
    //tree_map.clear();

    // HashMap
    Map<String, String> hash_map = new LinkedHashMap<String, String>();
    hash_map.put("3", "root");
    hash_map.put("3", "root duplicate");
    hash_map.put("6", "left");
    hash_map.put("9", "right");
    hash_map.put("- 1", "have to be trimmed");
    System.out.print("HashMap: ");
    hash_map.replace("- 1", "11111111");//replace(K, oldValue, newValue)
    show(hash_map.keySet());
    show(hash_map.values());
    System.out.println("get(-1) = " + hash_map.get("- 1"));
    System.out.println("remove(- 1) ...");
    if (hash_map.containsKey("- 1") && hash_map.containsValue("11111111")) {
      hash_map.remove("- 1");//remove(K, V)
    }
    System.out.print("HashMap: ");
    show(hash_map.keySet());
    show(hash_map.values());
    System.out.println();
    //hash_map.clear();

    // not sure it has multikey set / Map
    // but someone recomend: Map<E, List<E>>
    //https://stackoverflow.com/questions/12565587/does-java-have-a-multiset-data-structure-like-the-one-in-c-stl
  }
}
