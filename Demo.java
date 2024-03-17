package JavaBasic3;

class India{
	
	private int x,y;
	void setData(int p ,int q) {
		x=p;
		y=q;
	}
	
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
}

public class Demo{
	public static void main(String [] args) {
		India a1= new India();
a1.setData(23, 032);
    India a2 = new India();
    a2.setData(23,56);
    
    
    
    
    a1.display();
    a2.display();
    
    
    
	}

	
	
	
	
	
}