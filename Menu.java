package act11;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
	    Primera p =new Primera();
	    Triangle t = new Triangle();
	    Circle c= new Circle();
	    Square s=new Square();
	    Rectangle r= new Rectangle();
		
		Scanner datos =new  Scanner (System.in);
		
		
		//VARIABLES 
		int respuesta;
		int op =0;
		int figura=0;
		
	
		
		
		// MENU PRINCIPAL 
		
		do {
		
		
		System.out.println("---Bienvenido----- ");
        System.out.println("*****MENU******");
		
        System.out.println("Opciones");
        System.out.println("1. Seleccionar propiedad a calcular");
        System.out.println("2.Seleccionar la figura");
        System.out.println("3.Solicitar los atributos de la figura");
        System.out.println("4.Imprimir en pantalla el resultado de los cálculos");
        System.out.println("5.Salir");
        
        System.out.println("Escoge una opcion ");
        respuesta= datos.nextInt();
        
        switch(respuesta){
        
        
        case 1:
        	
        	//SELLECCIONAR PROPIEDAD A CALCULAR 
        
        System.out.println("-------------------------------------");
        System.out.println("Selecciona la propiedad a calcular");
        System.out.println("22.PERIMETRO");
        System.out.println("23.AREA");
        System.out.println("Escoge la opcion");
        op=datos.nextInt();
        
        if(op ==22 ) {
        	
        		System.out.println("PERIMETRO");
        		
        		
       }else if  (op == 23){
    	   
    	   System.out.println("AREA");
    	   
       }else {
    	   System.out.println("No es valida la opcion");
       }
        
        
       break;
        	
        case 2:
        	//SELECCIONAR FIGURA 
        	

            System.out.println("-------------------------------------");
        	System.out.println("---FIGURAS---");
        	System.out.println("Escoge la figura");
        	System.out.println("11.CIRCULO ");
        	System.out.println("12.TRIANGULO");
        	System.out.println("13.CUADRADO");
        	System.out.println("14.RECTANGULO ");
            
        	System.out.println("Escoge una figura");
        	figura=datos.nextInt();
        	
        	if(figura == 11 ) {
        		System.out.println("Has elegido la figura -> CIRCULO");
        		
        		
        	}else if (figura == 12){
        		System.out.println("Has elegido la figura -> TRIANGULO");
        		
        	}else if(figura == 13) {
        		System.out.println("Has elegido la figura -> CUADRADO");
        		
        	}else if(figura == 14) {
        		System.out.println("Has elegido la figura -> RECTANGULO");
        		
        	}else {
        		System.out.println("No es una opcion correcta ");
        	}
        		
        		
        break;
        	
        case 3:
        	// SOLICITAR LOS DATOS DE LA FIGURA 

            System.out.println("-------------------------------------");
        	
            //CIRCULO DE PERIMETRO
        	if (op == 22 && figura == 11) {
        	
        		System.out.println("Propiedad : Perimetro"+
        				           "\n"+ " Figura : Circulo");
        		
        		c.Perimetro();
        		
        		
        		
        		//PERIMETRO DEL TRIANGULO
        		}else if (op == 22 && figura ==12) {
        			
        			System.out.println("Propiedad : Perimetro"+
 				           "\n"+ " Figura : Triangulo");
        			
        			t.Perimetro();
        			
        			
        			
        			//PERIEMTRO DEL CUADRADO
        		}else if (op == 22 && figura == 13) {
        			System.out.println("Propiedad : Perimetro"+
  				           "\n"+ " Figura : Cuadrado");
        			
        			s.Perimetro();
        			
        			
        			//PERIMETRO RECTANGULO 
        			
        			
        		}else if(op== 22 && figura == 14) {
        			System.out.println("Propiedad : Perimetro"+
   				           "\n"+ " Figura : Rectangulo");
        		r.Perimetro();
        			
        			
        			////////AREAS///////
        		
        		//AREA CIRCULO
        		} else  if (op == 23 && figura == 11) {
            	
        		System.out.println("Propiedad : Area"+
        				           "\n"+ " Figura : Circulo");
        		
        		c.Area();
        		
        		//AREA TRIANGULO
 
        	} else if (op == 23 && figura == 12) {
            	
        		System.out.println("Propiedad : Area"+
        				           "\n"+ " Figura : Triangulo");
        		t.Area();
        		
        		//AREA CUADRADO
        		
        	}else if (op == 23 && figura == 13) {
            	
        		System.out.println("Propiedad : Area"+
        				           "\n"+ " Figura : Cuadrado");
        		
        		s.Area();
        		
        		
        		//AREA RECTANGULO
        	}else if (op == 23 && figura == 14) {
            	
        		System.out.println("Propiedad : Area"+
        				           "\n"+ " Figura : Rectangulo");
        		
        		r.Area();
        		
        	}else {
			System.out.println("NO EXISTE LA OPCION");
		}
        	
        	break;
        	
        case 4:
        	
        	//IMPRIMIR DATOS 
        	
        	
        	break;
        	
        	
        	
        case 5:
        	System.out.println("Adios");
        	break;
        	
        	default :
        		System.out.println("No existe esa opcion");
        }
        	 }while(respuesta!=5);
		}
	}


        
        
       

         
		
		
	