
package cajero.tdea;

/**
 *
 * @author melan
 */
public class Consulta extends ClasePadre {
    
    @Override
    public void Transacciones(){
        System.out.println("-----------------------------------");
        System.out.println("TU SALDO ACTUAL ES: "+ getSaldo());
        System.out.println("-----------------------------------");        
    }
}
