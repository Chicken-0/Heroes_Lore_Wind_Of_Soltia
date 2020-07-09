package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: d
public final class class_d extends class_cb {
   // $FF: renamed from: c byte
   private byte field_byte_c = 0;

   public class_d(class_cb var1) {
      super(var1, (byte)4);
   }

   // $FF: renamed from: a (int, int) boolean
   public final synchronized boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.field_byte_c != 0) {
         return true;
      } else if (this.func_boolean_a(var1, var2, false)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         switch(super.field_byte_b) {
         case 0:
            if (class_w.field_boolean_c) {
               this.func_void_d();
            } else if (class_n.field_class_ae_a.field_boolean_a) {
               this.func_void_a(new Object[]{class_ai.field_class_z_a.func_array_char_a(51), class_ai.field_class_z_a.func_array_char_a(52)});
            } else {
               this.field_byte_c = 2;
               this.func_void_b();
            }
            break;
         case 1:
            super.field_class_cb_b = new class_bt(this, true);
            break;
         case 2:
            super.field_class_cb_b = new class_be(this, true);
            break;
         case 3:
            this.func_void_d();
         }

         return true;
      }
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      Object[] var1;
      if (class_w.field_boolean_c) {
         var1 = new Object[]{class_bh.func_class_java_lang_String_a(3919).toCharArray()};
         this.func_void_a((byte)12, (byte)2, var1, class_bh.field_array_char_j, class_bh.field_array_char_c);
      } else {
         var1 = new Object[]{class_bh.field_array_char_a};
         this.func_void_a((byte)2, (byte)2, var1);
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if (var1 == 12 || var1 == 2) {
         if (class_w.field_boolean_c) {
            if (var2 == 0) {
               class_bh.func_void_a(class_w.field_class_java_lang_String_a);
               return;
            }

            class_n.func_void_a((byte)14, (byte)1);
            class_bw.func_void_f();
            class_bf.field_boolean_d = true;
            return;
         }

         if (var2 == 0) {
            class_n.func_void_a((byte)14, (byte)1);
            class_bw.func_void_f();
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var3 += 15;
      class_r.func_int_a(var1, class_ai.field_class_z_a.func_array_char_a(41), var2 + 5, var3);
      boolean var4 = false;
      var2 = class_r.field_int_g - 108 >> 1;
      class_cb.func_void_a(var1, var2, var3 + 15, 108, class_ai.field_class_z_a.func_array_char_a(42), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2, var3 + 37, 108, class_ai.field_class_z_a.func_array_char_a(43), super.field_byte_b == 1);
      class_cb.func_void_a(var1, var2, var3 + 59, 108, class_ai.field_class_z_a.func_array_char_a(44), super.field_byte_b == 2);
      class_cb.func_void_a(var1, var2, var3 + 81, 108, class_ai.field_class_z_a.func_array_char_a(45), super.field_byte_b == 3);
      if (this.field_byte_c == 2) {
         this.field_byte_c = 1;
         int var5 = class_r.field_int_i - 55;
         int var6 = class_r.field_int_j - 11;
         class_cb.func_void_a(var1, var5, var6, 110, 22);
         class_cb.func_void_b(var1, var5, var6, 110, 22);
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var5 + 5, var6 + 5, class_ai.field_class_z_a.func_array_char_a(53), 1);
         this.func_void_b();
      } else {
         if (this.field_byte_c == 1) {
            this.field_byte_c = 0;

            try {
               class_n.func_void_o();
               this.func_void_a(new Object[]{class_ai.field_class_z_a.func_array_char_a(46)});
               return;
            } catch (Exception var7) {
               this.func_void_a(new Object[]{class_ai.field_class_z_a.func_array_char_a(47), class_ai.field_class_z_a.func_array_char_a(48)});
            }
         }

      }
   }
}
