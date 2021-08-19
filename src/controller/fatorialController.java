package controller;

public class fatorialController {
	
	public int calculaFatorial(int n){

		//condicão de parada
		if(n == 1){
			return 1;
		}
		else{
		//função para o termo n em função do termo anterior
			return n * calculaFatorial(n-1);
		}
	}		
	
}
