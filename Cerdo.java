
/**
 * Clase Cerdo.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018)
 */
public class Cerdo extends Animal
{
    private static final String SONIDO_CERDO = "Ñoinq, ñoinq";
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        super(100, 15);
    }

    /**
     * Metodo que hace que el cerdo coma y gane 2 de peso y, a consecuencia, pierda 10 puntos de vida
     */
    @Override
    public void comer()
    {
        peso = peso + 2;
        puntosDeVida = puntosDeVida - 10;
    }
    
    /**
     * Metodo que imprime por pantalla el sonido caracteristico del cerdo
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println(SONIDO_CERDO);
    }
    
    /**
     * Metodo getter que devuelve el peso del cerdo
     * @return peso     Devuelve el peso del animal
     */
    @Override
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * Metodo getter que devuelve los puntos de vida del cerdo
     * @return puntosDeVida     Devuelve los puntos de vida del animal
     */
    @Override
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Metodo que vacuna al animal
     */
    @Override
    public void vacunar()
    {
        puntosDeVida += 20;
    }
}
