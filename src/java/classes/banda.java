/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author emers
 */
public class banda {
    private String nome;
    private String genero;
    private int qtdisco;
    
    public banda(String nome, String genero, int qtdisco) {
        this.nome = nome;
        this.genero = genero;
        this.qtdisco = qtdisco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getQtdisco() {
        return qtdisco;
    }
    
    public void setQtmusica(int qt) {
        this.qtdisco = qt;
    }
    
    
}
