
/**
 * Clase Granja.
 * 
 * @author (David Rodriguez) 
 * @version (11/05/2018)
 */
public class Granja
{
    /**
     * Constructor de la clase Granja
     */
    public Granja()
    {
        
    }

    /**
     * Metodo que permite alimentar al animal indicado
     * @param animalAlQueAlimentar  Animal que se va a alimentar
     */
    public void alimentar(Animal animalAlQueAlimentar)
    {
        Animal animal = animalAlQueAlimentar;
        animal.comer();
    }
    
    /**
     * Metodo que permite vacunar al animal indicado, menos al pato
     * @param animalAlQueVacunar    Animal que se va a vacunar
     */
    public void vacunar(Animal animalAlQueVacunar)
    {
        Animal animal = animalAlQueVacunar;
        if(animal instanceof Pato){
            System.out.println("No se puede vacunar a un pato");
        }
        else{
            animal.vacunar();
        }
    }
    
    /**
     * Metodo que permite hacer el sonido caracteristico del animal indicado
     * @param animalSonidoCaracteristico     El animal que emite el sonido caracteristico
     */
    public void hacerEmitirSonidoCaracterístico(Animal animalSonidoCaracteristico)
    {
        Animal animal = animalSonidoCaracteristico;
        animal.emitirSonidoCaracteristico();
    }
}
