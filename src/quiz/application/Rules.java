package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
   String name;
   JButton start;
   JButton back;

   Rules(String name) {
      this.name = name;
      this.getContentPane().setBackground(Color.WHITE);
      this.setLayout((LayoutManager)null);
      JLabel heading = new JLabel(" Welcome " + name + " to Simple Minds ");
      heading.setBounds(50, 20, 700, 30);
      heading.setFont(new Font("Mongolian Baiti", 1, 28));
      heading.setForeground(new Color(30, 144, 254));
      this.add(heading);
      JLabel rules = new JLabel();
      rules.setBounds(20, 50, 500, 450);
      rules.setFont(new Font("Tahoma", 0, 17));
      rules.setText("<html>1. You are trained to be a programmer and not a story teller, answer point to point<br><br>2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer<br><br>3. You may have lot of options in life but here all the questions are compulsory<br><br>4. Crying is allowed but please do so quietly.<br><br>5. Only a fool asks and a wise answers (Be wise, not otherwise)<br><br>6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di<br><br>7. Brace yourself, this paper is not for the faint hearted<br><br>8. May you know more than what John Snow knows, Good Luck<br><br><html>");
      this.add(rules);
      this.back = new JButton("Back");
      this.back.setBounds(150, 500, 100, 30);
      this.back.setBackground(new Color(30, 144, 254));
      this.back.setForeground(Color.white);
      this.back.addActionListener(this);
      this.add(this.back);
      this.start = new JButton("Start");
      this.start.setBounds(300, 500, 100, 30);
      this.start.setBackground(new Color(30, 144, 254));
      this.start.setForeground(Color.white);
      this.start.addActionListener(this);
      this.add(this.start);
      this.setSize(600, 600);
      this.setLocation(350, 25);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == this.start) {
         this.setVisible(false);
         new Quiz(this.name);
      } else {
         this.setVisible(false);
         new Login();
      }

   }

   public static void main(String[] args) {
      new Rules("User");
   }
}

