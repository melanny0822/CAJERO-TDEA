
package cajero.tdea;

/**
 *
 * @author melan
 */

public class Deposito extends ClasePadre {
    
      @Override
    public void Transacciones(){
        System.out.println("///////////////////////////////////");
        System.out.print("     ¿CUÁNTO DESEAS DEPOSITAR?:    ");
        System.out.println("///////////////////////////////////");
        Deposito();
        
        Transacciones = getSaldo();
        setSaldo(Transacciones + Deposito);
        System.out.println("---------------$$$----------------");
        System.out.println("TU NUEVO SALDO ES : " + getSaldo()+" PESOS");
        System.out.println("---------------$$$----------------");
             
    }
    
}
