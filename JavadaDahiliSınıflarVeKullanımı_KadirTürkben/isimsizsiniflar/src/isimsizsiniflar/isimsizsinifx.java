package isimsizsiniflar;

 class arac {
	public void  g�ster() {
		System.out.println("Kamyon");
	}
} 

public class isimsizsinifx {

	public static void main(String[] args) {
		
       arac marka = new arac() {
    	 public void g�ster() {
    		 System.out.println("Motorsiklet");
    	 } 
    	 
       };
       marka.g�ster();
	}
}
