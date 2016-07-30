package me.devillord.tixirpg;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel layout2,
				   layout3,
				   playLayout,
				   inventoryLayout,
				   fightingLayout,
				   shopLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		layout2 = new JPanel();
		layout3 = new JPanel();
		playLayout = new JPanel();
		inventoryLayout = new JPanel();
		fightingLayout = new JPanel();
		shopLayout = new JPanel();
		
	    final CardLayout card=new CardLayout();
		setContentPane(contentPane);
		
		layout2.setLayout(null);
		layout3.setLayout(null);
		playLayout.setLayout(null);
		inventoryLayout.setLayout(null);
		shopLayout.setLayout(null);
		fightingLayout.setLayout(null);
		
		contentPane.setLayout(card);
		contentPane.add(layout2,"1");
		contentPane.add(layout3,"2");
		contentPane.add(playLayout,"play");
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblInventory.setBounds(20, 234, 75, 17);
		playLayout.add(lblInventory);
		
		JLabel lblShop = new JLabel("Shop");
		lblShop.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblShop.setBounds(105, 234, 38, 17);
		playLayout.add(lblShop);
		
		JLabel lblEnhance = new JLabel("Enhance");
		lblEnhance.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblEnhance.setBounds(153, 234, 60, 17);
		playLayout.add(lblEnhance);
		
		JLabel lblForge = new JLabel("Forge");
		lblForge.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblForge.setBounds(223, 234, 45, 17);
		playLayout.add(lblForge);
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setBounds(10, 11, 414, 14);
		playLayout.add(lblNickname);
		
		JLabel lblLvl = new JLabel("Level: 1");
		lblLvl.setBounds(10, 30, 414, 14);
		playLayout.add(lblLvl);
		
		JLabel lblExp = new JLabel("Exp: 0");
		lblExp.setBounds(10, 49, 414, 14);
		playLayout.add(lblExp);
		
		JLabel lblHp = new JLabel("HP: ");
		lblHp.setBounds(10, 67, 414, 14);
		playLayout.add(lblHp);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 92, 414, 7);
		playLayout.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(10, 92, 1, 137);
		playLayout.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(423, 92, 1, 137);
		playLayout.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(10, 228, 414, 7);
		playLayout.add(separator_3);
		
		JLabel lblSurvive = new JLabel("<html><b>Survive:</b> 100%</html>");
		lblSurvive.setBounds(20, 100, 136, 14);
		playLayout.add(lblSurvive);
		
		JLabel lblCritRate = new JLabel("<html><b>Crit Rate:</b> 100%</html>");
		lblCritRate.setBounds(20, 115, 136, 14);
		playLayout.add(lblCritRate);
		
		JLabel lblDefense = new JLabel("<html><b>Defense:</b> 100000</html>");
		lblDefense.setBounds(20, 130, 136, 14);
		playLayout.add(lblDefense);
		
		JLabel lblAttack = new JLabel("<html><b>Attack:</b> 100000</html>");
		lblAttack.setBounds(20, 145, 136, 14);
		playLayout.add(lblAttack);
		
		JLabel lblEvasion = new JLabel("<html><b>Evasion:</b> 100%</html>");
		lblEvasion.setBounds(20, 170, 136, 14);
		playLayout.add(lblEvasion);
		
		JLabel lblluck = new JLabel("<html><b>Luck: </b>100%</html>");
		lblluck.setBounds(20, 185, 136, 14);
		playLayout.add(lblluck);
		
		JLabel lblcritDmgx = new JLabel("<html><b>Crit Dmg: </b>2x</html>");
		lblcritDmgx.setBounds(20, 200, 135, 14);
		playLayout.add(lblcritDmgx);
		
		JLabel lblStrength = new JLabel("<html><b>Strength:</b> 999</html>");
		lblStrength.setBounds(166, 100, 84, 14);
		playLayout.add(lblStrength);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(252, 100, 49, 14);
		playLayout.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.setBounds(303, 100, 49, 14);
		playLayout.add(button);
		
		JLabel lblluck_1 = new JLabel("<html><b>Luckness:</b> 999</html>");
		lblluck_1.setBounds(166, 115, 84, 14);
		playLayout.add(lblluck_1);
		
		JButton button_1 = new JButton("+");
		button_1.setBounds(252, 115, 49, 14);
		playLayout.add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(303, 115, 49, 14);
		playLayout.add(button_2);
		
		JLabel lbldexterity = new JLabel("<html><b>Dexterity:</b> 999</html>");
		lbldexterity.setBounds(166, 130, 84, 14);
		playLayout.add(lbldexterity);
		
		JButton button_3 = new JButton("+");
		button_3.setBounds(252, 130, 49, 14);
		playLayout.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(303, 130, 49, 14);
		playLayout.add(button_4);
		
		JLabel lblvitality = new JLabel("<html><b>Vitality:</b> 999</html>");
		lblvitality.setBounds(166, 145, 84, 14);
		playLayout.add(lblvitality);
		
		JButton button_5 = new JButton("+");
		button_5.setBounds(252, 145, 49, 14);
		playLayout.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setBounds(303, 145, 49, 14);
		playLayout.add(button_6);
		
		JLabel label = new JLabel("100");
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(362, 100, 49, 59);
		playLayout.add(label);
		
		JLabel lblWorld = new JLabel("World");
		lblWorld.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblWorld.setBounds(272, 234, 49, 17);
		playLayout.add(lblWorld);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblMainMenu.setBounds(331, 234, 103, 17);
		playLayout.add(lblMainMenu);
		contentPane.add(inventoryLayout,"inven");
		contentPane.add(fightingLayout,"fight");
		contentPane.add(shopLayout,"shop");
		
		JLabel lblNewLabel = new JLabel("Developer : Darius Ellert Klaus [DevilLord Aero]");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 358, 18);
		layout3.add(lblNewLabel);
		
		JLabel lblYouCanHack = new JLabel("You can hack, cheat or even f*ck this game, cuz i created it only for fun..");
		lblYouCanHack.setBounds(10, 33, 414, 14);
		layout3.add(lblYouCanHack);
		
		JLabel lblButItsNot = new JLabel("But it's not fun if you hacked this game right?");
		lblButItsNot.setBounds(10, 52, 414, 14);
		layout3.add(lblButItsNot);
		
		JLabel lblThisGameIs = new JLabel("This game is open source..");
		lblThisGameIs.setBounds(10, 73, 414, 14);
		layout3.add(lblThisGameIs);
		
		JLabel lblLookAtGithubcomdevillordsrmcpe = new JLabel("Look at github.com/DevilLordSR-MCPE");
		lblLookAtGithubcomdevillordsrmcpe.setBounds(10, 93, 414, 14);
		layout3.add(lblLookAtGithubcomdevillordsrmcpe);
		
		JLabel lblNewLabel_1 = new JLabel("< BACK");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(contentPane, "1");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.DARK_GRAY);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
		lblNewLabel_1.setBounds(104, 150, 174, 84);
		layout3.add(lblNewLabel_1);
		
		JLabel titleLabel = new JLabel("A Word RPG");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		titleLabel.setBounds(10, 7, 414, 41);
		
		JLabel lblPlay = new JLabel("PLAY");
		lblPlay.setForeground(Color.DARK_GRAY);
		
		lblPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPlay.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblPlay.setForeground(Color.DARK_GRAY);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(contentPane,"play");
			}
		});
		lblPlay.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlay.setBounds(184, 80, 66, 41);
		
		JLabel lblAbout = new JLabel("ABOUT");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		lblAbout.setBounds(168, 132, 98, 41);
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAbout.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblAbout.setForeground(Color.DARK_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(contentPane,"2");
			}
		});
		
		JLabel lblICreateThis = new JLabel("I Create this game cuz im bored.");
		lblICreateThis.setBounds(10, 237, 414, 14);
		
		layout2.add(titleLabel);
		layout2.add(lblPlay);
		layout2.add(lblAbout);
		layout2.add(lblICreateThis);
		
		card.show(contentPane, "1");
	}
}

