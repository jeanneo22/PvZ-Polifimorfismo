/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagens;

import Auxiliares.Posicao;
import Auxiliares.Sprite;

/**
 *
 * @author Felipe
 */
public abstract class Planta extends Personagem {
    
    public Planta(Sprite sprite, Posicao posicao,int vidaMaxima, int velocidadeAtaque)  {
        super(sprite,posicao,vidaMaxima,velocidadeAtaque);
    }
    
    public Planta() {
        super();
    }
    
    @Override
    public void update(long delta) {
        checarMorreu();
    }
    
    public abstract void notificarZumbiNasceu();
    
    public abstract void notificarMorreuZumbi();
    
    public void notificarLevouDano(int dano) {
        this.setVidaAtual(this.getVidaAtual() - dano);
        checarMorreu();
    }
}
