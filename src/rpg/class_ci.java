package rpg;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $FF: renamed from: ci
public final class class_ci implements PlayerListener {
   // $FF: renamed from: a javax.microedition.media.Player
   private Player field_class_javax_microedition_media_Player_a;

   public class_ci(String var1) {
      this.func_void_a(var1);
   }

   // $FF: renamed from: a (int) void
   public final void func_void_a(int var1) {
      if (this.field_class_javax_microedition_media_Player_a != null) {
         this.field_class_javax_microedition_media_Player_a.setLoopCount(var1);
      }

   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      if (class_bs.field_class_bs_a.field_int_a > 0) {
         this.func_void_d();
      }

   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      try {
         if (this.field_class_javax_microedition_media_Player_a != null) {
            this.field_class_javax_microedition_media_Player_a.stop();
         }

      } catch (MediaException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      if (this.field_class_javax_microedition_media_Player_a != null) {
         this.field_class_javax_microedition_media_Player_a.close();
         this.field_class_javax_microedition_media_Player_a = null;
      }

   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return this.field_class_javax_microedition_media_Player_a != null && this.field_class_javax_microedition_media_Player_a.getState() >= 400;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private static String func_class_java_lang_String_a(String var0) throws Exception {
      String var1;
      if (var0.endsWith("wav")) {
         var1 = "audio/x-wav";
      } else if (var0.endsWith("jts")) {
         var1 = "audio/x-tone-seq";
      } else {
         if (!var0.endsWith("mid")) {
            throw new Exception("Cannot guess content type from URL: " + var0);
         }

         var1 = "audio/midi";
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String) void
   private void func_void_a(String var1) {
      if (this.field_class_javax_microedition_media_Player_a == null) {
         try {
            if (var1.startsWith("http:")) {
               this.field_class_javax_microedition_media_Player_a = Manager.createPlayer(var1);
            } else if (var1.startsWith("resource")) {
               int var2 = var1.indexOf(58);
               String var3 = var1.substring(var2 + 1);
               InputStream var4 = this.getClass().getResourceAsStream(var3);
               String var5 = func_class_java_lang_String_a(var1);
               this.field_class_javax_microedition_media_Player_a = Manager.createPlayer(var4, var5);
               this.field_class_javax_microedition_media_Player_a.realize();
            }

            this.field_class_javax_microedition_media_Player_a.addPlayerListener(this);
            return;
         } catch (Exception var6) {
            if (this.field_class_javax_microedition_media_Player_a != null) {
               this.field_class_javax_microedition_media_Player_a.close();
               this.field_class_javax_microedition_media_Player_a = null;
            }
         }
      }

   }

   // $FF: renamed from: b (int) void
   public final void func_void_b(int var1) {
      VolumeControl var2;
      if (this.field_class_javax_microedition_media_Player_a != null && (var2 = (VolumeControl)this.field_class_javax_microedition_media_Player_a.getControl("VolumeControl")) != null) {
         var2.setLevel(var1);
      }

   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      if (this.field_class_javax_microedition_media_Player_a != null) {
         try {
            this.field_class_javax_microedition_media_Player_a.realize();
            this.field_class_javax_microedition_media_Player_a.prefetch();
            this.field_class_javax_microedition_media_Player_a.start();
         } catch (MediaException var2) {
            var2.printStackTrace();
         }
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
   }
}
