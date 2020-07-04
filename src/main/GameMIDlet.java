package main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;
import rpg.bs;

public class GameMIDlet
extends MIDlet {
    public static GameMIDlet instance;
    private Display appDisplay;
    public boolean isRunning = false;

    public GameMIDlet() {
        instance = this;
    }

    public final void startApp() {
        System.out.println("startApp");
        if (!this.isRunning) {
            this.isRunning = true;
            this.appDisplay = Display.getDisplay((MIDlet)this);
            bs.a(this.appDisplay);
            bs.var_bs_a.c();
        }
    }

    public final void pauseApp() {
        System.out.println("pauseApp");
    }

    public final void destroyApp(boolean flag) {
        this.endApp();
    }

    public final void endApp() {
        this.notifyDestroyed();
    }
}