
public class Ejercicio02 {
	public int [][] SumarMatriz(int [][] matrizOrigen)
	{
		int matrizSalida[][] = 
				new int [matrizOrigen.length][matrizOrigen[0].length]; 
				
		int i,j;
		for(i=0;i<matrizOrigen.length;i++)
		{
			for(j=0;j<matrizOrigen[i].length;j++)
			{
				matrizSalida[i][j]=matrizOrigen[i][j];
				if(i-1>=0)
				{
					matrizSalida[i][j]+=matrizOrigen[i-1][j];
				}
				if(j-1>=0)
				{
					matrizSalida[i][j]+=matrizOrigen[i][j-1];
				}
				if(i+1<matrizOrigen.length)
				{
					matrizSalida[i][j]+=matrizOrigen[i+1][j];
				}
				if(j+1<matrizOrigen[i].length)
				{
					matrizSalida[i][j]+=matrizOrigen[i][j+1];
				}
				
			}
		}
		
		return matrizSalida;
	}
	
	public void mostrarMatriz(int [][] matriz)
	{
		int i,j;
		for(i=0;i<matriz.length;i++)
		{
			for(j=0;j<matriz[i].length;j++)
			{
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String [] args)
	{
		int [][] matrizOrigen = 
		{
			{8, 2, -3, 4},
			{5, -6, -6, 20},
			{21, 1, -5, 0}
		};
		int[][] matrizSalida;
		Ejercicio02 ejer = new Ejercicio02();
		matrizSalida = ejer.SumarMatriz(matrizOrigen);
		ejer.mostrarMatriz(matrizSalida);
	}
}
