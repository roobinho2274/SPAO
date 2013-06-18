/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Policial;

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
public class LimitePolicial extends JFrame implements ActionListener {
private JPanel pPrincipal,pMat, pNome, pPostGrad, pEnd, pEmail, pStatus, pPermissao, pSenha, pButton, pTel;
private JLabel lMat, lNome, lPostGrad, lEnd, lEmail, lStatus, lPermissao, lSenha, lTel;
private JTextField tMat, tNome, tPostGrad, tEnd, tEmail, tSenha, tTel;
private JComboBox cbStatus, cbPermissao, cbMat;
private JButton bInserir, bConsulta, bLimpar, bInserirTel, bConsultaTel, bLimparTel;
String[] sPermissao = {"Nenhuma", "Radio Operado", "Comandante", "Administrador"}; 
String[] sStatus = {"Ativo", "Ferias", "Licenciado", "Transferido", "Inativo"};

public JPanel policial(){

    pMat = new JPanel(new FlowLayout());
    lMat = new JLabel("Matrícula");
    tMat = new JTextField(15);
    pMat.add(lMat);
    pMat.add(tMat);
    
    pNome = new JPanel(new FlowLayout());
    lNome = new JLabel("Nome");
    tNome = new JTextField(15);
    pNome.add(lNome);
    pNome.add(tNome);
    
    pPostGrad = new JPanel(new FlowLayout());
    lPostGrad = new JLabel("Posto/Graduação");
    tPostGrad = new JTextField(15);
    pPostGrad.add(lPostGrad);
    pPostGrad.add(tPostGrad);
    
    pEnd = new JPanel(new FlowLayout());
    lEnd = new JLabel("Endereçoo");
    tEnd = new JTextField(15);
    pEnd.add(lEnd);
    pEnd.add(tEnd);
    
    pEmail = new JPanel(new FlowLayout());
    lEmail = new JLabel("E-mail");
    tEmail = new JTextField(15);
    pEmail.add(lEmail);
    pEmail.add(tEmail);
    
    pStatus = new JPanel(new FlowLayout());
    lStatus = new JLabel("Status");
    cbStatus = new JComboBox(sStatus);
    pStatus.add(lStatus);
    pStatus.add(cbStatus);
    
    pPermissao = new JPanel(new FlowLayout());
    lPermissao = new JLabel("Permissão");
    cbPermissao = new JComboBox(sPermissao);
    pPermissao.add(lPermissao);
    pPermissao.add(cbPermissao);
    
    pSenha = new JPanel(new FlowLayout());
    lSenha = new JLabel("Senha");
    tSenha = new JTextField(15);
    pSenha.add(lSenha);
    pSenha.add(tSenha);
    
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
    
    pPrincipal = new JPanel(new GridLayout(9,1));
    pPrincipal.add(pMat);
    pPrincipal.add(pNome);
    pPrincipal.add(pPostGrad);
    pPrincipal.add(pEnd);
    pPrincipal.add(pEmail);
    pPrincipal.add(pStatus);
    pPrincipal.add(pPermissao);
    pPrincipal.add(pSenha);
    
    pPrincipal.setVisible(true);
    
    return pPrincipal;
}

public JPanel policialTelefone(){
    pMat = new JPanel(new FlowLayout());
    lMat = new JLabel("Matrícula");
    cbMat = new JComboBox();
    pMat.add(lMat);
    pMat.add(cbMat);
    
    pNome = new JPanel(new FlowLayout());
    lNome = new JLabel("Nome");
    tNome = new JTextField(15);
    pNome.add(lNome);
    pNome.add(tNome);
    
    pButton = new JPanel(new FlowLayout());
    bInserirTel = new JButton("Inserir");
    bInserirTel.addActionListener(this);
    bConsultaTel = new JButton("Consultar");
    bConsultaTel.addActionListener(this);
    bLimparTel = new JButton("Limpar");
    bLimparTel.addActionListener(this);
    pButton.add(bInserirTel);
    pButton.add(bConsultaTel);
    pButton.add(bLimparTel);
    
    pTel = new JPanel(new GridLayout(3,1));
    pTel.add(pMat);
    pTel.add(pNome);
    pTel.add(pButton);
    
    pTel.setVisible(true);
    
    return pTel;
}


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
