/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Felipe
 */
public class Sprite {
	private Image image;
	
	public Sprite(Image image) {
		this.image = image;
	}
	
	public int getLargura() {
		return image.getWidth(null);
	}

	public int getAltura() {
		return image.getHeight(null);
	}
	
	public void desenhar(Graphics g,int x,int y) {
		g.drawImage(image,x,y,null);
	}
}
