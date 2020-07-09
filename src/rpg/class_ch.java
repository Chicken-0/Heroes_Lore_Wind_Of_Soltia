package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ch
public final class class_ch extends class_cb {
   // $FF: renamed from: a e
   private class_e field_class_e_a;

   public class_ch(class_cb var1) {
      super(var1, (byte)2);
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         class_ao var3 = class_n.func_class_ao_a();
         if (super.field_byte_b == 0) {
            byte[] var4;
            if ((var4 = var3.func_array_byte_a(false, (byte)-1)).length == 0) {
               this.func_void_a(new Object[]{class_cj.field_class_cj_a.func_class_java_lang_String_a(3935).toCharArray()});
            } else {
               super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_aa.field_class_z_a.func_array_char_a(3));
            }
         } else if (super.field_byte_b == 1) {
            if (this.field_class_e_a == null) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(3)});
            } else if (var3.field_class_g_a.field_int_a < 100) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(8)});
            } else {
               this.func_void_a((byte)2, (byte)2, new Object[]{class_aa.field_class_z_a.func_array_char_a(19)});
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      if (var3 instanceof class_af && var1 == 2 && var2 == 0) {
         class_ao var6 = class_n.func_class_ao_a();
         this.field_class_e_a.field_boolean_b = true;
         class_g var10000 = var6.field_class_g_a;
         var10000.field_int_a -= 100;
         byte[] var7 = new byte[]{var6.func_byte_a(this.field_class_e_a)};
         super.field_class_cb_b = new class_m(this, var7, (byte)10, class_aa.field_class_z_a.func_array_char_a(20));
         this.field_class_e_a = null;
      } else {
         if (var3 instanceof class_m && var1 == 0) {
            class_ad var4;
            if (var2 >= 100) {
               var4 = class_n.func_class_ao_a().func_class_ad_a(var2 - 100);
            } else {
               var4 = class_n.func_class_ao_a().field_class_g_a.func_class_ad_a(var2);
            }

            class_x.func_void_a(var4 instanceof class_e);
            class_e var5;
            if ((var5 = (class_e)var4).field_boolean_b) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(21)});
               return;
            }

            this.field_class_e_a = var5;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      class_ao var4 = class_n.func_class_ao_a();
      var1.setColor(4136767);
      var1.fillRect(var2, var3, 155, 170);
      class_cb.func_void_c(var1, var2 + 2, var3 + 4, 151, 162);
      class_r.func_int_a(var1, class_aa.field_class_z_a.func_array_char_a(13), var2 + 3, var3 - 2);
      class_cb.func_void_b(var1, var2 + 3, var3 + 7, 149, 17, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 6, var3 + 10, class_aa.field_class_z_a.func_array_char_a(23), 1);
      class_cb.func_void_a(var1, var2 + 4, var3 + 30, this.field_class_e_a, (byte)1, class_aa.field_class_z_a.func_array_char_a(15), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2 + 155 - 10, var3 + 75, var4.field_class_g_a.field_int_a);
      class_cb.func_void_b(var1, var2 + 4, var3 + 83, 147, 20, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 8, var3 + 88, class_aa.field_class_z_a.func_array_char_a(24), 1);
      class_cb.func_void_a(var1, var2 + 155 - 8, var3 + 89, 100);
      int var5 = class_bh.func_int_a(155, 80);
      class_cb.func_void_a(var1, var2 + (155 - var5 >> 1), var3 + 138, var5, class_aa.field_class_z_a.func_array_char_a(25), super.field_byte_b == 1);
   }
}
