
package cajero.tdea;

/**
 *
 * @author melan
 */
public class CajeroTdeA {

    
    public static void main(String[] args) {
       
        ClasePadre comunica = new Consulta();
        comunica.setSaldo(1000000);
        comunica.Operaciones();
    }
    
}
