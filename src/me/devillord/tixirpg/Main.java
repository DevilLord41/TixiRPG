package me.devillord.tixirpg;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import me.devillord.tixirpg.item.Items;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel layout2,
				   layout3,
				   playLayout,
				   inventoryLayout,
				   fightingLayout,
				   shopLayout;
	
	/* Holy Study */
	private Items HOLY_STURDY_SWORD,
				  HOLY_STURDY_CROSSBOW,
				  HOLY_STURDY_BATTLEAXE,
				  HOLY_STURDY_ARMOR,
				  HOLY_STURDY_BOOTS,
				  HOLY_STURDY_HELM,
				  HOLY_STURDY_LEGGING,
				  HOLY_STURDY_GLOVES,
				  HOLY_STURDY_RING,
				  HOLY_STURDY_EARRING,
				  HOLY_STURDY_ORNAMENT,
				  HOLY_STURDY_CLOAK,
				  HOLY_STURDY_AMULET;
	
	private Items STURDY_SWORD,
				  STURDY_CROSSBOW,
				  STURDY_BATTLEAXE,
				  STURDY_ARMOR,
				  STURDY_BOOTS,
				  STURDY_HELM,
				  STURDY_LEGGING,
				  STURDY_GLOVES,
				  STURDY_RING,
				  STURDY_EARRING,
				  STURDY_ORNAMENT,
				  STURDY_CLOAK,
				  STURDY_AMULET;
	
	private Items SEVENTH_KNIGHT_SWORD,
				  SEVENTH_KNIGHT_CROSSBOW,
				  SEVENTH_KNIGHT_BATTLEAXE,
				  SEVENTH_KNIGHT_ARMOR,
				  SEVENTH_KNIGHT_BOOTS,
				  SEVENTH_KNIGHTHELM,
				  SEVENTH_KNIGHT_LEGGING,
				  SEVENTH_KNIGHT_GLOVES,
				  SEVENTH_KNIGHT_RING,
				  SEVENTH_KNIGHT_EARRING,
				  SEVENTH_KNIGHT_ORNAMENT,
				  SEVENTH_KNIGHT_CLOAK,
				  SEVENTH_KNIGHT_AMULET;
	
	private Items WOODEN_SWORD,
				  WOODEN_CROSSBOW,
				  WOODEN_BATTLEAXE,
				  WOODEN_ARMOR,
				  WOODEN_BOOTS,
				  WOODEN_HELM,
				  WOODEN_LEGGING,
				  WOODEN_GLOVES,
				  WOODEN_RING,
				  WOODEN_EARRING,
				  WOODEN_ORNAMENT,
				  WOODEN_CLOAK,
				  WOODEN_AMULET;
	
	private Items STONE_SWORD,
				  STONE_CROSSBOW,
				  STONE_BATTLEAXE,
				  STONE_ARMOR,
				  STONE_BOOTS,
				  STONE_HELM,
				  STONE_LEGGING,
				  STONE_GLOVES,
				  STONE_RING,
				  STONE_EARRING,
				  STONE_ORNAMENT,
				  STONE_CLOAK,
				  STONE_AMULET;
	
	private Items IRON_SWORD,
				  IRON_CROSSBOW,
				  IRON_BATTLEAXE,
				  IRON_ARMOR,
				  IRON_BOOTS,
				  IRON_HELM,
				  IRON_LEGGING,
				  IRON_GLOVES,
				  IRON_RING,
				  IRON_EARRING,
				  IRON_ORNAMENT,
				  IRON_CLOAK,
				  IRON_AMULET;
	
	private Items DIAMOND_SWORD,
				  DIAMOND_CROSSBOW,
				  DIAMOND_BATTLEAXE,
				  DIAMOND_ARMOR,
				  DIAMOND_BOOTS,
				  DIAMOND_HELM,
				  DIAMOND_LEGGING,
				  DIAMOND_GLOVES,
				  DIAMOND_RING,
				  DIAMOND_EARRING,
				  DIAMOND_ORNAMENT,
				  DIAMOND_CLOAK,
				  DIAMOND_AMULET;
	
	private Items VENOM_SWORD,
				  VENOM_CROSSBOW,
				  VENOM_BATTLEAXE,
				  VENOM_ARMOR,
				  VENOM_BOOTS,
				  VENOM_HELM,
				  VENOM_LEGGING,
				  VENOM_GLOVES,
				  VENOM_RING,
				  VENOM_EARRING,
				  VENOM_ORNAMENT,
				  VENOM_CLOAK,
				  VENOM_AMULET;
	
	private Items ANCIENT_ESPADA_SWORD,
				  ANCIENT_ESPADA_CROSSBOW,
				  ANCIENT_ESPADA_BATTLEAXE,
				  ANCIENT_ESPADA_ARMOR,
				  ANCIENT_ESPADA_BOOTS,
				  ANCIENT_ESPADA_HELM,
				  ANCIENT_ESPADA_LEGGING,
				  ANCIENT_ESPADA_GLOVES,
				  ANCIENT_ESPADA_RING,
				  ANCIENT_ESPADA_EARRING,
				  ANCIENT_ESPADA_ORNAMENT,
				  ANCIENT_ESPADA_CLOAK,
				  ANCIENT_ESPADA_AMULET;
	
	private Items HARMONY_SWORD,
				  HARMONY_CROSSBOW,
				  HARMONY_BATTLEAXE,
				  HARMONY_ARMOR,
				  HARMONY_BOOTS,
				  HARMONY_HELM,
				  HARMONY_LEGGING,
				  HARMONY_GLOVES,
				  HARMONY_RING,
				  HARMONY_EARRING,
				  HARMONY_ORNAMENT,
				  HARMONY_CLOAK,
				  HARMONY_AMULET;

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
		
		//Itemname,dur,dmg,luck,critrate,eva,critdmg,def,category
		HOLY_STURDY_SWORD = new Items("Holy Sturdy Sword",1288,1022,0,3,0,0,0,"Weapon");
		HOLY_STURDY_CROSSBOW = new Items("Holy Sturdy Crossbow",1288,1888,0,6,0,0,0,"Weapon");
		HOLY_STURDY_BATTLEAXE = new Items("Holy Sturdy Battleaxe",1288,1240,0,2,0,0,0,"Weapon");
		HOLY_STURDY_ARMOR = new Items("Holy Sturdy Armor",1500,0,0,0,1,0,62,"Armor");
		HOLY_STURDY_BOOTS = new Items("Holy Sturdy Boots",800,0,0,0,1,0,38,"Boots");
		HOLY_STURDY_HELM = new Items("Holy Sturdy Helmet",1024,0,0,0,1,0,52,"Helm");
		HOLY_STURDY_LEGGING = new Items("Holy Sturdy Legging",1250,0,0,0,1,0,46,"Legg");
		HOLY_STURDY_GLOVES = new Items("Holy Sturdy Glove",600,0,0,0,0,0,34,"Gloves");
		HOLY_STURDY_RING = new Items("Holy Sturdy Ring",250,0,0,6,0,0,12,"Ring");
		HOLY_STURDY_EARRING = new Items("Holy Sturdy Earring",238,0,8,0,0,0,0,"Earring");
		HOLY_STURDY_ORNAMENT = new Items("Holy Sturdy Ornament",192,0,16,0,3,0,12,"Ornament");
		HOLY_STURDY_CLOAK = new Items("Holy Sturdy Cloak",900,0,0,10,7,0,26,"Cloak");
		HOLY_STURDY_AMULET = new Items("Holy Sturdy Amulet",122,0,24,0,0,0,0,"Amulet");
		
		HARMONY_SWORD = new Items("Harmony Sword",0,0,0,0,0,0,0,"Weapon");
		HARMONY_CROSSBOW = new Items("Harmony Crossbow",0,0,0,0,0,0,0,"Weapon");
		HARMONY_BATTLEAXE = new Items("Harmony Battleaxe",0,0,0,0,0,0,0,"Weapon");
		HARMONY_ARMOR = new Items("Harmony Armor",0,0,0,0,0,0,0,"Armor");
		HARMONY_BOOTS = new Items("Harmony Boots",0,0,0,0,0,0,0,"Boots");
		HARMONY_HELM = new Items("Harmony Helmet",0,0,0,0,0,0,0,"Helm");
		HARMONY_LEGGING = new Items("Harmony Legging",0,0,0,0,0,0,0,"Legg");
		HARMONY_GLOVES = new Items("Harmony Glove",0,0,0,0,0,0,0,"Gloves");
		HARMONY_RING = new Items("Harmony Ring",0,0,0,0,0,0,0,"Ring");
		HARMONY_EARRING = new Items("Harmony Earring",0,0,0,0,0,0,0,"Earring");
		HARMONY_ORNAMENT = new Items("Harmony Ornament",0,0,0,0,0,0,0,"Ornament");
		HARMONY_CLOAK = new Items("Harmony Cloak",0,0,0,0,0,0,0,"Cloak");
		HARMONY_AMULET = new Items("Harmony Amulet",0,0,0,0,0,0,0,"Amulet");
		
		ANCIENT_ESPADA_SWORD = new Items("Ancient Espada Sword",0,0,0,0,0,0,0,"Weapon");
		ANCIENT_ESPADA_CROSSBOW = new Items("Ancient Espada Crossbow",0,0,0,0,0,0,0,"Weapon");
		ANCIENT_ESPADA_BATTLEAXE = new Items("Ancient Espada Battleaxe",0,0,0,0,0,0,0,"Weapon");
		ANCIENT_ESPADA_ARMOR = new Items("Ancient Espada Armor",0,0,0,0,0,0,0,"Armor");
		ANCIENT_ESPADA_BOOTS = new Items("Ancient Espada Boots",0,0,0,0,0,0,0,"Boots");
		ANCIENT_ESPADA_HELM = new Items("Ancient Espada Helmet",0,0,0,0,0,0,0,"Helm");
		ANCIENT_ESPADA_LEGGING = new Items("Ancient Espada Legging",0,0,0,0,0,0,0,"Legg");
		ANCIENT_ESPADA_GLOVES = new Items("Ancient Espada Glove",0,0,0,0,0,0,0,"Gloves");
		ANCIENT_ESPADA_RING = new Items("Ancient Espada Ring",0,0,0,0,0,0,0,"Ring");
		ANCIENT_ESPADA_EARRING = new Items("Ancient Espada Earring",0,0,0,0,0,0,0,"Earring");
		ANCIENT_ESPADA_ORNAMENT = new Items("Ancient Espada Ornament",0,0,0,0,0,0,0,"Ornament");
		ANCIENT_ESPADA_CLOAK = new Items("Ancient Espada Cloak",0,0,0,0,0,0,0,"Cloak");
		ANCIENT_ESPADA_AMULET = new Items("Ancient Espada Amulet",0,0,0,0,0,0,0,"Amulet");
		
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
		inventoryLayout.setLayout(new GridLayout(0,4));
		inventoryLayout.setBorder(new EmptyBorder(5, 10, 5, 10));
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

