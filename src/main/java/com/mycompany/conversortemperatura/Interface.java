
package com.mycompany.conversortemperatura;

import javax.swing.*;
import java.awt.event.*;


public class Interface extends JFrame{
    private JLabel escolha = new JLabel("C -> F OU F -> C?");
    
    private JButton conf;
    private JRadioButton  op1 = new JRadioButton ("C -> F");
    private JRadioButton  op2 = new JRadioButton ("F-> C");
    private JButton selecionar = new JButton("SELECIONAR");
    
    
    
    
    public Interface(){
        setTitle("Conversor de Temperaturas");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        escolha.setBounds(0,0,100,50);
        add(escolha);
      
        op1.setBounds( 0,50,100,50);
        add(op1);
        
        op2.setBounds(100,50,100,50);
        add(op2);
        
         ButtonGroup grupo = new ButtonGroup();
        grupo.add(op1);
        grupo.add(op2);
        
        
        selecionar.setBounds(50,125,125,50);
        add(selecionar);
        
        
         selecionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(op1.isSelected()){
                    JanelaCelsius j = new JanelaCelsius();
                    dispose();
                    
                }else{
                    JanelaFahrenheit i = new JanelaFahrenheit();
                    dispose();
                    
                }
            }
        });




        
        
    }
    
}
