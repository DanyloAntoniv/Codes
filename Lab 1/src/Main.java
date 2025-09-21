import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть кількість чисел Фібоначі:");
        int N = console.nextInt();
        int[] arr = new int[N];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<N;i++){
          arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("Числа Фібоначі з заданою кількістю N");
        for (int j=0;j<N;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
        System.out.println("Числа Фібоначі з заданою кількістю N які є квадратами");
        for (int k=0;k<N;k++){
            boolean b = IsSquare(arr[k]);
            if(b){
                System.out.print(arr[k]+" ");
            }

        }
    }
    public static boolean IsSquare(int num) {
        if (num<0) return false;
        int x=(int)Math.sqrt(num);
        return x*x==num;
    }
}
