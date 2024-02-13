import java.io.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class WelcomePage {

	public JFrame WelcomePage;
	public String Username;
	public String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage("NULL", null);
					window.WelcomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePage(String name, String pass) {
		Username = name;
		Password = pass;
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		WelcomePage = new JFrame("Welcome to SweetHome "+Username);
		WelcomePage.setType(Type.POPUP);
		WelcomePage.setResizable(false);
		WelcomePage.getContentPane().setFont(new Font("Georgia", Font.BOLD, 14));
		WelcomePage.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Welome To SweetHome");
		lblTitle.setForeground(new Color(102, 255, 255));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblTitle.setBounds(221, 58, 307, 61);
		WelcomePage.getContentPane().add(lblTitle);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(Color.WHITE);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage.setVisible(false);
				Login l = new Login();
				l.frmLoginToSweethome.setVisible(true);
			}
		});
		
		JButton btnBachelorHome = new JButton("Bachelor");
		btnBachelorHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Area window = new Area();
				Area.main(null);
				WelcomePage.setVisible(false);
			}
		});
		btnBachelorHome.setForeground(SystemColor.textHighlightText);
		btnBachelorHome.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
		btnBachelorHome.setBackground(new Color(204, 153, 153));
		btnBachelorHome.setBounds(288, 214, 180, 45);
		WelcomePage.getContentPane().add(btnBachelorHome);
		
		JButton btnSingleFamily = new JButton("Single Family");
		btnSingleFamily.setForeground(SystemColor.textHighlightText);
		btnSingleFamily.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
		btnSingleFamily.setBackground(new Color(204, 153, 204));
		btnSingleFamily.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter	myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
					myWriter.write("SingleFamily"+" ");
		        	myWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	

				Area window = new Area();
				window.main(null);
				WelcomePage.setVisible(false);
			}			
		});
		
		JLabel lblNewLabel_1 = new JLabel("Select an Option According  to Your Choice");
		lblNewLabel_1.setForeground(new Color(255, 255, 153));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setFont(new Font("Chaparral Pro Light", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(231, 126, 297, 75);
		WelcomePage.getContentPane().add(lblNewLabel_1);
		btnSingleFamily.setBounds(288, 292, 180, 45);
		WelcomePage.getContentPane().add(btnSingleFamily);
		
		JButton btnJoinFamily = new JButton("Join Family");
		btnJoinFamily.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter	myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
					myWriter.write("JoinFamily"+" ");
		        	myWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	

				Area window = new Area();
				window.main(null);
				WelcomePage.setVisible(false);
			
			}
		});
		btnJoinFamily.setForeground(SystemColor.textHighlightText);
		btnJoinFamily.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
		btnJoinFamily.setBackground(new Color(153, 153, 204));
		btnJoinFamily.setBounds(288, 368, 180, 45);
		WelcomePage.getContentPane().add(btnJoinFamily);
		btnLogout.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		btnLogout.setBackground(new Color(153, 102, 102));
		btnLogout.setBounds(335, 477, 89, 29);
		WelcomePage.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 153));
		lblNewLabel.setIcon(new ImageIcon("C:\\Java Project\\Jframe img\\How-Many-Mortgages-Can-I-have-as-a-Real-Estate-Investor.gif"));
		lblNewLabel.setBounds(0, 0, 794, 571);
		WelcomePage.getContentPane().add(lblNewLabel);
		WelcomePage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\2-512.png"));
		WelcomePage.setBounds(500, 100, 800, 600);
		WelcomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}