package projetJava8.chapitre.ch03;

import java.lang.annotation.Annotation;
import java.util.Iterator;

public class main3 {

	public static void main(String[] args) {
		Annotation[] annotation = Personne.class.getAnnotations();
		
		for(Annotation a:annotation ) {
			System.out.println(a);
		}

	}

}
