package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: s
public final class class_s extends class_cb {
   // $FF: renamed from: h byte[]
   private byte[] field_array_byte_h;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: d byte
   private byte field_byte_d;
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;

   public class_s(class_cb var1) {
      super(var1, (byte)0);
      int var2 = class_n.field_array_array_boolean_a[class_n.field_byte_a - 6].length;
      int var3 = 0;
      this.field_array_byte_h = new byte[var2 * 2];

      for(byte var4 = 0; var4 < var2; ++var4) {
         if (!class_n.func_boolean_b(1 + var4 * 3 + 1)) {
            if (class_n.func_boolean_b(1 + var4 * 3 + 2)) {
               if (class_n.func_boolean_b(1 + var4 * 3) && class_ce.field_class_z_f.loadByIndex(var4 * 7 + 2).length > 0) {
                  this.field_array_byte_h[var3++] = var4;
                  this.field_array_byte_h[var3++] = 2;
               }
            } else if (class_n.func_boolean_b(1 + var4 * 3) && class_ce.field_class_z_f.loadByIndex(var4 * 7).length > 0) {
               this.field_array_byte_h[var3++] = var4;
               this.field_array_byte_h[var3++] = 0;
            }
         }
      }

      super.field_byte_a = (byte)(var3 / 2);
      this.func_void_d();
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         super.field_class_cb_a.field_boolean_a = true;
         this.func_void_d();
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         if (super.field_byte_a > 0) {
            super.field_class_cb_b = new class_am(this, this.field_array_char_a, this.field_array_char_b, (byte)0);
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if (var1 == 0 && var2 == 1) {
         super.field_class_cb_b = new class_am(this, class_ai.field_class_z_a.loadByIndex(54), class_ce.field_class_z_f.loadByIndex(this.field_byte_c * 7 + 6), (byte)1);
      }

   }

   // $FF: renamed from: d () void
   private final void func_void_d() {
      this.field_byte_c = this.field_array_byte_h[super.field_byte_b * 2];
      this.field_byte_d = this.field_array_byte_h[super.field_byte_b * 2 + 1];
      int var1;
      if (this.field_byte_d == 2) {
         var1 = this.field_byte_c * 7 + 2;
         this.field_array_char_a = class_ce.field_class_z_f.loadByIndex(var1);
         this.field_array_char_b = class_ce.field_class_z_f.loadByIndex(var1 + 1);
      } else {
         var1 = this.field_byte_c * 7 + 0;
         this.field_array_char_a = class_ce.field_class_z_f.loadByIndex(var1);
         this.field_array_char_b = class_ce.field_class_z_f.loadByIndex(var1 + 1);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 15;
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(39), var2 + 5, var3);
      if (super.field_byte_a <= 0) {
         class_cb.func_void_a(var1, var2 + 4, var3 + 10, 143, 137, 4136767, 10452799, 4144959);
         class_cb.func_void_a(var1, var2 + 4, var3 + 10, 143, 137, 6242111);
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 10, var3 + 15, 96, 1, class_ai.field_class_z_a.loadByIndex(58));
      } else {
         this.func_void_a(var1, var2, var3, true);

         int var4;
         for(var4 = this.func_int_c(); var4 <= this.func_int_d(); ++var4) {
            var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_d[18], var2 + 13, var3 + 18 + 23 * (var4 % 5), 3);
         }

         var4 = var3 + 14;
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 33, var4, 105, 1, this.field_array_char_a);
         var4 += class_bh.func_int_a(this.field_array_char_a, 105) * 15;
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 33, var4, class_n.field_array_array_boolean_a[class_n.field_byte_a - 6][this.field_byte_c] ? class_ai.field_class_z_a.loadByIndex(55) : class_ai.field_class_z_a.loadByIndex(56), 1);
         var4 += 15;
         class_bh.func_int_a(var1, var2 + 33, var4, class_ai.field_class_z_a.loadByIndex(57), 1);
         var4 += 15;
         if (class_ce.field_class_z_f.loadByIndex(this.field_byte_c * 7 + 4).length > 0) {
            var1.setColor(16777215);
            class_bh.func_int_a(var1, var2 + 33, var4, class_ce.field_class_z_f.loadByIndex(this.field_byte_c * 7 + 4), 1);
            var4 += 15;
         }

         if (class_ce.field_class_z_f.loadByIndex(this.field_byte_c * 7 + 5).length > 0) {
            var1.setColor(16777215);
            class_bh.func_int_a(var1, var2 + 33, var4, class_ce.field_class_z_f.loadByIndex(this.field_byte_c * 7 + 5), 1);
         }

      }
   }
}
