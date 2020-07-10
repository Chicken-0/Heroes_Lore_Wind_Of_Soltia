package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMIDlet;

// $FF: renamed from: bf
public final class class_bf extends class_cb {
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: e boolean
   private boolean field_boolean_e;
   // $FF: renamed from: h byte[]
   private byte[] field_array_byte_h;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: d byte
   private byte field_byte_d;
   // $FF: renamed from: a long
   private long field_long_a;
   // $FF: renamed from: c int
   private static int field_int_c = 5;
   // $FF: renamed from: d int
   private static int field_int_d = 5;
   // $FF: renamed from: a bf
   private static class_bf field_class_bf_a;
   // $FF: renamed from: c boolean
   public static boolean field_boolean_c;
   // $FF: renamed from: d boolean
   public static boolean field_boolean_d;

   // $FF: renamed from: a () bf
   public static final class_bf func_class_bf_a() {
      return field_class_bf_a;
   }

   private class_bf(boolean var1, byte[] var2) {
      super((class_cb)null, (byte)6);
      if (MIDletConfig.buySetupOnMenu) {
         ++super.field_byte_a;
      }

      this.field_boolean_e = var1;
      this.field_array_byte_h = var2;
      this.field_byte_c = 0;
      if (field_boolean_d || field_boolean_c) {
         class_ce.func_void_w();
         this.field_long_a = System.currentTimeMillis() + 5000L;
         if (field_boolean_d) {
            this.field_byte_d = 2;
            field_boolean_d = false;
            return;
         }

         if (field_boolean_c) {
            this.field_byte_d = 3;
            field_boolean_c = false;
         }
      }

   }

   // $FF: renamed from: a (boolean, byte[]) void
   public static final void func_void_a(boolean var0, byte[] var1) {
      field_int_a = MyGameCanvas.canvasHalfWidth - 77;
      field_int_b = MyGameCanvas.field_int_j - 85;
      field_class_bf_a = new class_bf(var0, var1);
      if (MIDletConfig.buySetupOnMenu) {
         field_int_c = 6;
         field_int_d = 5;
      }

   }

   // $FF: renamed from: d () void
   public static final void func_void_d() {
      field_class_bf_a = null;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.field_long_a > 0L) {
         if (!MIDletConfig.isDemoVersion && MIDletConfig.buySetupOnExit) {
            if (var2 == 53) {
               class_bh.func_void_a(MIDletConfig.urlApp);
            } else if (var2 == -8) {
               GameMIDlet.instance.endApp();
            }
         }

         return true;
      } else if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_a(var1, var2, false)) {
         if (!this.field_boolean_e && super.field_byte_b == 1) {
            if (var1 != 6 && var2 != 56) {
               --super.field_byte_b;
            } else {
               ++super.field_byte_b;
            }
         }

         this.field_byte_c = 0;
         return true;
      } else {
         Object[] var3;
         if (var2 == -8) {
            var3 = new Object[]{class_bh.field_array_char_a};
            this.func_void_a((byte)2, (byte)2, var3);
            this.field_byte_d = 2;
         }

         if (var1 == 8 || var2 == 53) {
            switch(super.field_byte_b) {
            case 0:
               if (this.field_boolean_e) {
                  this.field_byte_d = 0;
                  var3 = new Object[]{class_bh.getTextById(3929).toCharArray()};
                  this.func_void_a((byte)12, (byte)2, var3, class_bh.field_array_char_d, class_bh.field_array_char_e);
               } else {
                  super.field_class_cb_b = new class_c(this);
               }
               break;
            case 1:
               super.field_class_cb_b = new class_a(this, this.field_array_byte_h);
               break;
            case 2:
               super.field_class_cb_b = new class_be(this, false);
               break;
            case 3:
               super.field_class_cb_b = new class_bt(this, false);
               break;
            case 4:
               super.field_class_cb_b = new class_bl(this, false);
               break;
            default:
               if (super.field_byte_b == field_int_c) {
                  var3 = new Object[]{class_bh.field_array_char_a};
                  this.field_byte_d = 2;
                  this.func_void_a((byte)2, (byte)2, var3);
               } else if (super.field_byte_b == field_int_d) {
                  var3 = new Object[]{class_bh.getTextById(3918).toCharArray()};
                  this.field_byte_d = 3;
                  this.func_void_a((byte)12, (byte)2, var3);
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if (var1 == 2 || var1 == 12) {
         if (var2 == 0) {
            switch(this.field_byte_d) {
            case 0:
               super.field_class_cb_b = new class_c(this);
            case 1:
            default:
               break;
            case 2:
               if (MIDletConfig.isDemoVersion) {
                  Object[] var3 = new Object[]{class_bh.getTextById(3919).toCharArray()};
                  this.field_byte_d = 4;
                  this.func_void_a((byte)12, (byte)2, var3, class_bh.field_array_char_j, class_bh.field_array_char_c);
               } else {
                  class_ce.func_void_w();
                  this.field_long_a = System.currentTimeMillis() + 5000L;
               }
               break;
            case 3:
            case 4:
               class_bh.func_void_a(MIDletConfig.urlApp);
            }

            return;
         }

         switch(this.field_byte_d) {
         case 4:
            class_ce.func_void_w();
            this.field_long_a = System.currentTimeMillis() + 5000L;
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      if (this.field_long_a > 0L) {
         var1.setColor(16777215);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_i[4], MyGameCanvas.canvasHalfWidth, class_as.field_int_d, 3);
         var1.setColor(0);
         class_bh.func_void_a(var1, MyGameCanvas.canvasWidth >> 1, MyGameCanvas.field_int_h - 23, class_bh.field_array_char_b, 1);
         class_bh.func_void_a(var1, MyGameCanvas.canvasWidth >> 1, 10, BabbleText.instance.getTextById(3941).toCharArray(), 1);
         if (!MIDletConfig.isDemoVersion && MIDletConfig.buySetupOnExit) {
            class_bh.func_void_a(var1, MIDletConfig.func_class_java_lang_String_a().toCharArray(), class_bh.field_array_char_c);
         }

         if (System.currentTimeMillis() > this.field_long_a) {
            GameMIDlet.instance.endApp();
         }

      } else {
         this.func_void_b(var1, field_int_a, field_int_b);
         if (this.field_byte_c < 2 && super.field_class_cb_b == null) {
            super.field_boolean_a = true;
            ++this.field_byte_c;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var3 += 13;
      var1.setColor(4136767);
      var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      func_void_b(var1, var2, var3 - 12, 4);
      byte var4 = 18;
      if (this.field_byte_c == 0) {
         var4 = 14;
      } else if (this.field_byte_c == 1) {
         var4 = 16;
      }

      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[var4], var2 + (155 - class_ce.field_array_class_javax_microedition_lcdui_Image_l[var4].getWidth()) >> 1, var3 + 12 + super.field_byte_b * 16, 20);

      for(int var5 = 0; var5 < super.field_byte_a; ++var5) {
         int var6 = var3 + 14 + var5 * 16;
         byte var7 = (byte)(var5 * 2);
         if (super.field_byte_b != var5 || this.field_byte_c < 2) {
            ++var7;
         }

         class_bh.func_void_a(var1, var7, var2 + 155 >> 1, var6);
      }

      class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_c);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int) void
   public static final void func_void_c(Graphics var0, int var1, int var2) {
      boolean var3 = false;
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[0], var1, var2, 20);
      Image var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[1];
      int var4 = var1 + 12;
      var0.drawImage(var10001, var4, var2, 20);

      int var5;
      for(var5 = 0; var5 < 3; ++var5) {
         var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[1];
         var4 += 32;
         var0.drawImage(var10001, var4, var2, 20);
      }

      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[2];
      var4 += 32;
      var0.drawImage(var10001, var4, var2, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[11], var1, var2 + 12, 20);
      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[12];
      var4 = var1 + 12;
      var0.drawImage(var10001, var4, var2 + 12, 20);

      for(var5 = 0; var5 < 3; ++var5) {
         var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[12];
         var4 += 32;
         var0.drawImage(var10001, var4, var2 + 12, 20);
      }

      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[13];
      var4 += 32;
      var0.drawImage(var10001, var4, var2 + 12, 20);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3) {
      boolean var4 = false;
      ++var3;
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[3], var1, var2, 20);
      Image var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[4];
      int var5 = var1 + 12;
      var0.drawImage(var10001, var5, var2, 20);

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[4];
         var5 += 32;
         var0.drawImage(var10001, var5, var2, 20);
      }

      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[5];
      var5 += 32;
      var0.drawImage(var10001, var5, var2, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[6], var1, var2 + 12, 20);
      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[7];
      var5 = var1 + 12;
      var0.drawImage(var10001, var5, var2 + 12, 20);

      for(var6 = 0; var6 < 3; ++var6) {
         var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[7];
         var5 += 32;
         var0.drawImage(var10001, var5, var2 + 12, 20);
      }

      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[8];
      var5 += 32;
      var0.drawImage(var10001, var5, var2 + 12, 20);
      var5 = var1;

      int var7;
      for(var7 = 0; var7 < var3; ++var7) {
         var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[9], var5, var2 + 36 + 24 * var7, 20);
         var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[10], var5 + 12 + 128, var2 + 36 + 24 * var7, 20);
      }

      var0.setColor(16763769);
      var0.fillRect(var5 + 12, var2 + 36, 128, 24 * var3);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[11], var1, var2 + 36 + 24 * var3, 20);
      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[12];
      var5 = var1 + 12;
      var0.drawImage(var10001, var5, var2 + 36 + 24 * var3, 20);

      for(var7 = 0; var7 < 3; ++var7) {
         var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[12];
         var5 += 32;
         var0.drawImage(var10001, var5, var2 + 36 + 24 * var3, 20);
      }

      var10001 = class_ce.field_array_class_javax_microedition_lcdui_Image_l[13];
      var5 += 32;
      var0.drawImage(var10001, var5, var2 + 36 + 24 * var3, 20);
   }
}
