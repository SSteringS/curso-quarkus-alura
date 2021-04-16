package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		
		Class<SubControle> subControleClasse1 = SubControle.class;


		Constructor<SubControle> construtorSubControle = subControleClasse1.getDeclaredConstructor(String.class);

		construtorSubControle.setAccessible(true);
		SubControle subControle = construtorSubControle.newInstance();
	}

}
