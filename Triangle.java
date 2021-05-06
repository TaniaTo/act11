package act11;

import java.util.Scanner;

public class Triangle implements Shape{
	
	public Triangle() {}
	Scanner d =new  Scanner (System.in);
    
	
	
	public void Area() {
    	
    	
         
    	// Base por altura entre 2
    	
    	int base ;
    	int altura ;
    	int area;
    	
    	System.out.println("Digita la base ");
    	base = d.nextInt();
    	
    	System.out.println("Digita la altura");
    	altura =d.nextInt();
    	
    	area=( base*altura)/2;
    	
    	System.out.println("El area del rectangulo es ->" + area);
    	
    	
    
    }
		
	
	public void Perimetro() {
		
		
		int lado1;
		int lado2;
		int lado3;
		int perimetro;
		
		System.out.println("Digita el lado 1");
		lado1=d.nextInt();
		System.out.println("Digita el lado 2");
		lado2=d.nextInt();
		System.out.println("Digita el lado 3");
		lado3=d.nextInt();
		
		
		perimetro =lado1 + lado2 +lado3;
		
		System.out.println("El perimetro del Triangulo es->" + perimetro);

		
	}
	

}
