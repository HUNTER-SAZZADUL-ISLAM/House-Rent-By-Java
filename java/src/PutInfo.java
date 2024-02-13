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

public class PutInfo {

	private JFrame frmError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PutInfo window = new PutInfo();
					window.frmError.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PutInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmError = new JFrame();
		frmError.setType(Type.POPUP);
		frmError.setResizable(false);
		frmError.setTitle("ERROR !");
		frmError.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\21-216711_yellow-exclamation-mark-sign-transparent-background-hd-png.png"));
		frmError.setBounds(700, 500, 419, 193);
		frmError.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmError.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Java Project\\Icons\\21-216711_yellow-exclamation-mark-sign-transparent-background-hd-png.png"));
		label.setBounds(258, 48, 48, 14);
		frmError.getContentPane().add(label);
		
		JLabel lblPleaseFillUp = new JLabel("Please fill up correctly");
		lblPleaseFillUp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPleaseFillUp.setBounds(124, 48, 134, 14);
		frmError.getContentPane().add(lblPleaseFillUp);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmError.setVisible(false);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.highlight"));
		btnNewButton.setBounds(169, 98, 89, 23);
		frmError.getContentPane().add(btnNewButton);
	}
}
