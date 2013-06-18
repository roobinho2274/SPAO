/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Evento;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class LimiteEvento extends JFrame implements ActionListener {
    private JPanel pButton, pPrincipal, pTipo, pBairro, pLogradouro, pDataInicio, pDataFim;
    private JLabel lTipo, lBairro, lLogradouro, lDataInicio, lDataFim;
    private JTextField tTipo, tDataInicio, tDataFim;
    private JComboBox cbBairro, cbLogradouro;
    private JButton bInserir, bConsultar, bLimpar;
    
    public JPanel evento(){
        pTipo = new JPanel(new FlowLayout());
        lTipo = new JLabel("Tipo do Evento");
        tTipo = new JTextField(15);
        pTipo.add(lTipo);
        pTipo.add(tTipo);
        
        pBairro = new JPanel(new FlowLayout());
        lBairro = new JLabel("Bairro");
        cbBairro = new JComboBox();
        pBairro.add(lBairro);
        pBairro.add(cbBairro);
        
        pLogradouro = new JPanel(new FlowLayout());
        lLogradouro = new JLabel("Logradouro");
        cbLogradouro = new JComboBox();
        pLogradouro.add(lLogradouro);
        pLogradouro.add(cbLogradouro);
        
        pDataInicio = new JPanel(new FlowLayout());
        lDataInicio = new JLabel("Data/Hora Início");
        tDataInicio = new JTextField(15);
        pDataInicio.add(lDataInicio);
        pDataInicio.add(tDataInicio);
        
        pDataFim = new JPanel(new FlowLayout());
        lDataFim = new JLabel("Data/Hora Término");
        tDataFim = new JTextField(15);
        pDataFim.add(lDataFim);
        pDataFim.add(tDataFim);
        
        pButton = new JPanel(new FlowLayout());
        bInserir = new JButton("Inserir");
        bInserir.addActionListener(this);
        bLimpar = new JButton("Limpar");
        bLimpar.addActionListener(this);
        bConsultar = new JButton("Consultar");
        bConsultar.addActionListener(this);
        pButton.add(bInserir);
        pButton.add(bConsultar);
        pButton.add(bLimpar);
        
        pPrincipal = new JPanel(new GridLayout(7,1));
        pPrincipal.add(pTipo);
        pPrincipal.add(pLogradouro);
       pPrincipal.add(pBairro);
       pPrincipal.add(pDataInicio);
       pPrincipal.add(pDataFim);
       pPrincipal.add(pButton);
       
       pPrincipal.setVisible(true);
    
        return pPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
