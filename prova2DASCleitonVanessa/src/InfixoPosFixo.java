import java.util.ArrayList;


public class InfixoPosFixo {
	
	ArrayList<Integer> pilhaDeNumeros = new ArrayList<Integer>();
	ArrayList<String> pilhaDeOperadores = new ArrayList<String>();
	
	public int calculaPosFixo(String posFixo) {
		
		int resultado=0;
		
		//Instrução que retira espaços da String
		String[] expressao = posFixo.split(" ");
		
		for(int i = 0; i<expressao.length;i++){
			if(expressao[i]!="+")
				pilhaDeNumeros.add(Integer.parseInt(expressao[i]));
			else if(expressao[i]!="-")
				pilhaDeNumeros.add(Integer.parseInt(expressao[i]));
			else if(expressao[i]!="/")
				pilhaDeNumeros.add(Integer.parseInt(expressao[i]));
			else if(expressao[i]!="*")
				pilhaDeNumeros.add(Integer.parseInt(expressao[i]));
			else
				pilhaDeOperadores.add(expressao[i]);
		}
		
		for(int i=0;i<pilhaDeNumeros.size();i+=2){
			
			resultado = operacao(pilhaDeNumeros.get(i), pilhaDeNumeros.get(i+1), pilhaDeOperadores.get(i));
		}
		
		return 1;
	}
	
	private int operacao(int numero1, int numero2,String operador) {
		if(operador=="+"){
			return numero1+numero2;
		}
		else if(operador=="-"){
			return numero1-numero2;
		}
		else if(operador=="*"){
			return numero1*numero2;
		}
		else {
			return numero1/numero2;
		}
	}

}
