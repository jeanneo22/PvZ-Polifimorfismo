/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagens;

import Auxiliares.Posicao;
import Auxiliares.Sprite;
import Auxiliares.SpriteStore;
import Interfaces.GameObject;
import java.awt.Graphics2D;

/**
 *
 * @author Felipe
 */
public abstract class Personagem implements GameObject{
    private Posicao posicao;
    private Sprite sprite;
    private int vidaMaxima;
    private int vidaAtual;
    private int velocidadeAtaque;
    private long tempoUltimoAtaque;
    
    public Personagem(Sprite sprite, Posicao posicao,int vidaMaxima, int velocidadeAtaque) {
        this.sprite = sprite;
        this.posicao = posicao;
        this.vidaMaxima = Math.max(1,vidaMaxima);
        this.vidaAtual = this.vidaMaxima;
        this.velocidadeAtaque = Math.max(1,velocidadeAtaque);
        this.tempoUltimoAtaque = System.currentTimeMillis();
    }
    
    public Personagem() {
        this(SpriteStore.get().getSprite("pvz/sprites/pea.jpg"), new Posicao(true, 0, 0), 100, 5);
    }
    
    @Override
    public void desenhar(Graphics2D graficos) {
        getSprite().desenhar(graficos, (int)getPosicao().getRealX(), (int)getPosicao().getRealY());
    };
    
    public boolean checarMorreu() {
        return getVidaAtual() < 0;
    }

    @Override
    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public long getTempoUltimoAtaque() {
        return tempoUltimoAtaque;
    }

    public void setTempoUltimoAtaque(long tempoUltimoAtaque) {
        this.tempoUltimoAtaque = tempoUltimoAtaque;
    }
}
