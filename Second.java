package JavaBasic3;
class Nokia1
{
  private int x,y,z;
  void setData() {
	  x=12; y=23; z=67;}
  
	  
  }

void display() {
	System.out.println(x+" "+y+" "+z);
}
	
}  class Second{
	public static void main(String [] args) {
		Nokia N1= new Nokia();
		N1.setData();
		N1.display();
		}
}
