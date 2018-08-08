import java.util.*;

public class reverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--){
            sb.append(word.charAt(i));
        }

        System.out.println(sb.toString());


    }
}
