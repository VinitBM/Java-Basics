package JavaBasic3;



class Nokia1{
	int x,y;
	void setData() {
		x=10;
		y=20;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
}class Nokia
{
	public static void main(String [] args) {
		Nokia1 a1= new Nokia1();
		Nokia1 a2= new Nokia1();
		a2.setData();
		a1.setData();
	}
}