/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Endereco;

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
public class LimiteEndereco extends JFrame implements ActionListener {
    private JPanel pPrincipal, pCod, pLog, pTipo, pBairro, pButton, pBairro2;
    private JLabel lCod, lLog, lTipo, lBairro;
    private JTextField tCod, tLog;
    private JComboBox cbTipo, cbBairro;
    String[] tipo = {"Rua", "Avenida", "Praca","Estrada", "Travessa", "Rodovia", "Beco", "Viela"};
    JButton bInserir, bConsulta, bLimpar, bInserirBairro, bConsultaBairro, bLimparBairro;
    
    public JPanel endereco(){
        
        pCod = new JPanel(new FlowLayout());
        lCod = new JLabel("Código");
        tCod = new JTextField(15);
        pCod.add(lCod);
        pCod.add(tCod);
        
        pLog = new JPanel(new FlowLayout());
        lLog = new JLabel("Logradouro");
        tLog = new JTextField(15);
        pLog.add(lLog);
        pLog.add(tLog);
        
        pTipo = new JPanel(new FlowLayout());
        lTipo = new JLabel("Tipo");
        cbTipo = new JComboBox(tipo);
        pTipo.add(lTipo);
        pTipo.add(cbTipo);
        
        pBairro = new JPanel(new FlowLayout());
        lBairro = new JLabel("Bairro");
        cbBairro = new JComboBox();
        pBairro.add(lBairro);
        pBairro.add(cbBairro);
        
        pButton = new JPanel(new FlowLayout());
        bInserir = new JButton("Inserir");
        bInserir.addActionListener(this);
        bConsulta = new JButton("Consultar");
        bConsulta.addActionListener(this);
        bLimpar = new JButton("Limpar");
        bLimpar.addActionListener(this);
        pButton.add(bInserir);
        pButton.add(bConsulta);
        pButton.add(bLimpar);
        
        pPrincipal = new JPanel(new GridLayout(6,1));
        pPrincipal.add(pCod);
        pPrincipal.add(pTipo);
        pPrincipal.add(pLog);
        pPrincipal.add(pBairro);
        pPrincipal.add(pButton);
        
        pPrincipal.setVisible(true);
        
        return pPrincipal;


    }
    public JPanel bairro(){
        
        pCod = new JPanel(new FlowLayout());
        lCod = new JLabel("Código");
        tCod = new JTextField(15);
        pCod.add(lCod);
        pCod.add(tCod);
        
        
        pBairro = new JPanel(new FlowLayout());
        lBairro = new JLabel("Bairro");
        cbBairro = new JComboBox();
        pBairro.add(lBairro);
        pBairro.add(cbBairro);
        
        pButton = new JPanel(new FlowLayout());
        bInserirBairro = new JButton("Inserir");
        bInserirBairro.addActionListener(this);
        bConsultaBairro = new JButton("Consultar");
        bConsultaBairro.addActionListener(this);
        bLimparBairro = new JButton("Limpar");
        bLimparBairro.addActionListener(this);
        pButton.add(bInserirBairro);
        pButton.add(bConsultaBairro);
        pButton.add(bLimparBairro);
        
        pBairro2 = new JPanel(new GridLayout(3,1));
        pBairro2.add(pCod);
        pBairro2.add(pBairro);
        pBairro2.add(pButton);
        
        pBairro2.setVisible(true);
        
        return pBairro2;


    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
