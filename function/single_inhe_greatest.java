import java.util.*;
  class first
    {
	  Scanner S=new Scanner(System.in);
	  int x,y;
	    void get1()
		 {
		  System.out.println("Enter a number=");
		   x=S.nextInt();
		  }
     }
    class second extends first 
       { 
	      float sq;
          void Find()
             {
			   sq=(float)(Math.sqrt(x));
			   System.out.println("Squre root of a nubmer="+sq);
			  }
			  
	    }
		 
	  class third extends first 
         {
            		 
             void get2()
    		   {	
			    System.out.println("Enter second number=");
				  y=S.nextInt();
				}
		      void check()
                {
                 int temp;
                   if(x>y)
                       {
                       temp=x;
                        }
                     else
                       {
                       temp=y;
                        }
                    System.out.println("Greatest value="+temp);
				 }	
          }
     
       class single_inhe_greatest
            {
              public static void main(String ar[])
                {
                 second ob1=new second();
                     ob1.get1();
                     ob1.Find();
                  third ob2=new third();
				     ob2.get1();
                     ob2.get2();
                     ob2.check();
                 }
            }				 