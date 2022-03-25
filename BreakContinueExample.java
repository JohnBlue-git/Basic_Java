
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: display break continue goto control flow
*/

public class BreakContinueExample {
    public static void main(String[] argv) {
        System.out.println("Begin loop:");
        System.out.println("outer loop");
        outerLoop:
        for (int i = 0; i < 6; i++) {
            System.out.println("inner loop");
            innerLoop:
            for (int j = 0; j < 6; j++) {
                if (j == 4) {
                  System.out.println("continue with inner loop");
                  continue innerLoop;
                }
                if (i == 3 && j == 3) {
                  System.out.println("break from outer loop");
                  break outerLoop;
                }
                System.out.println("(" + i + "," + j + ")");
            }
        }
    }
}
