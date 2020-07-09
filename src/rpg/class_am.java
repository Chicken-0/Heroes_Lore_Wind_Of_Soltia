package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: am
public final class class_am extends class_cb {
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;
   // $FF: renamed from: d byte
   private byte field_byte_d;
   // $FF: renamed from: c byte
   public byte field_byte_c;

   public class_am(class_cb var1, char[] var2, char[] var3, byte var4) {
      super(var1, (byte)0);
      this.field_array_char_a = var2;
      this.field_array_char_b = var3;
      this.field_byte_c = var4;
      this.field_byte_d = 0;
      this.field_byte_d = (byte)(this.field_byte_d + class_bh.func_int_a(var2, 135));
      this.field_byte_d = (byte)(this.field_byte_d + class_bh.func_int_a(var3, 135));
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == -8) {
            super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)0);
            return true;
         } else {
            return true;
         }
      } else {
         super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)1);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = this.field_byte_d * 15 + 10;
      var2 = class_r.field_int_i - 72;
      var3 = class_r.field_int_j - var4 / 2;
      class_cb.func_void_a(var1, var2, var3, 145, var4);
      class_cb.func_void_b(var1, var2, var3, 145, var4);
      int var5 = var3 + 5;
      var1.setColor(14663551);
      class_bh.func_int_a(var1, var2 + 5, var5, 135, 1, this.field_array_char_a);
      var5 += 15 * class_bh.func_int_a(this.field_array_char_a, 135);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 5, var5, 135, 1, this.field_array_char_b);
   }
}
