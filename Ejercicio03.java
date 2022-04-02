public class Ejercicio03 {
	
	public int [] obtenerVecorModa(int [][] matriz)
	{
		int [] vectorModa = new int [matriz.length];
		int i,j,k,acum,acumAux;
		for(i=0;i<matriz.length;i++)
		{
			acum=0;
			acumAux=0;
			for(j=0;j<matriz[i].length;j++)
			{
				for(k=0; k<matriz[i].length;k++)
				{
					if(matriz[i][j] == matriz[i][k])
					{
						acumAux++;
					}
				}
				if(acumAux>=acum)
				{
					vectorModa[i] = matriz[i][j];
					acum = acumAux;
				}
				acumAux = 0;
			}
		}
		
		return vectorModa;
	}

	public static void main(String[] args)
	{
		int [][] matriz = {
			{1, 2, 3, 4},
			{5, -6, -6, 20},
			{1, 1, 10, 10}
		};
		int [] vectorModa;
		int i;
		Ejercicio03 ejer = new Ejercicio03();
		vectorModa = ejer.obtenerVecorModa(matriz);
		for(i=0;i<vectorModa.length;i++)
		{
			System.out.print(vectorModa[i]+"\t");
		}
	}
}
