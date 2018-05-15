
/**
 * Clase Vaca.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018)
 */
public class Vaca extends Animal
{
    private static final String SONIDO_VACA = "Muuuu, muuuu";
    /**
     * Constructor de la clase Vaca
     */
    public Vaca()
    {
        super(100,25);
    }
    
    /**
     * Metodo que hace que la vaca coma y gane 2 de peso y, a consecuencia, pierda 10 puntos de vida
     */
    @Override
    public void comer()
    {
        peso = peso + 2;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo que imprime por pantalla el sonido caracteristico de la vaca
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println(SONIDO_VACA);
    }
    
    /**
     * Metodo getter que devuelve el peso de la vaca
     * @return peso     Devuelve el peso del animal
     */
    @Override
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * Metodo getter que devuelve los puntos de vida de la vaca
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
        puntosDeVida += 30;
    }
}
