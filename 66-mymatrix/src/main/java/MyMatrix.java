// import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

/**
 * 矩阵类，实现矩阵的加法，矩阵乘法，点乘以及转置方法
 * 其中加法和点乘方法需要有两种实现方式
 * 1.传入一个MyMatrix对象进行2个矩阵的操作
 * 2.从控制台（console）读入一个矩阵数据，再进行操作
 * 所有的数据均为int型
 * 输入数据均默认为正确数据，不需要对输入数据进行校验
 * @author Ray Liu & Qin Liu
 *
 */
public class MyMatrix {
	private int[][] data;
	
	/**
	 * 构造函数，参数为2维int数组
	 * a[i][j]是矩阵中的第i+1行，第j+1列数据
	 * @param a
	 */
	public MyMatrix(int[][] a){
		this.data = a;
	}

	public int[][] getData() {
		return data;
	}

	/**
	 * 实现矩阵加法，返回一个新的矩阵
	 * @param B
	 * @return
	 */
	public MyMatrix plus(MyMatrix B){
		int[][] sum=new int[data.length][data[0].length];
		if (data.length==B.data.length && data[0].length==B.data[0].length){
			for (int i=0;i<data.length;i++){
				for (int j=0;j<B.data.length;j++){
					sum[i][j]=data[i][j]+B.data[i][j];
				}
			}
		}
		MyMatrix sum_m = new MyMatrix(sum);
		return sum_m;
	}

	
	/**
	 * 实现矩阵乘法，返回一个新的矩阵
	 * @param B
	 * @return
	 */
	public MyMatrix times(MyMatrix B){
		int [][] multiply=new int[data.length][B.data[0].length];
		if (data[0].length==B.data.length){
			for (int i=0;i<data.length;i++){
				for (int j=0;j<B.data[0].length;j++){
					for (int k=0;k<data[0].length;k++){
						multiply[i][j]+=data[i][k]*B.data[k][j];
					}
				}
			}
		}
		MyMatrix multiply_m=new MyMatrix(multiply);
		return multiply_m;
	}
	
	/**
	 * 实现矩阵的点乘，返回一个新的矩阵
	 * @param b
	 * @return
	 */
	public MyMatrix times(int b){
		int [][] dot=new int[data.length][data[0].length];
		for (int i=0;i<data.length;i++){
			for (int j=0;j<data[0].length;j++){
				dot[i][j]=b*data[i][j];
			}
		}
		MyMatrix dot_m=new MyMatrix(dot);
		return dot_m;
	}
	
	/**
	 * 实现矩阵的转置，返回一个新的矩阵
	 * @return
	 */
	public MyMatrix transpose(){
		int [][] trans=new int[data[0].length][data.length];
		for (int i=0;i< data.length;i++){
			for (int j=0;j<data[0].length;j++){
				trans[j][i]=data[i][j];
			}
		}
		MyMatrix trans_m=new MyMatrix(trans);
		return trans_m;
	}
	
	/**
	 * 从控制台读入矩阵数据，进行矩阵加法，读入数据格式如下：
	 * m n
	 * m * n 的数据方阵，以空格隔开
	 * example:
	 * 4 3
	 * 1 2 3 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 返回一个新的矩阵
	 * @return
	 */
	public MyMatrix plusFromConsole(){
		Scanner scan=new Scanner(System.in);
		int m[]=new int[2];
		for (int i=0;i<2;i++){
			m[i]=scan.nextInt();
		}
		int [][] B=new int[m[0]][m[1]];
		for (int i=0;i<m[0];i++){
			for (int j=0;j<m[1];j++){
				B[i][j]=scan.nextInt();
			}
		}
		MyMatrix B_m=new MyMatrix(B);
		if (data.length!=0 && data[0].length!=0 && m[0]!=0 && m[1]!=0){
			MyMatrix sum_m=plus(B_m);
			return sum_m;
		}else {
			int [][] temp=new int[0][0];
			MyMatrix temp_m=new MyMatrix(temp);
			return temp_m;
		}
	}
	
	/**
	 * 输入格式同上方法相同
	 * 实现矩阵的乘法
	 * 返回一个新的矩阵
	 * @return
	 */
	public MyMatrix timesFromConsole(){
		Scanner scan=new Scanner(System.in);
		int m[]=new int[2];
		for (int i=0;i<2;i++){
			m[i]=scan.nextInt();
		}
		int [][] B=new int[m[0]][m[1]];
		for (int i=0;i<m[0];i++){
			for (int j=0;j<m[1];j++){
				B[i][j]=scan.nextInt();
			}
		}
		MyMatrix B_m=new MyMatrix(B);
		if (data.length!=0 && data[0].length!=0 && m[0]!=0 && m[1]!=0){
			MyMatrix multiply_m=times(B_m);
			return multiply_m;
		}else {
			int [][] temp=new int[0][0];
			MyMatrix temp_m=new MyMatrix(temp);
			return temp_m;
		}
	}
	
	/**
	 * 打印出该矩阵的数据
	 * 起始一个空行，结束一个空行
	 * 矩阵中每一行数据呈一行，数据间以空格隔开
	 * example：
	 * 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 
	 */
	public void print(){
		for (int i=0;i<data.length;i++){
			if (i==0){
				System.out.println();
			}
			for (int j=0;j<data[0].length;j++){
				if (j!=data[0].length-1){
					System.out.print(data[i][j]+" ");
				}else {
					System.out.print(data[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
