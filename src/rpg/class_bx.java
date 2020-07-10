package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bx
public final class class_bx extends class_cb {
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;
   // $FF: renamed from: a short[]
   private short[] field_array_short_a;

   public class_bx(class_bt var1, char[] var2, boolean var3, char[] var4) {
      super(var1, (byte)1);
      this.field_array_char_a = var2;
      this.field_array_char_b = var4;
      this.field_boolean_c = var3;
      short[] var5 = new short[20];
      int var6 = 0;

      int var7;
      for(var7 = 0; var6 < var2.length; var6 += UIGeneral.func_int_a((char[])var2, var6, 130, 11)) {
         var5[var7++] = (short)var6;
      }

      this.field_array_short_a = new short[var7];
      System.arraycopy(var5, 0, this.field_array_short_a, 0, this.field_array_short_a.length);
      super.field_byte_a = (byte)this.field_array_short_a.length;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 == -8) {
         super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
         return true;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      boolean var4 = false;
      if (this.field_boolean_c) {
         var2 += 2;
         var3 += 15;
         class_cb.func_void_b(var1, var2 + 4, var3 + 10, 143, 139);
         var2 += 8;
         var3 += 25;
         var1.setColor(16777215);
         UIGeneral.func_void_a(var1, UIGeneral.field_array_char_m, UIGeneral.labelTextBack);
      } else {
         var1.setColor(4136767);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         class_bf.func_void_c(var1, var2, var3);
         UIGeneral.setFontDefault(true);
         var1.setColor(0);
         UIGeneral.func_void_a(var1, var2 + 155 >> 1, var3 + 5 + 4, this.field_array_char_b, 1);
         UIGeneral.setFontDefault(false);
         class_bf.func_void_b(var1, var2, var3 + 24, 3);
         var2 += 10;
         var3 += 43;
         var1.setColor(6242111);
         UIGeneral.func_void_a(var1, (char[])null, UIGeneral.labelTextBack);
      }

      MyGameCanvas.func_void_d(var1, var2 + 155 - 25, var3 - 8, super.field_byte_b + 1, super.field_byte_a);
      if (super.field_byte_a > 1) {
         if (super.field_byte_b > 0) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_k, var2 + 62, var3 - 6, 20);
         }

         if (super.field_byte_b < super.field_byte_a - 1) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_n, var2 + 62, var3 + 114, 20);
         }
      }

      short var5 = this.field_array_short_a[super.field_byte_b];
      short var6 = super.field_byte_b == super.field_byte_a - 1 ? (short)this.field_array_char_a.length : this.field_array_short_a[super.field_byte_b + 1];
      if (this.field_array_char_a[0] == '!' && var5 == 0) {
         var5 = 1;
      }

      if (this.field_boolean_c) {
         var1.setColor(16777215);
      } else {
         var1.setColor(0);
      }

      UIGeneral.func_void_a(var1, var2, var3 + 3, 130, 1, this.field_array_char_a, var5, 0, var6 - var5);
   }
}
