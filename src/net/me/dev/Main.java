package net.me.dev;

public class Main {

	public static void main(String[] args) {
		double[] arreglo = {12, 100, 19, 31, 42};
		Burbuja b = new Burbuja();
		
		b.mostrArr(arreglo);
		b.ordenar(arreglo);
		b.mostrArr(arreglo);
	}

}
