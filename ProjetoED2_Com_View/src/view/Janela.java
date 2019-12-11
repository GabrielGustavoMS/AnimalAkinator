/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author hight
 */
public class Janela implements ActionListener{
    private JFrame frame;
    private String Title;
    private int width, height;
    private JButton botaoSim;
    private JButton botaoNao;
    private boolean pausarEAguardarResposta;
    private boolean respostaDoUsuario;
    private String title;
    private JPanel node;
    private JLabel lbl1 ;
    private JPanel botoes;
    

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel  getNode() {
        return node;
    }

    public void setNode(JPanel  node) {
        this.node = node;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }
    
    
    
    
    
    public Janela(String titulo) {
        botaoSim = new  JButton("Sim");
        botaoNao = new  JButton("Não");
        botaoSim.addActionListener(this);
        botaoNao.addActionListener(this);
        pausarEAguardarResposta = true;
        this.title = titulo;
        node = new JPanel ();
        botoes = new JPanel();
        width= 600;
        height=600;
        lbl1 = new JLabel("",SwingConstants.CENTER);
        createDisplay();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
              if( e.getSource() == botaoSim ) {
                        respostaDoUsuario = true;
                        pausarEAguardarResposta = false;                        
              }
              if(e.getSource() == botaoNao){
                        respostaDoUsuario = false;
                        pausarEAguardarResposta = false;     
              }
    }
    private void esperarResposta(){
        while(pausarEAguardarResposta){
            System.out.println("Esperando Resposta do Usuário");
        };
        pausarEAguardarResposta = true;
    }

    public boolean getRespostaDoUsuario() {
        esperarResposta();
        return respostaDoUsuario;
    }
    private void createDisplay() {
        //Cria janela com o título do construtor
        frame = new JFrame(title);
        //Configura a dimensão do frame
        frame.setSize(width, height);
        //Configura - X encerra o processo 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Não Permite que a janela seja redimendionada quando false
        frame.setResizable(false);
        //Configura a localização da janela como centro - quando null
        frame.setLocationRelativeTo(null);//?
        frame.setLayout(null);
        
        //Configura background
        String url = "/akinator/img/background.png";
        ImageIcon background = new ImageIcon(getClass().getResource(url));
        frame.setContentPane(new JLabel(background));
        background.setImage(background.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), 1));
        frame.setIconImage(background.getImage());
        
        //Configura icone da janela
        String urlIcone = "/akinator/img/icone.png";
        ImageIcon icone = new ImageIcon(getClass().getResource(urlIcone));
        icone.setImage(icone.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), 1));
        Image image = icone.getImage();
        frame.setIconImage(image);

         
        
        frame.add(node);
        node.setLayout(null);
        node.setSize(300, 500);
        node.setLocation(150 ,0);   
        node.add(lbl1); 
        node.setBackground(new Color(0,0,0,0));;
        lbl1.setSize(300, 100);
        lbl1.setLocation(0,0);        
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Serif", Font.PLAIN, 20));
         
       
        
       
        
        
        
        frame.add(botoes);
        botoes.setLayout(null);
        botoes.setSize(300, 50);
        botoes.setLocation(150 ,500);            
        botoes.setBackground(new Color(0,0,0,0));
        botoes.add(botaoSim); 
        botaoSim.setLayout(null);
        botaoSim.setSize(100, 50);
        botaoSim.setLocation(25, 0);
        botoes.add(botaoNao);
        botaoNao.setLayout(null);
        botaoNao.setSize(100, 50);
        botaoNao.setLocation(175,0);
        
    }
    
    
    
    
}
