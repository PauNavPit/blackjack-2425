import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Jugador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Carta[] mano;

    public Jugador(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        mano = new Carta[0];
        this.fechaNacimiento = fechaNacimiento;

        }

    public String getNombre() {
        return nombre;
    }

    public void anyadirCarta(Carta carta){

        mano = Arrays.copyOf(mano,mano.length+1);
        mano[mano.length-1] = carta;

        }

        public int obtenerPuntuacion(){

        int puntos=0;

            for (Carta carta:mano){
                puntos += carta.getNumero().getPuntuacion();
            }

            return (puntos>21)?-1:puntos;

    }

        @Override
        public String toString(){
        return "Jugador "+nombre +" Puntuacion :" + obtenerPuntuacion()+" Mano: "+ Arrays.toString(mano);
        }



    }
