import java.util.Arrays;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] getPersonajesConImagen(){
        Personaje[] persoFinal = new Personaje[personajes.obtenerTodos().length];
        int cont=0;
        for (Personaje perso : personajes.obtenerTodos()){
            if(!perso.getImage().isEmpty()){
                persoFinal[cont] = perso;
                cont++;
            }
        }
        return getArraySinNulos(persoFinal, cont);
    }

    public int getStaffVivos(){
        short cont=0;
        for(Personaje perso : personajes.obtenerTodos()){
            if (perso.getHogwartsStaff() && perso.getAlive()){
                cont++;
            }
        }
        return cont;
    }

    public int getStaffMuertos(){
        short cont=0;
        for(Personaje perso : personajes.obtenerTodos()){
            if (perso.getHogwartsStaff() && !perso.getAlive()){
                cont++;
            }
        }
        return cont;
    }

    public int contieneLetra(char letra){
        short cont=0;
        for (Personaje perso : personajes.obtenerTodos()){
            if (perso.getName().contains(String.valueOf(letra))){
                cont++;
            }
        }
        return cont;
    }

    public Personaje[] getPjVivosContienenCadena(String cadena){
        Personaje[] persoF=new Personaje[personajes.obtenerTodos().length];
        short cont=0;
        for (Personaje perso : personajes.obtenerTodos()){
            if (perso.getName().contains(cadena) && perso.getAlive()){
                persoF[cont]=perso;
                cont++;
            }
        }
        return getArraySinNulos(persoF, cont);
    }

    public Personaje[] getActorIgualCadena(String cadena){
        Personaje[] persoF=new Personaje[personajes.obtenerTodos().length];
        short cont=0;
        for (Personaje perso : personajes.obtenerTodos()){
            if (perso.getActor().equals(cadena)){
                persoF[cont]=perso;
                cont++;
            }
        }
        return getArraySinNulos(persoF, cont);
    }

    public Personaje[] getArraySinNulos(Personaje[] persoFinal, int comienzoNulos) {
        return Arrays.copyOfRange(persoFinal, 0, comienzoNulos);
    }
}

