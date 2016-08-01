package me.devillord.tixirpg.Event;

import java.util.Random;

import javax.swing.text.BadLocationException;

import me.devillord.tixirpg.Main;
import me.devillord.tixirpg.Entity.Entity;
import me.devillord.tixirpg.Entity.Player;

public class AttackManager {
	
	private boolean isPlayerTurn;
	private int attMin;
	private int attMax;
	
	public AttackManager(Player player, Entity entity) {
		isPlayerTurn = true;
		attMin = (int)(player.getDmg()*(10.0f/100.0f));
		attMax = (int)(player.getDmg()*(15.0f/100.0f));
		if(isPlayerTurn) {
			int damage = player.getDmg() + ((player.getLevel()*10) + randInt(attMin,attMax));
			int defense = entity.getDefense() + ((entity.getLevel()*5) + randInt((int)(entity.getDefense()*(10.0f/100.0f)),(int)(entity.getDefense()*(15.0f/100.0f))));
			int finalDamage = damage - defense;
			entity.setHealth(entity.getHealth() - finalDamage);
			try {
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),player.getPlayerName() + "deal damage: " + finalDamage + " to " + entity.getEntityName() + "\n",null);
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),"Current " + entity.getEntityName() + " health is " + entity.getHealth() + "\n",null);
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),"Current " + player.getPlayerName() + " health is " + player.getHealth() + "\n\n",null);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(entity.getHealth() < 0) {
				
			}
			isPlayerTurn = false;
		} else {
			attMin = (int)(entity.getDmg()*(10.0f/100.0f));
			attMax = (int)(entity.getDmg()*(15.0f/100.0f));
			int damage = entity.getDmg() + ((entity.getLevel()*10) + randInt(attMin,attMax));
			int defense = player.getDef() + ((player.getLevel()*5) + randInt((int)(player.getDef()*(10.0f/100.0f)),(int)(player.getDef()*(15.0f/100.0f))));
			int finalDamage = damage - defense;
			player.setHealth(player.getHealth() - finalDamage);
			try {
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),entity.getEntityName() + "deal damage: " + finalDamage + " to " + player.getPlayerName() + "\n",null);
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),"Current " + entity.getEntityName() + " health is " + entity.getHealth() + "\n",null);
				new Main().txtpnTestAsdasda.getDocument().insertString(new Main().txtpnTestAsdasda.getDocument().getLength(),"Current " + player.getPlayerName() + " health is " + player.getHealth() + "\n\n",null);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(player.getHealth() < 0) {
				
			}
			isPlayerTurn = true;
		}
	}
	
	public static int randInt(int min, int max) {
	    Random rand;
	    rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
