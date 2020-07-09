package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bn
public final class class_bn extends class_cb {
   // $FF: renamed from: c boolean
   private boolean field_boolean_c = true;
   // $FF: renamed from: a p
   private class_p field_class_p_a;

   public class_bn(class_bm var1, class_p var2) {
      super(var1, (byte)3);
      this.field_class_p_a = var2;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 52 && var2 != 54 && var1 != 2 && var1 != 5) {
         if (var2 != 53 && var1 != 8) {
            if (var2 == -8) {
               super.field_class_cb_a.func_void_a();
               return true;
            } else {
               return true;
            }
         } else {
            Object[] var3;
            if (super.field_byte_b == 3) {
               var3 = new Object[]{class_ai.field_class_z_a.func_array_char_a(59), class_ai.field_class_z_a.func_array_char_a(60)};
               this.func_void_a((byte)1, (byte)0, var3);
            } else if (this.field_class_p_a.field_byte_g != super.field_byte_b && this.field_class_p_a.field_byte_h != super.field_byte_b) {
               if (!this.field_class_p_a.func_boolean_a(this.field_boolean_c, super.field_byte_b, false)) {
                  var3 = new Object[]{class_ai.field_class_z_a.func_array_char_a(62), class_ai.field_class_z_a.func_array_char_a(63)};
                  this.func_void_a((byte)1, (byte)0, var3);
               }
            } else {
               var3 = new Object[]{class_ai.field_class_z_a.func_array_char_a(61)};
               this.func_void_a((byte)1, (byte)0, var3);
            }

            return true;
         }
      } else {
         this.field_boolean_c = !this.field_boolean_c;
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 10;
      class_cb.func_void_a(var1, var2, var3, 132, 22);
      class_cb.func_void_b(var1, var2, var3, 132, 22);
      var3 += 19;
      class_cb.func_void_a(var1, var2, var3, 149, 140, 2039615, 10452799, 4144959);
      class_cb.func_void_a(var1, var2, var3, 149, 140, 6242111);
      var3 -= 19;
      int var4 = var2 + (this.field_boolean_c ? 0 : 66);
      var1.setColor(6242111);
      var1.fillRect(var4 + 2, var3 + 2, 62, 19);
      var1.setColor(4144959);
      var1.fillRect(var4 + 44 + 20, var3 + 1, 1, 19);
      var1.setColor(2039615);
      var1.fillRect(var4 + 45 + 20, var3 + 1, 1, 17);
      var1.fillRect(var4, var3 + 1, 1, 18);
      var1.fillRect(var4 + 1, var3, 64, 1);
      var1.setColor(10452799);
      var1.fillRect(var4 + 1, var3 + 2, 1, 18);
      var1.fillRect(var4 + 1, var3 + 1, 63, 1);
      int var5 = var3 + 5 + (this.field_boolean_c ? 0 : 2);
      int var6 = class_r.func_int_a(var1, class_ai.field_class_z_a.func_array_char_a(38), var2 + 6, var5);
      class_r.func_void_c(var1, 1, var6 + 3, var5, 4);
      if (this.field_class_p_a.field_byte_g != -1) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_c[this.field_class_p_a.field_byte_f * 4 + this.field_class_p_a.field_byte_g], var6 + 13, var5 - 2, 20);
      }

      int var7 = var3 + 5 + (this.field_boolean_c ? 2 : 0);
      var6 = class_r.func_int_a(var1, class_ai.field_class_z_a.func_array_char_a(38), var2 + 51 + 20, var7);
      class_r.func_void_c(var1, 3, var6 + 3, var7, 4);
      if (this.field_class_p_a.field_byte_h != -1) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_c[this.field_class_p_a.field_byte_f * 4 + this.field_class_p_a.field_byte_h], var6 + 13, var7 - 2, 20);
      }

      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_o, var2, var3 + 7, 20);
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 90 + 40, var3 + 7, 20);
      var1.setColor(4136767);
      class_cb.func_void_b(var1, var2 + 28, var3 + 26, 114, 127, 4136767);
      class_cb.func_void_b(var1, var2 + 3, var3 + 31 + super.field_byte_b * 20, 26, 19, 4136767);

      for(var5 = 0; var5 < 3; ++var5) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_c[this.field_class_p_a.field_byte_f * 4 + var5], var2 + 5, var3 + 48 + var5 * 20, 36);
      }

      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 34, var3 + 29, class_ce.field_class_z_c.func_array_char_a(this.field_class_p_a.field_byte_f * 8 + super.field_byte_b * 2), 1);
      var5 = class_r.func_int_a(var1, class_bh.field_array_char_s, var2 + 34, var3 + 44);
      class_r.func_void_c(var1, class_p.field_array_byte_h[super.field_byte_b], var5 + 3, var3 + 44, 4);
      var1.setColor(14663551);
      char[] var8 = class_ce.field_class_z_c.func_array_char_a(this.field_class_p_a.field_byte_f * 8 + super.field_byte_b * 2 + 1);
      class_bh.func_int_a(var1, var2 + 34, var3 + 53, 100, 1, var8);
   }
}
