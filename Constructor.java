package JavaBasic3;
class Example{
	
	private int x,y;

Example(){
	x=4;y=5;
	
}
Example(int x,int y){
	x=7;
	y=8;
}
void display() {
	int g;
	System.out.println(x+" ");
	System.out.println(y+" ");
	
}
}
 class Constructor{
	 public static void main(String [] args) {
		 Example e1= new Example(5,6);
		 e1.display();
		 Example e2 = new Example();
		 e2.display();
		 
	 }
 }

	






