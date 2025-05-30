package pack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame {

	JLabel labelUN, labelPW;
	JTextField tf1, tf2;
	JButton butSubmit, butReset;

	public Login() {

		setLayout(new FlowLayout());

		labelUN = new JLabel("Username");
		labelPW = new JLabel("Password");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		butSubmit = new JButton("Submit");
		butSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					ResultSet resultSet = GetConnection.getConnection().prepareStatement("select * from info")
							.executeQuery();

					resultSet.next();

					String un = resultSet.getString(1);
					String pw = resultSet.getString(2);

					if (tf1.getText().equals(un) && tf2.getText().equals(pw)) {
						System.out.println("Credentials Authenticated...");
						System.out.println("Access Granted...");

					} else {
						System.out.println("Credentials Authenticated...");
						System.out.println("Access Denied...");
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		butReset = new JButton("Reset");
		butReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
			}
		});

		add(labelUN);
		add(tf1);
		add(labelPW);

		add(tf2);
		add(butSubmit);
		add(butReset);

		setVisible(true);
		setSize(400, 400);

	}

	public static void main(String[] args) {
		new Login();
	}
}
