/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Turno;

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
public class LimiteTurno extends JFrame implements ActionListener {
    
    public JPanel turno() {
        JPanel pPrincipalInsere;
        JPanel pIntervalo;
        JPanel pPeriodo;
        JPanel pTurno;
        JPanel pButton;
        JLabel lIntervalo;
        JLabel lPeriodo;
        JLabel lTurno;
        JTextField tIntervalo;
        JComboBox tTurno;
        JTextField tPeriodo;
        JButton bInsere;
        JButton bLimpa;
        JButton bConsulta;
        String[] enumTurno ={"1","2","3","4"};
        
        pPrincipalInsere = new JPanel(new GridLayout(4,1));
        pIntervalo = new JPanel(new FlowLayout());
        lIntervalo = new JLabel("Intervalo");
        tIntervalo = new JTextField(15);
        pIntervalo.add(lIntervalo);
        pIntervalo.add(tIntervalo);
        
        pPeriodo = new JPanel(new FlowLayout());
        lPeriodo = new JLabel("Periodo");
        tPeriodo = new JTextField(15);
        pPeriodo.add(lPeriodo);
        pPeriodo.add(tPeriodo);
               
        pTurno = new JPanel(new FlowLayout());
        lTurno = new JLabel("Turno");
        tTurno = new JComboBox(enumTurno);
        pTurno.add(lTurno);
        pTurno.add(tTurno);
        
        pButton = new JPanel(new FlowLayout());
        bInsere = new JButton("Inserir");
        bInsere.addActionListener(this);
        bLimpa = new JButton("Limpar");
        bLimpa.addActionListener(this);
        bConsulta = new JButton("Consultar");
        pButton.add(bInsere);
        pButton.add(bConsulta);
        pButton.add(bLimpa);
        
        pPrincipalInsere.add(pPeriodo);
        pPrincipalInsere.add(pIntervalo);
        pPrincipalInsere.add(pTurno);
        pPrincipalInsere.add(pButton);
        
        pPrincipalInsere.setVisible(true);
        
        return pPrincipalInsere;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
