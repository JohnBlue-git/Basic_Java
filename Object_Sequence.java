
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: show initialization sequence of object



Class initialization sequence:

static block >

variable >
after object is created; variable will be assigned even without constructor
value = 0
reference = null
boolean = false

class >
parent class > child class

*/

public class Object_Sequence {
    // static block
    // libarairy that have to load
    // it will not function until the first time the class is called
    // it is used undercondition that we want to use non Java libary
    // the benefit is to save the memory space when it is not used
    // and it is a way to seperate complex preloading from the implmentation of the class
    static {
        //System.loadLibrary("mylib");
    }
    // initial by ourself instead of using constructor
    static {
        data_r = (int)(Math.random()*100);
        data_v = (int)(Math.random()*100);
    }

    // variable
    static int data_r;
    static int data_v = 3;
    static int data_s = 3;
    int data;

    public Object_Sequence(int input) {
      // static assign
      data_s = input;
      // non static assign
      //this.data = input;
    }

    // main
    public static void main(String[] argv) {
        // object
        Object_Sequence sq = new Object_Sequence(9);
        // static
        System.out.println("data_r = " + data_r);
        System.out.println("data_v = " + data_v);
        System.out.println("data_s = " + data_s);
        // non static
        System.out.println("data = " + sq.data);
    }
}
