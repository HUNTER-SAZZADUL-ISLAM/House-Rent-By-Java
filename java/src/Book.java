import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Book {

	private JFrame frmSuccess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book window = new Book();
					window.frmSuccess.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Book() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuccess = new JFrame();
		frmSuccess.setType(Type.POPUP);
		frmSuccess.setResizable(false);
		frmSuccess.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\user-login-comfirm-accept-person-id-512.png"));
		frmSuccess.setTitle("Success ");
		frmSuccess.setBounds(700, 500, 303, 141);
		frmSuccess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSuccess.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java Project\\Icons\\check-mark-tick-clip-art-dismissal.png"));
		lblNewLabel.setBounds(206, 21, 32, 25);
		frmSuccess.getContentPane().add(lblNewLabel);
		
		JLabel lblSuccessfullySignedUp = new JLabel("Booked Successfully ");
		lblSuccessfullySignedUp.setBounds(10, 31, 257, 15);
		lblSuccessfullySignedUp.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblSuccessfullySignedUp.setHorizontalAlignment(SwingConstants.CENTER);
		frmSuccess.getContentPane().add(lblSuccessfullySignedUp);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage wc;
			WelcomePage.main(null);
				frmSuccess.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(118, 57, 64, 23);
		frmSuccess.getContentPane().add(btnNewButton);
	}
}
