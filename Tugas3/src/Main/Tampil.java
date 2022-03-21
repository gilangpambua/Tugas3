/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import tugas3.ruang.Balok;
/**
 *
 * @author USER
 */
public class Tampil extends JFrame implements ActionListener{

    JLabel lJudul = new JLabel("| CUBOID CALCULATOR |");
    JLabel lPanjang = new JLabel("Length");
    JTextField fPanjang = new JTextField(8);
    
    JLabel lLebar = new JLabel("Width");
    JTextField fLebar = new JTextField(8);
    
    JLabel lTinggi = new JLabel("Height");
    JTextField fTinggi = new JTextField(8);
    
    JLabel lHasil = new JLabel("Result :");
    
    JLabel lLuasP = new JLabel(); 
    
    JLabel lKelilingP = new JLabel();
    
    JLabel lVolumeB = new JLabel();
    
    JLabel lLuasPer = new JLabel();

    JButton bHitung = new JButton("Count");
    JButton bReset = new JButton("Reset");
    
    Tampil(){
        setTitle("Tugas 3");
        setSize(450,550);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);
        
        lJudul.setBounds(145,0,250,20);
        lPanjang.setBounds(10,30,250,20);
        fPanjang.setBounds(90, 30, 250, 20);
        lLebar.setBounds(10,70,150,20);
        fLebar.setBounds(90, 70, 250, 20);
        lTinggi.setBounds(10,110,150,20);
        fTinggi.setBounds(90, 110, 250, 20);
        lHasil.setBounds(50, 140, 150, 20);
        bHitung.setBounds(95, 350, 90, 30);
        bReset.setBounds(200, 350, 90, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bHitung) {            
            try{
                double panjang = Double.parseDouble(fPanjang.getText());
                double lebar = Double.parseDouble(fLebar.getText());
                double tinggi = Double.parseDouble(fTinggi.getText());

                Balok balok = new Balok(tinggi, panjang, lebar);
      
                lLuasP.setText("Square Area                     : " + Double.toString(balok.luas()));
                add(lLuasP);
                lLuasP.setBounds(30, 170, 300, 30);
                
                lKelilingP.setText("Square Circumference    : " + Double.toString(balok.keliling()));
                add(lKelilingP);
                lKelilingP.setBounds(30, 210, 300, 30);
                
                lVolumeB.setText("Cuboid Volume                : " + Double.toString(balok.volume()));
                add(lVolumeB);
                lVolumeB.setBounds(30, 250, 300, 30);
                
                lLuasPer.setText("Cuboid Surface Area       : " + Double.toString(balok.luaspermukaan()));
                add(lLuasPer);
                lLuasPer.setBounds(30, 290, 300, 30);
                
            }
            catch(NumberFormatException E){
                JOptionPane.showMessageDialog(null, "ERROR! Use NUMERIC");
            }
            
        }
        
        if (e.getSource()==bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKelilingP.setText(null);
            lVolumeB.setText(null);
            lLuasPer.setText(null);
        }
    }
    
}
