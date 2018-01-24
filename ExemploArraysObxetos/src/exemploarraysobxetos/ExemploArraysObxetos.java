
package exemploarraysobxetos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploArraysObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa[]persoas=new Persoa[4];
        String nome,dni; //<-Para pedir os datos.
        MetodosArray obxMetodos=new MetodosArray();
//        for(int i=0;i<persoas.length;i++){
//            nome=JOptionPane.showInputDialog("Nome");
//            dni=JOptionPane.showInputDialog("DNI");
//            persoas[i]=new Persoa(nome,dni);//-> Individualizamos cada espacio de memoria.
//        }
//        obxMetodos.amosar(persoas); //<-Método para amosar.

        //Valores iniciales:
//        Persoa[]lista={new Persoa("aa","111"),new Persoa("bb","222")};
//        obxMetodos.amosar(lista); //<-Método para amosar.
        
        //Importamos el Array desde la clase MetodosArray:
        persoas=obxMetodos.crearArray();
        //obxMetodos.amosar(persoas);
        
        //Metodo buscar:
        System.out.println("Busqueda -> "+obxMetodos.buscar(persoas, "111"));
        //obxMetodos.amosar(persoas);
        
        //Ordenar:
        Arrays.sort(persoas);
        obxMetodos.amosar(persoas);
        
        
        
    }
    
}
