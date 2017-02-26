package net.me.dev;

public class Burbuja {
	
	
	public double[] ordenar(double[] arreglo) {
		
		double numMayor;
		boolean ordenado;
		
		for (int i = 0; i < arreglo.length-1; i++) {
			
			ordenado = true;
			
			//Se necesitan dos ciclos porque se necesita hacer una comparacion de muchos a muchos 
			
			for (int j = 0; j < arreglo.length-1; j++) {	
				if(arreglo[j]>arreglo[j+1]) {
					ordenado = false;
					numMayor = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = numMayor;
				}
			}
			
			if (ordenado) {
				break;
			}
		}
		
		return arreglo;
	}
	
	public void mostrArr(double[] arreglo) {
		System.out.println("mostrando arreglo");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(" "+arreglo[i]);
		}
		System.out.println();
	}
}
