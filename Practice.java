
/*
Auther: John Blue
Time: 2022/3
Platform: ATOM with atom-ide-ui, ide-java, and script
SDK: java SE 8 SDK
Object: some simple practice
*/


public class Practice {
    // round
    static int round(double y) {
        return (int)(y + 0.5);
    }

    // 1 + 2 + ... + n
    public static int sum(int n) {
      if (n == 1) {
        return 1;
      }
      return n + sum(n - 1);
    }

    public static int gcd_rec(int x, int y) {
        // if x < y then exchange x y
        if (x % y == 0) {
            return y;
        }
        return gcd_rec(y, x % y);
    }

    public static int gcd(int x, int y) {
        int tmp;
        // if x < y then exchange x y
        while (x % y != 0) {
            tmp = y;
            y = x % y;
            x = tmp;
        }
        return y;
    }

    public static void main(String[] argv) {
        // round
        double x = 20.6;
        System.out.println(x + " round " + (int)(x + 0.5));
        System.out.println(x + " round " + round(x));

        // recusive 1 + 2 + ... + n
        System.out.println(sum(100));

        // great common denominator
        System.out.println(gcd(12,18));
        System.out.println(gcd_rec(12,18));
    }
}
