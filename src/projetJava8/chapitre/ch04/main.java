package projetJava8.chapitre.ch04;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> maListe= new ArrayList<>();
       
		 List<Object> emptyList = Collections.emptyList();
		 
		 maListe =  Collections.emptyList();
		 
		 Method[] lesMethodes = Personne.class.getDeclaredMethods();
		 
		 for(Method m : lesMethodes) {
			 Parameter[] parameters =  m.getParameters();
			 System.out.println(m.getName());
			 for( Parameter p : parameters) {
				 System.out.println("Type de parametre : " + p.getName());
				 System.out.println("Nom de parametre : " + p.getType());
			 }
		 }
	}

}
