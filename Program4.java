import java.util.Scanner;
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[11];
        for(int i=0;i<numbers.length;i++)
             numbers[i] = sc.nextInt();

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        System.out.println(result);
    }
}
