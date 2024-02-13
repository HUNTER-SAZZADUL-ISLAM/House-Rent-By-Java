import java.io.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Login {

	public JFrame frmLoginToSweethome;
	private JTextField username;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLoginToSweethome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginToSweethome = new JFrame("Facebook");
		frmLoginToSweethome.setType(Type.POPUP);
		frmLoginToSweethome.setResizable(false);
		frmLoginToSweethome.setTitle("Login to SweetHome");
		frmLoginToSweethome.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\295128.png"));
		frmLoginToSweethome.setBounds(500, 100, 676, 517);
		frmLoginToSweethome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmLoginToSweethome.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel bgimage = new JLabel("");
		bgimage.setHorizontalAlignment(SwingConstants.CENTER);
		bgimage.setBounds(0, 0, 384, 561);
		panel.setBackground(Color.WHITE);
		
		JLabel lblFacebook = new JLabel("LOGIN");
		lblFacebook.setBackground(Color.WHITE);
		lblFacebook.setForeground(Color.BLACK);
		lblFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebook.setFont(new Font("Georgia", Font.BOLD, 30));
		lblFacebook.setBounds(257, 44, 192, 56);
		panel.add(lblFacebook);
		
		username = new JTextField();
		username.setBackground(UIManager.getColor("TextField.background"));
		username.setToolTipText("Enter Username");
		username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		username.setBounds(321, 130, 242, 37);
		panel.add(username);
		username.setColumns(10);
		
		passField = new JPasswordField();
		passField.setBackground(UIManager.getColor("TextField.background"));
		passField.setToolTipText("Enter Password");
		passField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passField.setBounds(321, 201, 242, 37);
		panel.add(passField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setToolTipText("Login here");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = username.getText().toString();
				String pass = passField.getText().toString();
				boolean Success = true;
				try {
					String path = "C://Java Project//User txt//User.txt";
					
					FileReader fr = new FileReader(path);
		            BufferedReader br = new BufferedReader(fr);
		            
		            String line, fuser, fpass;
		            boolean isLoginSuccess = false;
		            
		          
		            while ((line = br.readLine()) != null) {
		            	
		                fuser = line.split(" ")[0];
		                fpass = line.split(" ")[1];
		                
		                while(fuser.equals("Null") && fpass.equals("Null")) {
				        	Success = false;
				        	break;
		                }
		                while(name.isEmpty()) {
		                	Success = false;
				        	break;
		                }
		                if (fuser.equals(name) && fpass.equals(pass)) {
		                    isLoginSuccess = true;
		                    
		                    WelcomePage dash = new WelcomePage(name, pass);
		    				dash.WelcomePage.setVisible(true);
		    				frmLoginToSweethome.setVisible(false); 
		                    
		    				Success = true;
		    				break;
		                } 
		            }
		            if(!Success && isLoginSuccess) {
		            	PutInfo pi = new PutInfo();
			        	pi.main(null);
		            }
		            if (!isLoginSuccess) {
		            	
		                Warning w = new Warning();
		                w.Warning();
		            	
		            }
		            fr.close();
		           
					
				}
				catch (Exception ep) {
		            ep.printStackTrace();
		        }
				
				
			}
		});
		btnLogin.setBackground(UIManager.getColor("Button.highlight"));
		btnLogin.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLogin.setBounds(398, 267, 89, 29);
		panel.add(btnLogin);
		
		JLabel lblor = new JLabel("Do not have an account? Sign Up Now !");
		lblor.setForeground(SystemColor.textHighlightText);
		lblor.setBackground(Color.WHITE);
		lblor.setFont(new Font("Georgia", Font.BOLD, 16));
		lblor.setBounds(204, 336, 347, 29);
		panel.add(lblor);
		
		JButton btnCreateNewSweetHome = new JButton("Sign Up");
		btnCreateNewSweetHome.setToolTipText("Sign up here");
		btnCreateNewSweetHome.setForeground(Color.BLACK);
		btnCreateNewSweetHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp su = new SignUp();
				frmLoginToSweethome.setVisible(false);
				su.SignUpframe.setVisible(true);
			}
		});
		btnCreateNewSweetHome.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnCreateNewSweetHome.setBackground(UIManager.getColor("Button.highlight"));
		btnCreateNewSweetHome.setBounds(312, 376, 115, 29);
		panel.add(btnCreateNewSweetHome);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setForeground(UIManager.getColor("Label.foreground"));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 16));
		lblNewLabel.setBounds(112, 130, 115, 37);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(UIManager.getColor("Label.foreground"));
		lblPassword.setFont(new Font("Georgia", Font.BOLD, 16));
		lblPassword.setBounds(112, 201, 115, 37);
		panel.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Java Project\\Jframe img\\House-insurance-pi.jpg"));
		lblNewLabel_1.setBounds(0, 0, 669, 490);
		panel.add(lblNewLabel_1);
	}
}