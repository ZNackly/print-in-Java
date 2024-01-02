public class Main {
    static void print(int v) {
        System.out.println(v);
    }

    static void print(String v) {
        System.out.println(v);
    }

    static void print(double v) {
        System.out.printf("%.3f", v);
    }

    static void print(int[] arr) {
        System.out.println();
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        print(10);
        print("I love Java");
        print(31.21312);
        print(new int[]{54, 1, 34, 4, 0});
    }
}
