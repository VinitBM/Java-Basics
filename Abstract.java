package JavaBasic3;

  abstract class USA
  {
	  int x  = 10;
	  
	  int y= 23;
	  
	  
  
  void fun1(){
	  System.out.println("fun 1 is executed");
  }

  

   abstract void fun2(); {
   }
   class UK extends USA{
	   void fun2() {
		   
		   System.out.println("overriden fun2 is executed");
		   
	   }
   }
   class Abstract{
	   public static void main(String [] args) {
		   UK u1= new UK();
		   u1.fun2();	   }
   }
   
  }
   
	 
 

  
  
  
  
