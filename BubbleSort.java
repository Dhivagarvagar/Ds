package Wipro;
import java.util.*;
public class BubbleSort {  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++) 
		{
			b[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a-1;i++) 
		{
			for(int j=0;j<a-i-1;j++) 
			{
				if(b[j]>b[j+1]) 
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					
				}
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}
}  
