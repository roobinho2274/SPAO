/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Metas;

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
public class LimiteMeta extends JFrame implements ActionListener {
    private JPanel pButton, pPrincipal, pCod, pNatureza, pQtd, pNivel, pDataInicio, pDataFim;
    private JLabel lCod, lNatureza, lQtd, lNivel, lDataInicio, lDataFim;
    private JTextField tCod, tQtd, tNivel, tDataInicio, tDataFim;
    private JComboBox cbNatureza;
    private JButton bInserir, bConsultar, bLimpar;
    
    public JPanel meta(){
        pCod = new JPanel(new FlowLayout());
        lCod = new JLabel("Código");
        tCod = new JTextField(15);
        pCod.add(lCod);
        pCod.add(tCod);
        
        pNatureza = new JPanel(new FlowLayout());
        lNatureza = new JLabel("Natureza");
        cbNatureza = new JComboBox();
        pNatureza.add(lNatureza);
        pNatureza.add(cbNatureza);
        
        pQtd = new JPanel(new FlowLayout());
        lQtd = new JLabel("Quantidade de ocorrências Permitidas");
        tQtd = new JTextField(15);
        pQtd.add(lQtd);
        pQtd.add(tQtd);
        
        pNivel = new JPanel(new FlowLayout());
        lNivel = new JLabel("Nível de Alerta");
        tNivel = new JTextField(15);
        pNivel.add(lNivel);
        pNivel.add(tNivel);
        
        pDataInicio = new JPanel(new FlowLayout());
        lDataInicio = new JLabel("Data Início");
        tDataInicio = new JTextField(15);
        pDataInicio.add(lDataInicio);
        pDataInicio.add(tDataInicio);
        
        pDataFim = new JPanel(new FlowLayout());
        lDataFim = new JLabel("Data Término");
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
        pPrincipal.add(pCod);
        pPrincipal.add(pNatureza);
       pPrincipal.add(pQtd);
       pPrincipal.add(pNivel);
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
