package browser;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		
		FilbertBrowser fb = new FilbertBrowser();
		//Toolbars tb = new Toolbars();
		//f.add(tb , BorderLayout.NORTH);
		fb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fb.setSize(800,800);
		fb.setVisible(true);
		
	}

}
