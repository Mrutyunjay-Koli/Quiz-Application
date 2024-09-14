package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
   JButton rules;
   JButton back;
   JTextField tfname;

   Login() {
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager)null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
      JLabel image = new JLabel(i1);
      image.setBounds(0, 0, 600, 500);
      this.add(image);
      JLabel heading = new JLabel("Simple Minds");
      heading.setBounds(750, 60, 300, 45);
      heading.setFont(new Font("Mongolian Baiti", 1, 40));
      heading.setForeground(new Color(30, 144, 254));
      this.add(heading);
      JLabel name = new JLabel("Enter Your Name ");
      name.setBounds(810, 150, 300, 20);
      name.setFont(new Font("Mongolian Baiti", 1, 21));
      name.setForeground(new Color(30, 144, 254));
      this.add(name);
      this.tfname = new JTextField();
      this.tfname.setBounds(735, 200, 300, 25);
      this.tfname.setFont(new Font("Times New Roman", 1, 18));
      this.add(this.tfname);
      this.rules = new JButton("Rules");
      this.rules.setBounds(735, 270, 120, 25);
      this.rules.setBackground(new Color(30, 144, 254));
      this.rules.setForeground(Color.white);
      this.rules.addActionListener(this);
      this.add(this.rules);
      this.back = new JButton("Back");
      this.back.setBounds(915, 270, 120, 25);
      this.back.setBackground(new Color(30, 144, 254));
      this.back.setForeground(Color.white);
      this.back.addActionListener(this);
      this.add(this.back);
      this.setSize(1200, 500);
      this.setLocation(50, 100);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.rules) {
         String name = this.tfname.getText();
         this.setVisible(false);
         new Rules(name);
      } else if (ae.getSource() == this.back) {
         this.setVisible(false);
      }

   }

   public static void main(String[] args) {
      new Login();
   }
}
