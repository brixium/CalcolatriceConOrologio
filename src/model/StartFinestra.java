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
