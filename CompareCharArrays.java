import java.util.*;

public class CompareCharArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> first = new ArrayList<String>(Arrays.asList(scanner.nextLine().split( "\\ ")));
        List<String> second = new ArrayList<String>(Arrays.asList(scanner.nextLine().split( "\\ ")));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i < first.size(); i++){
            sb.append(first.get(i));
        }
        StringBuilder sb1 = new StringBuilder();
        for (int i=0; i < second.size(); i++){
            sb1.append(second.get(i));
        }

        if (first.size() < second.size()){
            for (int i = 0; i < first.size(); i++){
                String a = first.get(i);
                char a1 = a.charAt(0);
                String b = second.get(i);
                char b1 = b.charAt(0);

                if (a1 < b1){
                    System.out.println(sb.toString());
                    System.out.println(sb1.toString());
                    break;
                }
                else if (a1 > b1){
                    System.out.println(sb1.toString());
                    System.out.println(sb.toString());
                    break;
                }
                else {
                    if (i == first.size() - 1){
                        System.out.println(sb.toString());
                        System.out.println(sb1.toString());
                        break;
                    }
                }
            }
        }

        if (first.size() > second.size()){
            for (int i = 0; i < second.size(); i++){
                String a = first.get(i);
                char a1 = a.charAt(0);
                String b = second.get(i);
                char b1 = b.charAt(0);

                if(a1 > b1){
                    System.out.println(sb1.toString());
                    System.out.println(sb.toString());
                    break;
                }
                else if(a1 < b1){
                    System.out.println(sb.toString());
                    System.out.println(sb1.toString());
                    break;
                }
                else {
                    if (i == second.size() - 1){
                        System.out.println(sb1.toString());
                        System.out.println(sb.toString());
                    }
                }
            }
        }

        if(first.size() == second.size()){
            for (int i = 0; i < first.size(); i++){
                String a = first.get(i);
                char a1 = a.charAt(0);
                String b = second.get(i);
                char b1 = b.charAt(0);

                if(a1 < b1){
                    System.out.println(sb.toString());
                    System.out.println(sb1.toString());
                    break;
                }
                else if (a1 > b1){
                    System.out.println(sb1.toString());
                    System.out.println(sb.toString());
                    break;
                }
                else {
                    if(i == first.size() - 1){
                        System.out.println(sb.toString());
                        System.out.println(sb1.toString());
                    }
                }
            }
        }
    }
}
