package Learning;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TableExample extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
    	 JFrame jf = new JFrame();
    	 
    	 jf.setTitle("JTable Example");
    	 String[ ] [ ] data = {
    	 {"Nischal", "11111", "kumaripati"},
    	 
    	 {"Vunte", "0000", "jawalakhel"}
    	 };
    	 
    	String[] columnNames = {"Name", "ID", "Address"};
    	 JTable jt = new JTable(data, columnNames);
    	 jt.setBounds(30, 40, 150, 150);
    	JScrollPane sp= new JScrollPane(jt);
    	 jf.add(sp);
    	 
    	 
    	 jf.setSize(500, 200);
    	 jf.setVisible(true);
    	 }
}