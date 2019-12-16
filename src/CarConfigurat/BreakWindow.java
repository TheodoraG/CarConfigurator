package CarConfigurat;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class BreakWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	String imgPath2 = ".\\src\\CarConfigurat\\break.jpg";
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				try 
				{
					//Create object of OldWindow
					MainPage frame = new MainPage();
					//set frame visible true
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

	}
	
	public BreakWindow() {
		this.setSize(400,400);
		this.setTitle("Break");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new JLabel(new ImageIcon(imgPath2)));
		this.getContentPane().setLayout(new FlowLayout());
		
		JButton btnCarFrame = new JButton("Vehicles");
		btnCarFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainPage().setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		
		JTextArea text = new JTextArea();
		//JTextArea text2 = new JTextArea();
		
		Font font = new Font("TimesRoman", Font.BOLD,20);
		text.setFont(font);
		//text2.setFont(font);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu menuColor = new JMenu("Color");
		menuBar.add(menuColor);
		
		JRadioButtonMenuItem radButBlue = new JRadioButtonMenuItem("blue - 259.99 euro");
		JRadioButtonMenuItem radButGray = new JRadioButtonMenuItem("gray - 259.99 euro");
		JRadioButtonMenuItem radButBlack = new JRadioButtonMenuItem("black - 259.99 euro");
		JRadioButtonMenuItem radButWhite = new JRadioButtonMenuItem("white - 0 euro");
		radButBlue.setActionCommand("blue");
		radButGray.setActionCommand("gray");
		radButBlack.setActionCommand("black");
		radButWhite.setActionCommand("white");
		
		Break break1 = new Break(20000.00);
		
		radButBlue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Color("blue"));				
			}
		});
		
		
		radButGray.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Color("gray"));
			}
		});
		
		radButBlack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Color("black"));
				}
		});
		
		radButWhite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Color("white"));
			}
		});
		
		
		ButtonGroup grupCol = new ButtonGroup();
		menuColor.add(radButBlue);
		menuColor.add(radButGray);
		menuColor.add(radButBlack);
		menuColor.add(radButWhite);
		grupCol.add(radButBlue);
		grupCol.add(radButGray);
		grupCol.add(radButBlack);
		grupCol.add(radButWhite);
		
		JMenu menuMotor = new JMenu("Motor");
		menuBar.add(menuMotor);
		
		JRadioButtonMenuItem radButDiesel = new JRadioButtonMenuItem("Diesel - 400 euro");
		JRadioButtonMenuItem radButBenzine = new JRadioButtonMenuItem("Benzine - 300 euro");
		
		radButDiesel.setActionCommand("Diesel");
		radButBenzine.setActionCommand("Benzine");
		
		radButDiesel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Motor("diesel"));
			}
		});
		
		radButBenzine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Motor("benzine"));				
			}
		});
		
		menuMotor.add(radButDiesel);
		menuMotor.add(radButBenzine);
		
		ButtonGroup grupMotor = new ButtonGroup();
		grupMotor.add(radButDiesel);
		grupMotor.add(radButBenzine);
		
		
		JMenu menuInterior = new JMenu("Interior");
		menuBar.add(menuInterior);
		
		JRadioButtonMenuItem radButColorI = new JRadioButtonMenuItem("Black & Polyester - 29.99 + 99.99");
		JRadioButtonMenuItem radButMaterial = new JRadioButtonMenuItem("White & Leather - 50.00 + 199.99");
		
		radButColorI.setActionCommand("Black & Polyester");
		radButMaterial.setActionCommand("White & Leather");
		
		radButColorI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Interior("black","polyester"));
			}
		});
		
		radButMaterial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Interior("white","leather"));				
			}
		});
		
		menuInterior.add(radButColorI);
		menuInterior.add(radButMaterial);
		
		ButtonGroup grupInterior = new ButtonGroup();
		grupInterior.add(radButColorI);
		grupInterior.add(radButMaterial);
		
		
		JMenu menuTechnlogies = new JMenu("Technolgies");
		menuBar.add(menuTechnlogies);
		
		JCheckBoxMenuItem checkBoxNavigation = new JCheckBoxMenuItem("Navigation - 199.00");
		JCheckBoxMenuItem checkBoxBluetooth = new JCheckBoxMenuItem("Bluetooth - 199.00");
		JCheckBoxMenuItem checkBoxCruiseControl = new JCheckBoxMenuItem("CruiseControl - 199.00");
		
		checkBoxNavigation.setActionCommand("Navigation");
		checkBoxBluetooth.setActionCommand("Bluetooth");
		checkBoxCruiseControl.setActionCommand("CruiseControl");
		
		checkBoxNavigation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Tehnologies(true,false,false));
			}
		});
		
		checkBoxBluetooth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Tehnologies(false,true,false));				
			}
		});
		
		checkBoxCruiseControl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				break1.joinConfigurator(new Tehnologies(false,false,true));				
			}
		});
		
		menuTechnlogies.add(checkBoxNavigation);
		menuTechnlogies.add(checkBoxBluetooth);
		menuTechnlogies.add(checkBoxCruiseControl);
		
		//DefaultTableModel model = new DefaultTableModel(); 
		//JTable jt = new JTable(model);
		//model.addColumn("Color");
       // model.addColumn("Motor");
       // model.addColumn("Interior");
       // model.addColumn("Tech");
   
		
		JButton btnCalculatePrice = new JButton("Calculate price");
		btnCalculatePrice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String output = String.format(" %.8s", break1.getPrice());
				text.setText("Break - price: "+ output);
				//text2.setText("Sedan1 - configurations: "+ sedan1.getConfigSelected());
				JOptionPane.showMessageDialog(new JFrame(),break1.getConfigSelected());
			}
		});
		
		//JTable jt = new JTable(model);
		
		this.add(btnCarFrame);
		this.add(text);
		//this.add(text2);
		this.add(btnCalculatePrice);
		//this.add(jt);
		this.pack();
		this.setVisible(true);
	}
}
