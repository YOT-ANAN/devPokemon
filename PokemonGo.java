import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;



public class PokemonGo extends JFrame{
	private GUIParser guiParser;
	
	private JPanel p;
	private JButton btnFeed;
	private JButton btnExcercise;
	private JButton btnBattle;
	private JTextArea taDetail;
	private JLabel imgLabel;


	public PokemonGo(String title,GUIParser guiParser){
		super(title);
		this.guiParser=guiParser;
		guiParser.printPokemons();
		p = new JPanel();
		p.setLayout(new GridBagLayout());
		btnFeed = new JButton("feed");
		btnExcercise = new JButton("Excercise");
		btnBattle = new JButton("Battle");
		taDetail = new JTextArea(10,2);
		imgLabel = new JLabel(new ImageIcon(guiParser.getImgPath()));
		
		
		AddPanel gc = new AddPanel();
		gc.addItem(p,taDetail,0,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,imgLabel,1,0,1,1,GridBagConstraints.CENTER);
		gc.addItem(p,btnFeed,0,1,1,1,GridBagConstraints.WEST);
		gc.addItem(p,btnExcercise,0,1,1,1,GridBagConstraints.EAST);
		gc.addItem(p,btnBattle,1,2,1,1,GridBagConstraints.CENTER);
		
		taDetail.setText(guiParser.printPokemons());
		btnFeed.addActionListener(new ButtonListener());
		btnExcercise.addActionListener(new ButtonListener());
		btnBattle.addActionListener(new ButtonListener());

		add(p);
	
		
		//pack();
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnFeed) {			
					guiParser.feedPokemon(1);
					taDetail.setText(guiParser.printPokemons());
					//taDetail.setText("");
					//System.out.println("F");
				}
				else if(e.getSource()==btnExcercise){
					guiParser.excercisePokemon(0);
					taDetail.setText(guiParser.printPokemons());
					//taDetail.setText("");
					//System.out.println("X");
				}
				else if(e.getSource()==btnBattle){
					
					guiParser.dicoverRival();
					
					JOptionPane.showMessageDialog(null,
						    "You Pokemon Rival is : "+guiParser.getRivalPokemonName()+"",
						    "Inane custom dialog",
						    JOptionPane.INFORMATION_MESSAGE);
					guiParser.pokemonBattle();
					taDetail.setText(guiParser.printPokemons());
					//taDetail.setText("");
					//System.out.println("X");
				}
		}
	}

	/*
	public static void creatPokemons(ArrayList<Pokemon> pokemons,int x) {
		for(int i=0; i<x; ++i){
			pokemons.add(new Pikachu());
			
		}
	}
	
	public static String[][] arraylistToString(ArrayList<Pokemon> pokemons) {
		String [][]data = new String [pokemons.size()][3];
		int i=0;
		for(Pokemon pokemon : pokemons ) {
			data[i][0] = pokemon.getName();
			data[i][1] = Double.toString(pokemon.getHealth());
			data[i][2] = Double.toString(pokemon.getHealth());
			i++;
		}
		return data;
	}*/

	
}
