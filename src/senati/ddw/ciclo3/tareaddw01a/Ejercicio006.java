package senati.ddw.ciclo3.tareaddw01a;

public class Ejercicio006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	byte dias=0;
	int km=0;
	float monto=0f;
	float aux=0f;
	float ckm=0.40f;


dias=5;
km=2200;
byte cdia = 0;
if(km>2000) {
	
	monto=dias*cdia;
	aux=(km-2000)*ckm;
	monto=monto+aux;
}
	else {
		
		monto=dias*cdia;
	}
  
		System.out.println("total a pagar"+ monto);
}
}
