package act11;

import java.util.Scanner;

public class Square implements Shape {
	
	public Square() {}
	Scanner b =new  Scanner (System.in);
	
    public void Area() {
    	// Lado por lado
    	int lado;
    	int areaCu;
    	
    	System.out.println("Digita el lado");
    	lado=b.nextInt();
    	
    	areaCu=lado*lado;
    	
    	System.out.println("El area del cuadrado es ->" + areaCu);
		
	}
	public void Perimetro() {
		int lad;
		int perimetoCu;
		
		System.out.println("Digita el lado");
		lad=b.nextInt();
		
		perimetoCu=lad*4;
		
		System.out.println("El perimetro del cuadrado es ->" + perimetoCu);
		
		
	}

	
	
}
