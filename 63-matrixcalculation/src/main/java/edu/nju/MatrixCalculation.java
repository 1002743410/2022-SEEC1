package edu.nju;

import java.util.Scanner;

/**
 * 实现矩阵的加法、乘法以及控制台输出
 * 其中加法和乘法需要有两种实现方式
 * 1.传入一个矩阵进行2个矩阵的操作
 * 2.从控制台（console）读入一个矩阵，再进行操作
 * 所有的数据均为int型
 * 输入数据均默认为正确数据，不需要对输入数据进行校验
 * @author Ray Liu & Qin Liu
 */
public class MatrixCalculation {
	
	/**
	 * 实现矩阵加法，返回一个新的矩阵
	 * @return result matrix = A + B
	 */
	public int[][] plus(int[][] A, int[][] B){
		int [][] sum=new int[A.length][A[0].length];
		if (A.length==B.length && A[0].length==B[0].length){
			for (int i=0;i<A.length;i++){
				for (int j=0;j<A[0].length;j++){
					sum[i][j]=A[i][j]+B[i][j];
				}
			}
		}
		// TODO
		return sum;
	}
	
	/**
	 * 实现矩阵乘法，返回一个新的矩阵
	 * @return result matrix = A * B
	 */
	public int[][] times(int[][] A, int[][] B){
		int [][] multiply=new int[A.length][B[0].length];
		if (A[0].length==B.length){
			for (int i=0;i<A.length;i++){
				for (int j=0;j<B[0].length;j++){
					for (int k=0;k<A[0].length;k++){
						multiply[i][j]+=A[i][k]*B[k][j];
					}
				}
			}
		}
		// TODO
		return multiply;
	}
	
	/**
	 * 从控制台读入矩阵数据，进行矩阵加法，读入数据格式如下：
	 * m n
	 * m * n 的数据方阵，以空格隔开
	 * 连续读入2个矩阵数据
	 * example:
	 * 4 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 4 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 返回一个新的矩阵
	 */
	public int [][] plusFromConsole(){
		Scanner scan=new Scanner(System.in);
		int m[]=new int[2];
		int n[]=new int[2];
		for (int i=0;i<2;i++){
			m[i]=scan.nextInt();
		}
		int a[][]=new int[m[0]][m[1]];
		for (int i=0;i<m[0];i++){
			for (int j=0;j<m[1];j++){
						a[i][j]=scan.nextInt();
			}
		}
		for (int i=0;i<2;i++){
			n[i]=scan.nextInt();
		}
		int b[][]=new int[n[0]][n[1]];
		for (int i=0;i<n[0];i++){
			for (int j=0;j<n[1];j++){
				b[i][j]=scan.nextInt();
			}
		}
		if (m[0]!=0 && m[1]!=0 && n[0]!=0 &&n[1]!=0){
			int[][] sum = plus(a, b);
			return sum;
		}else {
			int [][] sum=new int[0][0];
			return sum;
		}
		// TODO
	}

	/**
	 * 输入格式同上方法相同
	 * 实现矩阵的乘法
	 * 返回一个新的矩阵
	 */
	public int[][] timesFromConsole(){
		Scanner scan=new Scanner(System.in);
		int m[]=new int[2];
		int n[]=new int[2];
		for (int i=0;i<2;i++){
			m[i]=scan.nextInt();
		}
		int a[][]=new int[m[0]][m[1]];
		for (int i=0;i<m[0];i++){
			for (int j=0;j<m[1];j++){
				a[i][j]=scan.nextInt();
			}
		}
		for (int i=0;i<2;i++){
			n[i]=scan.nextInt();
		}
		int b[][]=new int[n[0]][n[1]];
		for (int i=0;i<n[0];i++){
			for (int j=0;j<n[1];j++){
				b[i][j]=scan.nextInt();
			}
		}
		if (m[0]!=0 && m[1]!=0 && n[0]!=0 && n[1]!=0){
			int[][] multiply = times(a,b);
			return multiply;
		}else {
			int [][] multiply=new int[0][0];
			return multiply;
		}
		// TODO
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
	public void print(int[][] A){
		for (int i=0;i<A.length;i++){
			if (i==0){
				System.out.println();
			}
			for (int j=0;j<A[0].length;j++){
				if (j!=A[0].length-1){
					System.out.print(A[i][j]+" ");
				}else {
					System.out.print(A[i][j]);
				}
			}
			System.out.println();
		}
		// TODO
	}
}
