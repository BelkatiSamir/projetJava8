package projetJava8.chapitre.ch02;

import java.util.Comparator;

public class ComparateurPersonne implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Personne p1 = (Personne) o1;
		Personne p2 = (Personne) o2;
		
		return p1.compare(p2);
		
	}

}
