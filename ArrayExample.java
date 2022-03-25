
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: array
*/

public class ArrayExample {
    public static void fun(int x[][]) {
      for (int i = 0; i < x.length; i++) {
          for (int j = 0; j < x[i].length; j++) {
              System.out.print(x[i][j] + "\t");
          }
          System.out.print("\n");
      }
    }

    public static void main(String[] argv) {
        // (1) 1D
        int[] x; // x is a reference to int[]
        x = new int[10];
        //x.length = 1; // Compile Error: length is final
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }

        // (2) 1D
        int[] y = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < y.length; i++) {
            y[i] = i;
        }

        // (3) 2D
        int[][] m;
        m = new int[3][6];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i + j;
            }
        }

        // (4) 2D triangle
        int[][] t;
        t = new int[3][];
        for (int i = 0; i < t.length; i++) {
            t[i] = new int[i];
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = i + j;
            }
        }

        // (passing)
        fun(m);
    }
}
