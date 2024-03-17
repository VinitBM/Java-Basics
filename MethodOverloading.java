package JavaBasic3;

class Nokia{
	
	void setMic() {
		System.out.println("Mic is set");
		
	}
	void setKey() {
		System.out.println(" keypad is set");
		
	}
} class Oppo extends Nokia{
	void setMic(){
		System.out.println(" mic is set successfully");
		/////////////function overloading
	}
}




public class MethodOverloading {
public static void main(String [] args) {
	Oppo o1 = new Oppo();
	o1.setMic();
}
}
