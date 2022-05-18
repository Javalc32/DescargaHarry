import java.util.Arrays;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] getPersonajesConImagen(){
        Personaje[] persoFinal = personajes.obtenerTodos();
        int cont=0;
        for (Personaje perso : personajes.obtenerTodos()){
            if(!perso.getImage().isEmpty()){
                persoFinal[cont] = perso;
                cont++;
            }
        }
        return getArraySinNulos(persoFinal, cont);
    }

    public Personaje[] getArraySinNulos(Personaje[] persoFinal, int comienzoNulos) {
        return Arrays.copyOfRange(persoFinal, 0, comienzoNulos);
    }
}

