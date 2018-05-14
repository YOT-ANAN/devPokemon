import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PokemonSelect extends JFrame{
	private JPanel p;
	private JLabel lblHeader;
	private JLabel lblB;
	private JLabel lblH;
	private JLabel lblS;
	private JButton btnB;
	private JButton btnH;
	private JButton btnS;
	private GUIParser guiParser;
	public PokemonSelect (String title,String pokemonTrainer) {
		super(title);
		guiParser = new GUIParser(pokemonTrainer); //สร้าง guiParser สำหรัลทำงานเบื้องหลังทั้งหมด ส่งข้อมูลระหว่าง jframe
		
		p= new JPanel();
		p.setLayout(new GridBagLayout());
		btnB = new JButton();
		btnH= new JButton();
		btnS= new JButton();
		lblHeader = new JLabel("Select your Pokemon");
		lblB = new JLabel("Bulbasaur");
		lblH = new JLabel("Hitokage");
		lblS = new JLabel("Squirtle");
		btnB.setIcon(new ImageIcon("C:\\Users\\toY\\Desktop\\pokemon_picture\\Bulbasaur.gif"));
		btnB.setPreferredSize(new Dimension(200,300));
		btnH.setIcon(new ImageIcon("C:\\Users\\toY\\Desktop\\pokemon_picture\\hitokage.gif"));
		btnH.setPreferredSize(new Dimension(200,300));
		btnS.setIcon(new ImageIcon("C:\\Users\\toY\\Desktop\\pokemon_picture\\Squirtle.gif"));
		btnS.setPreferredSize(new Dimension(200,300));
		//validate();

		
		AddPanel gc = new AddPanel();
		gc.addItem(p,lblHeader,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnB,0,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnH,1,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnS,2,1,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblB,0,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblH,1,2,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,lblS,2,2,1,1,GridBagConstraints.CENTER);
		
		
		
		btnB.addActionListener(new ButtonListener());
		btnH.addActionListener(new ButtonListener());
		btnS.addActionListener(new ButtonListener());
		add(p);
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				int n=1; 
				if(e.getSource()==btnB){
					n=guiParser.selectPokemon("Bulbasaur");
				}
				else if(e.getSource()==btnH){
					n=guiParser.selectPokemon("Hitokage");
				}
				else if(e.getSource()==btnS){
					n=guiParser.selectPokemon("Squirtle");
				}
				//เช็ค ผลการตอบ yes/no  โดย  Yes=0  No=1
				if(n==0) {
					PokemonGo pokemonGo = new PokemonGo("Main Menu", guiParser);
					pokemonGo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					pokemonGo.setSize(800,600);
					pokemonGo.setVisible(true);
					dispose();
				}
				
				
			
		}
	}
}
