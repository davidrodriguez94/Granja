
/**
 * Clase Pollo.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018))
 */
public class Pollo extends Animal
{
    private static final String SONIDO_POLLO = "Pio, pio";
    /**
     * Constructor de la clase Pollo
     */
    public Pollo()
    {
        super(100,1);
    }
    
    /**
     * Metodo que hace que el pollo coma y gane 1 de peso y, a consecuencia, pierda 10 puntos de vida
     */
    @Override
    public void comer()
    {
        peso = peso + 1;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo que imprime por pantalla el sonido caracteristico del pollo
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println(SONIDO_POLLO);
    }
    
    /**
     * Metodo getter que devuelve el peso del pollo
     * @return peso     Devuelve el peso del animal
     */
    @Override
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * Metodo getter que devuelve los puntos de vida del pollo
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
        puntosDeVida += 10;
    }
}
