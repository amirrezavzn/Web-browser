package browser;

import java.applet.AudioClip;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.DefaultEditorKit;

import browser.*;

public class FilbertBrowser extends JFrame{
	Clip clip;
	AudioInputStream InputStream;
	public Integer x=0;
	String[] str = null;
	String s ;
	//char [] ch ;
	JToolBar toolbar = new JToolBar();
	JToolBar toolbar2 = new JToolBar();
	public String st = " www.gsm.ir" , url="www.google.com" ;
	JTextField textfield ;
	JMenu  closetab , history ;
	public JEditorPane ed = new JEditorPane();
	JMenuBar menuBar;
	JMenu menu, menu2 , menu3;
	JMenuItem menuItem;
	public FilbertBrowser() throws MalformedURLException, IOException{
		
	super("Filbert Browser");
	//setLayout(new FlowLayout());
	//Create the menu bar.
	
	
	

	menuBar = new JMenuBar();
	menu = new JMenu("File");
	menu.setMnemonic(KeyEvent.VK_F);
	menu.getAccessibleContext().setAccessibleDescription(
	        "empty");
	ImageIcon files = new ImageIcon("folder24.PNG");
	menu.setIcon(files);
	menuBar.add(menu);
	menu.setToolTipText("new & close tab _ print _ history _alt+F");
	//a group of JMenuItems

	menuItem = new JMenuItem("New tab",
	                         new ImageIcon("add16.PNG"));
	menuItem.setMnemonic(KeyEvent.VK_N);
	menuItem.setToolTipText("adds a new tab to toolbar_alt+N");
	menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		toolbar2.add(new JButton("new tab"));
	}
	});
	menu.add(menuItem);
	
	
	closetab = new JMenu("Close tab");
	closetab.setIcon(new ImageIcon("Close16.PNG"));
	menuItem = new JMenuItem("home",new ImageIcon("Delete16.PNG"));
    closetab.setMnemonic(KeyEvent.VK_D);
	//closetab.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	//menuItem.getAccessibleContext().setAccessibleDescription("This Item closes present tab");
	closetab.setToolTipText("closes present tab from toolbar_alt+D");
	/*menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	closetab.add(menuItem);
	menu.add(closetab);
	menu.addSeparator();
	
	history = new JMenu("History");
	history.setMnemonic(KeyEvent.VK_H);
	history.setIcon(new ImageIcon("Data-icon4.PNG"));
	history.setToolTipText("shows the history_alt+H");
	menuItem = new JMenuItem("home");
	/*menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	history.add(menuItem);
	menu.add(history);
	
	
	menuItem = new JMenuItem("print",new ImageIcon("Print-icon.PNG"));
	menuItem.setMnemonic(KeyEvent.VK_P);
	menuItem.setToolTipText("prints present tab");
	/*menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	menu.add(menuItem);
	
	

	menu2 = new JMenu ("Edit");
	menu2.setMnemonic(KeyEvent.VK_A);
	menu2.getAccessibleContext().setAccessibleDescription(
	        "empty");
	ImageIcon edit = new ImageIcon("Edit24.PNG");
	menu2.setIcon(edit);
	menuBar.add(menu);
	menu2.setToolTipText("copy _ paste _ edit home");
	
	menuItem = new JMenuItem(new DefaultEditorKit.CopyAction());
	menuItem.setText("copy");
	menuItem.setIcon(new ImageIcon("copy16.PNG"));
	menuItem.setMnemonic(KeyEvent.VK_P);
	menuItem.setToolTipText("copys the last thing which you choosed");
	/*menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	menu2.add(menuItem);
	
	menuItem =new JMenuItem(new DefaultEditorKit.PasteAction());
	menuItem.setText("Paste");
	menuItem.setIcon(new ImageIcon("Paste16.PNG"));
	menuItem.setMnemonic(KeyEvent.VK_P);
	menuItem.setToolTipText("pastes the last thing which you copied");
	menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		/*try {
			 clip = AudioSystem.getClip();
			 
			try {
				InputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("f2.wav"));
						
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				clip.open(InputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clip.start();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		textfield.setText(DefaultEditorKit.pasteAction);
	}
	});
	menu2.add(menuItem);
	
	menuItem = new JMenuItem("Edit Home",new ImageIcon("Wrench16.PNG"));
	menuItem.setMnemonic(KeyEvent.VK_P);
	menuItem.setToolTipText("edits the address of your home");
	menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		
		textfield.setText("Type the URL of your Home");
	//	st=textfield.event.getActionCommand();
	}
	});
	menu2.add(menuItem);
	
	menuBar.add(menu2);
	
	menu3 = new JMenu("Help");
	ImageIcon help = new ImageIcon("Info24.PNG");
	menu3.setIcon(help);
	menuItem = new JMenuItem("About", new ImageIcon("Info16.PNG"));
	menuItem.setToolTipText("Information about the programmer");
	menuItem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		JFrame fr = new JFrame("About");
		JTextArea ta= new JTextArea(100,50);
		ta.setText("\t\tprogrammer : amirreza vaezian\t\n\n\t\tEmail : amirreza.vaezian@gmail.com");
		
		ta.setEnabled(false);
		ta.setDisabledTextColor(Color.blue);
		fr.add(ta);
		//fr.setBackground(Color.YELLOW);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(610,100);
		fr.setVisible(true);
	}
	});
	menu3.add(menuItem);
	
	menuBar.add(menu3);
	//a group of radio button menu items
	//menu.addSeparator();
	Container c1 = getContentPane();
	setJMenuBar(menuBar);
	
	
	JPanel panel = new JPanel();
	panel.setLayout(new BorderLayout());
	JButton back , forward , refresh , home , go , bookmark ;
	textfield = new JTextField(30) ;
	Icon back1 , forward1 , refresh1 , home1 , go1 , bookmark1 , bookmark2 ;
	back1 = new ImageIcon("arrow_left.PNG");
	forward1 = new ImageIcon("arrow_right.PNG");
	refresh1 = new ImageIcon("refresh.PNG");
	home1 = new ImageIcon("home.PNG");
	go1 = new ImageIcon("search_lense.PNG");
	bookmark1 = new ImageIcon("star_3.PNG");
	bookmark2 = new ImageIcon("star.PNG");                             
    
    back = new JButton(back1);
	back.setToolTipText("BACK PAGE");
	/*back.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	forward = new JButton(forward1);
	forward.setToolTipText("FORWARD PAGE");
	/*forward.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	refresh = new JButton(refresh1);
	refresh.setToolTipText("REFRESH PAGE");
	/*refresh.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	home = new JButton(home1);
	home.setToolTipText("HOME PAGE");
	/*home.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	go = new JButton(go1);
	go.setToolTipText("SEARCH");
	/*go.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){dastoorat}
	});*/
	bookmark = new JButton(bookmark1);
	bookmark.setToolTipText("BOOKMARK PAGE");
	bookmark.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		bookmark.setIcon(bookmark2);
	//dastoorate digar	
	}
	});
	
	textfield.setFont(new Font("serif" , Font.BOLD , 20));
	textfield.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent event){
		if(event.getActionCommand()!=null) {textfield.setFont(new Font("serif" , Font.ITALIC , 20));
		url= event.getActionCommand();}
		/*for(int i=0; i<url.length();i++){
			if(url.charAt(i)=='.'){
				for(int j =0 ; url.charAt(i+j)=='.';j++){
					ch[j]=url.charAt(i+j);
				}
			}
		}*/
		s = url;
		str= s.split("www.");
		
		x++;
		
		
		//Tabs tb = new Tabs(url,x,str);
	}
	});
	
	
	toolbar.add(back);
	toolbar.add(forward);
	toolbar.addSeparator();
	toolbar.add(refresh);
	toolbar.addSeparator();
	toolbar.add(home);   
	toolbar.addSeparator();
	toolbar.add(textfield);
	toolbar.addSeparator();
	toolbar.add(go);
	toolbar.addSeparator();
	toolbar.add(bookmark);
	toolbar.setEnabled(false);
	toolbar.setFloatable(false);
	//toolbar.setRollover(true);
	//toolbar.setAlignmentY(RIGHT_ALIGNMENT);

	JButton firsttab = new JButton("HOME");
	firsttab.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			textfield.setText(st);
		}
	});
	
	toolbar2.add(firsttab);
	toolbar2.setEnabled(false);
	toolbar2.setFloatable(false);

	
		
	panel.add(toolbar,BorderLayout.NORTH);
	panel.add(toolbar2,BorderLayout.SOUTH);
	//c1.add(toolbar,BorderLayout.N);
	c1.add(panel, BorderLayout.NORTH);
	
	//textfield.setText(url+"mm");
	/*ed.setPage(new URL("http://"+url));
	ed.setContentType("text/html");
	ed.setEditable(false);
	c1.add(ed,BorderLayout.SOUTH);*/
	
	}
}
