import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPanel;


public class AddPanel {
	private int[] columnWidths;
	private int[] rowHeights;
	public AddPanel() {
		this.columnWidths = new int[]{0, 0, 0, 0, 0};
		this.rowHeights = new int[]{0, 0, 0, 0};
	}
	public void addItem(JPanel p,Component model1,int x,int y
			,int width,int height,int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx=x; //ตำเเหน่ง row
		gc.gridy=y; //ตำเเหน่ง colum
		//gc.gridwidth = width; 
		//gc.gridheight = height; 
		gc.insets = new Insets(0, 5, 5, 0); // เว้นช่องว่าง 5 pixel รอบๆ 
		gc.anchor = align; // คั้งให้ component ขิดไปฝั่งไหน
		gc.fill =  GridBagConstraints.NONE; // การเติมให้เต็มช่อง
		p.add(model1,gc);
		
	}

}
