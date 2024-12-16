import javax.swing.*;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class Juego {
 //atributos

    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador banca;

    public Juego(Jugador[] jugadores){
        this.jugadores= jugadores;
        baraja = new Baraja();
        banca = new Jugador("Banca", LocalDate.now());
    }
public void start(){
    //reparto inicial
    for (Jugador jugador:jugadores){
        repartoInicial(jugador);
    }
    repartoInicial(banca);

    for (Jugador jugador:jugadores){
        juegaJugador(jugador);
    }
    juegaJugador(banca);

    mostrarGanador;



    }

    private void repartoInicial(Jugador player){

        player.anyadirCarta(baraja.repartirEncima());
        player.anyadirCarta(baraja.repartirEncima());
    }

    private void juegaJugador(Jugador player){
         boolean verifica = true;

        while (verifica){
            System.out.println("Turno de :"+ player);

            char medidor =Input.getchar("Indique S si quieres otra carta o N si quieres plantarte");
            player.anyadirCarta(baraja.repartirEncima());
            if (medidor!= 'S' || player.obtenerPuntuacion()>21){
                verifica= false;
            }
        }



        }

    }

