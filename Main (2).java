import java.util.Scanner;
class Main {
    static int[] toBinaryArray(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 2;
            count++;
        }
        int[] binary = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            binary[i] = num % 2;
            num /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int[] binaryArray = toBinaryArray(num);
        System.out.print("Binary representation: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
        System.out.println();
    }
}