
package provaleojunior;

import java.util.ArrayList;
import java.util.Scanner;
import newpackage.Cardapio;
import newpackage.Estabelecimento;
import newpackage.Lanchonete;
import newpackage.Pizzaria;
import newpackage.Restaurante;

public class StartApp {

  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Estabelecimento> eLista = new ArrayList();
        int opc = 0;
        Lanchonete l = new Lanchonete();
        Restaurante r = new Restaurante();
        Pizzaria p = new Pizzaria();
        
        for(int i = 0; i < 5; i++){
            System.out.println("Qual tipo estabelecimento:");
            System.out.println("1.....Lanchonete");
            System.out.println("2.....Restaurante");
            System.out.println("3.....Pizzaria");
            opc = scn.nextInt();
            scn.nextLine();
            
            switch(opc){
                case 1:
                    
                    System.out.println("Nome da lanchonete: ");
                    l.setNome(scn.nextLine());
                    eLista.add(l);
                    break;
                    
                case 2:
                    
                    System.out.println("Nome do restaurante: ");
                    r.setNome(scn.nextLine());
                    eLista.add(r);
                    break;
                case 3:
                    
                    System.out.println("Nome da Pizzaria: ");
                    p.setNome(scn.nextLine());
                    eLista.add(p);
                    break;
            }
               
            
            
        }
        
        
    }
    
}
