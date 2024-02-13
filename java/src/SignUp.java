import java.io.*;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Window.Type;
import javax.swing.JDesktopPane;

public class SignUp  {

	public JFrame SignUpframe;
	private JTextField Pass;
	private JTextField User;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.SignUpframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SignUpframe = new JFrame("Create New Facebook Account");
		SignUpframe.setResizable(false);
		SignUpframe.setType(Type.POPUP);
		SignUpframe.setTitle("Sign Up");
		SignUpframe.getContentPane().setFont(new Font("Georgia", Font.BOLD, 14));
		SignUpframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\login-icon-png-20.jpg"));
		SignUpframe.setBounds(500, 100, 652, 368);
		SignUpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SignUpframe.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(SystemColor.textHighlightText);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblUsername.setBounds(137, 113, 119, 19);
		SignUpframe.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(SystemColor.textHighlightText);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblPassword.setBounds(137, 177, 119, 19);
		SignUpframe.getContentPane().add(lblPassword);
		
		JButton button = new JButton("Sign Up");
		button.setToolTipText("Sign up now");
		
		button.addActionListener(new ActionListener() {
			boolean Success = true ;
			public void actionPerformed(ActionEvent e) {
				String name = User.getText().toString();
				String pass = Pass.getText().toString();
				try {
					  String path = "C://Java Project//User txt//User.txt";
				      
				      
				      FileReader fr = new FileReader(path);
			          BufferedReader br = new BufferedReader(fr);
			          
			          String line, fuser;
			          boolean isLoginSuccess = false; 
			          
			          if(name.isEmpty()) {
			        	  FileWriter myWriter = new FileWriter("C://Java Project//User txt//User.txt",true);
			        	  myWriter.write("Null"+" "+"Null\n");
			        	  myWriter.close();
			        	  
			        	  PutInfo pi = new PutInfo();
			        	  pi.main(null);
			        	  Success = false;
			        	 
			        	  
			          }
			          
			          while ((line = br.readLine()) != null ) {
			            	
			                fuser = line.split(" ")[0];
			                
			          
			                if ((fuser.equals(name))) {
			                    isLoginSuccess = true;
			                    
			                    ReEnter re = new ReEnter(); 
			                    re.main(null); 
			                    break;
			                } 
			            }
			          
				      if (!name.isEmpty()) {
				    	  if(!isLoginSuccess) {
				    	    Success = true;
			                Success s = new Success();
			                s.main(null);
			                
			                FileWriter myWriter = new FileWriter("C://Java Project//User txt//User.txt",true);
						      
						    myWriter.write(User.getText()+" "+Pass.getText()+"\n");
						    myWriter.close();
						    
						    
						    
						    Login l = new Login();
							l.frmLoginToSweethome.setVisible(Success);
							SignUpframe.setVisible(!Success);
					
				    	  }
							
			          }
				      fr.close();
			         
				      
		             
				    } 
				catch (IOException ep) {
				      
				      ep.printStackTrace();
				    }	
			}
		});
		
		JButton btnGoBack = new JButton("Go back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.frmLoginToSweethome.setVisible(true);
				SignUpframe.setVisible(false);
			}
		});
		btnGoBack.setBounds(495, 289, 89, 23);
		SignUpframe.getContentPane().add(btnGoBack);
		button.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		button.setBackground(UIManager.getColor("Button.highlight"));
		button.setBounds(342, 257, 89, 29);
		SignUpframe.getContentPane().add(button);
		
		Pass = new JTextField();
		Pass.setToolTipText("Enter a Password here");
		Pass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Pass.setColumns(10);
		Pass.setBounds(286, 173, 201, 30);
		SignUpframe.getContentPane().add(Pass);
		
		User = new JTextField();
		User.setToolTipText("Enter a name here");
		User.setFont(new Font("Tahoma", Font.PLAIN, 13));
		User.setColumns(10);
		User.setBounds(286, 109, 201, 30);
		SignUpframe.getContentPane().add(User);
		
		lblNewLabel_1 = new JLabel("Information Form");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(SystemColor.infoText);
		lblNewLabel_1.setBounds(247, 11, 165, 47);
		SignUpframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java Project\\Jframe img\\housevsinsurance.jpg"));
		lblNewLabel.setBounds(0, 0, 649, 341);
		SignUpframe.getContentPane().add(lblNewLabel);
	}
}