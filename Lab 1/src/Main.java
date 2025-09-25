import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N = readInput();
        int[] arr = fibonacci(N);
        System.out.println("Числа Фібоначі з заданою кількістю N:");
        printArr(arr);
        System.out.println("Числа Фібоначі, які є квадратами:");
        printSquares(arr);
    }
    public static int readInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть кількість чисел Фібоначі: ");
        return console.nextInt();
    }
    public static int[] fibonacci(int N) {
        int[] arr = new int[N];
        if (N > 0) arr[0] = 1;
        if (N > 1) arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void printSquares(int[] arr) {
        for (int num : arr) {
            if (isSquare(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static boolean isSquare(int num) {
        if (num < 0) return false;
        int x = (int) Math.sqrt(num);
        return x * x == num;
    }
}
