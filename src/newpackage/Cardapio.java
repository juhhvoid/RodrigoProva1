
package newpackage;

import java.util.ArrayList;

public class Cardapio {
    
    private String nome;
    private ArrayList<String> Slista = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getSlista() {
        return Slista;
    }

    public void setSlista(ArrayList<String> Slista) {
        this.Slista = Slista;
    }
    
    
}
