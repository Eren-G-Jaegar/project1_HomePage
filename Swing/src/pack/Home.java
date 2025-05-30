package pack;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class Home extends JFrame {

	JMenuBar bar;
	JMenu menuHome, menuAboutUs, menuContactUs;
	JButton butLogin, butProducts, butSubscriptions, butAchievements, butEmail, butNo, butOfflineStore;

	public Home() {
		setLayout(new FlowLayout());

		bar = new JMenuBar();
		bar.setBounds(0, 0, 100, 100);

		menuHome = new JMenu("Home");
		butLogin = new JButton("Login");
		butLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();

			}
		});
		menuHome.add(butLogin);

		butProducts = new JButton("Our Products");
		butProducts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Please fill Kyc form to access our products.");
			}
		});
		menuHome.add(butProducts);

		butSubscriptions = new JButton("Subscriptions");
		butSubscriptions.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Please login to Check your Subscriptions.");
			}
		});
		menuHome.add(butSubscriptions);

		menuAboutUs = new JMenu("About Us");
		butAchievements = new JButton("Our Achievements");
		butAchievements.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Not yet achieved anything.");
			}
		});
		menuAboutUs.add(butAchievements);

		menuContactUs = new JMenu("Contact Us");

		butEmail = new JButton("Email");
		butEmail.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Email : centerhead@sdacinfotech.com");
			}
		});
		menuContactUs.add(butEmail);

		butNo = new JButton("Phone Number");
		butNo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Contat Number : 9819455746");
			}
		});
		menuContactUs.add(butNo);

		butOfflineStore = new JButton("Offline Stores");
		butOfflineStore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Venue: B4, 3rd Floor, Goragandhi Building,\r\n"
						+ "Chandawarkar Lane, Opp. Railway Station, Borivali West.");
			}
		});
		menuContactUs.add(butOfflineStore);

		add(bar);
		bar.add(menuHome);
		bar.add(menuAboutUs);
		bar.add(menuContactUs);

		setVisible(true);
		setSize(400, 400);
	}

	public static void main(String[] args) {
		new Home();
	}
}
