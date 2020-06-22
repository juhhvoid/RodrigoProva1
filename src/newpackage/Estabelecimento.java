
package newpackage;

import java.util.ArrayList;

public abstract class Estabelecimento implements AddCard {
    //Atributos
    private String nome;
    private ArrayList<Cardapio> lista = new ArrayList<Cardapio>();
    
    //Metodos

    @Override
    public void addCardapio(Cardapio cardapio) {
        lista.add(cardapio);
    }

   
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cardapio> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cardapio> lista) {
        this.lista = lista;
    }
   
}
