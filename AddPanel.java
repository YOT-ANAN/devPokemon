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
		gc.gridx=x; //����˹� row
		gc.gridy=y; //����˹� colum
		//gc.gridwidth = width; 
		//gc.gridheight = height; 
		gc.insets = new Insets(0, 5, 5, 0); // ��鹪�ͧ��ҧ 5 pixel �ͺ� 
		gc.anchor = align; // ������ component �Դ份���˹
		gc.fill =  GridBagConstraints.NONE; // ��������������ͧ
		p.add(model1,gc);
		
	}

}
