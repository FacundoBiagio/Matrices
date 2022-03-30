# Matrices
Ejercicio matriz 00

//Escribir un método en Java que permita comprobar si la diagonal principal de una matriz cuadrada de enteros tiene en cada posición un valor igual a la suma de todos los valores de las posiciones anteriores de dicha diagonal. 
//
//Por ejemplo, la siguiente matriz comprueba la regla:
//1 2 3
//4 1 6
//7 8 2
//
//Pero esta otra, no la comprueba:
//1 2 3
//4 2 6
//7 8 2


public class Ejercicio_0 {

	public boolean comprobar(int[][] matriz)///Metodo de momento publico
	{
	
		int sumaDeLasAnteriores = matriz[0][0];
		for(int i = 0; i< matriz.length; i++) ///matriz lengt, es el largo, en clase usea i=1 para agilizar
		{
			if(matriz[i][i] == sumaDeLasAnteriores)
			{
				sumaDeLasAnteriores = sumaDeLasAnteriores + matriz[i][i]; 
			}
			else {
				return false;
			}
		}
		return true; 
	}
	
	public static void main(String[] args){
		
		int[][] ejemplo = {
				{1,2,3},
				{4,2,6},
				{7,8,2}
		};
		
		Ejercicio_0 miEjercicio = new Ejercicio_0();
		System.out.println(miEjercicio.comprobar(ejemplo));
	}
}//
