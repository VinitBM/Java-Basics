package JavaBasic3;

 class StaticM2 {
	int x;
	int y;
	 static private int z;
	 
	 static void fun1() {
		 z=11;
		 System.out.println(z);
	 }
	 
	 }
 public class StaticM{
	 public static void main(String [] args) {
		 StaticM2.fun1();
		 
	 }
}
