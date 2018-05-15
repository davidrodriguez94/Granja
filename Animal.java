
/**
 * Clase Animal.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018)
 */
public abstract class Animal
{
    protected int puntosDeVida;
    protected int peso;
    
    /**
     * Constructor de la clase Animal
     * @param puntosDeVida      Puntos de vida del animal
     * @param peso              Peso del animal
     */
    public Animal(int puntosDeVida, int peso)
    {
        this.puntosDeVida = puntosDeVida;
        this.peso = peso;
    }

    public abstract void comer();
    
    public abstract void emitirSonidoCaracteristico();
    
    public abstract int getPeso();
    
    public abstract int getPuntosDeVida();
    
    public abstract void vacunar();
}