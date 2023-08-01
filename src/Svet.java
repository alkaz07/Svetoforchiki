import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Svet {
    public static void main(String[] args) {
        String fname1 = "INPUT.txt";
        String fname2 = "OUTPUT.txt";
       // System.out.println("введите N и M:");
        try {
            Scanner sc = new Scanner(new File(fname1));

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] result = new int[n];

          //  System.out.println("введите " + m + "пар чисел");
            for (int i = 0; i < 2*m; i++) {
                int perekrestok = sc.nextInt();
                int k = perekrestok - 1;      //потому что в массиве нумерация с 0
                result[k]++;                //добавляем светофор
            }

            FileWriter output = new FileWriter(new File(fname2));
            for (int i = 0; i < result.length; i++) {
                //System.out.print(result[i] + " ");
                output.write(result[i] + " ");
            }
           // System.out.println();
            output.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ойой");
        } catch (IOException e) {
            System.out.println("ой-ой-ой");
        }
    }
}