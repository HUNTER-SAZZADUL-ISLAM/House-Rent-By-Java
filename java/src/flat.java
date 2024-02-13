import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;

public class flat  {

	private JFrame frame;
	private JTextField SELECTION;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flat window = new flat();
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
	public flat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnRoom_1 = new JButton("flat1");
		btnRoom_1.setBounds(0, 0, 126, 126);
		btnRoom_1.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\fb96ff8691d3ef72bc61c384d3979833 (1).jpg"));
		btnRoom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				try{	 boolean Success = true;
//				
//				if(Success) {
//					FileWriter myWriter = new FileWriter("C://Java Project//FamilySelection//Common.txt",true);
//				
//	        	  myWriter.write("flat1"+" "+Success);
//	        	  myWriter.close();
//				  
//	        	  Confirm c = new Confirm();
//	        	  c.main(null);
//	        	  Success = false;
//	        	  myWriter.write("flat1"+" "+Success);
//	        	  myWriter.close();
//	        	
//				}}
//			catch (IOException ep) {
//			      
//			      ep.printStackTrace();
//			}
				}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnRoom_1);
		
		JLabel lblRoom = new JLabel("FLT1");
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setBounds(0, 126, 90, 26);
		lblRoom.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRoom);
		
		JButton button = new JButton("flat1");
		button.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\images.jpg"));
		button.setBounds(136, 0, 132, 126);
		frame.getContentPane().add(button);
		
		JLabel lblFlt = new JLabel("FLT2");
		lblFlt.setForeground(Color.WHITE);
		lblFlt.setBounds(136, 126, 90, 26);
		lblFlt.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblFlt);
		
		JButton button_1 = new JButton("flat1");
		button_1.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\images (1).jpg"));
		button_1.setBounds(278, 0, 127, 126);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("flat1");
		button_2.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\141320535 (1).jpg"));
		button_2.setBounds(415, 0, 123, 126);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("flat1");
		button_3.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\images (2).jpg"));
		button_3.setBounds(548, 0, 121, 126);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("flat1");
		button_4.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\fb96ff8691d3ef72bc61c384d3979833 (1).jpg"));
		button_4.setBounds(0, 164, 132, 126);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("flat1");
		button_5.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\white-sofa-chair-cover-living-room-large-cushions-set-outdoor-covers-target-off-couch-design-table-single-leather-tufted-sectional-ideas-designs-sets-decorating-images-fluffy-930x535.jpeg"));
		button_5.setBounds(136, 164, 132, 126);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("flat1");
		button_6.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\flat-51.jpg"));
		button_6.setBounds(273, 164, 132, 126);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("flat1");
		button_7.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\107760069.jpg"));
		button_7.setBounds(415, 164, 132, 126);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("flat1");
		button_8.setIcon(new ImageIcon("C:\\Java Project\\RoomPic\\skirted-chair-cover-parson-slipcovers-dining-chairs-room-covers.jpg"));
		button_8.setBounds(548, 164, 132, 126);
		frame.getContentPane().add(button_8);
		
		JLabel lblFlt_1 = new JLabel("FLT3");
		lblFlt_1.setForeground(Color.WHITE);
		lblFlt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_1.setBounds(278, 126, 90, 26);
		frame.getContentPane().add(lblFlt_1);
		
		JLabel lblFlt_2 = new JLabel("FLT4");
		lblFlt_2.setForeground(Color.BLACK);
		lblFlt_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_2.setBounds(415, 126, 90, 26);
		frame.getContentPane().add(lblFlt_2);
		
		JLabel lblFlt_3 = new JLabel("FLT5");
		lblFlt_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_3.setBounds(548, 126, 90, 26);
		frame.getContentPane().add(lblFlt_3);
		
		JLabel lblFlt_4 = new JLabel("FLT6");
		lblFlt_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_4.setBounds(0, 289, 90, 26);
		frame.getContentPane().add(lblFlt_4);
		
		JLabel lblFlt_5 = new JLabel("FLT7");
		lblFlt_5.setForeground(Color.WHITE);
		lblFlt_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_5.setBounds(136, 289, 90, 26);
		frame.getContentPane().add(lblFlt_5);
		
		JLabel lblFlt_6 = new JLabel("FLT8");
		lblFlt_6.setForeground(Color.WHITE);
		lblFlt_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_6.setBounds(273, 289, 90, 26);
		frame.getContentPane().add(lblFlt_6);
		
		JLabel lblFlt_7 = new JLabel("FLT9");
		lblFlt_7.setForeground(Color.WHITE);
		lblFlt_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_7.setBounds(415, 289, 90, 26);
		frame.getContentPane().add(lblFlt_7);
		
		JLabel lblFlt_8 = new JLabel("FLT10");
		lblFlt_8.setForeground(Color.WHITE);
		lblFlt_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlt_8.setBounds(548, 289, 90, 26);
		frame.getContentPane().add(lblFlt_8);
		
		SELECTION = new JTextField();
		SELECTION.setBounds(279, 326, 126, 20);
		frame.getContentPane().add(SELECTION);
		SELECTION.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ENTER SELECTION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(136, 326, 132, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton confirm = new JButton("CONFIRM");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SELECTION1 = SELECTION.getText().toString();
				String DELETE;
				boolean Success = true;
				try {
String path = "C:\\Java Project\\FamilySelection\\Common.txt";
					
					FileReader fr = new FileReader(path);
		            BufferedReader br = new BufferedReader(fr);
	            FileReader UR = new FileReader(path);
		            BufferedReader USR = new BufferedReader(UR);
		            
		            
		            String line, fCheck;
		            Success = true;
		            
		          
		            while ((line = br.readLine()) != null) {
		            	
		            	fCheck = line.split(" ")[0];
		            	   
		            	if(fCheck.equals(SELECTION1)) {
		            	              
		            		 
			                FileWriter myWriter = new FileWriter("C://Java Project//User txt//User.txt",true);
						      
						    
			                myWriter.write(SELECTION.getText()+" "+"selected"+"\n");
						    myWriter.close();
						      
						    
			        	  Confirm c = new Confirm();
			        	  c.main(null);
		                 
		        	 
		        		  File inputFile = new File(path);
		        		  File tempFile = new File("C:\\\\Java Project\\\\FamilySelection\\\\myTempFile.txt");

		        		  BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		        		  BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		        		  String lineToRemove =SELECTION1;
		        		  String currentLine;

		        		  while((currentLine = reader.readLine()) != null) {
		        		      // trim newline when comparing with lineToRemove
		        		      String trimmedLine = currentLine.trim();
		        		      if(trimmedLine.equals(lineToRemove)) continue;
		        		      writer.write(currentLine + System.getProperty("line.separator"));
		        		  }
		        		  writer.close(); 
		        		  reader.close(); 
		        		  File inputFile1 = new File("C:\\\\Java Project\\\\FamilySelection\\\\myTempFile.txt");
		        		  File tempFile2 = new File(path);

		        		  BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
		        		  BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));

		        		 
		        		  String currentLine1;

		        		  while((currentLine1 = reader1.readLine()) != null) {
		        		    
		        		     
		        		      writer2.write(currentLine1 + System.getProperty("line.separator"));
		        		  }
		        		  writer2.close(); 
		        		  reader1.close(); 
		        		  
		        		  BufferedWriter writer3 = new BufferedWriter(new FileWriter(inputFile1));
		        		  writer3.write("");
		        		  writer3.close();
		            	 	Success=false; 
		            	 	
		            	}
	
		}
		            if(Success) {
		            	 Sold s = new Sold();
			        		s.main(null);
		            }
		            br.close();
		fr.close();
		}catch (Exception ep) {
            ep.printStackTrace();
		}}});
		confirm.setBounds(435, 326, 89, 23);
		frame.getContentPane().add(confirm);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Java Project\\Jframe img\\morning-bird.jpg"));
		lblNewLabel_1.setBounds(0, 0, 680, 382);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
