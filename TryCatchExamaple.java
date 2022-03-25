/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: display how to use try catch
Referenece:https://programming.im.ncnu.edu.tw/J_Chapter8.htm

Exception,Throwable are defined in java.lang(package)

when catch exception, here are some method can use
toString()
getMessage()
printStackTrace()

*/

import java.io.*;

public class TryCatchExamaple {
    public void file_fun() throws Exception {// !!! throws have "s" !!! throw base type, and java will determined which class it belong to
        FileInputStream f;
        try {
            f = new FileInputStream("abc.txt");// create object
        }
        // if abc.txt does not exist, FileNotFoundException will be caught
        catch(FileNotFoundException fnf) {
            System.out.println("File not found. Generate an exception and throw it");
            throw fnf;// !!! throw object
        }
        f = null;// delete object
    }

    public static void main(String[] args) {
      // try block
      System.out.println("Try Catch block >>");
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      }
      // catch (... e?) {
      // ...
      //}
      catch (Exception e) {
        System.out.println("Something went wrong.");
      }
      finally {
        System.out.println("The 'try catch' is finished.\n");
      }

      // throws
      System.out.println("Throws >>");
      TryCatchExamaple s = new TryCatchExamaple();
      try {
          s.file_fun();
      }
      catch (FileNotFoundException ef) {
        System.out.println("File not found.");
        System.out.println("Error: " + ef.toString());
      }
      catch(Exception epp) {
          System.out.println("An Exception has been caught.");
          System.out.println("Error: " + epp.toString());
      }
  }
}
