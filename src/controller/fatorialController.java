package controller;

public class fatorialController {
	
	public int calculaFatorial(int n){

		//condic�o de parada
		if(n == 1){
			return 1;
		}
		else{
		//fun��o para o termo n em fun��o do termo anterior
			return n * calculaFatorial(n-1);
		}
	}		
	
}
