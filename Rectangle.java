package act11;

import java.util.Scanner;

public class Rectangle  implements Shape{
	
	public Rectangle() {}
	Scanner c =new  Scanner (System.in);
	
    public void Area() {
		//base por altura 
    	
    	int base;
    	int altura;
    	int areaRec;
    	
    	System.out.println("Digita la base");
    	base=c.nextInt();
    	
    	System.out.println("Digita la altura");
    	altura=c.nextInt();
    	
    	areaRec= base*altura;
    	
    	System.out.println("El area del rectangulo es->" + areaRec);
    	
	}
	public void Perimetro() {
		int lado;
		int periRec;
		
		System.out.println("Digita el lado");
		lado=c.nextInt();
		
		periRec=lado*lado;
		
		System.out.println("El perimetro del Rectangulo es ->" + periRec);
		
		
	}
	

}
