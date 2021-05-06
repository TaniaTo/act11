package act11;

import java.util.Scanner;

public class Circle  implements Shape {
	
	public Circle() {}
		Scanner a =new  Scanner (System.in);
		
	
		
	
    public void Area() {
    	
    	double radio;
    	double  pi= 3.141;
    	double ar;
    	double areaC;
    	
    	System.out.println("Digita tu radio");
    	radio=a.nextDouble();
    	
    	ar=(radio)*2;
    	
    	areaC= ar*pi;
    	
    	System.out.println("Tu area del circulo es->" + areaC);
    	
    	
    	
    	
    	}
    
    
    
	public void Perimetro() {
		
	double diametro;
	double p=3.141;
	double perimeC;
	
	System.out.println("Digita tu diametro");
	diametro=a.nextDouble();
	
	  perimeC= diametro*p;
	  
	  System.out.println("Tu perimetro del circulo ->"+ perimeC);
		
	}
	
	

}
