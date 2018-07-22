package projetJava8.chapitre.ch03;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Modifies.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Modifiee {
  String auteur() default "Inconnu";
}
