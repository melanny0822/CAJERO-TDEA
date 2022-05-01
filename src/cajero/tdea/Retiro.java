
package cajero.tdea;

/**
 *
 * @author melan
 */

public class Retiro extends ClasePadre{
    
     @Override
    public void Transacciones(){
        System.out.println("-----------------------------------");
        System.out.println("     ¿CUÁNTO DESEAS RETIRAR?:      ");
        System.out.println("-----------------------------------");
        Retiro();
        if(Retiro <= getSaldo()){
           Transacciones = getSaldo();
           setSaldo(Transacciones - Retiro);
           System.out.println("-----------------------------------");
           System.out.println("     ACABAS DE RETIRAR: "+ Retiro +" PESOS");
           System.out.println("-----------------------------------");
           System.out.println("-----------------------------------");
           System.out.println("   TU NUEVO SALDO ES: " + getSaldo() + " PESOS");
           System.out.println("-----------------------------------");
           
        }else{
            System.out.println("----------------$$$----------------");
            System.out.println("       FONDOS INSUFICIENTES        ");
            System.out.println("----------------$$$----------------");
        }        
    }
    
}
