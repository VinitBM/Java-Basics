 class Nokia1{
	 int mic;
	 void setMiv() {
		 
		 mic=2;
		 
	 }
	 void displayM() {
		 System.out.println(mic);
	 }
 }
 class Nokia2 extends Nokia1{
	 int sensore;
	 void setSensore() {
		 sensore=6;
	 }
	 
	 
   void displayS() {
	 System.out.println(sensore);
	 
 }
 }
 class Nokia3 extends Nokia2{
	 int touchpad;
	 void setTp() {
		 touchpad= 10;
		 
	 }
	 void displayTP() {
		 System.out.println(touchpad);
		 
		 
		 
	 }
 }
 
 
 class MultiInher
 {
	 
	 
	 public static void main(String [] args) {
		 
		 
		 Nokia3 a1=new Nokia3();
		 
		 
		 
		 
		 
		 n1.setSensor();
			n1.setTP();
			
			n1.displayM();
			n1.displayS();
			n1.displayTP();
			
		
	
		 
	 }
 }
 