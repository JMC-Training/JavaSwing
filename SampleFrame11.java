package test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleFrame11 extends JFrame implements ActionListener
{
  JLabel label = new JLabel();
  ImageIcon image1 = new ImageIcon(".\\src\\test\\IoT1.png");
  ImageIcon image2 = new ImageIcon(".\\src\\test\\IoT2.png");
  ImageIcon image_current = null;
  JButton button = new JButton("画像切り替え");

  int current_row = 0;
  int current_column = 0;

  public SampleFrame11()
  {
    this.setTitle("Sample No.11");
    this.setSize(800, 400);

    this.label.setHorizontalAlignment(JLabel.CENTER);
    this.label.setVerticalAlignment(JLabel.CENTER);
    this.label.setIcon(this.image1);

    this.button.addActionListener(this);

    this.setLayout(new BorderLayout());
    this.add(this.label, BorderLayout.CENTER);
    this.add(this.button, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(this.label.getIcon()==this.image1)
    {
        this.label.setIcon(this.image2);
    }
    else
    {
        this.label.setIcon(this.image1);
    }
  }
}

