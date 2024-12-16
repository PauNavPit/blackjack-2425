import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private Carta[] cartas;

    public Baraja(){
        int cont=0;
        cartas = new Carta[Palo.values().length*Numero.values().length];
        for (Palo palo:Palo.values()){
            for (Numero numero:Numero.values()){
                cartas[cont++]= new Carta(palo,numero);
            }
        }
        barajar();
    }

    private void barajar(){
        List<Carta> cartaList =Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);
    }

    public Carta repartirEncima(){
        Carta carta = null;
        if(cartas.length>0){
            carta = cartas[0];
            cartas = Arrays.copyOfRange(cartas,1,cartas.length);
        }
        return carta;
    }

    public Carta repartirDebajo(){
        Carta carta = null;
        if(cartas.length>0){
            carta = cartas[cartas.length-1];
            cartas = Arrays.copyOfRange(cartas,0,cartas.length-1);
        }
        return carta;
    }

    @Override
    public String toString() { return Arrays.toString(cartas);}


}