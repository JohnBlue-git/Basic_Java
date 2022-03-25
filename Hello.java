
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: say Hello World

reference:
https://gist.github.com/christopherjanzen/529c9bf307cc5d38b4eff1c72f3e5b30
*/

public class Hello {
    public static void say(String s) {
        System.out.print(s + "I'm John Blue\n");
        // 為了寫作程式方便起見, Java Compiler碰到+符號某一邊的型態是String時, 就會把+翻譯成StringBuffer類別裡相對應的append Method
        // 千萬不要以為Java支援operator overloading。Java只是透過Compiler來做特別的轉換, 稱這種技術為Compiler Sugar比較適合
        // System.out.println((new StringBuffer("x = ")).append(x).append(", y = ").append(y).toString());
    }

    public static void main(String[] argv) {
        say("Hello, world\n");
    }
}
