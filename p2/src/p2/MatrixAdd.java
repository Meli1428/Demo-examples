package p2;

import java.util.Scanner;

public class MatrixAdd {
	
	public void showAdd()
	{
        int i,j,k,l;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows and colums: ");
        i=sc.nextInt();
        j=sc.nextInt();
        int first[][]=new int[i][j];
        int second[][]=new int[i][j];
        int sum[][]=new int[i][j];
        System.out.println("Enter the first matrux: ");
        for(k=0;k<i;k++)
        {
        	for(l=0;l<j;l++)
        	{
        		first[k][l]=sc.nextInt();
        	
        	}
        }
        System.out.println("Enter the second matrix: ");
        for(k=0;k<i;k++)
        {
        	for(l=0;l<j;l++)
        	{
        		second[k][l]=sc.nextInt();
        	
        	}
        }
        System.out.println("Addition of two matrices: ");
        for(k=0;k<i;k++)
        {
        	for(l=0;l<j;l++)
        	{
        		sum[k][l]=first[k][l]+second[k][l];
        	
        	}
        }	
        for(k=0;k<i;k++)
        {
        	for(l=0;l<j;l++)
        	{
        		System.out.println(sum[k][l]+"");
        	}
        }
        System.out.print();
	}

	public static void main(String[] args) {
MatrixAdd m1=new MatrixAdd();
m1.showAdd();
	}

}
