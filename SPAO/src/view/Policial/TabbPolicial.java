/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Policial;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import view.Endereco.LimiteEndereco;

/**
 *
 * @author acer
 */
public class TabbPolicial {
        
    
    JTabbedPane tabPrincipal;
    JPanel card1, card2;
    LimitePolicial LPol;
    
    public JTabbedPane iniciaComponentePolicial() {
        
// Inicializa o container e seta o layout
        card1 = new JPanel();
        card2 = new JPanel();
        //cards.setLayout(new CardLayout());
// Adiciona os painéis e associa um nome (string) a eles
        LPol = new LimitePolicial();
        
        card1.add("Policial", LPol.policial());
        card2.add("Telefone", LPol.policialTelefone());


        
        
        
        tabPrincipal = new JTabbedPane();
        tabPrincipal.addTab("Policial",card1);
        tabPrincipal.addTab("Telefone",card2);
        
        return tabPrincipal;
        
    }
    
}
