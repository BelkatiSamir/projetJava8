package projetJava8.chapitre.ch05;

import java.util.Arrays;

public class main5 {

	public static void main(String[] args) {
		Personne[] lesPersonnes = {
				new Personne(12),
				new Personne(2),
				new Personne(5),
				new Personne(44),
				new Personne(77),
				new Personne(88)
				
		};
		//1 cr�er une classe impl�ments Comparator
		//2 : r�f�rencier une m�thode qui existe
		//3: utiliser les lambda expersion
		
		Arrays.sort(lesPersonnes,(p1,p2) ->{return p1.getAge()-p2.getAge();});
		
		for(Personne p : lesPersonnes) {
			System.out.println(p.getAge());
		}

	}

}
