package projetJava8.chapitre.ch01;

public interface Personne {
 default int getAge() {return -1;};
 String getNom();
}
