/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.Finestra;

/**
 *
 * @author asolan.lorenzo
 */
public class StartFinestra implements Runnable{
    private Finestra f;
    @Override
    public void run() {
        this.f = new Finestra("Calcolatrice di Asolan Lorenzo");
    }

}
