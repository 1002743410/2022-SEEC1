import java.util.Scanner;
import java.util.regex.Pattern;

public class Literal {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if (Pattern.matches("\\d+",s)){
            System.out.println("integer");
        }else if (Pattern.matches("\\d+L",s)){
            System.out.println("long");
        }else if (Pattern.matches("\\d+\\.\\d+",s)){
            System.out.println("double");
        }else if (Pattern.matches("\\d+\\.\\d+f",s)){
            System.out.println("float");
        }else if (Pattern.matches("'.*'",s)){
            System.out.println("char");
        }else if ("true".equals(s)||"false".equals(s)){
            System.out.println("boolean");
        }
        //TODO
    }
}
