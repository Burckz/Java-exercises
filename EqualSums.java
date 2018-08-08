import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputList = Arrays.stream(scanner.nextLine().split("\\ ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < inputList.length; i++) {
            if (i == 0) {
                for (int c = 1; c < inputList.length; c++) {
                    sumRight = sumRight + inputList[c];
                }
                if (sumLeft == sumRight) {
                    System.out.println(i);
                    return;
                } else {
                    sumLeft = 0;
                    sumRight = 0;
                }

            } else {
                for (int c = i + 1; c < inputList.length; c++) {
                    sumRight = sumRight + inputList[c];
                }
                for (int c = i - 1; c >= 0; c--) {
                    sumLeft = sumLeft + inputList[c];
                }

                if (sumLeft == sumRight) {
                    System.out.println(i);
                    return;
                } else {
                    sumLeft = 0;
                    sumRight = 0;
                }

            }


        }
        System.out.println("no");
    }
}
