import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Warning {

	private JFrame frmWarning;

	/**
	 * Launch the application.
	 */
	public static void Warning() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warning window = new Warning();
					window.frmWarning.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Warning() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWarning = new JFrame();
		frmWarning.setType(Type.POPUP);
		frmWarning.setResizable(false);
		frmWarning.setTitle("ERROR ! ");
		frmWarning.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\21-216711_yellow-exclamation-mark-sign-transparent-background-hd-png.png"));
		frmWarning.setBounds(700, 500, 365, 178);
		frmWarning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWarning.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterUsername = new JLabel("Please enter a valid Username and Password!");
		lblPleaseEnterUsername.setBounds(21, 46, 282, 14);
		lblPleaseEnterUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmWarning.getContentPane().add(lblPleaseEnterUsername);
		
		JLabel label = new JLabel("");
		label.setBounds(306, 41, 58, 19);
		label.setIcon(new ImageIcon("C:\\Java Project\\Icons\\21-216711_yellow-exclamation-mark-sign-transparent-background-hd-png.png"));
		frmWarning.getContentPane().add(label);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWarning.setVisible(false);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOk.setBounds(145, 81, 67, 29);
		btnOk.setBackground(UIManager.getColor("Button.background"));
		frmWarning.getContentPane().add(btnOk);
	}
}
