package projetJava8.chapitre.ch02;

import java.util.Arrays;
import java.util.Iterator;

public class main02 {

	public static void main(String[] args) {
		Personne moi = new Personne(47);
		Personne ele = new Personne(46);
		
		Personne[] lesgens = new Personne[2];
		lesgens[0]= moi;
		lesgens[1]= ele;
		
		//Arrays.sort(lesgens, new ComparateurPersonne());
		Arrays.sort(lesgens, Personne::compare);
		for (Personne p : lesgens) {
			System.out.println(p.getAge());
			
		}
	}

}
