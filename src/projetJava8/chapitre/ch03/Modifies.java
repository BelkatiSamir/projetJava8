package projetJava8.chapitre.ch03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Modifies {
 Modifiee[] value(); 
}
