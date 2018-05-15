
/**
 * Clase Pato.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018)
 */
public class Pato extends Animal
{
    private static final String SONIDO_PATO = "Cua, cua";
    /**
     * Constructor for objects of class Pato
     */
    public Pato()
    {
        super(100, 2);
    }

    /**
     * Metodo que hace que el pato coma y gane 1 de peso y, a consecuencia, pierda 10 puntos de vida
     */
    @Override
    public void comer()
    {
        peso = peso + 1;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo que imprime por pantalla el sonido caracteristico del pato
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println(SONIDO_PATO);
    }
    
    /**
     * Metodo getter que devuelve el peso del pato
     * @return peso     Devuelve el peso del animal
     */
    @Override
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * Metodo getter que devuelve los puntos de vida del pato
     * @return puntosDeVida     Devuelve los puntos de vida del animal
     */
    @Override
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Metodo que vacuna al animal(el pato no puede ser vacunado)
     */
    public void vacunar()
    {
        
    }
}
