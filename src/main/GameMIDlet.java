package main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;
import rpg.bs;

public class GameMIDlet
extends MIDlet {
    public static GameMIDlet var_rpg_GameMIDlet_a;
    private Display var_javax_microedition_lcdui_Display_a;
    public boolean var_boolean_a = false;

    public GameMIDlet() {
        var_rpg_GameMIDlet_a = this;
    }

    public final void startApp() {
        System.out.println("startApp");
        if (!this.var_boolean_a) {
            this.var_boolean_a = true;
            this.var_javax_microedition_lcdui_Display_a = Display.getDisplay((MIDlet)this);
            bs.a(this.var_javax_microedition_lcdui_Display_a);
            bs.var_bs_a.c();
        }
    }

    public final void pauseApp() {
        System.out.println("pauseApp");
    }

    public final void destroyApp(boolean bl2) {
        this.a();
    }

    public final void a() {
        this.notifyDestroyed();
    }
}