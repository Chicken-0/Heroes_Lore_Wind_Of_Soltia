package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import main.GameMIDlet;

// $FF: renamed from: bg
public final class class_bg extends MyGameCanvas implements Runnable {
   // $FF: renamed from: a byte
   private byte field_byte_a;
   // $FF: renamed from: b byte
   private byte field_byte_b;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: a short
   private short field_short_a;
   // $FF: renamed from: b short
   private short field_short_b;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: c short
   private short field_short_c;
   // $FF: renamed from: d short
   private short field_short_d;
   // $FF: renamed from: d byte
   private byte field_byte_d;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c = false;
   // $FF: renamed from: a bg
   public static class_bg field_class_bg_a;

   public class_bg() {
      new Object();
      this.field_byte_b = 0;
   }

   public final void keyPressed(int var1) {
      this.getGameAction(var1);
      if (class_bs.field_class_bs_a != null && !class_bs.field_class_bs_a.field_boolean_e) {
         switch(this.field_byte_a) {
         case 0:
            return;
         case 1:
            class_bw.func_void_f();
            class_ce.func_void_x();
            class_ce.func_void_z();
            this.func_void_a(false, (byte)1);
            return;
         case 2:
            this.field_byte_a = 3;
            this.field_int_a = 0;
            class_bs.field_class_bs_a.func_void_g();
            field_class_bg_a = this;
            (new Thread(field_class_bg_a)).start();
            return;
         case 6:
            GameMIDlet.instance.destroyApp(true);
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 9:
         default:
            return;
         case 10:
            this.func_void_c();
         }
      }
   }

   public final void run() {
      switch(this.field_byte_a) {
      case 0:
         switch(this.field_byte_b) {
         case 1:
            class_ce.func_void_o();
            MyGameCanvas.func_void_k();

            try {
               class_ad.field_class_z_b = new class_z("/itm/itmtp");
               MyGameCanvas.func_void_k();
               class_t.field_class_z_a = new class_z("/itm/itmatt");
               MyGameCanvas.func_void_k();
            } catch (IOException var3) {
            }

            class_ce.func_void_w();
            class_ce.func_void_y();

            try {
               if (class_au.func_boolean_a("/c")) {
                  class_bs.field_class_bs_a.func_void_j();
               } else {
                  if (!class_au.func_boolean_a("/c")) {
                     if (class_au.func_boolean_a(class_n.field_array_class_java_lang_String_a[0])) {
                        class_au.func_void_a(class_n.field_array_class_java_lang_String_a[0]);
                     }

                     if (class_au.func_boolean_a(class_n.field_array_class_java_lang_String_a[1])) {
                        class_au.func_void_a(class_n.field_array_class_java_lang_String_a[1]);
                     }

                     if (class_au.func_boolean_a(class_n.field_array_class_java_lang_String_a[2])) {
                        class_au.func_void_a(class_n.field_array_class_java_lang_String_a[2]);
                     }

                     if (class_au.func_boolean_a("/o")) {
                        class_au.func_void_a("/o");
                     }
                  }

                  class_bs.field_class_bs_a.func_void_i();
               }
            } catch (Exception var2) {
            }

            this.func_void_b();
            MyGameCanvas.func_void_k();
            return;
         case 2:
            class_bu.func_void_e();
            class_ce.func_void_A();
            class_bs.field_class_bs_a.func_void_d();
            this.field_byte_a = -1;
            this.field_byte_b = 0;
         }
      default:
      }
   }

   public final void paint(Graphics var1) {
      this.func_void_a(var1.getClipHeight());
      switch(this.field_byte_a) {
      case 0:
      default:
         break;
      case 1:
         var1.setColor(16777215);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         int var3 = MyGameCanvas.field_int_j - 68;
         int var4 = MyGameCanvas.canvasHalfWidth - 60;
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_j[2], var4 + 0, var3 + 25, 20);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_j[3], var4 + 52, var3 + 25, 20);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_j[4], var4 + 93, var3 + 2, 20);
         boolean var5 = false;
         var1.setColor(4136767);
         if (class_bh.labelTextVersion != null) {
            class_bh.func_int_a(var1, MyGameCanvas.canvasWidth - 2 - class_bh.func_int_a(class_bh.labelTextVersion), MyGameCanvas.field_int_h - 31, class_bh.labelTextVersion, 0);
         }

         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_k[this.field_byte_c < 4 ? this.field_byte_c : 8 - this.field_byte_c], this.field_short_a, this.field_short_b, 33);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_k[(this.field_byte_d < 4 ? this.field_byte_d : 8 - this.field_byte_d) + 5], this.field_short_c, this.field_short_d, 33);
         this.field_short_a = (short)(this.field_short_a + 10 * (this.field_byte_c < 4 ? 1 : -1));
         this.field_short_b = (short)(this.field_short_b + class_h.func_int_a(-1, 4));
         this.field_short_c = (short)(this.field_short_c + 10 * (this.field_byte_d < 4 ? -1 : 1));
         this.field_short_d = (short)(this.field_short_d + class_h.func_int_a(-1, 4));
         ++this.field_byte_c;
         ++this.field_byte_d;
         if (this.field_byte_c > 7) {
            this.field_byte_c = 0;
         }

         if (this.field_byte_d > 7) {
            this.field_byte_d = 0;
         }

         if (this.field_short_b > MyGameCanvas.field_int_h + 10) {
            this.field_short_a = (short)class_h.func_int_a(10, MyGameCanvas.canvasWidth / 2 - 10);
            this.field_short_b = (short)(-10 * class_h.func_int_a(0, 4));
            this.field_byte_c = (byte)class_h.func_int_a(0, 7);
         }

         if (this.field_short_d > MyGameCanvas.field_int_h + 10) {
            this.field_short_c = (short)class_h.func_int_a(MyGameCanvas.canvasWidth / 2 + 10, MyGameCanvas.canvasWidth - 10);
            this.field_short_d = (short)(-10 * class_h.func_int_a(3, 7));
            this.field_byte_d = (byte)class_h.func_int_a(0, 7);
         }

         if (this.field_int_a % 4 < 2) {
            var1.setColor(0);
            class_bh.func_void_a(var1, MyGameCanvas.canvasHalfWidth, MyGameCanvas.field_int_h - 45, class_bh.field_array_char_q, 1);
         }

         ++this.field_int_a;
         break;
      case 10:
         var1.setColor(16777215);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         if (this.field_byte_c > 40) {
            this.field_short_a = (short)(this.field_short_a * 2);
         }

         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_i[4], MyGameCanvas.canvasHalfWidth, this.field_int_a - this.field_short_a, 3);
         if (this.field_byte_c == 0) {
            if (this.field_int_a < MyGameCanvas.field_int_j - 1) {
               this.field_int_a += (MyGameCanvas.field_int_j - this.field_int_a) / 2;
            } else {
               this.field_byte_c = 1;
            }
         } else {
            switch(this.field_byte_c) {
            case 1:
            case 3:
               this.field_int_a = MyGameCanvas.field_int_j - 1;
               break;
            case 2:
            case 4:
               this.field_int_a = MyGameCanvas.field_int_j;
            }

            ++this.field_byte_c;
         }

         if (this.field_short_a > MyGameCanvas.field_int_h) {
            this.func_void_c();
         }
      }

      class_bs.field_class_bs_a.func_void_b();
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      MyGameCanvas.func_void_a("- INITIALIZE", 30);
      class_bh.func_void_a();
      MIDletConfig.init(GameMIDlet.instance);
      int var1;
      if ((var1 = MIDletConfig.getLangIdx()) >= 0) {
         System.out.println("langChoice " + var1);
         MyGameCanvas.field_int_m = 3;
         this.field_byte_b = 1;
         this.field_byte_a = 0;
         this.func_void_b(var1);
         (new Thread(this)).start();
      } else {
         MyGameCanvas.field_int_m = 3;
         this.field_byte_b = 1;
         this.field_byte_a = 0;
         this.func_void_b(1);
         (new Thread(this)).start();
      }
   }

   // $FF: renamed from: b (int) void
   private void func_void_b(int var1) {
      BabbleText.instance.func_void_a("/lang/language", "", var1);
      class_bh.func_void_a(BabbleText.instance);
      MIDletConfig.setVersionTextLabel();

      try {
         class_ce.field_class_z_g = new class_z("/sgui/com");
         class_bh.field_array_char_p = class_ce.field_class_z_g.func_array_char_a(37);
         class_bh.field_array_char_o = class_ce.field_class_z_g.func_array_char_a(38);
         MyGameCanvas.func_void_k();
         this.field_byte_b = 1;
      } catch (IOException var3) {
      }
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      class_bs.field_class_bs_a.func_void_a((int)20);
      this.field_int_a = -20;
      this.field_byte_c = 0;
      this.field_short_a = 1;
      this.field_byte_a = 10;
   }

   public final void hideNotify() {
      class_bw.func_void_a();
   }

   public final void showNotify() {
      class_bw.func_void_b();
   }

   // $FF: renamed from: c () void
   private final void func_void_c() {
      class_bs.field_class_bs_a.func_void_a((int)15);
      this.field_int_a = 0;
      this.field_byte_a = 1;
      this.field_short_a = (short)class_h.func_int_a(0, MyGameCanvas.canvasWidth / 2 - 10);
      this.field_short_b = (short)(10 * class_h.func_int_a(0, 4));
      this.field_byte_c = (byte)class_h.func_int_a(0, 7);
      this.field_short_c = (short)class_h.func_int_a(MyGameCanvas.canvasWidth / 2, MyGameCanvas.canvasWidth - 10);
      this.field_short_d = (short)(10 * class_h.func_int_a(3, 7));
      this.field_byte_d = (byte)class_h.func_int_a(0, 7);
      class_bw.func_void_b((int)22);
   }

   // $FF: renamed from: a (boolean, byte) void
   public final void func_void_a(boolean var1, byte var2) {
      class_bw.func_void_d();
      if (!var1 && (class_bs.field_class_bs_a.field_byte_b & (var2 == 1 ? 8 : 2)) != 0) {
         var1 = true;
      }

      if (var1 && !this.field_boolean_c) {
         this.field_byte_a = 0;
         this.field_byte_b = 2;
         MyGameCanvas.func_void_a("- STORY MODE", 52);
         class_bs.field_class_bs_a.func_void_g();
         (new Thread(this)).start();
      } else {
         this.field_byte_a = 2;
      }
   }

   static {
      "*:MAP UPDATE".toCharArray();
   }
}