/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagens.Plantas;

import Auxiliares.Posicao;
import Auxiliares.SpriteStore;

/**
 *
 * @author Felipe
 */
public class WallNut extends Planta {
    
    public  WallNut (Posicao posicao) {
        super(SpriteStore.get().getSprite("Sprites/wallnut.jpg"), posicao, 300, 0);
    }
    
    public  WallNut () {
        super(SpriteStore.get().getSprite("Sprites/wallnut.jpg"), new Posicao(true, 0, 0), 300, 0);
    }
    @Override
    public void notificarZumbiNasceu() { 
    }

    @Override
    public void notificarMorreuZumbi() {
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof WallNut) {
            if (this.getPosicao().equals(((WallNut)o).getPosicao()))
                return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "WallNut";
    }
}
