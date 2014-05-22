import java.util.ArrayList;


public class InfixoPosFixo {
	
	ArrayList<Integer> pilhaDeNumeros = new ArrayList<Integer>();
	ArrayList<String> pilhaDeOperadores = new ArrayList<String>();
	
	public int calculaPosFixo(String posFixo) {
		/*
		int resultado=0;
		
		//Instrução que retira espaços da String
		String[] expressao = posFixo.split(" ");
		//System.out.println(expressao[3]);
		
		//3 5 7 + -
		
		for(int i = 0; i<5;i++){
			if(expressao[i]=="+"){
				pilhaDeOperadores.add(expressao[i]);
			System.out.println(expressao[i]);
			}
			else if(expressao[i]=="-"){
				pilhaDeOperadores.add(expressao[i]);
				System.out.println(expressao[i]);
			}
			else if(expressao[i]=="/"){
				pilhaDeOperadores.add(expressao[i]);
				System.out.println(expressao[i]);
			}
			else if(expressao[i]=="*"){
				pilhaDeOperadores.add(expressao[i]);
				System.out.println(expressao[i]);
			}
			else{
				pilhaDeNumeros.add(Integer.parseInt(expressao[i]));
				System.out.println(expressao[i]);
			}
			
		}
		System.out.println(pilhaDeNumeros);
		System.out.println(pilhaDeOperadores);
		
		
		int j = 0;
		
		for(int i=0;i<pilhaDeNumeros.size();i++){
			if( i == 0){
				resultado = operacao(pilhaDeNumeros.get(i), pilhaDeNumeros.get(i+1), pilhaDeOperadores.get(j));
				i++;
			}
			else
				resultado = operacao(resultado, pilhaDeNumeros.get(i), pilhaDeOperadores.get(i));
			j++;
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
		}*/
		return 1;
	}

	public String infixo(String expressao) {
		String posfixo="";
		String operadores="";
		int i;

		
		for(i =0;i<expressao.length();i++){
			if((expressao.charAt(i)!='(') || expressao.charAt(i)!=')'){
				if(expressao.charAt(i)=='+')
					operadores+=expressao.charAt(i);
				else if(expressao.charAt(i)=='-')
					operadores+=expressao.charAt(i);
				else if(expressao.charAt(i)=='*')
					operadores+=expressao.charAt(i);
				else if(expressao.charAt(i)=='/')
					operadores+=expressao.charAt(i);
				else
					posfixo+=expressao.charAt(i);
			}
		}
		System.out.println(posfixo);
		return posfixo+operadores;
	}

}
