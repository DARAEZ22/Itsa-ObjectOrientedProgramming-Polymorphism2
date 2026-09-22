package polimorfismo_2;

import java.util.Scanner;

public class Producto_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa codigo del producto: ");
		String nom=sc.nextLine();
		System.out.println("Existencias: ");
		int val=sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa nombre del producto: ");
		String pro=sc.nextLine();
		System.out.println("Qué tan amenudo compras ese producto?");
		String tiempo=sc.nextLine();
		
		System.out.println("Ubicación en coordenadas: ");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		
		/*Since the class has two polimorphic variables we have to add two variables per object. */
		Producto<String,Integer> articulo=new Producto<>(nom,val);
		Producto<Double,Double> ubicacion=new Producto<>(x,y);
		
		System.out.println("Codigo: "+articulo.getclave()+articulo.getvalor());
		System.out.println("Ubicación: y:"+ubicacion.getclave()+" x:"+ubicacion.getvalor());
		
		
		Producto<String,String> detalles=new Producto<>(pro,tiempo);
		System.out.println("Nombre del producto: "+detalles.getclave()+"\nTu lo compras: "+detalles.getvalor());
		
		sc.close();
		
	}

}
