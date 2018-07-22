package projetJava8.chapitre.ch02;

public class Personne {
 
	private int age;
	
	public int getAge() {return age;};
	
	public Personne(int age) {this.age = age;};
	
	
	
	public int compare(Personne d) {
		return this.age-d.age;
	}
}
