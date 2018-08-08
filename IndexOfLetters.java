import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String input = scanner.nextLine();

        Hashtable<Character, Integer> alphabetTable = new Hashtable<Character, Integer>();
        int id = 0;
        for (int i = 0; i < alphabet.length; i++){
            char a = alphabet[i];
            alphabetTable.put(a, id);
            id++;
        }

        for (int i = 0; i < input.toCharArray().length; i++){
            System.out.println(input.charAt(i)+" -> "+alphabetTable.get(input.charAt(i)));
        }

    }
}
