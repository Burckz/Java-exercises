import java.util.Scanner;

public class FitString20Chars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Character[] frame = new Character[20];

        for (int i = 0; i < frame.length; i++){
            frame[i] = '*';
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < frame.length; i++){
            if(i < input.length()){
                frame[i] = input.charAt(i);
            }
            sb.append(frame[i]);
        }

        System.out.println(sb.toString());

    }
}
