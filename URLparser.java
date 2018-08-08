import java.util.Scanner;

public class URLparser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String protocol = "";
        String server = "";
        String resource = "";

        String[] url = scanner.nextLine().split(":\\W*");
        StringBuilder sb = new StringBuilder();

        if (url.length > 1) {
            protocol = url[0];
            String[] src = url[1].split("\\/");
            if (src.length > 1) {
                server = src[0];
                if (src.length > 2) {
                    for (int i = 1; i < src.length; i++) {
                        sb.append(src[i]);
                        if (i < src.length - 1) {
                            sb.append("/");
                        }
                    }
                    resource = sb.toString();
                } else {
                    resource = src[1];
                }


            } else {
                String[] src1 = url[0].split("\\/");
                if (src1.length>1){
                    server = url[0];
                    if (src1.length>2){
                        for (int i = 1; i < src1.length; i++){
                            sb.append(src1[i]);
                            if (i < src1.length - 1){
                                sb.append("/");
                            }
                        }
                        resource = sb.toString();
                    }
                }
                else {
                    server = url[0];
                }
            }

        }
        System.out.println("[protocol] = " + '"' + protocol.trim() + '"');
        System.out.println("[server] = " + '"' + server.trim() + '"');
        System.out.println("[resource] = " + '"' + resource.trim() + '"');
    }
}
