/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetil;

import Auxiliares.Posicao;
import Auxiliares.Sprite;
import Interfaces.Colidivel;
import Interfaces.GameObject;
import java.awt.Graphics2D;

/**
 *
 * @author Felipe
 */
public abstract class Projetil implements GameObject, Colidivel{
    private int velocidadeMovimento;
    private int dano;
    private Sprite sprite;
    private Posicao posicao;
    
    public Projetil(int velocidade,int dano, Sprite sprite, Posicao posicao) {
        this.velocidadeMovimento = Math.min(100, Math.max(velocidade,0));
        this.dano = Math.min(100, Math.max(dano,0));
        this.sprite = sprite;
        this.posicao = posicao;
    }
    
    @Override
    public void desenhar(Graphics2D graficos) {
        getSprite().desenhar(graficos, (int)getPosicao().getRealX(), (int)getPosicao().getRealY());
    };
    
    @Override
    public void update(long delta) {
        this.posicao.setRealX(this.posicao.getRealX() + velocidadeMovimento * delta);
    }

    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    public void setVelocidadeMovimento(int velocidadeMovimento) {
        this.velocidadeMovimento = velocidadeMovimento;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
