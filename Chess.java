public class Chess {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i <= 64; i++) {
            System.out.println("Square " + i + ": " + a + " grains");
            a = a * 2;

        }
    }
}
