package br.com.tiagodeveloper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExemploVarargs {
	
	
	
	public void teste(Object...objects) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		for(Object obj : objects){
			
			for(Method metodo: obj.getClass().getDeclaredMethods()){
				if(metodo.getName().startsWith("get"))
					System.out.println(metodo.invoke(obj));
				
			}
			
		}
		
	}
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ExemploVarargs varargs = new ExemploVarargs();
		
		
		Pessoa p = new Pessoa("Tiago",28);
		Carro carro = new Carro("Fiat", 2017, "Classic");
		
		
		
		varargs.teste(p,carro);

	}
	
	
	
	

}
