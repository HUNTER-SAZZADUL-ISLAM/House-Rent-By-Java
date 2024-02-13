import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ReEnter {

	private JFrame frmSignUpFailed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReEnter window = new ReEnter();
					window.frmSignUpFailed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReEnter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUpFailed = new JFrame();
		frmSignUpFailed.setResizable(false);
		frmSignUpFailed.setType(Type.POPUP);
		frmSignUpFailed.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\mitchell-aluminium-american-red-cross-symbol-clip-art-wrong-thumb.png"));
		frmSignUpFailed.setTitle("Sign Up Failed");
		frmSignUpFailed.setBounds(750, 500, 384, 189);
		frmSignUpFailed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUpFailed.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java Project\\Icons\\mitchell-aluminium-american-red-cross-symbol-clip-art-wrong-thumb.png"));
		lblNewLabel.setBounds(292, 49, 48, 14);
		frmSignUpFailed.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Already registered to this Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(61, 49, 221, 14);
		frmSignUpFailed.getContentPane().add(lblNewLabel_1);
		
		JButton btnSignUpAgain = new JButton("Sign Up Again");
		btnSignUpAgain.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSignUpAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSignUpFailed.setVisible(false);
			}
		});
		btnSignUpAgain.setBackground(UIManager.getColor("Button.highlight"));
		btnSignUpAgain.setBounds(121, 90, 128, 23);
		frmSignUpFailed.getContentPane().add(btnSignUpAgain);
	}
}
