import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Sold {

	JFrame frmBookingFailed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sold window = new Sold();
					window.frmBookingFailed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sold() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookingFailed = new JFrame();
		frmBookingFailed.setType(Type.POPUP);
		frmBookingFailed.setResizable(false);
		frmBookingFailed.setTitle("Booking failed");
		frmBookingFailed.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\21-216711_yellow-exclamation-mark-sign-transparent-background-hd-png.png"));
		frmBookingFailed.setBounds(100, 100, 395, 183);
		frmBookingFailed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookingFailed.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
					myWriter.write("\n"); 
		        	myWriter.close();
		        	
		        	boolean isOkay = true;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmBookingFailed.setVisible(false);
			}
		});
		btnOk.setBounds(150, 92, 89, 23);
		frmBookingFailed.getContentPane().add(btnOk);
		
		JLabel lblThisRoomIs = new JLabel("Whoops! This flat is already booked");
		lblThisRoomIs.setBounds(0, 0, 389, 117);
		lblThisRoomIs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThisRoomIs.setHorizontalAlignment(SwingConstants.CENTER);
		frmBookingFailed.getContentPane().add(lblThisRoomIs);
	}
}
