package jSpinner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SpinnerExample {
public static void main(String[] args) {
JFrame f = new JFrame("Spinner Slider Example");
SpinnerNumberModel value = new SpinnerNumberModel(5,0,10,1);
JSpinner s = new JSpinner(value);
s.setBounds(120,20,50,30);
JSlider s1 = new JSlider();
s1.setBounds(20,70,200,30);
s1.setPaintTicks(true);
s1.setPaintLabels(true);
JButton b = new JButton("Submit");
b.setBounds(150, 120, 80, 30);
JLabel label = new JLabel();
label.setBounds(50, 150, 400, 30);
f.setVisible(true); 
f.setSize(500,500);
f.add(s);
f.add(s1);
f.add(b);
f.add(label);
f.setLayout(null);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String spinner = String.valueOf(s.getValue());
String slider = String.valueOf(s1.getValue());
String data = "The value of Spinner is : " +spinner;
data += " The value of Slider is : " +slider;
label.setText(data);
}
});
}
}
