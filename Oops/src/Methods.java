
public class Methods {
  //      int a=10
    //    int b=20;
        
//        void sum(int x,int y)//method take parameters 
//        {
//        	a=x;
//        	b=y;
//         System.out.println(a+b);	
//        }
//      	public static void main(String args[])
//      	{
//      		Methods cal=new Methods();
//      		 cal.sum(10, 20);
//      	}

	       int a;
	       int b;
//
//        void sum()//method may not parameters 
//        {
//        	System.out.println(a+b);
//        
//        }
//        public static void main(String args[])
//        {
//        	Methods cal=new Methods();
//        	cal.a=100;
//        	cal.b=200;
//        	cal.sum();
	   int sum()
	   {
		   return(a+b);
	   }
	   public static void main(String args[])
	   {
		   Methods cal=new Methods();
		   cal.a=100;
		   cal.b=200;
		   int r =cal.sum();
		   System.out.println(r);
				   
	   }
	
	
        }
        
        
        
        
        

