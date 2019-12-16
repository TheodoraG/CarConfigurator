package CarConfigurat;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Fiecare tip de masina are propriul frame, de unde
 * utilizatorul poate selecta optiunile dorite.
 */

public class MainPage extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String imgPath = ".\\src\\CarConfigurat\\car.jpg";
	
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
	
	public MainPage() {
		this.setSize(400,400);
		this.setTitle("CarConfigurator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new JLabel(new ImageIcon(imgPath)));
		this.getContentPane().setLayout(new FlowLayout());
		
		JButton btnSedanFrame = new JButton("Sedan - from 30000 euro");
		btnSedanFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SedanWindow frame = new SedanWindow();
				frame.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		
		JButton btnSuvFrame = new JButton("Suv - from 50000 euro");
		btnSuvFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuvWindow frame = new SuvWindow();
				frame.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		
		JButton btnCoupeFrame = new JButton("Coupe - from 40000 euro");
		btnCoupeFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoupeWindow frame = new CoupeWindow();
				frame.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		
		JButton btnBreakFrame = new JButton("Break - from 20000 euro");
		btnBreakFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BreakWindow frame = new BreakWindow();
				frame.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		JButton btnHatchbackFrame = new JButton("Hatchback - from 25000 euro");
		btnHatchbackFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HatchbackWindow frame = new HatchbackWindow();
				frame.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
		});
		
		this.add(btnSedanFrame);
		this.add(btnSuvFrame);
		this.add(btnCoupeFrame);
		this.add(btnBreakFrame);
		this.add(btnHatchbackFrame);
		this.pack();
		this.setVisible(true);
	}

}
