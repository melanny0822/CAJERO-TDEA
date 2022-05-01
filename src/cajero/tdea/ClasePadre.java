
package cajero.tdea;

import java.util.Scanner;


/**
 *
 * @author melan
 */
public abstract class ClasePadre {
    
     protected int Transacciones, Retiro, Deposito;
    private static int Saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do{
        
            do{
                
                System.out.println("   BIENVENIDO AL CAJERO TdeA  ");
                System.out.println("  --------------------------- ");
                System.out.println("    SELECCIONE UNA OPCION    ");
                System.out.println("  ----------------------------");
                System.out.println("    1. Consultar saldo  ");
                System.out.println("    2. Retiro           ");
                System.out.println("    3. Depósito         ");
                System.out.println("    4. Salir            ");
                System.out.println("------------------------");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4){
                    bandera = 1;    
                }else{
                    System.out.println("-------------------------");
                    System.out.println("   !!OPCION INVALIDA¡¡   ");
                    System.out.println("INGRESE UNA OPCION VALIDA");
                    System.out.println("-------------------------");
                }
            }while(bandera == 0);
            
            if(seleccion == 1){
                ClasePadre comunica = new Consulta();
                comunica.Transacciones();
            }else if(seleccion == 2){
                ClasePadre comunica = new Retiro();
                comunica.Transacciones();
            }else if(seleccion == 3){
                ClasePadre comunica = new Deposito();
                comunica.Transacciones();
            }else if(seleccion == 4){
                System.out.println("*******************************");
                System.out.println("    !GRACIAS POR ELEGIRNOS¡    ");
                System.out.println("       !!VUELVE PRONTO¡¡       ");
                System.out.println("*******************************");
                bandera = 2;
            }
    
        }while(bandera != 2);
    }
    
    //Solicitar cantidad del retiro
    public void Retiro(){
        Retiro = entrada.nextInt();
    }
    
    //Solicitar depósito
    public void Deposito(){
        Deposito = entrada.nextInt();
    }
    
    //Metodo abstracto
    public abstract void Transacciones();
    
    //Métodos setters y getters
    public int getSaldo(){
        return Saldo;
    }
    
    public void setSaldo(int saldo){
        this.Saldo = saldo;
        
    }
    
}
