package main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import rpg.class_bs;

public class GameMIDlet extends MIDlet {
   // $FF: renamed from: a rpg.GameMIDlet
   public static GameMIDlet field_class_rpg_GameMIDlet_a;
   // $FF: renamed from: a javax.microedition.lcdui.Display
   private Display field_class_javax_microedition_lcdui_Display_a;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a = false;

   public GameMIDlet() {
      field_class_rpg_GameMIDlet_a = this;
   }

   public final void startApp() {
      System.out.println("startApp");
      if (!this.field_boolean_a) {
         this.field_boolean_a = true;
         this.field_class_javax_microedition_lcdui_Display_a = Display.getDisplay(this);
         class_bs.func_void_a(this.field_class_javax_microedition_lcdui_Display_a);
         class_bs.field_class_bs_a.func_void_c();
      }

   }

   public final void pauseApp() {
      System.out.println("pauseApp");
   }

   public final void destroyApp(boolean var1) {
      this.func_void_a();
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.notifyDestroyed();
   }
}
