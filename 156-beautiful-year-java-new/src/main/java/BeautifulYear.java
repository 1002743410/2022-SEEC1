import java.util.Arrays;

public class BeautifulYear {

    boolean compare(int a,int b,int c,int d){
        if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
            return true;
        }else {
            return false;
        }
    }
    /**
     * 计算出离该年份最近且大于该年份的"Beautiful Year"，"Beautiful Year"是指所有数字均不重复的年份，例如"1987"
     *
     * @param rawYear 任意年份
     * @return "Beautiful Year"
     */

    public static int getYear(int rawYear) {
        BeautifulYear A=new BeautifulYear();
        for (int i=rawYear+1;i<10000;i++){
            int FirstNum=i/1000;
            int SecondNum=i%1000/100;
            int ThirdNum=i%100/10;
            int FouthNum=i%10;
            if (A.compare(FirstNum,SecondNum,ThirdNum,FouthNum)){
                return i;
            }
        }
        return -1;
    }
}
