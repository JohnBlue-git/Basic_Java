/*

*/

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Thread_Extend extends Thread {
    private String message;
    public Thread_Extend(String message) {
      this.message = message;
    }
    public void run() {
      try {
        Thread.sleep(1000);
        System.out.println("Thread message is:" + message);
      }
      catch (Exception e) {
            throw new RuntimeException(e);
      }
    }
}

class Thread_Implement implements Runnable {
    private String message;
    public Thread_Implement(String message){
        this.message = message;
    }
    public void run() {
      try {
        Thread.sleep(10);
        System.out.println("Thread message is:" + message);
      }
      catch (Exception e) {
            throw new RuntimeException(e);
      }
    }
}


class Thread_Count1 implements Runnable {
    private List<String> list;
    public Thread_Count1(List<String> lt) {
        this.list = lt;
    }
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                Thread.sleep(10);
                list.add("a" + i);
            }
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread_Count2 implements Runnable {
    private List<String> list;
    public Thread_Count2(List<String> lt) {
        this.list = lt;
    }
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                Thread.sleep(10);
                synchronized(list) {
                  list.add("a" + i);
                }
            }
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}



public class Java_Thread {
  public static void main(String args[]) throws Exception {
    // Thread construction & Thread.sleep()
    Thread_Extend thd_e = new Thread_Extend("message 1");
    Thread thd_r = new Thread(new Thread_Implement("message 2"));
    thd_e.start();
    Thread.sleep(10);// sleep of main thread, but it will not stop the sub thread
    thd_r.start();
    Thread.sleep(3000);

    // synchronized & join
    // 1
    List<String> list1 = Collections.synchronizedList(new ArrayList<String>());
    Thread thd11 = new Thread(new Thread_Count1(list1));
    Thread thd12 = new Thread(new Thread_Count1(list1));
    Thread thd13 = new Thread(new Thread_Count1(list1));
    thd11.start();
    thd12.start();
    thd13.start();
    // https://openhome.cc/Gossip/JavaGossip-V2/JoinThread.htm
    // can .join() to ask for the main thread to wait for the sub thread
    // .join(setting second here)
    thd11.join();
    thd12.join();
    thd13.join();
    System.out.println("list 1 size is " + list1.size());
    System.out.println("list 1: " + list1);
    // 2
    List<String> list2 = new ArrayList<String>();
    Thread thd21 = new Thread(new Thread_Count2(list2));
    Thread thd22 = new Thread(new Thread_Count2(list2));
    Thread thd23 = new Thread(new Thread_Count2(list2));
    thd21.start();
    thd22.start();
    thd23.start();
    // https://openhome.cc/Gossip/JavaGossip-V2/JoinThread.htm
    // can .join() to ask for the main thread to wait for the sub thread
    // .join(setting second here)
    thd21.join();
    thd22.join();
    thd23.join();
    System.out.println("list 2 size is " + list2.size());
    System.out.println("list 2: " + list2);
  }
}
