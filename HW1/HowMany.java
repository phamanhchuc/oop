public class HowMany {
    public static void main(String[] args) {
        int n = args.length;

        System.out.print("You entered " + n + " command-line argument");
        if (n == 1 || n == 0) {
            System.out.println(".");
        }
        if (n > 1) {
            System.out.println("s.");
        }
    }
}
