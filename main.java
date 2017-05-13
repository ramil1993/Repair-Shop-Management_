import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.imageio.ImageIO;
import java.net.URL;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.nio.file.Path;
import java.awt.Frame;
/* 
        Auto Body Shop Management App   
 
        Author: Ramil Davidov
        Date: 1/12/2017

        More Information: . . .
*/

public class main  {



public static void main(String[] args) {

	try 
   	 { 
       		 UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); 
   	 } 
    	catch(Exception e){ 
    	}
	new main();
}


public main()
{
		
	
	String  usr = "adminholder";
	String pass = "admin666";
	String path = System.getProperty("user.dir");
        
	
	
	
	ArrayList<Person> ppl = new ArrayList<Person>();
	ArrayList<Part> part = new ArrayList<Part>();

	JFrame loginFrame = new JFrame();			
	JLabel background = new JLabel(new ImageIcon(path + "\\pics\\1.JPG"));
	
	ImageIcon icon = new ImageIcon(path + "\\pics\\icon.png");
	loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	loginFrame.setTitle("ProNorth \t Collision");
	loginFrame.setSize(300,100);
	
	JPanel sub = new JPanel();

	JPanel comboPanel = new JPanel();

	JLabel usl = new JLabel("Username: ");
	JLabel passl = new JLabel("Password: ");
	JTextField usr_txt = new JTextField("username");
	JPasswordField pass_txt = new JPasswordField("password");
	
	usl.setForeground(Color.WHITE);	
	passl.setForeground(Color.WHITE);	

	JButton b_login = new JButton("Login");
	JButton exit = new JButton("Exit");
	exit.addActionListener ( new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			System.exit(0);
		}

	 });
	
	comboPanel.add(usl);   
	comboPanel.add(usr_txt);
	comboPanel.add(passl);   
	comboPanel.add(pass_txt);
	comboPanel.add(b_login);
	comboPanel.add(exit);
	comboPanel.setBackground(Color.BLACK);
	loginFrame.add(comboPanel, BorderLayout.CENTER);
	loginFrame.setIconImage(icon.getImage());
	loginFrame.setLocationRelativeTo(null);	
	//loginFrame.pack();
	loginFrame.setVisible(true);
	

	b_login.addActionListener ( new ActionListener()
	 {
		public void actionPerformed(ActionEvent e) 
		{
			if (usr.equals(usr_txt.getText())&& pass.equals(pass_txt.getText()))
			{
				JOptionPane.showMessageDialog(null, "Login Successful!");
				

				JFrame guiFrame = new JFrame();		
				JPanel sub2 = new JPanel();
				JPanel sub3 = new JPanel();
				
				

				//This will center the JFrame in the middle of the screen
				guiFrame.setLocationRelativeTo(null);		
					

				JButton b_appoint = new JButton( "Meetings");  // Meeting Button
       				b_appoint.setPreferredSize(new Dimension(100, 100));
				b_appoint.addActionListener( new ActionListener()
				{

					public void actionPerformed(ActionEvent e)// Meetings Section
					{
						JFrame meet_frame = new JFrame(); 
        

						//make sure the program exits when the frame closes
						meet_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						meet_frame.setTitle("ProNorth \t Collision {Meetings}");
						meet_frame.setSize(300,300);

						//This will center the JFrame in the middle of the screen
						meet_frame.setLocationRelativeTo(null);
						meet_frame.setVisible(true);

			
						JButton b_meet_create = new JButton( "Create");
						b_meet_create.setPreferredSize(new Dimension(100, 100));
						b_meet_create.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
					
								JFrame createbox = new JFrame();
								//make sure the program exits when the frame closes
								createbox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								createbox.setTitle("ProNorth \t Collision {Meetings}");
								createbox.setSize(800,300);

								//This will center the JFrame in the middle of the screen
								createbox.setLocationRelativeTo(null);
								createbox.setVisible(true);	

								JPanel message = new JPanel();
					
								// Meeting Schedules
								JTextField name_txt = new JTextField("Fill In Here");
								JTextField carbrand_txt = new JTextField("Fill In Here");
								JTextField carmodel_txt = new JTextField("Fill In Here");
								JTextField license_txt = new JTextField("Fill In Here");
								JTextField date_txt = new JTextField("Fill In Here");

                						message.add(new JLabel("Full Name:"));              
                						message.add(name_txt);
								message.add(new JLabel("Vehicle Brand:"));              
                						message.add(carbrand_txt);
								message.add(new JLabel("Vehicle Model:"));              
                						message.add(carmodel_txt);
								message.add(new JLabel("License Plate:"));              
                						message.add(license_txt);
								message.add(new JLabel("Date:"));              
                						message.add(date_txt);
                						message.setBackground(Color.WHITE);
								createbox.setIconImage(icon.getImage());

								JButton complete = new JButton("Save");
								createbox.add(message, BorderLayout.CENTER);
								createbox.add(complete, BorderLayout.SOUTH);		
								complete.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										
								
									 }
								 });

						}
				});

				JButton b_meet_update = new JButton( "Update");
				b_meet_update.setPreferredSize(new Dimension(100, 100));
                     	
				b_meet_update.addActionListener( new ActionListener()
				{
			    		 public void actionPerformed(ActionEvent e)
			       		 {
					
						JFrame update = new JFrame();
						//make sure the program exits when the frame closes
						update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						update.setTitle("ProNorth \t Collision {Meetings}");
						update.setSize(300,300);

						//This will center the JFrame in the middle of the screen
						update.setLocationRelativeTo(null);
						update.setVisible(true);	

						JPanel message = new JPanel();

						JTextField license_txt = new JTextField("Fill In Here");
						message.add(new JLabel("Search by License Plate Number:")); 
						message.add(license_txt);				  
					


						JButton b_update = new JButton("Update");
						update.add(message, BorderLayout.CENTER);
						update.add(b_update, BorderLayout.SOUTH);
						update.setIconImage(icon.getImage());
			       		}
				});

				JButton b_meet_remove = new JButton( "Remove");
				b_meet_remove.setPreferredSize(new Dimension(100, 100));

				b_meet_remove.addActionListener( new ActionListener()
				{
			      		public void actionPerformed(ActionEvent e)
			       		{
						JFrame remove = new JFrame();
						//make sure the program exits when the frame closes
						remove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						remove.setTitle("ProNorth \t Collision {Meetings}");
						remove.setSize(300,300);

						//This will center the JFrame in the middle of the screen
						remove.setLocationRelativeTo(null);
						remove.setVisible(true);	

						JPanel message = new JPanel();

						JTextField license_txt = new JTextField("Fill In Here");
						message.add(new JLabel("Search by License Plate Number:")); 
						message.add(license_txt);				  
					


						JButton b_remove = new JButton("Remove");
						remove.add(message, BorderLayout.CENTER);
						remove.add(b_remove, BorderLayout.SOUTH);	
						remove.setIconImage(icon.getImage());
			       		}
				});
			
				JPanel sub_meet = new JPanel();

				sub_meet.add(b_meet_create);
				sub_meet.add(b_meet_update);
				sub_meet.add(b_meet_remove);

				meet_frame.add(sub_meet);
				meet_frame.setIconImage(icon.getImage());
				meet_frame.add(sub_meet, BorderLayout.CENTER);
				meet_frame.pack();
				meet_frame.setResizable(true);
				meet_frame.setVisible(true);
				}
			   });

			   JButton b_arrive = new JButton( "Arrivals");   // Arrivals Button
 			   b_arrive.setPreferredSize(new Dimension(100, 100));
			   b_arrive.addActionListener( new ActionListener()
			   {

				public void actionPerformed(ActionEvent e) // Arrivals Section
				{
					JFrame ar_frame = new JFrame();
        

					//make sure the program exits when the frame closes
					ar_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ar_frame.setTitle("ProNorth \t Collision {Arrivals}");
					ar_frame.setSize(300,300);

					//This will center the JFrame in the middle of the screen
					ar_frame.setLocationRelativeTo(null);
					ar_frame.setVisible(true);

					JButton b_arrivals = new JButton( "Check");
					b_arrivals.setPreferredSize(new Dimension(200, 100));
			
					b_arrivals.addActionListener( new ActionListener()
					{
		 	    			 public void actionPerformed(ActionEvent e)
			      			 {
							JFrame check = new JFrame();
							//make sure the program exits when the frame closes
							check.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							check.setTitle("ProNorth \t Collision {Arrivals}");
							check.setSize(300,300);

							//This will center the JFrame in the middle of the screen
							check.setLocationRelativeTo(null);
							check.setVisible(true);	

							JPanel message = new JPanel();

							JTextField license_txt = new JTextField("Fill In Here");
							message.add(new JLabel("Search by License Plate Number:")); 
							message.add(license_txt);				  
					


							JButton b_check = new JButton("Find");
							check.add(message, BorderLayout.CENTER);
							check.add(b_check, BorderLayout.SOUTH);
							check.setIconImage(icon.getImage());
			      			}
					});			

					JButton b_arr_update = new JButton( "Update");
					b_arr_update.setPreferredSize(new Dimension(200, 100));
                     		
					b_arr_update.addActionListener( new ActionListener()
					{
			     			public void actionPerformed(ActionEvent e)
			      			{
							JFrame update = new JFrame();
							//make sure the program exits when the frame closes
							update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							update.setTitle("ProNorth \t Collision {Arrivals}");
							update.setSize(300,300);

							//This will center the JFrame in the middle of the screen
							update.setLocationRelativeTo(null);
							update.setVisible(true);	

							JPanel message = new JPanel();

							JTextField license_txt = new JTextField("Fill In Here");
							message.add(new JLabel("Search by License Plate Number:")); 
							message.add(license_txt);				  
					


							JButton b_check = new JButton("Update");
							update.add(message, BorderLayout.CENTER);
							update.add(b_check, BorderLayout.SOUTH);
							update.setIconImage(icon.getImage());
			      			}
					});

					JButton b_arr_remove = new JButton( "Remove");
					b_arr_remove.setPreferredSize(new Dimension(200, 100));
			
					b_arr_remove.addActionListener( new ActionListener()
					{
		             			public void actionPerformed(ActionEvent e)
			      			{
			         			JFrame remove = new JFrame();
							//make sure the program exits when the frame closes
							remove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							remove.setTitle("ProNorth \t Collision {Arrivals}");
							remove.setSize(300,300);

							//This will center the JFrame in the middle of the screen
							remove.setLocationRelativeTo(null);
							remove.setVisible(true);	
			
							JPanel message = new JPanel();

							JTextField license_txt = new JTextField("Fill In Here");
							message.add(new JLabel("Search by License Plate Number:")); 
							message.add(license_txt);				  
					


							JButton b_check = new JButton("Remove");
							remove.add(message, BorderLayout.CENTER);
							remove.add(b_check, BorderLayout.SOUTH);
							remove.setIconImage(icon.getImage());
			      			}
					});

					JPanel sub_arr = new JPanel();

					sub_arr.add(b_arrivals);
					sub_arr.add(b_arr_update);
					sub_arr.add(b_arr_remove);

					ar_frame.add(sub_arr);
					ar_frame.setIconImage(icon.getImage());
					ar_frame.add(sub_arr, BorderLayout.CENTER);
					ar_frame.pack();
					ar_frame.setResizable(true);
					ar_frame.setVisible(true);
				}
			 });

			JButton b_deliver = new JButton( "Deliveries"); // Deliveries Button
			b_deliver.setPreferredSize(new Dimension(100, 100));
			b_deliver.addActionListener( new ActionListener() // Deliveries Section
			{

				public void actionPerformed(ActionEvent e)
				{
					JFrame deliver_frame = new JFrame();

					String[] columnNames = {"Part","Part Number", "Date", "Time Arriving"};
                                		
                     			DefaultTableModel model = new DefaultTableModel();
 					model.setColumnIdentifiers(columnNames);  
								
        				Object[][] data = {
       					{"", "", "", ""},
        				{"", "", "", ""},
       					{"", "", "", ""},
        				{"", "", "", ""},
       					{"", "", "", ""}
        				};
					
					JTable table = new JTable(data, columnNames);

					JFrame contact_frame = new JFrame();
        				try {
					
						BufferedReader br = new BufferedReader(new FileReader(path + "\\other\\deliveries.txt")); 
								
						String line1;
										
						
						while((line1 = br.readLine()) != null)	
						{
							String[] info = line1.split("\\s+");
							
							model.addRow(info);
							
  
						}
					} catch(IOException filenotfound) {
						System.out.println("File not found!");
						System.exit(-1);
					}

					

					table.setModel(model);
					JScrollPane scrollPane = new JScrollPane(table);
								
					deliver_frame.add(scrollPane, BorderLayout.CENTER);
					

					//make sure the program exits when the frame closes
					deliver_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					deliver_frame.setTitle("ProNorth \t Collision {Deliveries}");
					deliver_frame.setSize(300,300);

					//This will center the JFrame in the middle of the screen
					deliver_frame.setLocationRelativeTo(null);
					deliver_frame.setVisible(true);
					deliver_frame.setIconImage(icon.getImage());

			
				}
			});

			JButton b_stats = new JButton( "Statistics");  // Statistics Button
			b_stats.setPreferredSize(new Dimension(100, 100));
			b_stats.addActionListener( new ActionListener() // Statistics Section
			{

				public void actionPerformed(ActionEvent e)
				{
					JFrame stats_frame = new JFrame();
        

					//make sure the program exits when the frame closes
					stats_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					stats_frame.setTitle("ProNorth \t Collision {Statistics}");
					stats_frame.setSize(300,300);

					//This will center the JFrame in the middle of the screen
					stats_frame.setLocationRelativeTo(null);
					stats_frame.setVisible(true);

			
					JButton b_stats_display = new JButton( "Graph");
					b_stats_display.setPreferredSize(new Dimension(100, 100));

					b_stats_display.addActionListener( new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JFrame graph_frame = new JFrame();	
							JLabel j = new JLabel("Monthly Profit Statistics");

							graph_frame.add(j, BorderLayout.NORTH);
							graph_frame.setTitle("ProNorth \t Collision {Graph}");
							graph_frame.setSize(500,500);
							BarChartComponent comp = new BarChartComponent();
							graph_frame.add(comp, BorderLayout.CENTER);
							graph_frame.setIconImage(icon.getImage());
							graph_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							graph_frame.setResizable(true);
							graph_frame.setVisible(true);
 						}
						
					});		
		
					JButton b_stats_update = new JButton( "Chart");
					b_stats_update.setPreferredSize(new Dimension(100, 100));
                     	
					b_stats_update.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JFrame pie_frame = new JFrame();
							JLabel j = new JLabel("Management Statistics");
							pie_frame.add(j, BorderLayout.NORTH);
    							pie_frame.getContentPane().add(new MyComponent());
							pie_frame.setTitle("ProNorth \t Collision {Pie Chart}");
							pie_frame.setSize(500,500);
							pie_frame.setIconImage(icon.getImage());
							pie_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							pie_frame.setResizable(true);
							pie_frame.setVisible(true);	
						}
		
					});

			
					JPanel sub_stats = new JPanel();

					sub_stats.add(b_stats_update);
					sub_stats.add(b_stats_display);
					stats_frame.setIconImage(icon.getImage());
					stats_frame.add(sub_stats);
					stats_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					stats_frame.add(sub_stats, BorderLayout.CENTER);
					stats_frame.pack();
					stats_frame.setResizable(true);
					stats_frame.setVisible(true);
				}
			});

       	 		JButton b_contacts = new JButton( "Contacts"); // Contacts Button
			b_contacts.setPreferredSize(new Dimension(100, 100));
			b_contacts.addActionListener( new ActionListener() // Contacts Section
			{

				public void actionPerformed(ActionEvent e)
				{
					String[] columnNames = {"Recipient","Number"};
                                		
                     			DefaultTableModel model = new DefaultTableModel();
 					model.setColumnIdentifiers(columnNames);  
								
        				Object[][] data = {
       					{"", ""},
        				{"", ""},
       					{"", ""},
        				{"", ""},
       					{"", ""}
        				};
					
					JTable table = new JTable(data, columnNames);

					JFrame contact_frame = new JFrame();
        				try {
					
						BufferedReader br = new BufferedReader(new FileReader(path + "\\other\\contacts.txt")); 
								
						String line1;
										
						
						while((line1 = br.readLine()) != null)	
						{
							String[] info = line1.split("\\s+");
							
							model.addRow(info);
							
  
						}
					} catch(IOException filenotfound) {
						System.out.println("File not found!");
						System.exit(-1);
					}

					

					table.setModel(model);
					JScrollPane scrollPane = new JScrollPane(table);
								
					contact_frame.add(scrollPane, BorderLayout.CENTER);
					

					//make sure the program exits when the frame closes
					contact_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					contact_frame.setTitle("ProNorth \t Collision {Contacts}");
					contact_frame.setSize(300,300);

					//This will center the JFrame in the middle of the screen
					contact_frame.setLocationRelativeTo(null);
					contact_frame.setVisible(true);
					contact_frame.setIconImage(icon.getImage());

			
				}
			});

        		JButton b_database = new JButton( "Database"); // Database Button
			b_database.setPreferredSize(new Dimension(100, 100));
			b_database.addActionListener( new ActionListener() // Database Section
			{

				public void actionPerformed(ActionEvent e)
				{
				
						JFrame database_frame = new JFrame();
						database_frame.setIconImage(icon.getImage());
						
						String[] columnNames = {"R.O. #",
                                		"Customer",
                                		"Est #",
                                		"Sch In",
                                		"Sch Out",
						"Dept/Status",
						"Job Class",
						"Total",
						"Balance",
						"Ins",
						"Deduct",
						"Year",
						"Make",
						"Color",
						"Model",
						"Rental",
						"License",
						"CLAIM #",
						"POA"};

						String[] columnNames2 = {"Person", "Part"};
 						
						Object[][] data2 = {
       						{"", ""},
        					{"", ""}
        					};	

        					Object[][] data = {
       						{"", "",
        					 "", "", "", "", "", "", "", "", "", "", "", "", "", "","","",""},
        					{"", "",
        					 "", "", "", "", "", "", "", "", "", "", "", "", "", "","","",""},
       						{"", "",
       						 "", "", "", "", "", "", "", "", "", "", "", "", "", "","","",""},
        					{"", "",
         					"", "", "", "", "", "", "", "", "", "", "", "", "", "","","",""},
       						{"", "",
        					 "", "", "", "", "", "", "", "", "", "", "", "", "", "","","",""}
        					};	
 					
						DefaultTableModel model = new DefaultTableModel();
						DefaultTableModel model2 = new DefaultTableModel();
						
						
						final JTable table = new JTable(data, columnNames);
						final JTable table2 = new JTable(data2, columnNames2);


						model.setColumnIdentifiers(columnNames);  
						model2.setColumnIdentifiers(columnNames2); 
					 		
						File dir = new File(path + "\\storage");
						File[] all = dir.listFiles();
						
						for(File f : all)
						{
									   
							
								try {					 		
									BufferedReader b = new BufferedReader(new FileReader(f)); 
								
								        String line1;
										

								
									
									
									
									while((line1 = b.readLine()) != null)	
									{
										String[] info = line1.split("\\s+");
										
										

										if(info[0].equals("customer")) {
											Person tmp = new Person();
											tmp.setFile(f);

									

											tmp.makePerson(Integer.parseInt(info[1]), info[2], Integer. 												parseInt(info[3]), info[4], info[5], info[6], info[7], 												Integer.parseInt(info[8]), Integer.parseInt (info[9]), 												info[10],Integer.parseInt(info[11]), info[12], 
											info[13], info[14], info[15], info[16], info[17],info[18],
											info[19]);

											ppl.add(tmp);
											
											
											model.addRow(tmp.arrayString());
											
										}
										else if(info[0].equals("part")) {
											Part tmp_part = new Part();
											Person tmp2 = new Person();

											for(Person p: ppl)
											{
												if(Integer.toString(p.r_o).equals(
														f.getName().replaceFirst("[.][^.]+$", ""))) 
												{
													tmp2 = p;
												}
											}

											tmp_part.makePart(tmp2, info[1], Integer.parseInt(info[2]),
											Integer.parseInt(info[3]), 
											Integer.parseInt(info[4]));						
											part.add(tmp_part);
					
											model2.addRow(tmp_part.arrayString());
										}
										
									}
									
									
									
									
									
									
									b.close();
								} catch (IOException readernotFound) {
									System.out.println("Reader Not Found!");
									System.exit(-1);
								}

							
						}			
           								
									
       							
								table2.setModel(model2);
								table.setModel(model);

        					JPanel sub_data = new JPanel();
						JPanel sub_data2 = new JPanel();
					
						
						
						JButton costs = new JButton("Job Costs");
						costs.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								JFrame jcost_frame = new JFrame();
								
								
								
								String[] columnNames = {"R.O #", "Total","Deduct","Cost", "Balance"};
                                		
                     						DefaultTableModel model = new DefaultTableModel();
 								model.setColumnIdentifiers(columnNames);  
								
        							Object[][] data = {
       								{"", "","", ""},
        							{"", "","", ""},
       								{"", "","", ""},
        							{"", "","", ""},
       								{"", "","", ""}
        							};
									
								JTable table = new JTable(data, columnNames);

								for(Part p: part)
								{
									String[] info = new String[100];
									info[0] = Integer.toString(p.customer.r_o);
									info[1] = Integer.toString(p.customer.total);
									info[2] = Integer.toString(p.customer.deduct);
									info[3] = Integer.toString(p.cost);
									info[4] = Integer.toString(p.customer.balance);

									model.addRow(info);
								}
								table.setModel(model);
	

								JScrollPane scrollPane = new JScrollPane(table);
								jcost_frame.setIconImage(icon.getImage());
								jcost_frame.add(scrollPane, BorderLayout.CENTER);
								jcost_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								jcost_frame.setTitle("ProNorth \t Collision {Job Costs}");
								jcost_frame.setSize(300,300);
								

								//This will center the JFrame in the middle of the screen
								jcost_frame.setLocationRelativeTo(null);
								jcost_frame.setVisible(true);	
								
							}
						});
						JButton prods = new JButton("Productions");
						prods.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
										
							}
						});
						JButton ro = new JButton("R.O List");
						ro.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{	
								Frame f = new TextViewer();
    								f.show();					
							}
						});
						JButton history = new JButton("History");
						JButton calc = new JButton ("Calc");
						calc.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								for(Person p: ppl)	
									p.balance = p.total - p.deduct;
					
								
								JFrame calc_frame = new JFrame();
								
								
								
								String[] columnNames = {"R.O #", "Calculated Balance"};
                                		
                     						DefaultTableModel model = new DefaultTableModel();
 								model.setColumnIdentifiers(columnNames);  
								
        							Object[][] data = {
       								{"", "",""},
        							{"", "",""},
       								{"", "",""},
        							{"", "",""},
       								{"", "",""}
        							};

								JTable table = new JTable(data, columnNames);

								for(Person p: ppl)
								{
							            String[] info = new String[100];
							            info[0] = Integer.toString(p.r_o);
								    info[1] = Integer.toString(p.balance);

								    model.addRow(info);
								}
								table.setModel(model);
								
								JScrollPane scrollPane = new JScrollPane(table);
								calc_frame.add(scrollPane, BorderLayout.CENTER);
								calc_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								calc_frame.setTitle("ProNorth \t Collision {Schedules}");
								calc_frame.setSize(300,500);
								

								//This will center the JFrame in the middle of the screen
								calc_frame.setLocationRelativeTo(null);
								calc_frame.setVisible(true);		
							}
						});
						JButton close = new JButton("Close");
						close.addActionListener( new ActionListener() // Database Section
						{

							public void actionPerformed(ActionEvent e)
							{
								database_frame.dispose();							
							}
						});
						JButton summary = new JButton("Summary");
						summary.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								String tmp = "";
								
								for(Person p: ppl)
								{
								    tmp += p.toString() + "\n";
								}
							
								JOptionPane.showMessageDialog(null, tmp);

								
							}
						});
						
						JButton print = new JButton("Print");
						print.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								File folder = new File(path + "\\print");
								File[] files = folder.listFiles();
								JList list = new JList(files);
								JFrame.setDefaultLookAndFeelDecorated(true);
								JFrame print = new JFrame();

								 
   								print.setLayout(new FlowLayout());
								print.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	
    								JPanel sub_print = new JPanel();
								JButton b_print = new JButton("Print");
								b_print.addActionListener( new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{

									}
								});

								sub_print.add(b_print);
   								list.setSelectedIndex(1);
   								System.out.println(list.getSelectedValue());
    								print.add(new JScrollPane(list));
								print.add(sub_print, BorderLayout.SOUTH);
    								print.pack();

    								print.setVisible(true);
							}
						});	
						JButton export = new JButton("Export");
						export.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								File folder = new File(path + "\\print");
								File[] files = folder.listFiles();
								JList list = new JList(files);
								JFrame.setDefaultLookAndFeelDecorated(true);
								JFrame export_frame = new JFrame();

								 
   								export_frame.setLayout(new FlowLayout());
								export_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	
    								JPanel sub_export = new JPanel();
								JButton b_export = new JButton("Export");
								b_export.addActionListener( new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{

									}
								});

								sub_export.add(b_export);
   								list.setSelectedIndex(1);
   								
    								export_frame.add(new JScrollPane(list));
								export_frame.add(sub_export, BorderLayout.SOUTH);
    								export_frame.pack();

    								export_frame.setVisible(true);
							}
						});
						JButton addparts = new JButton("Add Part");
						addparts.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								JFrame part_frame = new JFrame();
								part_frame.setIconImage(icon.getImage());
								part_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								part_frame.setTitle("ProNorth \t Collision {Add Part}");
								part_frame.setSize(300,300);
								

								//This will center the JFrame in the middle of the screen
								part_frame.setLocationRelativeTo(null);
								part_frame.setVisible(true);	
							}
						});
						JButton jobs = new JButton("Jobs");
						jobs.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								
								
								JFrame jobs_frame = new JFrame();
								
								
								String[] columnNames = {"R.O #"};
                                		
                     						DefaultTableModel model = new DefaultTableModel();
 								model.setColumnIdentifiers(columnNames);  
								
        							Object[][] data = {
       								{"", "",""},
        							{"", "",""},
       								{"", "",""},
        							{"", "",""},
       								{"", "",""}
        							};

								JTable table = new JTable(data, columnNames);
								for(Person p: ppl)
								{
							            String[] info = new String[100];
								    info[0] = Integer.toString(p.r_o);

							      
								    model.addRow(info);
								}
								table.setModel(model);
								
								JScrollPane scrollPane = new JScrollPane(table);
								jobs_frame.setIconImage(icon.getImage());
								
								jobs_frame.add(scrollPane, BorderLayout.CENTER);
								jobs_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								jobs_frame.setTitle("ProNorth \t Collision {Schedules}");
								jobs_frame.setSize(300,300);
								

								//This will center the JFrame in the middle of the screen
								jobs_frame.setLocationRelativeTo(null);
								jobs_frame.setVisible(true);
								
							}
						});
						JButton admin = new JButton("Admin");
						admin.addActionListener( new ActionListener()
                                                {
							public void actionPerformed(ActionEvent e)
							{
								JOptionPane.showMessageDialog(null, "Current User: " + usr);
							}
						});
						JButton b_entry = new JButton("Add Entry");
						b_entry.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{	
								JFrame entry_frame = new JFrame();
								
								JLabel entry = new JLabel("Enter R.O #");
								JTextField entry_text = new JTextField("Enter Here");	

									
								JButton b_add_entry = new JButton("Add");
								b_add_entry.addActionListener( new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										String path_name = path + "\\storage";
									

										File f = new File(path);
   										File f1 = new File(path_name + "\\" + entry_text.getText() + ".txt");	
										f.mkdirs() ;
   								 		try {
      								 		 f1.createNewFile();
    										} catch (IOException fileNotFound) {
       											 System.out.println("File not found!");
											 System.exit(-1);
    										}
									}
								});
    								
								JPanel sub_entry = new JPanel();
								sub_entry.add(entry, BorderLayout.CENTER);
								sub_entry.add(entry_text, BorderLayout.CENTER);
								entry_frame.add(sub_entry, BorderLayout.CENTER);
								entry_frame.add(b_add_entry, BorderLayout.SOUTH);
								entry_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								entry_frame.setTitle("ProNorth \t Collision {Add Entry}");
								entry_frame.setSize(200,200);
						

								entry_frame.setLocationRelativeTo(null);
								entry_frame.setVisible(true);
							}
						});
						JButton b_save = new JButton("Save");
						b_save.addActionListener( new ActionListener() // Statistics Section
						{
							public void actionPerformed(ActionEvent e)
							{	/*
								try{
								File file = new File(path + "\\storage\\database_applicants");
					
								if(!file.exists()) {

								   file.createNewFile();
								}

								FileWriter fw = new FileWriter(file.getAbsoluteFile());
								BufferedWriter bw = new BufferedWriter(fw);
								
								bw.write("R.O.# Customer Est# SchIn SchOut Dept/Status JobClass Total Balance Ins Deduct Year Make Color Model Rental License CLAIM# POA\n");
								for(int i = 0; i < table2.getRowCount(); i++) {

									for(int j = 0; j < table2.getColumnCount(); j++) {
										bw.write(table2.getModel().getValueAt(i,j) + " ");
									}	
									bw.write("\n");
								}				
								bw.close();
								fw.close();
								JOptionPane.showMessageDialog(null, "Informated Saved!");
								}catch (Exception es) {
									es.printStackTrace();
								} */	
							}
						});
						
						JButton line = new JButton("Line Items");
						line.addActionListener( new ActionListener() // Statistics Section
						{
							
							public void actionPerformed(ActionEvent e)
							{
								int counter = 0;
								JFrame line_frame = new JFrame();
								
								
								JLabel j_title = new JLabel("Parts and Labour");
								String[] columnNames = {"R.O #","Part","Part Number","Part Cost", "Labour Cost"};
                                		
                     						DefaultTableModel model = new DefaultTableModel();
 								model.setColumnIdentifiers(columnNames);  
								
        							Object[][] data = {
       								{"", "","", "", ""},
        							{"", "","", "", ""},
       								{"", "","", "", ""},
        							{"", "","", "", ""},
       								{"", "","", "", ""}
        							};

								JTable table = new JTable(data, columnNames);
								for(Part p: part)
								{
									
							            String[] info = new String[100];
								    info[0] = Integer.toString(p.customer.r_o);
							            info[1] = p.part_name;
								    info[2] = Integer.toString(p.part_number);
								    info[3] = Integer.toString(p.cost);
								    info[4] = Integer.toString(p.labour_cost);
								    model.addRow(info);
								}
								table.setModel(model);
								
								JScrollPane scrollPane = new JScrollPane(table);
								line_frame.setIconImage(icon.getImage());
								line_frame.add(j_title, BorderLayout.CENTER);
								line_frame.add(scrollPane, BorderLayout.CENTER);
								line_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								line_frame.setTitle("ProNorth \t Collision {Parts & Labour}");
								line_frame.setSize(300,300);
								

								//This will center the JFrame in the middle of the screen
								line_frame.setLocationRelativeTo(null);
								line_frame.setVisible(true);
							}
						});
						JButton media = new JButton("Media");
						media.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{


							}
						});
						JButton schedule = new JButton("Schedule");
						schedule.addActionListener( new ActionListener()
						{
							
							public void actionPerformed(ActionEvent e)
							{
								int counter = 0;
								JFrame schedule_frame = new JFrame();
								
								
								
								String[] columnNames = {"Name","Schedule In","Schedule Out"};
                                		
                     						DefaultTableModel model = new DefaultTableModel();
 								model.setColumnIdentifiers(columnNames);  
								
        							Object[][] data = {
       								{"", "",""},
        							{"", "",""},
       								{"", "",""},
        							{"", "",""},
       								{"", "",""}
        							};

								JTable table = new JTable(data, columnNames);
								for(Person p: ppl)
								{
							            String[] info = new String[100];
								    info[0] = p.name;
							            info[1] = p.schedule_in;
								    info[2] = p.schedule_out;
								    model.addRow(info);
								}
								table.setModel(model);
								
								JScrollPane scrollPane = new JScrollPane(table);
								schedule_frame.setIconImage(icon.getImage());
								schedule_frame.add(scrollPane, BorderLayout.CENTER);
								schedule_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								schedule_frame.setTitle("ProNorth \t Collision {Schedules}");
								schedule_frame.setSize(300,300);
								

								//This will center the JFrame in the middle of the screen
								schedule_frame.setLocationRelativeTo(null);
								schedule_frame.setVisible(true);
							}
						});
						JButton reports = new JButton("Reports");
						reports.addActionListener( new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								
							}
						});
			
						sub_data2.add(jobs);
						sub_data2.add(admin);
						sub_data2.add(line);
						sub_data2.add(media);
						sub_data2.add(schedule);
						sub_data2.add(reports);

						
						sub_data2.add(costs);
						sub_data2.add(prods);
						sub_data2.add(ro);
			
						JLabel customers = new JLabel("Customers");
						JLabel parts = new JLabel("Parts");
						customers.setForeground(Color.WHITE);	
						parts.setForeground(Color.WHITE);	
						sub_data.add(parts);
						sub_data.add(history);
						sub_data.add(calc);
						sub_data.add(close);
						sub_data.add(summary);
						sub_data.add(print);
						sub_data.add(export);
						sub_data.add(addparts);
						sub_data.add(customers);

			 			
						
						
								   
    						
						JScrollPane scrollPane2 = new JScrollPane(table2);
						JScrollPane scrollPane = new JScrollPane(table);

						//make sure the program exits when the frame closes
						sub_data2.add(b_entry);
						sub_data2.add(b_save);
						database_frame.add(sub_data, BorderLayout.NORTH);
						database_frame.add(sub_data2, BorderLayout.SOUTH);
						database_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						database_frame.setTitle("ProNorth \t Collision {Database}");
						database_frame.setSize(1000,500);
						

						//This will center the JFrame in the middle of the screen
						database_frame.setLocationRelativeTo(null);
						database_frame.setVisible(true);
					
						database_frame.add(scrollPane2, BorderLayout.WEST);
						database_frame.add(scrollPane, BorderLayout.EAST);

			
				}
		});

		


			sub.add(b_stats);
			sub.add(b_contacts);
			sub.add(b_database);
			sub.add(b_appoint);
			sub.add(b_arrive);
			sub.add(b_deliver);
			sub.setBackground(Color.BLACK);
			
				
			guiFrame.setIconImage(icon.getImage());
			guiFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			guiFrame.setTitle("ProNorth \t Collision");
			guiFrame.setSize(300,300);
			guiFrame.add(sub, BorderLayout.CENTER);
			guiFrame.pack();
			guiFrame.setResizable(true);
			guiFrame.setVisible(true);


		}
		else
		{
			if(!(usr.equals(usr_txt.getText()))) {		
				JOptionPane.showMessageDialog(null, "Wrong Information! Program Closing . . .");
				System.exit(0);
			}
		}}

	 });

	
 }
}


