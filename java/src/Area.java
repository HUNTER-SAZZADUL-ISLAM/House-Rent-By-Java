import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Area {

	private JFrame frmChooseArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
					window.frmChooseArea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Area() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChooseArea = new JFrame();
		frmChooseArea.setFont(new Font("Dialog", Font.BOLD, 35));
		frmChooseArea.setType(Type.POPUP);
		frmChooseArea.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java Project\\Icons\\2-512.png"));
		frmChooseArea.setResizable(false);
		frmChooseArea.setTitle("Choose Area");
		frmChooseArea.setBounds(800, 100, 890, 589);
		frmChooseArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChooseArea.getContentPane().setLayout(null);
		
		JButton btnMirpur = new JButton("Mirpur ");
		btnMirpur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
//				try {
//					FileWriter myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
//					
//		        	  myWriter.write("Mirpur ");
//		        	  myWriter.close();
					flat f =new flat();
					f.main(null);
					
				}

//				catch (Exception ep) {
//		            ep.printStackTrace();
//		        }
			}
		);
		btnMirpur.setIcon(new ImageIcon("C:\\Java Project\\Jbutton\\gif\\CQPj.gif"));
		btnMirpur.setForeground(SystemColor.textText);
		btnMirpur.setFont(new Font("Tekton Pro", Font.BOLD, 18));
		btnMirpur.setBounds(35, 190, 287, 215);
		frmChooseArea.getContentPane().add(btnMirpur);
		
		JButton btnDhanmondi = new JButton("");
		btnDhanmondi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter	myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
					myWriter.write("Dhanmondi"+" ");
		        	myWriter.close();
		        	
		        	Flat2 f =new Flat2(null);
		        	f.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnDhanmondi.setIcon(new ImageIcon("C:\\Java Project\\Jbutton\\gif\\responsive-house.gif"));
		btnDhanmondi.setForeground(Color.BLACK);
		btnDhanmondi.setFont(new Font("Tekton Pro", Font.BOLD, 18));
		btnDhanmondi.setBounds(562, 190, 287, 215);
		frmChooseArea.getContentPane().add(btnDhanmondi);
		
		JLabel lblMirpur = new JLabel("Mirpur");
		lblMirpur.setForeground(new Color(153, 0, 102));
		lblMirpur.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblMirpur.setHorizontalAlignment(SwingConstants.CENTER);
		lblMirpur.setBounds(67, 133, 215, 28);
		frmChooseArea.getContentPane().add(lblMirpur);
		
		JLabel lblDhanmondi = new JLabel("Dhanmondi");
		lblDhanmondi.setForeground(new Color(51, 51, 51));
		lblDhanmondi.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblDhanmondi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDhanmondi.setBounds(613, 133, 215, 28);
		frmChooseArea.getContentPane().add(lblDhanmondi);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setForeground(new Color(0, 0, 153));
		lblArea.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblArea.setBounds(394, 146, 108, 62);
		frmChooseArea.getContentPane().add(lblArea);
		
		JLabel lblChooseArea = new JLabel("Choose");
		lblChooseArea.setForeground(new Color(0, 0, 102));
		lblChooseArea.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		lblChooseArea.setBounds(171, 71, 538, 90);
		lblChooseArea.setHorizontalAlignment(SwingConstants.CENTER);
		frmChooseArea.getContentPane().add(lblChooseArea);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(153, 51, 51));
		label.setIcon(new ImageIcon("C:\\Java Project\\Jframe img\\117060.jpg"));
		label.setBounds(0, 0, 884, 560);
		frmChooseArea.getContentPane().add(label);
	}
}
