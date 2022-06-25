import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=m;
        int y=n;
        int[][] a=new int[50][50];
        int[][] matrix=new int[50][50];
        //输入初始m*n矩阵
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int t=sc.nextInt();
        //旋转矩阵
        for (int k=0;k<t/90%4;k++){
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    matrix[i][j]=a[m-1-j][i];
                }
            }
            int max=m >= n ? m : n;
            for (int p=0;p<max;p++){
                for (int q=0;q<max;q++){
                    a[p][q]=matrix[p][q];
                }
            }
            //不断循环旋转，如果是1倍以上，就要清空数组
            if (k!=t/90%4-1){
                for(int p=0;p<n;p++){
                    for (int q=0;q<m;q++){
                        matrix[p][q]=0;
                    }
                }
                int temp=m;
                m=n;
                n=temp;
            }
        }
        //根据旋转角度的倍数不同，旋转后的矩阵行数和列数改变
        if (t/90%4%2!=0){
            int temp=x;
            x=y;
            y=temp;
        }
        //输出旋转后的矩阵
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //TODO
        //your implementation should not be too slow
    }
}
