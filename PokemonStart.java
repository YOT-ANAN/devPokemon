import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PokemonStart extends JFrame{
	private GUIParser guiParser;
	private JPanel p;
	private JButton btnStart;
	private JLabel lblName;
	private JLabel lblWelcome;
	private JTextField tfName;
	public PokemonStart(String title) {
		super(title);
		
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		lblWelcome = new JLabel("Welcome to the world of POKeMON");
		lblName = new JLabel("Name :");
		tfName	= new JTextField(10);
		btnStart = new JButton("PRESS START");
		//btnStart.setBounds(200, 500, 193, 77);
		//btnStart.setPreferredSize(new Dimension(50,30));
		
		AddPanel gc = new AddPanel();
		gc.addItem(p,lblWelcome,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblName,0,1,1,1,GridBagConstraints.EAST);
		gc.addItem(p,tfName,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnStart,1,2,1,1,GridBagConstraints.CENTER);
		
		btnStart.addActionListener(new ButtonListener());
		add(p);
		
		
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnStart && tfName.getText().length()>0) {			
					PokemonSelect pokemonGo = new PokemonSelect("Pokemon Select",tfName.getText());
					pokemonGo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					pokemonGo.setSize(800,600);
					pokemonGo.setVisible(true);
					dispose();
				}
				else {
					
				}
		}
	}
	public static void main(String[] args) {
		PokemonStart pokemonStart = new PokemonStart("START");
		pokemonStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pokemonStart.setSize(800,600);
		pokemonStart.setVisible(true);
		//pokemonStart.pack();
		
	}
}
