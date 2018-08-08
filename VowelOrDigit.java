import java.util.Scanner;

public class VowelOrDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String character = scanner.nextLine().toLowerCase();

        if (character.equals("a")){
            System.out.println("vowel");
        }
        else  if(character.equals("e")){
            System.out.println("vowel");
        }
        else if(character.equals("i")){
            System.out.println("vowel");
        }
        else if(character.equals("o")){
            System.out.println("vowel");
        }
        else if(character.equals("u")){
            System.out.println("vowel");
        }
        else if(character.equals("0")){
            System.out.println("digit");
        }
        else if(character.equals("1")){
            System.out.println("digit");
        }
        else if(character.equals("2")){
            System.out.println("digit");
        }
        else if(character.equals("3")){
            System.out.println("digit");
        }
        else if(character.equals("4")){
            System.out.println("digit");
        }
        else if(character.equals("5")){
            System.out.println("digit");
        }
        else if(character.equals("6")){
            System.out.println("digit");
        }
        else if(character.equals("7")){
            System.out.println("digit");
        }
        else if(character.equals("8")){
            System.out.println("digit");
        }
        else if(character.equals("9")){
            System.out.println("digit");
        }
        else{
            System.out.println("other");
        }

    }
}