package main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import rpg.class_bs;

public class GameMIDlet extends MIDlet {
   public static GameMIDlet instance;
   private Display display;
   public boolean isRunning = false;

   public GameMIDlet() {
      instance = this;
   }

   public final void startApp() {
      System.out.println("startApp");
      if (!this.isRunning) {
         this.isRunning = true;
         this.display = Display.getDisplay(this);
         class_bs.func_void_a(this.display);
         class_bs.field_class_bs_a.func_void_c();
      }
   }

   public final void pauseApp() {
      System.out.println("pauseApp");
   }

   public final void destroyApp(boolean var1) {
      this.endApp();
   }

   public final void endApp() {
      this.notifyDestroyed();
   }
}
