import java.io.*;
  class main_room
    {
	 DataInputStream DIS= new DataInputStream(System.in);
	 
	 int x,y,z;
	  void get1_data() throws IOException
	    {
		System.out.print("Enter 1st 2nd number");
		  x=Integer.parseInt(DIS.readLine());
          y=Integer.parseInt(DIS.readLine());
		 }
		 void get2_data() throws IOException
		 {
		 System.out.println("and 3rd number= ");
          z=Integer.parseInt(DIS.readLine());
         }
     }
    
     class Greatest extends main_room
      {   
	  int temp;
	  
	        
	      void check1()
		    {
			
           	 if(x>y)
                {
                  if(x>z)
				     {
					  temp=x;
					  }
					else
                      {
                      temp=z;
                      }
                 }
              else 
                {
                  if(y>z)
                    {
                      temp=y;
                     }
                   else 
                     {
                     temp=z;
                     }
                }
            System.out.println("Smallest="+temp);
             }
        }
  
     class Smallest extends main_room
           {
             int temp;
			  void check2()
			   {
           	 if(x<y)
                {
                  temp=x;
				 }
				 else 
				   {
				    temp=y;
					}
				
            System.out.println("Smallest="+temp);
                }
           }
       class sing_inhe_great
          {
            public static void main(String ar[]) throws IOException 
             {
              Greatest G=new Greatest();
                 G.get1_data();
				 G.get2_data();
                 G.check1();
               Smallest S=new Smallest();
                 S.get1_data();
				 S.check2();
			  }
			}
                 				 
					  
		 
   