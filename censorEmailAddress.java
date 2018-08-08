import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class censorEmailAddress {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String[] mail = email.split("@");
        char[] name = mail[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length; i++){
            name[i] = '*';
            sb.append(name[i]);
        }
        sb.append("@");
        sb.append(mail[1]);



        List<String> text = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\ ")));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.size(); i++){
            if (text.get(i).equals(email)){
                text.remove(i);
                text.add(i, sb.toString());
            }
            result.append(text.get(i));
            result.append(" ");
        }

        System.out.println(result.toString());
    }
}
