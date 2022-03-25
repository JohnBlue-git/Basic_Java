
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: variable type (..., static, final, const, ...)
*/

public class Variable {
    public static final double PI = 3.14159;
    public final int x = 10;

    public static void main(String[] argv) {
        // local final
        final int local = 10;
        //local = 100; // Compile Error

        // object
        Variable m = new Variable();
        // object static variable
        //PI = 100; // Compile Error
        // object variable
        //m.x = 10; // Compile Error
    }
}

/*
reference
https://blog.csdn.net/oMaoYanEr/article/details/41280047

//似乎中文不行

(const)
是java预留关键字，用于后期扩展用，用法跟(final)相似，不常用

(final)
这个关键字的含义是“这是无法改变的”或者“终态的”；
1.修饰variable     (final)成员变量表示常量，只能被赋值一次，赋值后值不再改变。
2.修饰method     (final)方法不能被子类方法覆盖，但可以被继承。
3.修饰class     (final)类不能被继承，没有子类，final类中所有方法都是final的。
*/
