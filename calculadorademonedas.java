import java.util.Scanner; 
import java.io.IOException; 
        
        
public class calculadorademonedas {
    static public void main ( String [] args) throws IOException {
        int opc = 0;
      
        Scanner lectura = new Scanner(System.in);
        double Dolar = 17.07;
        double Euro = 18.21;
        double Yen = 0.12;
        double Libras = 21.18;
       
                
        System.out.println("---------CONVERTIDOR DE MONEDAS----------");
        System.out.println ("Ingrese la cantidad en $(MXN) que desee convertir a otra moneda");
       
        double pesos = lectura.nextDouble();
        
        System.out.println("Convertir a Euros" + pesos / Euro);
        System.out.println("Convertir a Dolar" + pesos / Dolar);
        System.out.println("Convertir a Yen" + pesos / Yen);
        System.out.println("Convertir a Libra" + pesos / Libras);
        
        
    }
    
}
