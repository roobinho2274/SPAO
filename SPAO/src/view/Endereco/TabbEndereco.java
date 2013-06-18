/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Endereco;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author acer
 */
public class TabbEndereco extends JFrame {
    
    
        JTabbedPane tabPrincipal;
    JPanel card1, card2;
    LimiteEndereco LEnd;
    
    public JTabbedPane iniciaComponenteEnd() {
        
        
        
        
// Inicializa o container e seta o layout
        card1 = new JPanel();
        card2 = new JPanel();
        //cards.setLayout(new CardLayout());
// Adiciona os painéis e associa um nome (string) a eles
        LEnd = new LimiteEndereco();
        
        card1.add("Logradouro", LEnd.endereco());
        card2.add("Bairro", LEnd.bairro());


        
        
        
        tabPrincipal = new JTabbedPane();
        tabPrincipal.addTab("Logradouro",card1);
        tabPrincipal.addTab("Bairro",card2);
        
        return tabPrincipal;
        
    }
}
