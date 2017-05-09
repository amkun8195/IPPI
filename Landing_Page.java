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
import java.awt.event.ActionEvent;

public class Landing_Page extends JFrame {

	private JFrame frame;
	private JPanel contentPane;

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
		btnViewIsoTable.setBounds(54, 39, 121, 25);
		isoManagement.add(btnViewIsoTable);
	
		JPanel monitoring = new JPanel();
		tabbedPane.addTab("Monitoring", null, monitoring, null);
		monitoring.setLayout(null);
		
		JPanel administration = new JPanel();
		tabbedPane.addTab("Administrating", null, administration, null);
		administration.setLayout(null);
}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}