import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] seq = Arrays.stream(scanner.nextLine().split("\\ ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] spec = Arrays.stream(scanner.nextLine().split("\\ ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        List<Integer> sequence = new ArrayList<Integer>();

        int bomb = spec[0];
        int power = spec[1];
        int sum = 0;

        for (int i = 0; i < seq.length; i++){
            int number = seq[i];
            sequence.add(i, number);
        }

        List<Integer> result = new ArrayList<Integer>();

        for (int num:sequence
             ) {
            if (num == bomb){
                int index = sequence.indexOf(num) - power;
                int indexP= sequence.indexOf(num) + power;
                int ex = power*2 + 1;
                while (ex != 0){
                    if (indexP >= sequence.size()){
                        result = sequence.subList(0, index);
                        for (int number:result
                             ) {
                            sum = sum + number;
                        }
                        System.out.println(sum);
                        return;
                    }
                    else if(index <= 0){
                        result = sequence.subList(sequence.indexOf(num)+power+1, sequence.size());
                        for (int number:result
                             ) {
                            sum = sum + number;
                        }
                        System.out.println(sum);
                        return;
                    }
                    ex = ex - 1;
                }
            }
        }

        for (int i = 0; i < sequence.size(); i++){
            if (sequence.get(i) == bomb) {
                int index = i - power;
                int indexP = i + power;
                int ex = (power * 2) + 1;

                for (int c = 0; c<ex; c++){
                    sequence.remove(index);
                }
                i = index - 1;
            }
        }
        for (int num:sequence
             ) {
            sum = sum + num;
        }
        System.out.println(sum);

    }
}
