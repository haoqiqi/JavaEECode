import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
//        Scanner txt1 = new Scanner(Paths.get("E:\\JAVA\\书籍资料\\JAVA路线.txt"), "UTF-8");
//        System.out.println(txt1);

//        PrintWriter out = new PrintWriter("E:\\JAVA\\书籍资料\\text.txt", "UTF-8");

//        System.out.println("A");
        int[] a = new int[5];
        for(int i = 0; i < a.length; i++)
            {
                a[i] = i;
                System.out.println(a[i]);
        }
        System.out.println("a");

        System.out.println(Arrays.toString(a));
        int[] c = {3,5,4};
        Arrays.sort(a);
        System.out.println("============");
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(i + args[i]);
//        }
    }
}
