import javax.swing.*;
import java.awt.event.*;

public class TableExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Table Example");
		String col[]= {"ID","Name","Salary"};
		String data[][]= {{"1","abc","2000000"},{"2","defg","4000000"}};
		JTable jt= new JTable(data,col);
		JScrollPane p = new JScrollPane(jt);
		f.add(p);
		f.setSize(200,200);
		f.setVisible(true);
		f.setLayout(null);
	}
}
