
package exemploarraysobxetos;

/**
 *
 * @author dfernandezguerreiro
 */
public class Persoa implements Comparable{
    private String nome;
    private String dni;

    public Persoa() {
    }

    public Persoa(String nome, String dni) {
        this.nome=nome;
        this.dni=dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+", dni: "+dni;
    }

    @Override
    public int compareTo(Object t){
        Persoa p=(Persoa)t;
        if(dni.compareToIgnoreCase(p.getDni())>0)
            return 1;
        else if(dni.compareToIgnoreCase(p.getDni())==0)
            return 0;
            else
                return -1;
        
    }
    
    
}
