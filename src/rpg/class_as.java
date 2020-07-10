package rpg;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: as
public final class class_as extends MyGameCanvas {
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: c int
   public static int field_int_c;
   // $FF: renamed from: d int
   public static int field_int_d;
   // $FF: renamed from: n int
   private static int field_int_n;
   // $FF: renamed from: o int
   private static int field_int_o;
   // $FF: renamed from: p int
   private static int field_int_p;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d;
   // $FF: renamed from: e boolean
   private boolean field_boolean_e;
   // $FF: renamed from: f boolean
   private boolean field_boolean_f;
   // $FF: renamed from: g boolean
   private boolean field_boolean_g;
   // $FF: renamed from: q int
   private int field_int_q;
   // $FF: renamed from: r int
   private int field_int_r;
   // $FF: renamed from: h boolean
   private boolean field_boolean_h;
   // $FF: renamed from: s int
   private int field_int_s;
   // $FF: renamed from: a al
   private class_al field_class_al_a;
   // $FF: renamed from: e int
   public static int field_int_e;
   // $FF: renamed from: a z
   private TableDefineTextFile field_class_z_a;
   // $FF: renamed from: t int
   private int field_int_t;
   // $FF: renamed from: u int
   private int field_int_u;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   private Image[] field_array_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: a java.util.Vector
   private Vector field_class_java_util_Vector_a;
   // $FF: renamed from: i boolean
   private boolean field_boolean_i;
   // $FF: renamed from: a char[]
   public char[] field_array_char_a = "".toCharArray();

   public class_as() {
      System.out.println("MyGameCanvas");
      field_int_a = MyGameCanvas.canvasWidth;
      field_int_b = MyGameCanvas.field_int_h - 21;
      field_int_c = field_int_a / 2 - 8;
      field_int_d = field_int_b / 2;
      field_int_n = (MyGameCanvas.canvasWidth - 74) / 6;
      field_int_o = MyGameCanvas.canvasWidth - 67;
      field_int_p = MyGameCanvas.canvasWidth - 6;
      this.field_boolean_d = true;
      this.field_int_q = 0;
      this.field_int_r = 0;
      this.field_int_s = 0;
   }

   public final void paint(Graphics var1) {
      synchronized(class_bs.field_class_java_lang_Object_a) {
         class_n.func_void_e();
         switch(class_n.field_int_e) {
         case 1:
            class_bu.func_void_a(var1);
            break;
         case 2:
            if (class_bs.field_class_bs_a.field_boolean_d) {
               class_n.func_void_g();
               class_n.func_void_i();
            } else {
               class_n.func_void_i();
               class_n.func_void_g();
            }

            if (class_n.field_int_e == 2) {
               if (!class_n.field_class_ae_a.field_boolean_b && class_bs.field_class_bs_a.field_boolean_d) {
                  class_n.func_void_a(true, true);
               }

               class_n.field_class_ae_a.func_void_a(var1);
               this.func_void_a(var1);
               if (class_x.activeDemoVersion && !class_bs.field_class_bs_a.field_boolean_a && class_n.func_class_ao_a().field_byte_g >= 8) {
                  class_n.func_void_a((byte)13, (byte)1);
                  return;
               }
            }
         case 3:
         default:
            break;
         case 4:
            class_n.func_void_j();
            if (class_n.field_int_e == 4) {
               class_ah.func_void_b();
               class_ah.func_void_a(var1);
            }
            break;
         case 5:
            class_ai.func_class_ai_a().func_void_b();
            class_ai.func_class_ai_a().func_void_c();
            class_ai.func_class_ai_a().func_void_a(var1);
            break;
         case 6:
            this.func_void_a(var1, class_bp.func_class_bp_a());
            class_bp.func_class_bp_a().func_void_a(var1);
            break;
         case 7:
            this.func_void_a(var1, class_ax.func_class_ax_a());
            class_ax.func_class_ax_a().func_void_a(var1);
            break;
         case 8:
            this.func_void_a(var1, class_aa.func_class_aa_a());
            class_aa.func_class_aa_a().func_void_a(var1);
            break;
         case 9:
            class_bf.func_class_bf_a().func_void_c();
            class_bf.func_class_bf_a().func_void_a(var1);
            break;
         case 10:
            func_void_b(var1);
            if (field_int_e > 0) {
               --field_int_e;
            }

            if (field_int_e == 0) {
               class_n.func_void_a((int)1);
               class_bu.func_void_d();
               SoundPlayerManager.stopTrack((byte)12);
            }
            break;
         case 11:
            this.func_void_a(var1, (class_cb)null);
            class_n.field_class_ae_a.func_void_b(var1);
            break;
         case 12:
            this.func_void_d(var1);
            break;
         case 13:
            this.func_void_e(var1);
            break;
         case 14:
            this.func_void_f(var1);
            break;
         case 15:
            char[] var3 = UIGeneral.labelTextPaused;
            UIGeneral.func_void_a(var1);
            var1.setColor(16777215);
            UIGeneral.func_void_a(var1, MyGameCanvas.canvasHalfWidth, MyGameCanvas.field_int_j - 15, var3, 1);
            UIGeneral.func_void_a(var1, UIGeneral.labelTextOk, (char[])null);
         }

         var1.setColor(16777215);
         class_bs.field_class_bs_a.func_void_b();
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, cb) void
   private final void func_void_a(Graphics var1, class_cb var2) {
      if (this.field_boolean_c) {
         class_n.field_class_ae_a.func_void_a(var1);
         this.func_void_a(var1);
         if (var2 != null) {
            var2.func_void_c();
         }
      }

   }

   public final void hideNotify() {
      SoundPlayerManager.stop();
      synchronized(class_bs.field_class_java_lang_Object_a) {
         if (class_n.field_int_e == 2) {
            this.keyReleased(-8);
            class_n.func_void_a((byte)13);
         } else if (class_n.field_int_e == 1) {
            class_n.func_void_a((int)15);
         }

      }
   }

   public final void showNotify() {
      SoundPlayerManager.play();
      synchronized(class_bs.field_class_java_lang_Object_a) {
         if (class_n.field_int_e == 2) {
            class_n.func_void_a((byte)13);
         }

      }
   }

   public final void keyPressed(int var1) {
      synchronized(class_bs.field_class_java_lang_Object_a) {
         if (var1 == -6) {
            var1 = 53;
         }

         if (var1 == -7) {
            var1 = -8;
         }

         if (class_bs.field_class_bs_a != null && !class_bs.field_class_bs_a.field_boolean_e) {
            super.field_boolean_a = true;
            int var3 = this.getGameAction(var1);
            switch(class_n.field_int_e) {
            case 2:
               this.func_void_a(var3, var1);
            case 3:
            case 10:
            case 13:
            default:
               break;
            case 4:
               class_ah.func_void_a(var3, var1);
               break;
            case 5:
               class_ai.func_class_ai_a().func_boolean_a(var3, var1);
               break;
            case 6:
               class_bp.func_class_bp_a().func_boolean_a(var3, var1);
               break;
            case 7:
               class_ax.func_class_ax_a().func_boolean_a(var3, var1);
               break;
            case 8:
               class_aa.func_class_aa_a().func_boolean_a(var3, var1);
               break;
            case 9:
               class_bf.func_class_bf_a().func_boolean_a(var3, var1);
               break;
            case 11:
               class_n.func_void_a((byte)2, (byte)2, (byte)1);
               class_bs.field_class_as_a.func_void_b();
               break;
            case 12:
               this.field_boolean_i = true;
               break;
            case 14:
               if (var3 == 8 || var1 == 53) {
                  class_n.func_void_a((byte)21, (byte)2);
               }
               break;
            case 15:
               if (var1 == 53) {
                  class_n.func_void_a((int)1);
               }
            }

         }
      }
   }

   public final void keyReleased(int var1) {
      synchronized(class_bs.field_class_java_lang_Object_a) {
         if (var1 == -6) {
            var1 = 53;
         }

         if (var1 == -7) {
            var1 = -8;
         }

         if (class_n.field_int_e == 2) {
            if (super.field_boolean_a) {
               super.field_int_f = var1;
            } else {
               switch(class_n.func_byte_a()) {
               case 2:
                  class_n.func_void_h();
               default:
               }
            }
         }
      }
   }

   // $FF: renamed from: a (int, int) void
   private final void func_void_a(int var1, int var2) {
      switch(var2) {
      case -8:
         if (class_n.func_class_ao_a().field_byte_h == 1) {
            class_n.func_void_a((byte)13);
            return;
         }
         break;
      case 35:
         class_n.func_class_ao_a().field_class_g_a.func_void_b();
         this.func_void_b();
         return;
      case 48:
         if (class_n.func_class_ao_a().field_byte_h == 1 && class_n.field_class_ae_a.field_byte_b <= 14) {
            class_n.func_void_a((byte)2, (byte)11, (byte)3);
            return;
         }
         break;
      case 49:
         class_n.func_class_ao_a().func_void_a(true);
         return;
      case 50:
         class_n.func_void_b((byte)1);
         return;
      case 51:
         class_n.func_class_ao_a().func_void_a(false);
         return;
      case 52:
         class_n.func_void_b((byte)3);
         return;
      case 53:
         if (class_n.func_boolean_a()) {
            return;
         }

         if (class_ah.func_boolean_a()) {
            return;
         }

         class_n.func_void_a(false);
         return;
      case 54:
         class_n.func_void_b((byte)4);
         return;
      case 55:
         class_n.func_void_a(true);
         return;
      case 56:
         class_n.func_void_b((byte)2);
         return;
      case 57:
         class_n.func_class_ao_a().func_void_k();
         return;
      default:
         switch(var1) {
         case 1:
            class_n.func_void_b((byte)1);
            return;
         case 2:
            class_n.func_void_b((byte)3);
            return;
         case 3:
         case 4:
         case 7:
         default:
            break;
         case 5:
            class_n.func_void_b((byte)4);
            return;
         case 6:
            class_n.func_void_b((byte)2);
            return;
         case 8:
            if (class_n.func_boolean_a()) {
               this.func_void_b();
               return;
            }

            if (class_ah.func_boolean_a()) {
               return;
            }

            class_n.func_void_a(false);
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4) {
      if (var2 + var4 > field_int_b) {
         var4 = field_int_b - var2;
      }

      var0.setClip(var1, var2, var3, var4);
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_boolean_c = true;
      this.func_void_b();
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      this.field_boolean_d = true;
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      this.field_boolean_e = true;
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      this.field_boolean_f = true;
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      this.field_boolean_g = true;
   }

   // $FF: renamed from: f () void
   public final void func_void_f() {
      this.field_int_r = 0;
      this.field_boolean_h = false;
      this.field_int_s = 0;
      this.field_class_al_a = null;
   }

   // $FF: renamed from: g () void
   public final void func_void_g() {
      class_bu.func_void_f();
      class_bu.func_void_g();
      class_bu.func_void_h();
      SoundPlayerManager.close();
      field_int_e = -16;
      this.field_int_t = 0;
      this.field_int_u = -1;

      try {
         this.field_class_z_a = new TableDefineTextFile("/sgui/ed" + class_n.field_byte_a);
         SoundPlayerManager.setupSoundPlayer((byte)23);
         SoundPlayerManager.startPlayer1((int)23);
         PNGMerger var1;
         switch(class_n.field_byte_a) {
         case 6:
            try {
               (var1 = new PNGMerger("/m/face")).enableLoad = true;
               this.field_array_class_javax_microedition_lcdui_Image_a = new Image[2];
               this.field_array_class_javax_microedition_lcdui_Image_a[0] = var1.getImageGrayscale(0);
               this.field_array_class_javax_microedition_lcdui_Image_a[1] = var1.getImageGrayscale(8);
            } catch (IOException var3) {
               var3.printStackTrace();
            }
            break;
         case 8:
            try {
               (var1 = new PNGMerger("/m/face")).enableLoad = true;
               this.field_array_class_javax_microedition_lcdui_Image_a = new Image[1];
               this.field_array_class_javax_microedition_lcdui_Image_a[0] = var1.getImageById(17);
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }

      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $FF: renamed from: h () void
   public final void func_void_h() {
      field_int_e = 0;
      this.field_int_t = 0;
      this.field_int_u = -1;
      this.field_class_java_util_Vector_a = new Vector();

      try {
         this.field_class_z_a = new TableDefineTextFile("/sgui/edsr");
         PNGMerger var1;
         (var1 = new PNGMerger("/img/end")).enableLoad = true;
         this.field_array_class_javax_microedition_lcdui_Image_a = new Image[1];
         this.field_array_class_javax_microedition_lcdui_Image_a[0] = var1.getImageById(class_n.field_byte_a - 6);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: a (char[], int) void
   public final void func_void_a(char[] var1, int var2) {
      if (this.field_int_r > 0) {
         this.field_boolean_h = true;
      }

      this.field_int_r = var2;
      this.field_array_char_a = var1;
   }

   // $FF: renamed from: a (al, boolean) void
   public final void func_void_a(class_al var1, boolean var2) {
      this.field_int_s = 24;
      if (!var2 || this.field_class_al_a == null) {
         if (this.field_class_al_a != var1) {
            this.field_class_al_a = var1;
         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      class_ao var2;
      class_p var3 = (var2 = class_n.func_class_ao_a()).func_class_p_a();
      boolean var4 = false;
      int var5 = MyGameCanvas.field_int_h - 31 - 5;
      if (var2.field_short_a > 0) {
         ++this.field_int_q;
         if (this.field_int_q < 5) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_v, 5, var5 + 9, 36);
         }

         if (this.field_int_q >= 8) {
            this.field_int_q = 0;
         }
      }

      if (this.field_boolean_d) {
         var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      } else {
         var1.setClip(0, var5, MyGameCanvas.canvasWidth, 15);
      }

      func_void_a(var1, 0, var5);
      class_ad var6 = var2.field_class_g_a.func_class_ad_a();
      byte var7 = var2.field_class_g_a.func_byte_a();
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_d[var7], MyGameCanvas.canvasWidth - 10, var5 + 19, 3);
      if (var6 != null) {
         MyGameCanvas.func_void_c(var1, var6.field_byte_h, MyGameCanvas.canvasWidth - 4, var5 + 22, 24);
      } else {
         MyGameCanvas.func_void_c(var1, 0, MyGameCanvas.canvasWidth - 4, var5 + 22, 24);
      }

      if (var3.field_byte_g != -1) {
         var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         var1.setColor(0);
         var1.drawRect(7, var5 + 15, 14, 14);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_c[var3.field_byte_f * 4 + var3.field_byte_g], 7, var5 + 15, 20);
         if (var3.field_array_short_c[var3.field_byte_g] != 0) {
            var1.setColor(12525375);
            var1.drawRect(7, var5 + 15, 14, 14);
         }

         var1.setClip(8, var5 + 16, 13, 13 * var3.field_array_short_c[var3.field_byte_g] / class_p.field_array_short_b[var3.field_byte_f * 3 + var3.field_byte_g]);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_C, 7, var5 + 15, 20);
      }

      if (var3.field_byte_h != -1) {
         var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         var1.setColor(0);
         var1.drawRect(29, var5 + 15, 14, 14);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_c[var3.field_byte_f * 4 + var3.field_byte_h], 29, var5 + 15, 20);
         if (var3.field_array_short_c[var3.field_byte_h] != 0) {
            var1.setColor(12525375);
            var1.drawRect(29, var5 + 15, 14, 14);
         }

         var1.setClip(30, var5 + 16, 13, 13 * var3.field_array_short_c[var3.field_byte_h] / class_p.field_array_short_b[var3.field_byte_f * 3 + var3.field_byte_h]);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_C, 29, var5 + 15, 20);
      }

      var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      int var10;
      if (this.field_boolean_d || this.field_boolean_e) {
         var10 = var2.field_int_a * field_int_o / var2.field_int_d;
         var1.setClip(47, var5 + 18, field_int_o, 7);
         func_void_a(var1, 0, var5);
         if (var10 > 0) {
            var1.setColor(16711680);
            var1.fillRect(47, var5 + 20, var10, 4);
            var1.setColor(16752447);
            var1.fillRect(47, var5 + 21, var10, 2);
         }

         MyGameCanvas.func_void_c(var1, var2.field_int_a, 46 + field_int_o - 2, var5 + 18, 8);
         this.field_boolean_e = false;
         var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      }

      if (this.field_boolean_d || this.field_boolean_f) {
         var10 = var2.field_int_b * field_int_o / var2.field_int_e;
         var1.setColor(4194239);
         var1.fillRect(47, var5 + 27, var10, 2);
         var1.setColor(0);
         var1.fillRect(47 + var10, var5 + 27, field_int_o - var10, 2);
         this.field_boolean_f = false;
      }

      if (this.field_boolean_d || this.field_boolean_g) {
         var10 = var2.field_int_c * field_int_p / var2.field_int_f;
         var1.setColor(10461055);
         var1.fillRect(0, var5 + 31, MyGameCanvas.canvasWidth, 5);
         var1.setColor(4144959);
         var1.fillRect(2, var5 + 32, MyGameCanvas.canvasWidth - 4, 3);
         var1.setColor(12566399);
         var1.drawLine(3, var5 + 33, 3 + var10 - 1, var5 + 33);
         this.field_boolean_g = false;
      }

      int var11;
      if (this.field_int_s > 0 && this.field_class_al_a != null && this.field_class_al_a.field_byte_h != 6) {
         var10 = MyGameCanvas.canvasWidth - 105;
         var11 = 2;
         if (var3 != null && var3.field_byte_i == 2) {
            var11 += 20;
         }

         class_cb.func_void_a(var1, var10, var11, 105, 27, false);
         var1.translate(var10 + 2, var11 + 2);
         int var8 = 16777215;
         if (this.field_class_al_a.field_class_j_a.field_byte_b == 1) {
            var8 = 16744239;
         } else if (this.field_class_al_a.field_class_j_a.field_byte_b == 2) {
            var8 = 16776991;
         }

         class_cb.func_void_a(var1, 0, 0, 101, 23, this.field_class_al_a.field_class_j_a.field_array_char_a, 0, 1, 6233919, var8);
         boolean var9 = false;
         int var12 = MyGameCanvas.func_int_a(var1, (String)UIGeneral.labelTextLV, 1, 16);
         MyGameCanvas.func_void_c(var1, this.field_class_al_a.field_class_j_a.field_byte_f, var12, 16, 4);
         var1.translate(-(var10 + 2), -(var11 + 2));
         var1.setColor(16727855);
         if (this.field_class_al_a.field_short_a > 0) {
            var1.fillRect(var10 + 24 + 5, var11 + 22, 77 * (this.field_class_al_a.field_short_a - 1) / this.field_class_al_a.field_class_j_a.field_short_a + 1 - 5, 2);
         }

         --this.field_int_s;
      } else {
         this.field_class_al_a = null;
      }

      if (var3 != null && var3.field_byte_i == 2) {
         var3.func_void_a(var1);
      }

      var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      if (this.field_boolean_h) {
         this.field_boolean_h = false;
      } else {
         if (this.field_int_r > 0) {
            var10 = MyGameCanvas.canvasHalfWidth - 50;
            var11 = MyGameCanvas.field_int_h - 46;
            class_cb.func_void_a(var1, var10, var11, 100, 23, false);
            var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
            class_cb.func_void_a(var1, var10 + 2, var11 + 2, 96, 19, this.field_array_char_a, 0, 1, 6233919, 16777215);
            --this.field_int_r;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   private static final void func_void_a(Graphics var0, int var1, int var2) {
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[1], var1, var2 + 12, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[1], var1 + 22, var2 + 12, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[2], var1 + 23, var2 + 23, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[3], var1 + 44, var2 + 12, 20);

      for(int var3 = 0; var3 < field_int_n; ++var3) {
         var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[4], var1 + 49 + var3 * 6, var2 + 14, 20);
      }

      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[0], var1, var2 + 9, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[6], MyGameCanvas.canvasWidth - 26, var2, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_q[5], MyGameCanvas.canvasWidth - 30, var2 + 11, 20);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], byte, int, int) void
   public static final void func_void_a(Graphics var0, byte[] var1, byte var2, int var3, int var4) {
      if (var1 != null && var2 < var1[0]) {
         int var5 = 1 + var2 * 4;
         Image[] var6 = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[var1[var5 + 2]];
         byte var7;
         if ((var7 = var1[var5 + 3]) != -1 && var6[var7] != null) {
            var0.drawImage(var6[var7], var3 + var1[var5], var4 + var1[var5 + 1], 20);
         }

      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, byte[], byte, int, int) void
   public static final void func_void_b(Graphics var0, byte[] var1, byte var2, int var3, int var4) {
      if (var1 != null && var2 < var1[0]) {
         int var5 = 1;

         for(int var6 = 0; var6 < var2; ++var6) {
            byte var7 = var1[var5++];
            var5 += var7 * 4;
         }

         byte var10 = var1[var5++];

         for(int var11 = 0; var11 < var10; ++var11) {
            Image[] var8 = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[var1[var5 + 2]];
            byte var9;
            if ((var9 = var1[var5 + 3]) != -1 && var8[var9] != null) {
               var0.drawImage(var8[var9], var3 + var1[var5], var4 + var1[var5 + 1], 20);
            }

            var5 += 4;
         }

      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setColor(0);
      class_cb.func_void_a(var0, var1, var2, var3, var4);
      class_cb.func_void_b(var0, var1, var2, var3, var4);
      var1 += 4;
      var2 += 6;
      var3 -= 8;
      var0.setColor(16777215);
      UIGeneral.func_int_a(var0, var1 + 5, var2, class_ce.field_class_z_g.loadByIndex(31), 1);
      var0.setColor(16723759);
      var0.drawLine(var1, var2 + 17 + 0, var1 + var3 * MyGameCanvas.field_int_k / MyGameCanvas.field_int_l, var2 + 17 + 0);
      var0.drawLine(var1, var2 + 17 + 1, var1 + var3 * MyGameCanvas.field_int_k / MyGameCanvas.field_int_l, var2 + 17 + 1);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public static final void func_void_b(Graphics var0) {
      var0.setColor(0);
      var0.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      class_n.func_class_ao_a().func_void_d(var0, MyGameCanvas.canvasHalfWidth, MyGameCanvas.field_int_j + 20);
      char[] var1;
      int var2 = UIGeneral.getTextWidth(var1 = class_ce.field_class_z_g.loadByIndex(32));
      System.out.println(UIGeneral.toString(var1));
      var0.setColor(8355711);
      UIGeneral.func_void_a(var0, MyGameCanvas.canvasHalfWidth - var2 / 2 + 1, MyGameCanvas.field_int_j - 20 + 1, 200, 1, var1, 0, 0, (17 - field_int_e) * 2);
      var0.setColor(16777215);
      UIGeneral.func_void_a(var0, MyGameCanvas.canvasHalfWidth - var2 / 2, MyGameCanvas.field_int_j - 20, 200, 1, var1, 0, 0, (17 - field_int_e) * 2);
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics) void
   private final void func_void_d(Graphics var1) {
      int var5;
      if (field_int_e < 0) {
         var5 = 255 * -field_int_e / 16;
         var1.setColor(var5, var5, var5);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         ++field_int_e;
      } else {
         var1.setColor(0);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         if (this.field_boolean_i || this.field_int_u == -1) {
            this.field_boolean_i = false;
            ++this.field_int_u;

            for(this.field_int_t = this.field_int_u; this.field_int_u < this.field_class_z_a.numberEntry; ++this.field_int_u) {
               char[] var2;
               if ((var2 = this.field_class_z_a.loadByIndex(this.field_int_u))[0] == '_') {
                  field_int_e = Integer.parseInt(new String(var2, 1, var2.length - 1));
                  break;
               }
            }
         }

         if (this.field_int_u >= this.field_class_z_a.numberEntry) {
            this.field_class_z_a = null;
            this.field_array_class_javax_microedition_lcdui_Image_a = null;
            this.func_void_h();
            class_n.func_void_a((byte)2, (byte)13, (byte)1);
         } else {
            var5 = MyGameCanvas.field_int_j - (this.field_int_u - this.field_int_t + 1) * 15 / 2;
            switch(class_n.field_byte_a) {
            case 6:
               if (this.field_int_t == 2 || this.field_int_t == 6 || this.field_int_t == 9 || this.field_int_t == 13) {
                  var1.setColor(12566463);
                  var1.fillRect(0, 15, MyGameCanvas.canvasWidth, 40);
                  var1.setClip(0, 15, MyGameCanvas.canvasWidth, 40);
                  var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], MyGameCanvas.canvasWidth / 4, 5, 17);
                  if (this.field_int_t == 9) {
                     var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[1], MyGameCanvas.canvasWidth / 4 * 3 + (field_int_e >= 27 ? (field_int_e - 27) * 10 : 0), 5, 17);
                  }

                  var1.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
                  var5 += 30;
               }
               break;
            case 8:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h, 40);
            }

            var1.setColor(16777215);

            for(int var3 = this.field_int_t; var3 < this.field_int_u; ++var3) {
               char[] var4 = this.field_class_z_a.loadByIndex(var3);
               UIGeneral.func_int_a(var1, MyGameCanvas.canvasHalfWidth - UIGeneral.getTextWidth(var4) / 2, var5, var4, 1);
               var5 += 15;
            }

            if (field_int_e > 0) {
               --field_int_e;
            }

         }
      }
   }

   // $FF: renamed from: e (javax.microedition.lcdui.Graphics) void
   private final void func_void_e(Graphics var1) {
      var1.setColor(0);
      var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], 0, MyGameCanvas.field_int_h / 2, 6);
      if (field_int_e == 0 && this.field_int_t < this.field_class_z_a.numberEntry) {
         char[] var2;
         if ((var2 = this.field_class_z_a.loadByIndex(this.field_int_t))[0] == '-') {
            field_int_e = 4;
         } else if (var2[0] == '=') {
            field_int_e = 10;
         } else {
            Image var3;
            Graphics var4;
            (var4 = (var3 = Image.createImage(UIGeneral.getTextWidth(var2), UIGeneral.func_int_a())).getGraphics()).setColor(0);
            var4.fillRect(0, 0, var3.getWidth(), var3.getHeight());
            var4.setColor(16777215);
            UIGeneral.func_int_a(var4, 0, 0, var2, 1);
            this.field_class_java_util_Vector_a.addElement(new class_bc(var3, MyGameCanvas.field_int_h));
            field_int_e = 5;
         }

         ++this.field_int_t;
      }

      if (this.field_int_t >= this.field_class_z_a.numberEntry && this.field_class_java_util_Vector_a.size() == 0) {
         this.field_class_java_util_Vector_a = null;
         this.field_class_z_a = null;
         this.field_array_class_javax_microedition_lcdui_Image_a = null;
         SoundPlayerManager.close();
         SoundPlayerManager.stopTrack((byte)23);
         class_n.func_void_a((byte)21, (byte)2);
      } else {
         if (field_int_e > 0) {
            --field_int_e;
         }

         for(int var6 = this.field_class_java_util_Vector_a.size() - 1; var6 >= 0; --var6) {
            class_bc var5 = (class_bc)this.field_class_java_util_Vector_a.elementAt(var6);
            var1.drawImage(var5.field_class_javax_microedition_lcdui_Image_a, MyGameCanvas.canvasHalfWidth, var5.field_int_a, 17);
            var5.field_int_a -= 2;
            if (var5.field_int_a < -8) {
               this.field_class_java_util_Vector_a.removeElementAt(var6);
            }
         }

      }
   }

   // $FF: renamed from: f (javax.microedition.lcdui.Graphics) void
   private final void func_void_f(Graphics var1) {
      char[] var2 = class_ce.field_class_z_g.loadByIndex(33);
      char[] var3 = class_ce.field_class_z_g.loadByIndex(34);
      char[] var4 = class_ce.field_class_z_g.loadByIndex(35);
      char[] var5 = class_ce.field_class_z_g.loadByIndex(36);
      var1.setColor(0);
      var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      int var6 = MyGameCanvas.canvasHalfWidth - 55;
      int var7 = MyGameCanvas.field_int_j - 36;
      class_cb.func_void_a(var1, var6, var7, 110, 72);
      class_cb.func_void_b(var1, var6, var7, 110, 72);
      var1.setColor(16777215);
      UIGeneral.func_int_a(var1, var6 + 5, var7 + 5, var2, 1);
      UIGeneral.func_int_a(var1, var6 + 5, var7 + 21, var3, 1);
      UIGeneral.func_int_a(var1, var6 + 5, var7 + 37, var4, 1);
      UIGeneral.func_int_a(var1, var6 + 5, var7 + 53, var5, 1);
   }
}
