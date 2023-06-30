/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Davs
 */
public class Usuario {
    private int cod;
    private String usuario;
    private String contra;
    private int codc;

    public Usuario() {
    }

    public Usuario(int cod, String usuario, String contra, int codc) {
        this.cod = cod;
        this.usuario = usuario;
        this.contra = contra;
        this.codc = codc;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getCodc() {
        return codc;
    }

    public void setCodc(int codc) {
        this.codc = codc;
    }
    
    
    
}
