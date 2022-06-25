import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class testCSVFile {

    public static void main(String[] args) {
        //输入命令并将其转化为数组
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] instruct=s.split(" ");
        InputStreamReader fr = null;
        BufferedReader br = null;

        try {
            //按行读取csv文件的内容并将其存入二维数组message中
            fr = new InputStreamReader(new FileInputStream(args[0]));
            br = new BufferedReader(fr);
            String rec = null;
            String[] argsArr = null;
            //初始化二维数组
            String [][] message=new String[10][5];
            //初始化表头
            String[] header = new String[]{"Last_name","First_name","Salary","Department","Employee_id"};
            int count=0;
            while ((rec = br.readLine()) != null) {
                if (rec != null) {
                    argsArr = rec.split(",");
                    for (int i=0;i<argsArr.length;i++){
                        message[count][i]=argsArr[i];
                    }
                    count++;
                }
            }
            int n=count;
            int flag;
            //如果命令中有排序的要求
            if (instruct.length==5 || instruct.length==7){
                if (instruct[4].equals(header[2])){
                    flag=2;
                }else{
                    flag=4;
                }
                for(int i=0;i<count-1;i++){
                    for(int j=0;j<count-1-i;j++){
                        if(Double.parseDouble(message[j][flag])<=Double.parseDouble(message[j+1][flag])){
                            String[] temp=message[j];
                            message[j]=message[j+1];
                            message[j+1]=temp;
                        }
                    }

                }
                //记录输出的前n行
                if (instruct.length==7) {
                    n = Integer.parseInt(instruct[6]);
                }
            }
            if (instruct.length==4){
                n=Integer.parseInt(instruct[3]);
            }
            //全部输出
            if (instruct[1].equals("*")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print(header[i] + "    ");
                    }
                    System.out.println();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(message[i][j] + "    ");
                        }
                        System.out.println();
                    }
                } //选取指定的列输出
             else {
                    String[] instruct_head = instruct[1].split(",");
                    int[] num = new int[instruct_head.length];
                    int k = 0;
                    for (int i = 0; i < instruct_head.length; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (instruct_head[i].equals(header[j])) {
                                num[k] = j;
                                k++;
                            }
                        }
                    }

                    for (int i = 0; i < instruct_head.length; i++) {
                        System.out.print(header[num[i]] + "    ");
                    }
                    System.out.println();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < instruct_head.length; j++) {
                            System.out.print(message[i][num[j]] + "    ");
                        }
                        System.out.println();
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();

        //TODO
        }
    }
}

