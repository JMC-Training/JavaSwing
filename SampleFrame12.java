package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SampleFrame12 extends JFrame implements ChangeListener, ActionListener
{
    String text1 = "温度センサー";
    String text2 = "水位センサー";
    String text3 = "光センサー";

    JLabel label1 = new JLabel(this.text1, JLabel.CENTER);
    JLabel label2 = new JLabel(this.text2, JLabel.CENTER);
    JLabel label3 = new JLabel(this.text3, JLabel.CENTER);

    JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
    JSlider slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
    JSlider slider3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

    JLabel figure1 = new JLabel("0");
    JLabel figure2 = new JLabel("0");
    JLabel figure3 = new JLabel("0");

    JButton button = new JButton("データを取得");

    public SampleFrame12()
    {
        this.setTitle("Sample No.12");
        this.setSize(800, 400);

        JPanel panel_center = new JPanel();
        panel_center.setLayout(new GridLayout(3, 3));

        panel_center.add(this.label1);
        panel_center.add(this.slider1);
        panel_center.add(this.figure1);

        panel_center.add(this.label2);
        panel_center.add(this.slider2);
        panel_center.add(this.figure2);

        panel_center.add(this.label3);
        panel_center.add(this.slider3);
        panel_center.add(this.figure3);

        this.setLayout(new BorderLayout());
        this.add(panel_center, BorderLayout.CENTER);
        this.add(this.button, BorderLayout.SOUTH);

        this.slider1.addChangeListener(this);
        this.slider2.addChangeListener(this);
        this.slider3.addChangeListener(this);

        this.button.addActionListener(this);
    }

    /**
     * 下記は ChangeListenerインターフェースの実装です。
     */
    @Override
    public void stateChanged(ChangeEvent e)
    {
        Object source = e.getSource();

        if(source==this.slider1)
        {
            int value = this.slider1.getValue();
            String text = Integer.toString(value);
            this.figure1.setText(text);
        }
        else if(source==this.slider2)
        {
            int value = this.slider2.getValue();
            String text = Integer.toString(value);
            this.figure2.setText(text);
        }
        else if(source==this.slider3)
        {
            int value = this.slider3.getValue();
            String text = Integer.toString(value);
            this.figure3.setText(text);
        }
    }

    /**
     * 下記は ActionListenerインターフェースの実装です。
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("-----------------------------------------------------");
        System.out.println(this.text1 + "の数値：" + this.slider1.getValue());
        System.out.println(this.text2 + "の数値：" + this.slider2.getValue());
        System.out.println(this.text3 + "の数値：" + this.slider3.getValue());
    }
}


