import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Confirm {

	public JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm window = new Confirm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Confirm() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Book b = new Book();
                b.main(null);
				
				
				
				
				
				
//				FileWriter myWriter;
//				
//				try {  
//					
//				
//                  String path = "C://Java Project//FamilySelection//Common.txt";
//					
//					FileReader fr = new FileReader(path);
//		            BufferedReader br = new BufferedReader(fr);
//		            
//		            String line, fArea,fFlat;
//		            boolean isLoginSuccess = false;
//		            
//		          
//		            while ((line = br.readLine()) != null) {
//		            	
//		            	fArea = line.split(" ")[0];
//		                fFlat = line.split(" ")[1];
//		                
//		                
//		                
//		                
//		                if (fArea.equals("Mirpur") && fFlat.equals("flat1")) {
//		                    isLoginSuccess = true;
//		                    
//		                    Sold s = new Sold();
//			        		s.main(null);
//			        		
//		                    
//		                    
//		    				
//		    				break;
//		                } 
//		                if (fArea.equals("Mirpur") && fFlat.equals("flat")) {
//		                    isLoginSuccess = true;
//		                    
//		                    Sold s = new Sold();
//			        		s.main(null);
//			        		
//		                    
//		                    
//		    				
//		    				break;
//		                } 
//		            }
//		        	if(!isLoginSuccess) {
//		        		FileWriter myWriter1 = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
//			        	  myWriter1.write(" "+"done");
//			        	  myWriter1.close();
//		        		Book b = new Book();
//		                b.main(null);
//		        	}
//		        	
//		        	
//	                frame.setVisible(false);
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		});
		frame.getContentPane().add(btnConfirm, BorderLayout.CENTER);
	}

}
