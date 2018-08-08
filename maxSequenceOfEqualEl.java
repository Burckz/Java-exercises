import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maxSequenceOfEqualEl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> array = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("\\ ")));

        int seq = 0;
        int prev = 0;
        int bestSeq = 0;
        int bestIndex = 0;

        for (int i = 0; i < array.size(); i++) {
            if (i > 0) {
                prev = Integer.parseInt(array.get(i - 1));
                if (Integer.parseInt(array.get(i)) == prev) {
                    seq++;
                    if (seq > bestSeq) {
                        bestSeq = seq;
                        bestIndex = i - seq + 1;
                    }
                } else {
                    seq = 1;
                }
            } else {
                seq = seq + 1;
            }
        }

        for (int i = bestIndex; i < bestIndex + bestSeq - 1; i++) {
            System.out.printf("%s ", array.get(i));
        }
    }
}
