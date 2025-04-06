
package com.mycompany.conversortemperatura;
import javax.swing.*;


public class Interface extends JFrame{
    private JLabel escolha = new JLabel("C -> F OU F -> C?");
    
    private JButton conf;
    private JRadioButton  op1 = new JRadioButton ("C -> F");
    private JButton op2; 
    
    
    
    
    public Interface(){
        setTitle("Conversor de Temperaturas");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        escolha.setBounds(0,0,100,50);
        add(escolha);
      
        op1.setBounds( 100,50,100,50);
        add(op1);
        
        
        




        
        
    }
    
}
