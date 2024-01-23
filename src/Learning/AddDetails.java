package Learning;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddDetails extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField name;
    private JTextField age;
    private JTextField phonenumber;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddDetails frame = new AddDetails();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddDetails() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 646, 447);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblAddDetails = new JLabel("Add Details");
        lblAddDetails.setBounds(281, 32, 81, 15);
        contentPane.add(lblAddDetails);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(70, 86, 40, 15);
        contentPane.add(lblName);

        name = new JTextField();
        name.setBounds(172, 74, 143, 40);
        contentPane.add(name);
        name.setColumns(10);

        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(70, 145, 40, 15);
        contentPane.add(lblAge);

        age = new JTextField();
        age.setBounds(172, 133, 102, 40);
        contentPane.add(age);
        age.setColumns(10);

        phonenumber = new JTextField();
        phonenumber.setBounds(172, 199, 160, 47);
        contentPane.add(phonenumber);
        phonenumber.setColumns(10);

        JLabel lblPhonenumber = new JLabel("PhoneNumber");
        lblPhonenumber.setBounds(45, 215, 100, 15);
        contentPane.add(lblPhonenumber);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(198, 282, 117, 25);
        contentPane.add(btnSave);

        // ActionListener for the Save button
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    saveDataToDatabase();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
    }

    // Method to save data to the database
    private void saveDataToDatabase() throws SQLException, ClassNotFoundException {
    	Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "")) {
            String sql = "INSERT INTO mytable (name, age, phonenumber) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, name.getText());
                pstmt.setString(2, age.getText());
                pstmt.setString(3, phonenumber.getText());
                pstmt.executeUpdate();
            }
        }

        System.out.println("Data added successfully");
    }
}
