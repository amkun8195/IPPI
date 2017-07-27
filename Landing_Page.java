import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.DropMode;

public class Landing_Page extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField txtIsoManagementDesk;
	private JTextField monitoring_1;
	private JTextField txtTotalPhysicalMemory;
	private JTextField totalphysicalmemory;
	private JTextField txtPhysicalMemory;
	private JTextField txtFreePhysicalMemory;
	private JTextField freephysicalmemory;
	private JTextField txtVirtualMemory;
	private JTextField txtTotalVirtualMemory;
	private JTextField totalvirtualmemory;
	private JTextField txtFreeVirtualMemory;
	private JTextField freevirtualmemory;
	private JTextField txtLoadPercentage;
	private JTextField loadpercentage;
	private JTextField dateTime;
	private JLabel lblNewLabel;
	private JLabel lblDateAndTime;
	private JLabel lblNoteRefresh;
	private JTextField txtAdvanceMonitoring;
	private JLabel lblClickingTheButton;
	private JLabel lblWillOpenUp;
	private JButton JMX;
	private JButton ResourceMonitor;
	private JButton btnRefresh;
	private JTextField txtActivityLog;
	private JTextField txtRemoteMonitoringDesk;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Landing_Page window = new Landing_Page();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the application.
	 */
	public Landing_Page() {
//		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1381, 716);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mnFile.add(mntmEdit);
		
		JMenu mnSource = new JMenu("Source");
		menuBar.add(mnSource);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 0, 1339, 643);
		contentPane.add(tabbedPane);
	
		JPanel isoManagement = new JPanel();
		tabbedPane.addTab("ISO Management", null, isoManagement, null);
		isoManagement.setLayout(null);
		
		JButton btnViewIsoTable = new JButton("View ISO Table");
		btnViewIsoTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ISO8583Table2();
			}
		});
		btnViewIsoTable.setBounds(50, 157, 343, 56);
		isoManagement.add(btnViewIsoTable);
		
		JButton btnAddIsoContent = new JButton("Add ISO Content");
		btnAddIsoContent.setBounds(50, 254, 343, 56);
		isoManagement.add(btnAddIsoContent);
		
		JButton btnEditIsoContent = new JButton("Edit ISO Content");
		btnEditIsoContent.setBounds(50, 354, 343, 56);
		isoManagement.add(btnEditIsoContent);
		
		JButton btnDeleteIsoContent = new JButton("Delete ISO Content");
		btnDeleteIsoContent.setBounds(50, 456, 343, 56);
		isoManagement.add(btnDeleteIsoContent);
		
		JLabel lblCopyrightBy = new JLabel("Copyright ©2017 by Dr Hafizah's group, University of Malaya and Infopro Sdn Bhd. All rights reserved. This prototype is for private usage and may not be published,");
		lblCopyrightBy.setBounds(202, 553, 972, 21);
		isoManagement.add(lblCopyrightBy);
		
		JLabel lblReproducedBroadcastOr = new JLabel("reproduced, broadcast, or redistributed without permission. Terms and conditions applied.");
		lblReproducedBroadcastOr.setBounds(387, 573, 531, 16);
		isoManagement.add(lblReproducedBroadcastOr);
		
		txtIsoManagementDesk = new JTextField();
		txtIsoManagementDesk.setHorizontalAlignment(SwingConstants.CENTER);
		txtIsoManagementDesk.setFont(new Font("Tahoma", Font.ITALIC, 50));
		txtIsoManagementDesk.setEditable(false);
		txtIsoManagementDesk.setBackground(Color.LIGHT_GRAY);
		txtIsoManagementDesk.setText("ISO Management Desk");
		txtIsoManagementDesk.setBounds(12, 23, 1310, 81);
		isoManagement.add(txtIsoManagementDesk);
		txtIsoManagementDesk.setColumns(10);
		
		JTextArea ISODescription = new JTextArea();
		ISODescription.setLineWrap(true);
		ISODescription.setFont(UIManager.getFont("Button.font"));
		ISODescription.setBounds(522, 157, 754, 355);
		isoManagement.add(ISODescription);
	
		JPanel administration = new JPanel();
		tabbedPane.addTab("Administrating", null, administration, null);
		administration.setLayout(null);
		
			JPanel monitoring = new JPanel();
			tabbedPane.addTab("Monitoring", null, monitoring, null);
			monitoring.setLayout(null);
			
			monitoring_1 = new JTextField();
			monitoring_1.setText("Monitoring Processes Desk\r\n");
			monitoring_1.setHorizontalAlignment(SwingConstants.CENTER);
			monitoring_1.setFont(new Font("Tahoma", Font.ITALIC, 35));
			monitoring_1.setEditable(false);
			monitoring_1.setColumns(10);
			monitoring_1.setBackground(Color.LIGHT_GRAY);
			monitoring_1.setBounds(12, 25, 1310, 47);
			monitoring.add(monitoring_1);
			
			txtTotalPhysicalMemory = new JTextField();
			txtTotalPhysicalMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtTotalPhysicalMemory.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtTotalPhysicalMemory.setBackground(Color.LIGHT_GRAY);
			txtTotalPhysicalMemory.setEditable(false);
			txtTotalPhysicalMemory.setText("Total Physical Memory (in bytes)");
			txtTotalPhysicalMemory.setBounds(12, 145, 342, 47);
			monitoring.add(txtTotalPhysicalMemory);
			txtTotalPhysicalMemory.setColumns(10);
			
			totalphysicalmemory = new JTextField();
			totalphysicalmemory.setHorizontalAlignment(SwingConstants.CENTER);
			totalphysicalmemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
			totalphysicalmemory.setBackground(Color.WHITE);
			totalphysicalmemory.setEditable(false);
			totalphysicalmemory.setBounds(366, 145, 342, 47);
			monitoring.add(totalphysicalmemory);
			totalphysicalmemory.setColumns(10);
			
			//-------------------Monitoring Total Physical Memory-------------------------
				getTotalPhysicalMemory();
			
			//-------------------End of Monitoring Total Physical Memory-------------------------
				
			txtPhysicalMemory = new JTextField();
			txtPhysicalMemory.setBackground(Color.LIGHT_GRAY);
			txtPhysicalMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtPhysicalMemory.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtPhysicalMemory.setText("Physical Memory");
			txtPhysicalMemory.setBounds(12, 85, 696, 47);
			monitoring.add(txtPhysicalMemory);
			txtPhysicalMemory.setColumns(10);
			
			txtFreePhysicalMemory = new JTextField();
			txtFreePhysicalMemory.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtFreePhysicalMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtFreePhysicalMemory.setBackground(Color.LIGHT_GRAY);
			txtFreePhysicalMemory.setEditable(false);
			txtFreePhysicalMemory.setText("Free Physical Memory (in bytes)");
			txtFreePhysicalMemory.setBounds(12, 205, 342, 47);
			monitoring.add(txtFreePhysicalMemory);
			txtFreePhysicalMemory.setColumns(10);
			
			freephysicalmemory = new JTextField();
			freephysicalmemory.setHorizontalAlignment(SwingConstants.CENTER);
			freephysicalmemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
			freephysicalmemory.setBackground(Color.WHITE);
			freephysicalmemory.setEditable(false);
			freephysicalmemory.setBounds(366, 205, 342, 47);
			monitoring.add(freephysicalmemory);
			freephysicalmemory.setColumns(10);
			
			//-------------------Monitoring Free Physical Memory Size-------------------------
				getFreePhysicalMemory();
			
			//-------------------End of Monitoring Free Virtual Memory Size-------------------------
			
			txtVirtualMemory = new JTextField();
			txtVirtualMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtVirtualMemory.setEditable(false);
			txtVirtualMemory.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtVirtualMemory.setBackground(Color.LIGHT_GRAY);
			txtVirtualMemory.setText("Virtual Memory");
			txtVirtualMemory.setBounds(12, 265, 696, 47);
			monitoring.add(txtVirtualMemory);
			txtVirtualMemory.setColumns(10);
			
			txtTotalVirtualMemory = new JTextField();
			txtTotalVirtualMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtTotalVirtualMemory.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtTotalVirtualMemory.setBackground(Color.LIGHT_GRAY);
			txtTotalVirtualMemory.setText("Total Virtual Memory (in bytes)");
			txtTotalVirtualMemory.setBounds(12, 325, 342, 47);
			monitoring.add(txtTotalVirtualMemory);
			txtTotalVirtualMemory.setColumns(10);
			
			totalvirtualmemory = new JTextField();
			totalvirtualmemory.setHorizontalAlignment(SwingConstants.CENTER);
			totalvirtualmemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
			totalvirtualmemory.setBackground(Color.WHITE);
			totalvirtualmemory.setEditable(false);
			totalvirtualmemory.setBounds(366, 325, 342, 47);
			monitoring.add(totalvirtualmemory);
			totalvirtualmemory.setColumns(10);
			
			txtFreeVirtualMemory = new JTextField();
			txtFreeVirtualMemory.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtFreeVirtualMemory.setBackground(Color.LIGHT_GRAY);
			txtFreeVirtualMemory.setEditable(false);
			txtFreeVirtualMemory.setHorizontalAlignment(SwingConstants.CENTER);
			txtFreeVirtualMemory.setText("Free Virtual Memory (in bytes)");
			txtFreeVirtualMemory.setBounds(12, 385, 342, 47);
			monitoring.add(txtFreeVirtualMemory);
			txtFreeVirtualMemory.setColumns(10);
			
				//-------------------Monitoring Total Virtual Memory Size-------------------------
				getTotalVirtualMemory();
				//-------------------End of Monitoring Total Virtual Memory Size-------------------------
			
			freevirtualmemory = new JTextField();
			freevirtualmemory.setHorizontalAlignment(SwingConstants.CENTER);
			freevirtualmemory.setFont(new Font("Tahoma", Font.PLAIN, 16));
			freevirtualmemory.setBackground(Color.WHITE);
			freevirtualmemory.setEditable(false);
			freevirtualmemory.setBounds(366, 385, 342, 47);
			monitoring.add(freevirtualmemory);
			freevirtualmemory.setColumns(10);
			
			//-------------------Free Virtual Memory-------------------------
				getFreeVirtualMemory();
			//-------------------End of Free Virtual Memory-------------------------
			
			txtLoadPercentage = new JTextField();
			txtLoadPercentage.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtLoadPercentage.setEditable(false);
			txtLoadPercentage.setHorizontalAlignment(SwingConstants.CENTER);
			txtLoadPercentage.setBackground(Color.LIGHT_GRAY);
			txtLoadPercentage.setText("Load Percentage (%)");
			txtLoadPercentage.setBounds(12, 445, 696, 47);
			monitoring.add(txtLoadPercentage);
			txtLoadPercentage.setColumns(10);
			
			loadpercentage = new JTextField();
			loadpercentage.setFont(new Font("Tahoma", Font.PLAIN, 16));
			loadpercentage.setHorizontalAlignment(SwingConstants.CENTER);
			loadpercentage.setBounds(12, 502, 696, 47);
			monitoring.add(loadpercentage);
			loadpercentage.setColumns(10);
			
			//-------------------Monitoring Load Percentage--------------------------------
				getLoadPercentage();
			//-------------------End of Monitoring Load Percentage-------------------------
			
			dateTime = new JTextField();
			dateTime.setBackground(Color.WHITE);
			dateTime.setEditable(false);
			dateTime.setHorizontalAlignment(SwingConstants.CENTER);
			dateTime.setFont(new Font("Tahoma", Font.BOLD, 20));
			dateTime.setBounds(740, 179, 582, 47);
			monitoring.add(dateTime);
			dateTime.setColumns(10);
		
			//-------------------Monitoring Date and Time-------------------------	
				getDateTime();  
			//-------------------End of Monitoring Date and Time-------------------------
			
			lblNewLabel = new JLabel("All monitorization are based on the current");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(840, 116, 395, 25);
			monitoring.add(lblNewLabel);
			
			lblDateAndTime = new JLabel("date and time (GMT +8) :");
			lblDateAndTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblDateAndTime.setBounds(932, 145, 232, 21);
			monitoring.add(lblDateAndTime);
			
			lblNoteRefresh = new JLabel("Note : Refresh may take up to 5 seconds");
			lblNoteRefresh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			lblNoteRefresh.setBounds(740, 281, 382, 25);
			monitoring.add(lblNoteRefresh);
			
			txtAdvanceMonitoring = new JTextField();
			txtAdvanceMonitoring.setBackground(Color.LIGHT_GRAY);
			txtAdvanceMonitoring.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtAdvanceMonitoring.setHorizontalAlignment(SwingConstants.CENTER);
			txtAdvanceMonitoring.setText("Advance Monitoring");
			txtAdvanceMonitoring.setBounds(740, 325, 582, 47);
			monitoring.add(txtAdvanceMonitoring);
			txtAdvanceMonitoring.setColumns(10);
			
			lblClickingTheButton = new JLabel("Clicking the button below will open up");
			lblClickingTheButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblClickingTheButton.setBounds(874, 385, 278, 25);
			monitoring.add(lblClickingTheButton);
			
			lblWillOpenUp = new JLabel("a new monitoring window");
			lblWillOpenUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblWillOpenUp.setBounds(911, 407, 197, 25);
			monitoring.add(lblWillOpenUp);
			
			JMX = new JButton("Monitoring via JMX");
			JMX.setFont(new Font("Tahoma", Font.PLAIN, 20));
			JMX.setBounds(740, 449, 265, 47);
			monitoring.add(JMX);
			
			ResourceMonitor = new JButton("Open Resource Monitor");
			ResourceMonitor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					-------------------Monitoring via Resource Monitor Application-------------------------
					try{
	     					Process proc = Runtime.getRuntime().exec("cmd /C \"perfmon /res");
	     			        proc.getInputStream();
	     			       
	     				}catch (Exception exp) {
	     					exp.printStackTrace();
	     				}
				}
			});
			ResourceMonitor.setFont(new Font("Tahoma", Font.PLAIN, 20));
			ResourceMonitor.setBounds(740, 502, 581, 47);
			monitoring.add(ResourceMonitor);
			
			btnRefresh = new JButton("Refresh");
			btnRefresh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					{
					getFreePhysicalMemory();
					getLoadPercentage();
					getFreeVirtualMemory();
					getDateTime();
				 
					}
				}	
			});
			btnRefresh.setBounds(952, 239, 197, 40);
			monitoring.add(btnRefresh);
			
			JButton btnPrintReport = new JButton("Print Report");
			btnPrintReport.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnPrintReport.setBounds(432, 562, 582, 38);
			monitoring.add(btnPrintReport);
			
			JButton btnRefresh_1 = new JButton("something");
			btnRefresh_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					getTotalPhysicalMemory(); 
					getFreePhysicalMemory();
					getTotalVirtualMemory();
					getFreeVirtualMemory();
					getDateTime();
					getLoadPercentage();
				}
			});
			btnRefresh_1.setBounds(1017, 445, 304, 47);
			monitoring.add(btnRefresh_1);
			
			JPanel RemoteMonitoring = new JPanel();
			tabbedPane.addTab("Remote Monitoring", null, RemoteMonitoring, null);
			RemoteMonitoring.setLayout(null);
			
			JTextArea ActivityLog = new JTextArea();
			ActivityLog.setFont(new Font("Monospaced", Font.PLAIN, 18));
			ActivityLog.setText("Wed 25/05/2017\r\n10:30 AM\r\n\r\n10.42am - Connection Terminated\r\n--------------------------------------\r\n10.20am - Successful Login\r\n--------------------------------------\r\n10.15am - Attempt Failed\r\n--------------------------------------\r\n10.14am - Attempt Failed\r\n--------------------------------------\r\n10.00am - Connection Enstablished");
			ActivityLog.setLineWrap(true);
			ActivityLog.setBounds(659, 284, 663, 249);
			RemoteMonitoring.add(ActivityLog);
			
			txtActivityLog = new JTextField();
			txtActivityLog.setBackground(Color.GRAY);
			txtActivityLog.setHorizontalAlignment(SwingConstants.CENTER);
			txtActivityLog.setFont(new Font("Tahoma", Font.BOLD, 30));
			txtActivityLog.setEditable(false);
			txtActivityLog.setText("Activity Log");
			txtActivityLog.setBounds(659, 236, 663, 35);
			RemoteMonitoring.add(txtActivityLog);
			txtActivityLog.setColumns(10);
			
			txtRemoteMonitoringDesk = new JTextField();
			txtRemoteMonitoringDesk.setBackground(Color.GRAY);
			txtRemoteMonitoringDesk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
			txtRemoteMonitoringDesk.setEditable(false);
			txtRemoteMonitoringDesk.setHorizontalAlignment(SwingConstants.CENTER);
			txtRemoteMonitoringDesk.setText("Remote Monitoring Desk");
			txtRemoteMonitoringDesk.setBounds(12, 13, 1310, 47);
			RemoteMonitoring.add(txtRemoteMonitoringDesk);
			txtRemoteMonitoringDesk.setColumns(10);
			
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setBounds(12, 333, 593, 35);
			RemoteMonitoring.add(textField);
			textField.setColumns(10);
			
			JLabel lblComputerName = new JLabel("Computer Username :");
			lblComputerName.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblComputerName.setHorizontalAlignment(SwingConstants.LEFT);
			lblComputerName.setVerticalAlignment(SwingConstants.TOP);
			lblComputerName.setBounds(12, 299, 239, 25);
			RemoteMonitoring.add(lblComputerName);
			
			JLabel lblIpAddress = new JLabel("IP Address :");
			lblIpAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblIpAddress.setBounds(12, 391, 198, 25);
			RemoteMonitoring.add(lblIpAddress);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setBounds(12, 429, 593, 35);
			RemoteMonitoring.add(textField_1);
			textField_1.setColumns(10);
			
			JButton btnReset = new JButton("Reset");
			btnReset.setBounds(12, 477, 287, 47);
			RemoteMonitoring.add(btnReset);
			
			JButton btnConnect = new JButton("Connect");
			btnConnect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try{
						Process proc = Runtime.getRuntime().exec("cmd /C \"Date /T & Time /T");
				        InputStream is = proc.getInputStream();
				        
				        int i = -1;
				        StringBuilder buf = new StringBuilder();
				        while ((i = is.read()) != -1) {
				        	
				            buf.append((char)i);
				          
				        }
				        
				        ActivityLog.setText(buf.toString()  );
				        proc.waitFor();
					}catch (Exception exp) {
						exp.printStackTrace();
					}      		
					ActivityLog.append("---------------------");
					ActivityLog.append("Connection Failed");
					ActivityLog.append("---------------------");
				}
			});
			btnConnect.setBounds(318, 477, 287, 47);
			RemoteMonitoring.add(btnConnect);
			
			JLabel lblName = new JLabel("Name :");
			lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblName.setBounds(142, 112, 68, 16);
			RemoteMonitoring.add(lblName);
			
			JLabel lblTypeOfConnection = new JLabel("Type of Connection :");
			lblTypeOfConnection.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblTypeOfConnection.setBounds(32, 130, 174, 16);
			RemoteMonitoring.add(lblTypeOfConnection);
			
			JLabel lblCreatedOn = new JLabel("Created On :");
			lblCreatedOn.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblCreatedOn.setBounds(97, 147, 113, 25);
			RemoteMonitoring.add(lblCreatedOn);
			
			JLabel lblLastModified = new JLabel("Last Modified :");
			lblLastModified.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblLastModified.setBounds(78, 171, 132, 16);
			RemoteMonitoring.add(lblLastModified);
			
			JLabel lblAcer = new JLabel("Acer");
			lblAcer.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAcer.setBounds(210, 114, 68, 12);
			RemoteMonitoring.add(lblAcer);
			
			JLabel lblRemoteConnection = new JLabel("Remote Connection");
			lblRemoteConnection.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblRemoteConnection.setBounds(210, 131, 132, 16);
			RemoteMonitoring.add(lblRemoteConnection);
			
			JLabel lblamthMay = new JLabel("2.37pm 23th May 2017");
			lblamthMay.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblamthMay.setBounds(210, 152, 187, 16);
			RemoteMonitoring.add(lblamthMay);
			
			JLabel lblamthMay_1 = new JLabel("7.01am 24th May 2017");
			lblamthMay_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblamthMay_1.setBounds(210, 172, 164, 16);
			RemoteMonitoring.add(lblamthMay_1);
			
			JButton btnPrintReport_1 = new JButton("Print Report");
			btnPrintReport_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnPrintReport_1.setBounds(837, 546, 315, 35);
			RemoteMonitoring.add(btnPrintReport_1);
}
	
	
// -----------------------------------------Method of Monitoring---------------------------------------
	public void getFreeVirtualMemory(){
		try{
			Process proc = Runtime.getRuntime().exec("cmd /C \"wmic os get FreeVirtualMemory /format : table");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	
	            buf.append((char)i);
	          
	        }
	        freevirtualmemory.setText(buf.toString());
	        proc.waitFor();
	       
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void getDateTime(){
		try{
			Process proc = Runtime.getRuntime().exec("cmd /C \"Date /T & Time /T");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	
	            buf.append((char)i);
	          
	        }
	        
	        dateTime.setText(buf.toString()  );
	        proc.waitFor();
		}catch (Exception exp) {
			exp.printStackTrace();
		}      		
    }
	
	public void getFreePhysicalMemory(){
		try{
			Process proc = Runtime.getRuntime().exec("cmd /C \"wmic OS get FreePhysicalMemory /format : table");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	
	            buf.append((char)i);
	          
	        }
	        freephysicalmemory.setText(buf.toString());
	        proc.waitFor();
	       
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void getTotalPhysicalMemory(){
		try{
			Process proc = Runtime.getRuntime().exec("wmic ComputerSystem get TotalPhysicalMemory /format : table");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	
	            buf.append((char)i);
	          
	        }
	        totalphysicalmemory.setText(buf.toString());
	        proc.waitFor();
	       
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void getTotalVirtualMemory(){
		try{
			Process proc = Runtime.getRuntime().exec("cmd /C \"wmic OS get TotalVirtualMemorySize /format : table");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	  
	            buf.append((char)i);
	          
	        }
	        totalvirtualmemory.setText(buf.toString());
	        proc.waitFor();
	       
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public void getLoadPercentage(){
		try{

			Process proc = Runtime.getRuntime().exec("cmd /C \"wmic cpu get loadpercentage /format : Value");
	        InputStream is = proc.getInputStream();
	        
	        int i = -1;
	        StringBuilder buf = new StringBuilder();
	        while ((i = is.read()) != -1) {
	        	
	            buf.append((char)i);
	          
	        }
	        loadpercentage.setText(buf.toString());
	        proc.waitFor();

	       
		}catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
