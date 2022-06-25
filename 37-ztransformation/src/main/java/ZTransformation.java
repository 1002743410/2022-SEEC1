import java.util.Scanner;

public class ZTransformation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=scanner.nextInt();
        if (n==1){
            for (int i=0;i<s.length();i++){
                System.out.print(s.charAt(i));
                if (i!=s.length()-1){
                System.out.print(" ");}
            }
        }else{
        int len=s.length();
        int col=len+1;
        char[][]a=new char[n][];
        for (int i=0;i<n;i++){
            a[i]=new char[col];
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<col;j++){
                a[i][j]=' ';
            }
        }
        for (int i=0;i<len;i+=2*n-2){
            int j;
            for (j=0;j<n;j++){
                if (i+j>=len) break;
                a[j][i/(2*n-2)*(n-1)]=s.charAt(i+j);
            }
            if (i+j>=len) break;
            j--;
            for (int k=1;k<n-1;k++){
                if (i+j+k>=len) break;
                a[j-k][i/(2*n-2)*(n-1)+k]=s.charAt(i+j+k);
            }
        }
        int max_col=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<col;j++){
                if (a[i][j]!=' '&&j>max_col) max_col=j;
            }
        }
        StringBuilder result;
        for (int i=0;i<n;i++){
            result=new StringBuilder();
            int j;
            for (j=0;j<=max_col;j++){
                result.append(a[i][j]).append(' ');
            }
            System.out.println(result.toString().trim());
        }
        }
        //TODO
    }
    public static String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder ret = new StringBuilder();
        int len = s.length();
        int cyclen = numRows*2 - 2;

        for(int i = 0;i < numRows;i++){
            for(int j = 0;j + i < len;j+=cyclen){
                ret.append(s.charAt(j+i));
                if(i != 0 && i != numRows-1 && j + cyclen -i < len){
                    ret.append(s.charAt(j+cyclen-i));
                }
            }
        }
        return ret.toString();
    }
}
