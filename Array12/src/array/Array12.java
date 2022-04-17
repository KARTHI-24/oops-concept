package array;

public class Array12 {


public static void main(String[] args) {
   
////	int a[]=new int[5];//declare the array
////	a[0]=100;//inserting the values
////	a[1]=200;
////	a[2]=200;
////	a[3]=200;
////	a[4]=200;
//	  
//	
//	int a[]= {100,200,300,400,500,};//without knowing the exact values
//	System.out.println("length of an array is "+a.length);
//	//System.out.println(a[2]);// if we have minimum values we ca use sys.out but more means have to looping
//	
////	
////	for(int n=0; n<=a.length-1;n++);
////	
////		{
////		
////		System.out.println(a[i]);
////	}
//	
//	for(int i:a) {
//		System.out.println(i);
//	}
//	
	int a[][]=new int[3][2];//multi dimensional array
	
	a[0][0]=100;
	a[0][1]=100;
	
	a[1][0]=100;
	a[1][1]=100;
	
	a[2][0]=100;
	a[2][1]=100;
	
     System.out.println("number of rows is  " +a.length);
     System.out.println( "number of coloumns is "+a[0].length);
	
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=0;j<a[0].length;j++)
//		
//		{
//		System.out.println(a[i][j]); 
//		
		
	for(int r[]:a)	//enhanced for loop
	{
		for(int i:r)
		{
		System.out.println(i);
		}
		
		
	
	}
	}
	
	
	
	
	
	}	

