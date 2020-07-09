package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: m
public class class_m extends class_cb {
   // $FF: renamed from: h byte[]
   public byte[] field_array_byte_h;
   // $FF: renamed from: c byte
   public byte field_byte_c;
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;

   public class_m(class_cb var1, byte[] var2, byte var3, char[] var4) {
      super(var1, (byte)var2.length);
      this.field_array_byte_h = var2;
      this.field_byte_c = var3;
      this.field_array_char_a = var4;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == -8) {
            super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
            return true;
         } else {
            return true;
         }
      } else {
         super.field_class_cb_a.func_void_a(this.field_byte_c, this.field_array_byte_h[super.field_byte_b]);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public void func_void_a(Graphics var1, int var2, int var3) {
      class_ao var4 = class_n.func_class_ao_a();
      var3 -= 3;
      var2 += 2;
      var3 += 14;
      class_cb.func_void_c(var1, var2, var3 - 14, 151, 170);
      boolean var5 = this.func_int_b() > 1;
      class_cb.func_void_b(var1, var2 + 3, var3 - 13 + (var5 ? 0 : 3), 145, 14, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 6, var3 - 10 + (var5 ? 0 : 3), this.field_array_char_a, 1);
      this.func_void_a(var1, var2, var3, var5);

      class_ad var6;
      for(int var7 = this.func_int_c(); var7 <= this.func_int_d(); ++var7) {
         if (this.field_array_byte_h[var7] >= 100) {
            var6 = var4.func_class_ad_a(this.field_array_byte_h[var7] - 100);
         } else if (this.field_array_byte_h[var7] < 0) {
            var6 = var4.field_class_g_b.func_class_ad_a(-this.field_array_byte_h[var7] - 1);
         } else {
            var6 = var4.field_class_g_a.func_class_ad_a(this.field_array_byte_h[var7]);
         }

         if (var6 != null) {
            class_cb.func_void_a(var1, var2 + 13, var3 + 18 + 23 * (var7 % 5), var6, true);
         }
      }

      if (this.field_array_byte_h[super.field_byte_b] >= 100) {
         var6 = var4.func_class_ad_a(this.field_array_byte_h[super.field_byte_b] - 100);
      } else if (this.field_array_byte_h[super.field_byte_b] < 0) {
         var6 = var4.field_class_g_b.func_class_ad_a(-this.field_array_byte_h[super.field_byte_b] - 1);
      } else {
         var6 = var4.field_class_g_a.func_class_ad_a(this.field_array_byte_h[super.field_byte_b]);
      }

      if (var6 != null) {
         class_cb.func_void_a(var1, var2 + 33, var3 + 14, var6);
      }

   }
}
