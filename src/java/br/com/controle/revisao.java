/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author D1090
 */
public class revisao {
    
    private double valor1;
    private double valor2;

    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public double Somar() {    
        return this.valor1 + this.valor2 ;
    }
    
}
