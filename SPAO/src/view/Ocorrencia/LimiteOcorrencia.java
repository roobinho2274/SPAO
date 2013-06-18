/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Ocorrencia;

import java.awt.BorderLayout;
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
public class LimiteOcorrencia extends JFrame implements ActionListener {
  private JPanel pPrincipal, pButton, pNumOco, pDataAcio, pTurno, pReds, pNatureza, pNomeSol, pSintese, pBairro, pLogradouro, pNum, pRef, pSetor, pDataChegada, pDataFim, pMat, pPresos, pRadio;
  private JLabel lNumOco, lDataAcio, lTurno, lReds, lNatureza, lNomeSol, lSintese, lBairro, lLogradouro, lNum, lRef, lSetor, lDataChegada, lDataFim, lMat, lPresos, lRadio;
  private JTextField tNumOco, tDataAcio, tReds, tNomeSol, tSintese, tNum, tRef, tDataChegada, tDataFim;
  private JComboBox cbTurno, cbNatureza, cbBairro, cbLogradouro, cbSetor, cbMat, cbRadio;
  private JButton bInserir, bConsultar, bLimpar, bGetData, bCadLog, bCadBairro;
  private String[] sSetor = {"Centro", "Norte", "Sul"};
  private JTextArea txtPresos;
  private JScrollPane scroll;
  
  public JPanel ocorrencia(){
      
      pNumOco = new JPanel(new FlowLayout());
      lNumOco = new JLabel("Numero da Ocorrencia");
      tNumOco = new JTextField(15);
      pNumOco.add(lNumOco);
      pNumOco.add(tNumOco);
      
      pDataAcio = new JPanel(new FlowLayout());
      lDataAcio = new JLabel("Data/Hora acionamento");
      tDataAcio = new JTextField(15);
      bGetData = new JButton("Hora Atual");
      bGetData.addActionListener(this);
      pDataAcio.add(lDataAcio);
      pDataAcio.add(tDataAcio);
      pDataAcio.add(bGetData);
      
      pTurno = new JPanel(new FlowLayout());
      lTurno = new JLabel("Turno");
      cbTurno = new JComboBox();
      pTurno.add(lTurno);
      pTurno.add(cbTurno);
      
      pReds = new JPanel(new FlowLayout());
      lReds = new JLabel("Reds");
      tReds = new JTextField(15);
      pReds.add(lReds);
      pReds.add(tReds);
      
      pNatureza = new JPanel(new FlowLayout());
      lNatureza = new JLabel("Natureza");
      cbNatureza = new JComboBox();
      pNatureza.add(lNatureza);
      pNatureza.add(cbNatureza);
      
      pNomeSol = new JPanel(new FlowLayout());
      lNomeSol = new JLabel("Solicitante");
      tNomeSol = new JTextField(15);
      pNomeSol.add(lNomeSol);
      pNomeSol.add(tNomeSol);
      
      pSintese = new JPanel(new FlowLayout());
      lSintese = new JLabel("Sintese");
      tSintese = new JTextField(15);
      pSintese.add(lSintese);
      pSintese.add(tSintese);
      
      pBairro = new JPanel (new FlowLayout());
      lBairro = new JLabel("Bairro");
      cbBairro = new JComboBox();
      bCadBairro = new JButton("Cadastar");
      bCadBairro.addActionListener(this);
      pBairro.add(lBairro);
      pBairro.add(cbBairro);
      pBairro.add(bCadBairro);
      
      pLogradouro = new JPanel(new FlowLayout());
      lLogradouro = new JLabel("Logradouro");
      cbLogradouro = new JComboBox();
      bCadLog = new JButton("Cadastrar");
      bCadLog.addActionListener(this);
      pLogradouro.add(lLogradouro);
      pLogradouro.add(cbLogradouro);
      pLogradouro.add(bCadLog);
      
      pNum = new JPanel(new FlowLayout());
      lNum = new JLabel("Numero");
      tNum = new JTextField(15);
      pNum.add(lNum);
      pNum.add(tNum);
      
      pRef = new JPanel(new FlowLayout());
      lRef = new JLabel("Ponto de Referencia");
      tRef = new JTextField(15);
      pRef.add(lRef);
      pRef.add(tRef);
      
      pSetor = new JPanel(new FlowLayout());
      lSetor = new JLabel("Setor");
      cbSetor = new JComboBox(sSetor);
      pSetor.add(lSetor);
      pSetor.add(cbSetor);
      
      pDataChegada = new JPanel(new FlowLayout());
      lDataChegada = new JLabel("Data/Hora Chegada");
      tDataChegada = new JTextField(15);
      pDataChegada.add(lDataChegada);
      pDataChegada.add(tDataChegada);
      
      pDataFim = new JPanel(new FlowLayout());
      lDataFim = new JLabel("Data/Hora Termino");
      tDataFim = new JTextField(15);
      pDataFim.add(lDataFim);
      pDataFim.add(tDataFim);
      
    pMat = new JPanel(new FlowLayout());
    lMat = new JLabel("Matrícula");
    cbMat = new JComboBox();
    pMat.add(lMat);
    pMat.add(cbMat);
    
    pPresos = new JPanel(new BorderLayout(5, 5));
    lPresos = new JLabel("Presos/Apreendidos");
    txtPresos = new JTextArea("aki");
    scroll = new JScrollPane(txtPresos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    pPresos.add(lPresos,BorderLayout.PAGE_START);
    pPresos.add(scroll, BorderLayout.CENTER);
    

    pRadio = new JPanel(new FlowLayout());
    lRadio = new JLabel("Radio Operador");
    cbRadio = new JComboBox();
    pRadio.add(lRadio);
    pRadio.add(cbRadio);
    
    pButton = new JPanel(new FlowLayout());
    bInserir = new JButton("Inserir");
    bInserir.addActionListener(this);
    bConsultar = new JButton("Consultar");
    bConsultar.addActionListener(this);
    bLimpar = new JButton("Limpar");
    bLimpar.addActionListener(this);
    pButton.add(bInserir);
    pButton.add(bConsultar);
    pButton.add(bLimpar);
    
      
    pPrincipal = new JPanel(new GridLayout(9,2));
    pPrincipal.add(pNumOco);
    pPrincipal.add(pDataAcio);
    pPrincipal.add(pTurno);
    pPrincipal.add(pReds);
    pPrincipal.add(pNatureza);
    pPrincipal.add(pNomeSol);
    pPrincipal.add(pSintese);
    pPrincipal.add(pBairro);
    pPrincipal.add(pLogradouro);
    pPrincipal.add(pNum);
    pPrincipal.add(pSetor);
    pPrincipal.add(pDataChegada);
    pPrincipal.add(pDataFim);
    pPrincipal.add(pMat);
    pPrincipal.add(pPresos);
    pPrincipal.add(pRadio);
    pPrincipal.add(pButton);
    return pPrincipal;
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
