
package exemploarraysobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class MetodosArray {
    Persoa[]lista=new Persoa[4];
    
    public void amosar(Persoa[]listaPersoas){
        for(Persoa ele:listaPersoas)
            System.out.println(ele);
    }
    
    public Persoa[] crearArray(){
        String nome,dni;
        for(int i=0;i<lista.length;i++){
            nome=JOptionPane.showInputDialog("Nome");
            dni=JOptionPane.showInputDialog("DNI");
            lista[i]=new Persoa(nome,dni);
        }
        return lista;
    }
    
    public Persoa buscar(Persoa[]liPersoas,String dni){
        boolean atopado=false; //non atopado
        Persoa per=new Persoa();
        for(int i=0;i<liPersoas.length;i++){
            if(dni.equalsIgnoreCase(liPersoas[i].getDni())){ // IgnoreCase: por si va en mayuscula, minuscula, etc.
                atopado=true;
                per=liPersoas[i];
            }
        }
            if(atopado==false){
                System.out.println(" non o atopou ");
            }
        return per;
    }
}
