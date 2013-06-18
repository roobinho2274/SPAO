/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Natureza;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class LimiteNatureza extends JFrame implements ActionListener{
    public JPanel natureza() {
        JPanel pPrincipalInsere;
        JPanel pCod;
        JPanel pNatureza;
        JPanel pButton;
        JLabel lCod;
        JLabel lNatureza;
        JTextField tCod;
        JTextField tNatureza;
        JButton bInsere;
        JButton bLimpa;
        JButton bConsulta;
        
        pPrincipalInsere = new JPanel(new GridLayout(4,1));
        pCod = new JPanel(new FlowLayout());
        lCod = new JLabel("Código da Natureza");
        tCod = new JTextField(15);
        pCod.add(lCod);
        pCod.add(tCod);
        
        pNatureza = new JPanel(new FlowLayout());
        lNatureza = new JLabel("Natureza");
        tNatureza = new JTextField(15);
        pNatureza.add(lNatureza);
        pNatureza.add(tNatureza);
               
        
        pButton = new JPanel(new FlowLayout());
        bInsere = new JButton("Inserir");
        bInsere.addActionListener(this);
        bLimpa = new JButton("Limpar");
        bLimpa.addActionListener(this);
        bConsulta = new JButton("Consultar");
        bConsulta.addActionListener(this);
        pButton.add(bInsere);
        pButton.add(bConsulta);
        pButton.add(bLimpa);
        
        pPrincipalInsere.add(pCod);
        pPrincipalInsere.add(pNatureza);
        pPrincipalInsere.add(pButton);
        
        pPrincipalInsere.setVisible(true);
        
        return pPrincipalInsere;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
