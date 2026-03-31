import java.util.Scanner;
class Main {
    static String toBinaryString(int num) {
        String binary = "";
        if (num == 0)
        return "0";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String binary = toBinaryString(num);
        System.out.println("Binary representation: " + binary);
    }
}
