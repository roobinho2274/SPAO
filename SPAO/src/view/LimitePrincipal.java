/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Turno.LimiteTurno;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import view.Endereco.TabbEndereco;
import view.Evento.LimiteEvento;
import view.Metas.LimiteMeta;
import view.Natureza.LimiteNatureza;
import view.Ocorrencia.LimiteOcorrencia;
import view.Policial.TabbPolicial;


/**
 *
 * @author acer
 */
public class LimitePrincipal extends JFrame {
    JTabbedPane tabPrincipal;
    JPanel card1, card2, card3, card4, card5, card6, card7;
    LimiteTurno LPTurno;
    LimiteNatureza LPNatureza;
    TabbEndereco TEnd;
    TabbPolicial TPol;
    LimiteMeta LMeta;
    LimiteEvento LEvento;
    LimiteOcorrencia LOco;
    
    public void iniciaComponente() {
        this.setTitle("SPAO");
        this.setSize(850,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
// Inicializa o container e seta o layout
        card1 = new JPanel();
        card2 = new JPanel();
        card3 = new JPanel();
        card4 = new JPanel();
       card5 = new JPanel();
       card6 = new JPanel();
       card7 = new JPanel();
       
// Adiciona os painéis e associa um nome (string) a eles
        LPTurno = new LimiteTurno();
        LPNatureza = new LimiteNatureza();
        TEnd = new TabbEndereco();
        TPol = new TabbPolicial();
        LMeta = new LimiteMeta();
        LEvento = new LimiteEvento();
        LOco = new LimiteOcorrencia();
        
        card1.add("Turno", LPTurno.turno());
        card2.add("Natureza", LPNatureza.natureza());
        card3.add("Endereco", TEnd.iniciaComponenteEnd());
        card4.add("Policial", TPol.iniciaComponentePolicial());
        card5.add("Metas", LMeta.meta());
        card6.add("Eventos",LEvento.evento());
        card7.add("Ocorrencia",LOco.ocorrencia());
        
// Adiciona o painel de seleção e o painel com os cartões
        //setLayout(new BorderLayout());
        
        
        
        tabPrincipal = new JTabbedPane();
        tabPrincipal.addTab("Turno",card1);
        tabPrincipal.addTab("Natureza",card2);
        tabPrincipal.addTab("Endereco",card3);
        tabPrincipal.addTab("Policial",card4);
        tabPrincipal.addTab("Metas",card5);
        tabPrincipal.addTab("Eventos",card6);
        tabPrincipal.addTab("Ocorrencias",card7);
        this.add(tabPrincipal);
        this.setVisible(true);
    }
}
