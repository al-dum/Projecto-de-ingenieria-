public class proyecto {

    public static int funcion(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + funcion(n - 1);
        }
    }
    public static void main(String[] args) {

    }
}
