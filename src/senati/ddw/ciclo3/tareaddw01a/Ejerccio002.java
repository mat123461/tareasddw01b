package senati.ddw.ciclo3.tareaddw01a;

public class Ejerccio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=5;
		byte y=2;
		byte aux=0;

		System.out.println("Valor inicial de X -->" + x);
		System.out.println("Valor inicial de Y -->" + y);

		aux=x;
		x=y;
		y=aux;

		System.out.println("Valor final de X -->" + x);
		System.out.println("Valor final de Y -->" + y);

	}

}
