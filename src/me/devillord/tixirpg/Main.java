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

import me.devillord.tixirpg.Entity.Player;
import me.devillord.tixirpg.Item.Items;
import javax.swing.JTextPane;
import javax.swing.JTextField;

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
				  SEVENTH_KNIGHT_HELM,
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
	
	private Items TEMPLAR_SWORD,
				  TEMPLAR_CROSSBOW,
				  TEMPLAR_BATTLEAXE,
				  TEMPLAR_ARMOR,
				  TEMPLAR_BOOTS,
				  TEMPLAR_HELM,
				  TEMPLAR_LEGGING,
				  TEMPLAR_GLOVES,
				  TEMPLAR_RING,
				  TEMPLAR_EARRING,
				  TEMPLAR_ORNAMENT,
				  TEMPLAR_CLOAK,
				  TEMPLAR_AMULET;
	
	private Items LATTENIUM_KNIGHT_SWORD,
				  LATTENIUM_KNIGHT_CROSSBOW,
				  LATTENIUM_KNIGHT_BATTLEAXE,
				  LATTENIUM_KNIGHT_ARMOR,
				  LATTENIUM_KNIGHT_BOOTS,
				  LATTENIUM_KNIGHT_HELM,
				  LATTENIUM_KNIGHT_LEGGING,
				  LATTENIUM_KNIGHT_GLOVES,
				  LATTENIUM_KNIGHT_RING,
				  LATTENIUM_KNIGHT_EARRING,
				  LATTENIUM_KNIGHT_ORNAMENT,
				  LATTENIUM_KNIGHT_CLOAK,
				  LATTENIUM_KNIGHT_AMULET;
	
	private Items BLOODY_SWORD,
				  BLOODY_CROSSBOW,
				  BLOODY_BATTLEAXE,
				  BLOODY_ARMOR,
				  BLOODY_BOOTS,
				  BLOODY_HELM,
				  BLOODY_LEGGING,
				  BLOODY_GLOVES,
				  BLOODY_RING,
				  BLOODY_EARRING,
				  BLOODY_ORNAMENT,
				  BLOODY_CLOAK,
				  BLOODY_AMULET;
	
	private Items DIVINE_SWORD,
				  DIVINE_CROSSBOW,
				  DIVINE_BATTLEAXE,
				  DIVINE_ARMOR,
				  DIVINE_BOOTS,
				  DIVINE_HELM,
				  DIVINE_LEGGING,
				  DIVINE_GLOVES,
				  DIVINE_RING,
				  DIVINE_EARRING,
				  DIVINE_ORNAMENT,
				  DIVINE_CLOAK,
				  DIVINE_AMULET;
	
	private Items ETHERNAL_SWORD,
				  ETHERNAL_CROSSBOW,
				  ETHERNAL_BATTLEAXE,
				  ETHERNAL_ARMOR,
				  ETHERNAL_BOOTS,
				  ETHERNAL_HELM,
				  ETHERNAL_LEGGING,
				  ETHERNAL_GLOVES,
				  ETHERNAL_RING,
				  ETHERNAL_EARRING,
				  ETHERNAL_ORNAMENT,
				  ETHERNAL_CLOAK,
				  ETHERNAL_AMULET;
	
	private Items CLARITY_SWORD,
				  CLARITY_CROSSBOW,
				  CLARITY_BATTLEAXE,
				  CLARITY_ARMOR,
				  CLARITY_BOOTS,
				  CLARITY_HELM,
				  CLARITY_LEGGING,
				  CLARITY_GLOVES,
				  CLARITY_RING,
				  CLARITY_EARRING,
				  CLARITY_ORNAMENT,
				  CLARITY_CLOAK,
				  CLARITY_AMULET;
	
	private Items SHADOW_SWORD,
				  SHADOW_CROSSBOW,
				  SHADOW_BATTLEAXE,
				  SHADOW_ARMOR,
				  SHADOW_BOOTS,
				  SHADOW_HELM,
				  SHADOW_LEGGING,
				  SHADOW_GLOVES,
				  SHADOW_RING,
				  SHADOW_EARRING,
				  SHADOW_ORNAMENT,
				  SHADOW_CLOAK,
				  SHADOW_AMULET;
	
	private Items TITANIUM_SWORD,
				  TITANIUM_CROSSBOW,
				  TITANIUM_BATTLEAXE,
				  TITANIUM_ARMOR,
				  TITANIUM_BOOTS,
				  TITANIUM_HELM,
				  TITANIUM_LEGGING,
				  TITANIUM_GLOVES,
				  TITANIUM_RING,
				  TITANIUM_EARRING,
				  TITANIUM_ORNAMENT,
				  TITANIUM_CLOAK,
				  TITANIUM_AMULET;
	
	private Items CHAOTIC_SWORD,
				   CHAOTIC_CROSSBOW,
				   CHAOTIC_BATTLEAXE,
				   CHAOTIC_ARMOR,
				   CHAOTIC_BOOTS,
				   CHAOTIC_HELM,
				   CHAOTIC_LEGGING,
				   CHAOTIC_GLOVES,
				   CHAOTIC_RING,
				   CHAOTIC_EARRING,
				   CHAOTIC_ORNAMENT,
				   CHAOTIC_CLOAK,
				   CHAOTIC_AMULET;
	
	private Items EXCALIBUR_SWORD,
				  EXCALIBUR_CROSSBOW,
				  EXCALIBUR_BATTLEAXE,
				  EXCALIBUR_ARMOR,
				  EXCALIBUR_BOOTS,
				  EXCALIBUR_HELM,
				  EXCALIBUR_LEGGING,
				  EXCALIBUR_GLOVES,
				  EXCALIBUR_RING,
				  EXCALIBUR_EARRING,
				  EXCALIBUR_ORNAMENT,
				  EXCALIBUR_CLOAK,
				  EXCALIBUR_AMULET;
	
	private Items BLAZE_SWORD,
				  BLAZE_CROSSBOW,
				  BLAZE_BATTLEAXE,
				  BLAZE_ARMOR,
				  BLAZE_BOOTS,
				  BLAZE_HELM,
				  BLAZE_LEGGING,
				  BLAZE_GLOVES,
				  BLAZE_RING,
				  BLAZE_EARRING,
				  BLAZE_ORNAMENT,
				  BLAZE_CLOAK,
				  BLAZE_AMULET;
	
	private Items DAEDRIC_SWORD,
				  DAEDRIC_CROSSBOW,
				  DAEDRIC_BATTLEAXE,
				  DAEDRIC_ARMOR,
				  DAEDRIC_BOOTS,
				  DAEDRIC_HELM,
				  DAEDRIC_LEGGING,
				  DAEDRIC_GLOVES,
				  DAEDRIC_RING,
				  DAEDRIC_EARRING,
				  DAEDRIC_ORNAMENT,
				  DAEDRIC_CLOAK,
				  DAEDRIC_AMULET;
	
	private Items ABYSSAL_SWORD,
				  ABYSSAL_CROSSBOW,
				  ABYSSAL_BATTLEAXE,
				  ABYSSAL_ARMOR,
				  ABYSSAL_BOOTS,
				  ABYSSAL_HELM,
				  ABYSSAL_LEGGING,
				  ABYSSAL_GLOVES,
				  ABYSSAL_RING,
				  ABYSSAL_EARRING,
				  ABYSSAL_ORNAMENT,
				  ABYSSAL_CLOAK,
				  ABYSSAL_AMULET;
	
	private Items LUGUNICA_SWORD,
	  			  LUGUNICA_CROSSBOW,
	  			  LUGUNICA_BATTLEAXE,
	  			  LUGUNICA_ARMOR,
	  			  LUGUNICA_BOOTS,
	  			  LUGUNICA_HELM,
	  			  LUGUNICA_LEGGING,
	  			  LUGUNICA_GLOVES,
	  			  LUGUNICA_RING,
	  			  LUGUNICA_EARRING,
	  			  LUGUNICA_ORNAMENT,
	  			  LUGUNICA_CLOAK,
	  			  LUGUNICA_AMULET;
	
	private Items CERO_SWORD,
	              CERO_CROSSBOW,
	              CERO_BATTLEAXE,
	              CERO_ARMOR,
	              CERO_BOOTS,
	              CERO_HELM,
	              CERO_LEGGING,
	              CERO_GLOVES,
	              CERO_RING,
	              CERO_EARRING,
	              CERO_ORNAMENT,
	              CERO_CLOAK,
	              CERO_AMULET;
	
	private Items INFERNO_SWORD,
	  			  INFERNO_CROSSBOW,
	  			  INFERNO_BATTLEAXE,
	  			  INFERNO_ARMOR,
	  			  INFERNO_BOOTS,
	  			  INFERNO_HELM,
	  			  INFERNO_LEGGING,
	  			  INFERNO_GLOVES,
	  			  INFERNO_RING,
	  			  INFERNO_EARRING,
	  			  INFERNO_ORNAMENT,
	  			  INFERNO_CLOAK,
	  			  INFERNO_AMULET;
	
	private Items SANCTUM_SWORD,
	  			  SANCTUM_CROSSBOW,
	  			  SANCTUM_BATTLEAXE,
	  			  SANCTUM_ARMOR,
	  			  SANCTUM_BOOTS,
	  			  SANCTUM_HELM,
	  			  SANCTUM_LEGGING,
	  			  SANCTUM_GLOVES,
	  			  SANCTUM_RING,
	  			  SANCTUM_EARRING,
	  			  SANCTUM_ORNAMENT,
	  			  SANCTUM_CLOAK,
	  			  SANCTUM_AMULET;
	
	private Items COLOSSAL_SWORD,
	  			  COLOSSAL_CROSSBOW,
	  			  COLOSSAL_BATTLEAXE,
	  			  COLOSSAL_ARMOR,
	  			  COLOSSAL_BOOTS,
	  			  COLOSSAL_HELM,
	  			  COLOSSAL_LEGGING,
	  			  COLOSSAL_GLOVES,
	  			  COLOSSAL_RING,
	  			  COLOSSAL_EARRING,
	  			  COLOSSAL_ORNAMENT,
	  			  COLOSSAL_CLOAK,
	  			  COLOSSAL_AMULET;
	
	private Items TITAN_SWORD,
	  			  TITAN_CROSSBOW,
	  			  TITAN_BATTLEAXE,
	  			  TITAN_ARMOR,
	  			  TITAN_BOOTS,
	  			  TITAN_HELM,
	  			  TITAN_LEGGING,
	  			  TITAN_GLOVES,
	  			  TITAN_RING,
	  			  TITAN_EARRING,
	  			  TITAN_ORNAMENT,
	  			  TITAN_CLOAK,
	  			  TITAN_AMULET;
	
	private Items TARINTUS_SWORD,
	  			  TARINTUS_CROSSBOW,
	  			  TARINTUS_BATTLEAXE,
	  			  TARINTUS_ARMOR,
	  			  TARINTUS_BOOTS,
	  			  TARINTUS_HELM,
	  			  TARINTUS_LEGGING,
	  			  TARINTUS_GLOVES,
	  			  TARINTUS_RING,
	  			  TARINTUS_EARRING,
	  			  TARINTUS_ORNAMENT,
	  			  TARINTUS_CLOAK,
	  			  TARINTUS_AMULET;
	
	private Items DEPRAVED_SWORD,
	  			  DEPRAVED_CROSSBOW,
	  			  DEPRAVED_BATTLEAXE,
	  			  DEPRAVED_ARMOR,
	  			  DEPRAVED_BOOTS,
	  			  DEPRAVED_HELM,
	  			  DEPRAVED_LEGGING,
	  			  DEPRAVED_GLOVES,
	  			  DEPRAVED_RING,
	  			  DEPRAVED_EARRING,
	  			  DEPRAVED_ORNAMENT,
	  			  DEPRAVED_CLOAK,
	  			  DEPRAVED_AMULET;
	
	private Items NIRVANA_SWORD,
	  			  NIRVANA_CROSSBOW,
	  			  NIRVANA_BATTLEAXE,
	  			  NIRVANA_ARMOR,
	  			  NIRVANA_BOOTS,
	  			  NIRVANA_HELM,
	  			  NIRVANA_LEGGING,
	  			  NIRVANA_GLOVES,
	  			  NIRVANA_RING,
	  			  NIRVANA_EARRING,
	  			  NIRVANA_ORNAMENT,
	  			  NIRVANA_CLOAK,
	  			  NIRVANA_AMULET;
	
	private Items DESTROYER_SWORD,
	  			  DESTROYER_CROSSBOW,
	  			  DESTROYER_BATTLEAXE,
	  			  DESTROYER_ARMOR,
	  			  DESTROYER_BOOTS,
	  			  DESTROYER_HELM,
	  			  DESTROYER_LEGGING,
	  			  DESTROYER_GLOVES,
	  			  DESTROYER_RING,
	  			  DESTROYER_EARRING,
	  			  DESTROYER_ORNAMENT,
	  			  DESTROYER_CLOAK,
	  			  DESTROYER_AMULET;
	
	private Player player;
	private boolean onEditStage;
	
	private int nowStr;
	private int nowDex;
	private int nowLuck;
	private int nowVit;
	
	public JTextPane txtpnTestAsdasda;

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
		
		player = new Player("Wey",0,100,10,5,0,0,2,1,100,1,5,5,5,5,5);
		
		//Itemname,dur,dmg,luck,critrate,eva,critdmg,def,category
		HOLY_STURDY_SET();
		HARMONY_SET();
		ANCIENT_ESPADA_SET();
		VENOM_SET();
		STURDY_SET();
		SEVENTH_KNIGHT_SET();
		WOODEN_SET();
		IRON_SET();
		DIAMOND_SET();
		STONE_SET();
		
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
		
		JLabel lblNickname = new JLabel("<html><b>" + player.getPlayerName() + "</b></html>");
		lblNickname.setBounds(10, 11, 414, 14);
		playLayout.add(lblNickname);
		
		JLabel lblLvl = new JLabel("Level: " + player.getLevel());
		lblLvl.setBounds(10, 30, 414, 14);
		playLayout.add(lblLvl);
		
		JLabel label = new JLabel("" + player.getPoint());
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(362, 100, 49, 59);
		playLayout.add(label);
		
		JLabel lblExp = new JLabel("Exp: " + player.getExp() + "/100");
		lblExp.setBounds(10, 49, 414, 14);
		playLayout.add(lblExp);
		
		JLabel lblHp = new JLabel("HP: " + player.getHealth());
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
		
		JLabel lblSurvive = new JLabel("<html><b>Survive:</b> " + player.getSurvive() + "</html>");
		lblSurvive.setBounds(20, 100, 136, 14);
		playLayout.add(lblSurvive);
		
		JLabel lblCritRate = new JLabel("<html><b>Crit Rate:</b> " + player.getCritRate() +" %</html>");
		lblCritRate.setBounds(20, 115, 136, 14);
		playLayout.add(lblCritRate);
		
		JLabel lblDefense = new JLabel("<html><b>Defense:</b> " + player.getDef() + "</html>");
		lblDefense.setBounds(20, 130, 136, 14);
		playLayout.add(lblDefense);
		
		JLabel lblAttack = new JLabel("<html><b>Attack:</b> " + player.getDmg() + "</html>");
		lblAttack.setBounds(20, 145, 136, 14);
		playLayout.add(lblAttack);
		
		JLabel lblEvasion = new JLabel("<html><b>Evasion:</b> "+ player.getEvasion() + " %</html>");
		lblEvasion.setBounds(20, 170, 136, 14);
		playLayout.add(lblEvasion);
		
		JLabel lblluck = new JLabel("<html><b>Luck: </b> " + player.getLuck() + " %</html>");
		lblluck.setBounds(20, 185, 136, 14);
		playLayout.add(lblluck);
		
		JLabel lblcritDmgx = new JLabel("<html><b>Crit Dmg: </b> "+ player.getCritDmg() +" x </html>");
		lblcritDmgx.setBounds(20, 200, 135, 14);
		playLayout.add(lblcritDmgx);
		
		JLabel lblStrength = new JLabel("<html><b>Strength:</b> " + player.getStr() + "</html>");
		lblStrength.setBounds(166, 100, 84, 14);
		playLayout.add(lblStrength);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player.getPoint() > 0) {
					if(onEditStage == false) { 
						nowLuck = player.getLuck();
						nowStr = player.getStr();
						nowVit = player.getVit();
						nowDex = player.getDex();
						onEditStage = true;
					}
					player.setStr(player.getStr() + 1);
					player.setPoint(player.getPoint() - 1);
					lblStrength.setText("<html><b>Strength:</b> " + player.getStr() + "</html>");
					label.setText("" + player.getPoint());
				}
			}
		});
		btnNewButton.setBounds(252, 100, 49, 14);
		playLayout.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(onEditStage == true && player.getStr() > nowStr) {
					player.setStr(player.getStr() - 1);
					player.setPoint(player.getPoint() + 1);
					label.setText("" + player.getPoint());
					lblStrength.setText("<html><b>Strength:</b> " + player.getStr() + "</html>");
				}
			}
		});
		button.setBounds(303, 100, 49, 14);
		playLayout.add(button);
		
		JLabel lblluck_1 = new JLabel("<html><b>Luckness:</b> " + player.getLuckness() + "</html>");
		lblluck_1.setBounds(166, 115, 84, 14);
		playLayout.add(lblluck_1);
		
		JButton button_1 = new JButton("+");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player.getPoint() > 0) {
					if(onEditStage == false) { 
						nowLuck = player.getLuck();
						nowStr = player.getStr();
						nowVit = player.getVit();
						nowDex = player.getDex();
						onEditStage = true;
					}
					player.setLuck(player.getLuck() + 1);
					player.setPoint(player.getPoint() - 1);
					lblluck_1.setText("<html><b>Luck:</b> " + player.getLuck() + "</html>");
					label.setText("" + player.getPoint());
				}
			}
		});
		button_1.setBounds(252, 115, 49, 14);
		playLayout.add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(onEditStage == true && player.getLuck() > nowLuck) {
					player.setLuck(player.getLuck() - 1);
					player.setPoint(player.getPoint() + 1);
					label.setText("" + player.getPoint());
					lblluck_1.setText("<html><b>Luck:</b> " + player.getLuck() + "</html>");
				}
			}
		});
		button_2.setBounds(303, 115, 49, 14);
		playLayout.add(button_2);
		
		JLabel lbldexterity = new JLabel("<html><b>Dexterity:</b> " + player.getDex() + "</html>");
		lbldexterity.setBounds(166, 130, 84, 14);
		playLayout.add(lbldexterity);
		
		JButton button_3 = new JButton("+");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player.getPoint() > 0) {
					if(onEditStage == false) { 
						nowLuck = player.getLuck();
						nowStr = player.getStr();
						nowVit = player.getVit();
						nowDex = player.getDex();
						onEditStage = true;
					}
					player.setDex(player.getDex() + 1);
					player.setPoint(player.getPoint() - 1);
					lbldexterity.setText("<html><b>Dexterity:</b> " + player.getDex() + "</html>");
					label.setText("" + player.getPoint());
				}
			}
		});
		button_3.setBounds(252, 130, 49, 14);
		playLayout.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(onEditStage == true && player.getDex() > nowDex) {
					player.setDex(player.getDex() - 1);
					player.setPoint(player.getPoint() + 1);
					label.setText("" + player.getPoint());
					lbldexterity.setText("<html><b>Dexterity:</b> " + player.getDex() + "</html>");
				}
			}
		});
		button_4.setBounds(303, 130, 49, 14);
		playLayout.add(button_4);
		
		JLabel lblvitality = new JLabel("<html><b>Vitality:</b> " + player.getVit() + "</html>");
		lblvitality.setBounds(166, 145, 84, 14);
		playLayout.add(lblvitality);
		
		JButton button_5 = new JButton("+");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player.getPoint() > 0) {
					if(onEditStage == false) { 
						nowLuck = player.getLuck();
						nowStr = player.getStr();
						nowVit = player.getVit();
						nowDex = player.getDex();
						onEditStage = true;
					}
					player.setVit(player.getVit() + 1);
					player.setPoint(player.getPoint() - 1);
					lbldexterity.setText("<html><b>Dexterity:</b> " + player.getVit() + "</html>");
					label.setText("" + player.getPoint());
				}
			}
		});
		button_5.setBounds(252, 145, 49, 14);
		playLayout.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(onEditStage == true && player.getVit() > nowVit) {
					player.setVit(player.getVit() - 1);
					player.setPoint(player.getPoint() + 1);
					label.setText("" + player.getPoint());
					lblvitality.setText("<html><b>Vitality:</b> " + player.getDex() + "</html>");
				}
			}
		});
		button_6.setBounds(303, 145, 49, 14);
		playLayout.add(button_6);
		
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
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.GRAY);
		separator_5.setBackground(Color.WHITE);
		separator_5.setBounds(10, 11, 414, 2);
		fightingLayout.add(separator_5);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.WHITE);
		separator_4.setForeground(Color.GRAY);
		separator_4.setBounds(10, 211, 414, 2);
		fightingLayout.add(separator_4);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(10, 11, 1, 201);
		fightingLayout.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(423, 11, 1, 201);
		fightingLayout.add(separator_7);
		
		txtpnTestAsdasda = new JTextPane();
		txtpnTestAsdasda.setBounds(10, 11, 414, 201);
		fightingLayout.add(txtpnTestAsdasda);
		
		JLabel lblRetreat = new JLabel("Retreat");
		lblRetreat.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblRetreat.setBounds(10, 223, 95, 28);
		fightingLayout.add(lblRetreat);
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
	
	public void HOLY_STURDY_SET() {
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
	}
	
	public void HARMONY_SET() {
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
	}	
	
	public void ANCIENT_ESPADA_SET() {
		
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
	}
	
	public void VENOM_SET() {
		
		VENOM_SWORD = new Items("Venom Sword",0,0,0,0,0,0,0,"Weapon");
		VENOM_CROSSBOW = new Items("Venom Crossbow",0,0,0,0,0,0,0,"Weapon");
		VENOM_BATTLEAXE = new Items("Venom Battleaxe",0,0,0,0,0,0,0,"Weapon");
		VENOM_ARMOR = new Items("Venom Armor",0,0,0,0,0,0,0,"Armor");
		VENOM_BOOTS = new Items("Venom Boots",0,0,0,0,0,0,0,"Boots");
		VENOM_HELM = new Items("Venom Helmet",0,0,0,0,0,0,0,"Helm");
		VENOM_LEGGING = new Items("Venom Legging",0,0,0,0,0,0,0,"Legg");
		VENOM_GLOVES = new Items("Venom Glove",0,0,0,0,0,0,0,"Gloves");
		VENOM_RING = new Items("Venom Ring",0,0,0,0,0,0,0,"Ring");
		VENOM_EARRING = new Items("Venom Earring",0,0,0,0,0,0,0,"Earring");
		VENOM_ORNAMENT = new Items("Venom Ornament",0,0,0,0,0,0,0,"Ornament");
		VENOM_CLOAK = new Items("Venom Cloak",0,0,0,0,0,0,0,"Cloak");
		VENOM_AMULET = new Items("Venom Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void STURDY_SET() {
		
		STURDY_SWORD = new Items("Sturdy Sword",0,0,0,0,0,0,0,"Weapon");
		STURDY_CROSSBOW = new Items("Sturdy Crossbow",0,0,0,0,0,0,0,"Weapon");
		STURDY_BATTLEAXE = new Items("Sturdy Battleaxe",0,0,0,0,0,0,0,"Weapon");
		STURDY_ARMOR = new Items("Sturdy Armor",0,0,0,0,0,0,0,"Armor");
		STURDY_BOOTS = new Items("Sturdy Boots",0,0,0,0,0,0,0,"Boots");
		STURDY_HELM = new Items("Sturdy Helmet",0,0,0,0,0,0,0,"Helm");
		STURDY_LEGGING = new Items("Sturdy Legging",0,0,0,0,0,0,0,"Legg");
		STURDY_GLOVES = new Items("Sturdy Glove",0,0,0,0,0,0,0,"Gloves");
		STURDY_RING = new Items("Sturdy Ring",0,0,0,0,0,0,0,"Ring");
		STURDY_EARRING = new Items("Sturdy Earring",0,0,0,0,0,0,0,"Earring");
		STURDY_ORNAMENT = new Items("Sturdy Ornament",0,0,0,0,0,0,0,"Ornament");
		STURDY_CLOAK = new Items("Sturdy Cloak",0,0,0,0,0,0,0,"Cloak");
		STURDY_AMULET = new Items("Sturdy Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void SEVENTH_KNIGHT_SET() {

		SEVENTH_KNIGHT_SWORD = new Items("Seventh Knight Sword",0,0,0,0,0,0,0,"Weapon");
		SEVENTH_KNIGHT_CROSSBOW = new Items("Seventh Knight Crossbow",0,0,0,0,0,0,0,"Weapon");
		SEVENTH_KNIGHT_BATTLEAXE = new Items("Seventh Knight Battleaxe",0,0,0,0,0,0,0,"Weapon");
		SEVENTH_KNIGHT_ARMOR = new Items("Seventh Knight Armor",0,0,0,0,0,0,0,"Armor");
		SEVENTH_KNIGHT_BOOTS = new Items("Seventh Knight Boots",0,0,0,0,0,0,0,"Boots");
		SEVENTH_KNIGHT_HELM = new Items("Seventh Knight Helmet",0,0,0,0,0,0,0,"Helm");
		SEVENTH_KNIGHT_LEGGING = new Items("Seventh Knight Legging",0,0,0,0,0,0,0,"Legg");
		SEVENTH_KNIGHT_GLOVES = new Items("Seventh Knight Glove",0,0,0,0,0,0,0,"Gloves");
		SEVENTH_KNIGHT_RING = new Items("Seventh Knight Ring",0,0,0,0,0,0,0,"Ring");
		SEVENTH_KNIGHT_EARRING = new Items("Seventh Knight Earring",0,0,0,0,0,0,0,"Earring");
		SEVENTH_KNIGHT_ORNAMENT = new Items("Seventh Knight Ornament",0,0,0,0,0,0,0,"Ornament");
		SEVENTH_KNIGHT_CLOAK = new Items("Seventh Knight Cloak",0,0,0,0,0,0,0,"Cloak");
		SEVENTH_KNIGHT_AMULET = new Items("Seventh Knight Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void WOODEN_SET() {

		WOODEN_SWORD = new Items("Wooden Sword",0,0,0,0,0,0,0,"Weapon");
		WOODEN_CROSSBOW = new Items("Wooden Crossbow",0,0,0,0,0,0,0,"Weapon");
		WOODEN_BATTLEAXE = new Items("Wooden Battleaxe",0,0,0,0,0,0,0,"Weapon");
		WOODEN_ARMOR = new Items("Wooden Armor",0,0,0,0,0,0,0,"Armor");
		WOODEN_BOOTS = new Items("Wooden Boots",0,0,0,0,0,0,0,"Boots");
		WOODEN_HELM = new Items("Wooden Helmet",0,0,0,0,0,0,0,"Helm");
		WOODEN_LEGGING = new Items("Wooden Legging",0,0,0,0,0,0,0,"Legg");
		WOODEN_GLOVES = new Items("Wooden Glove",0,0,0,0,0,0,0,"Gloves");
		WOODEN_RING = new Items("Wooden Ring",0,0,0,0,0,0,0,"Ring");
		WOODEN_EARRING = new Items("Wooden Earring",0,0,0,0,0,0,0,"Earring");
		WOODEN_ORNAMENT = new Items("Wooden Ornament",0,0,0,0,0,0,0,"Ornament");
		WOODEN_CLOAK = new Items("Wooden Cloak",0,0,0,0,0,0,0,"Cloak");
		WOODEN_AMULET = new Items("Wooden Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void STONE_SET() {

		STONE_SWORD = new Items("Stone Sword",0,0,0,0,0,0,0,"Weapon");
		STONE_CROSSBOW = new Items("Stone Crossbow",0,0,0,0,0,0,0,"Weapon");
		STONE_BATTLEAXE = new Items("Stone Battleaxe",0,0,0,0,0,0,0,"Weapon");
		STONE_ARMOR = new Items("Stone Armor",0,0,0,0,0,0,0,"Armor");
		STONE_BOOTS = new Items("Stone Boots",0,0,0,0,0,0,0,"Boots");
		STONE_HELM = new Items("Stone Helmet",0,0,0,0,0,0,0,"Helm");
		STONE_LEGGING = new Items("Stone Legging",0,0,0,0,0,0,0,"Legg");
		STONE_GLOVES = new Items("Stone Glove",0,0,0,0,0,0,0,"Gloves");
		STONE_RING = new Items("Stone Ring",0,0,0,0,0,0,0,"Ring");
		STONE_EARRING = new Items("Stone Earring",0,0,0,0,0,0,0,"Earring");
		STONE_ORNAMENT = new Items("Stone Ornament",0,0,0,0,0,0,0,"Ornament");
		STONE_CLOAK = new Items("Stone Cloak",0,0,0,0,0,0,0,"Cloak");
		STONE_AMULET = new Items("Stone Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void IRON_SET() {

		IRON_SWORD = new Items("Iron Sword",0,0,0,0,0,0,0,"Weapon");
		IRON_CROSSBOW = new Items("Iron Crossbow",0,0,0,0,0,0,0,"Weapon");
		IRON_BATTLEAXE = new Items("Iron Battleaxe",0,0,0,0,0,0,0,"Weapon");
		IRON_ARMOR = new Items("Iron Armor",0,0,0,0,0,0,0,"Armor");
		IRON_BOOTS = new Items("Iron Boots",0,0,0,0,0,0,0,"Boots");
		IRON_HELM = new Items("Iron Helmet",0,0,0,0,0,0,0,"Helm");
		IRON_LEGGING = new Items("Iron Legging",0,0,0,0,0,0,0,"Legg");
		IRON_GLOVES = new Items("Iron Glove",0,0,0,0,0,0,0,"Gloves");
		IRON_RING = new Items("Iron Ring",0,0,0,0,0,0,0,"Ring");
		IRON_EARRING = new Items("Iron Earring",0,0,0,0,0,0,0,"Earring");
		IRON_ORNAMENT = new Items("Iron Ornament",0,0,0,0,0,0,0,"Ornament");
		IRON_CLOAK = new Items("Iron Cloak",0,0,0,0,0,0,0,"Cloak");
		IRON_AMULET = new Items("Iron Amulet",0,0,0,0,0,0,0,"Amulet");
	}
	
	public void DIAMOND_SET() {

		DIAMOND_SWORD = new Items("Diamond Sword",0,0,0,0,0,0,0,"Weapon");
		DIAMOND_CROSSBOW = new Items("Diamond Crossbow",0,0,0,0,0,0,0,"Weapon");
		DIAMOND_BATTLEAXE = new Items("Diamond Battleaxe",0,0,0,0,0,0,0,"Weapon");
		DIAMOND_ARMOR = new Items("Diamond Armor",0,0,0,0,0,0,0,"Armor");
		DIAMOND_BOOTS = new Items("Diamond Boots",0,0,0,0,0,0,0,"Boots");
		DIAMOND_HELM = new Items("Diamond Helmet",0,0,0,0,0,0,0,"Helm");
		DIAMOND_LEGGING = new Items("Diamond Legging",0,0,0,0,0,0,0,"Legg");
		DIAMOND_GLOVES = new Items("Diamond Glove",0,0,0,0,0,0,0,"Gloves");
		DIAMOND_RING = new Items("Diamond Ring",0,0,0,0,0,0,0,"Ring");
		DIAMOND_EARRING = new Items("Diamond Earring",0,0,0,0,0,0,0,"Earring");
		DIAMOND_ORNAMENT = new Items("Diamond Ornament",0,0,0,0,0,0,0,"Ornament");
		DIAMOND_CLOAK = new Items("Diamond Cloak",0,0,0,0,0,0,0,"Cloak");
		DIAMOND_AMULET = new Items("Diamond Amulet",0,0,0,0,0,0,0,"Amulet");
	}
}

