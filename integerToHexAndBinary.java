import javafx.util.converter.NumberStringConverter;

import java.util.Scanner;

public class integerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Integer.parseInt(scanner.nextLine());
        double number = num;
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            Double remainder = num % 16;
            num = Math.floor(num / 16);


            String numChar = "";

            if (remainder == 10){
                numChar = "A";
            }
            else if(remainder == 11){
                numChar = "B";
            }
            else if (remainder == 12){
                numChar = "C";
            }
            else  if(remainder == 13){
                numChar = "D";
            }
            else if (remainder == 14){
                numChar = "E";
            }
            else if(remainder == 15){
                numChar = "F";
            }
            else {
                Integer rem = remainder.intValue();
                numChar = Integer.toString(rem);
            }

            sb.append(numChar);
        }
        sb.reverse();
        System.out.println(sb.toString());


        StringBuilder sb1 = new StringBuilder();

        while (number != 0){
            Double remainder = number % 2;
            number = Math.floor(number/2);

            if (remainder == 1){
                Integer rem = remainder.intValue();
                sb1.append(rem.toString());
            }
            else{
                Integer rem = remainder.intValue();
                sb1.append(rem.toString());
            }
        }
        sb1.reverse();
        System.out.println(sb1.toString());
    }
}
