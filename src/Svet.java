import java.util.Scanner;

public class Svet {
    public static void main(String[] args) {
        System.out.println("введите N и M:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] result = new int[n];

        System.out.println("введите "+m+"пар чисел");
        for (int i = 0; i < m; i++) {
            int perekrestok = sc.nextInt();
            int k = perekrestok-1;      //потому что в массиве нумерация с 0
            result[k]++;                //добавляем светофор
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}