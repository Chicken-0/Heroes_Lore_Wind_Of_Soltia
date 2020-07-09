package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: at
public final class class_at extends class_cb {
   // $FF: renamed from: a e
   private class_e field_class_e_a;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: d byte
   private byte field_byte_d;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;

   public class_at(class_cb var1) {
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
            if ((var4 = var3.field_class_g_a.func_array_byte_a(false, (byte)0)).length > 0) {
               super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_aa.field_class_z_a.func_array_char_a(3));
            } else {
               this.func_void_a(new Object[]{class_cj.field_class_cj_a.func_class_java_lang_String_a(3936).toCharArray()});
            }
         } else if (super.field_byte_b == 1) {
            int var6 = var3.field_class_g_a.func_int_a((byte)11, (byte)0);
            byte var5 = var3.field_class_g_a.func_byte_a((byte)11, (byte)0);
            if (this.field_class_e_a == null) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(3)});
            } else if (this.field_class_e_a.field_byte_e >= this.field_class_e_a.field_byte_d) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(6), class_aa.field_class_z_a.func_array_char_a(7)});
            } else if (var5 >= 0 && var6 >= this.field_byte_c) {
               if (var3.field_class_g_a.field_int_a < this.field_int_a) {
                  this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(8)});
               } else {
                  this.func_void_a((byte)2, (byte)2, new Object[]{class_aa.field_class_z_a.func_array_char_a(9)});
               }
            } else {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(5)});
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
         class_ao var6;
         class_x.func_void_a((var6 = class_n.func_class_ao_a()).field_class_g_a.func_byte_a((byte)11, (byte)0) != -1);
         var6.field_class_g_a.func_void_a((byte)11, (byte)0, this.field_byte_c);
         class_g var10000 = var6.field_class_g_a;
         var10000.field_int_a -= this.field_int_a;
         if (100 * (this.field_class_e_a.field_byte_d - this.field_class_e_a.field_byte_e) / this.field_class_e_a.field_byte_d + 30 < class_h.func_int_a(1, 100)) {
            this.field_byte_d = 2;
            this.field_boolean_c = false;
         } else {
            this.field_byte_d = 2;
            this.field_boolean_c = true;
         }

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
            if (!(var5 = (class_e)var4).field_boolean_b) {
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(11), class_aa.field_class_z_a.func_array_char_a(12)});
               return;
            }

            this.field_class_e_a = (class_e)var4;
            this.field_int_a = this.field_class_e_a.field_byte_e * 100;
            this.field_byte_c = (byte)(this.field_class_e_a.field_byte_e + 1);
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
      class_bh.func_int_a(var1, var2 + 6, var3 + 11, class_aa.field_class_z_a.func_array_char_a(14), 1);
      class_cb.func_void_a(var1, var2 + 4, var3 + 30, this.field_class_e_a, (byte)1, class_aa.field_class_z_a.func_array_char_a(15), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2 + 155 - 8, var3 + 65, var4.field_class_g_a.field_int_a);
      class_cb.func_void_b(var1, var2 + 4, var3 + 73, 147, 38, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 8, var3 + 80, class_aa.field_class_z_a.func_array_char_a(16), 1);
      if (this.field_class_e_a != null) {
         class_cb.func_void_a(var1, var2 + 155 - 8, var3 + 80, this.field_int_a);
         char[] var5 = class_h.func_array_char_a(class_aa.field_class_z_a.func_array_char_a(17), (" : " + this.field_byte_c + "개").toCharArray());
         class_bh.func_int_a(var1, var2 + 8, var3 + 93, var5, 1);
      }

      int var8;
      if (this.field_byte_d == 2) {
         this.field_byte_d = 1;
         var8 = class_r.field_int_i - 55;
         int var6 = class_r.field_int_j - 11;
         class_cb.func_void_a(var1, var8, var6, 110, 22);
         class_cb.func_void_b(var1, var8, var6, 110, 22);
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var8 + 5, var6 + 5, class_aa.field_class_z_a.func_array_char_a(28), 1);
         super.field_boolean_a = true;
      } else if (this.field_byte_d == 1) {
         this.field_byte_d = 0;

         try {
            Thread.sleep(500L);
            if (this.field_boolean_c) {
               Thread.sleep(1000L);
               ++this.field_class_e_a.field_byte_e;
               byte[] var9 = new byte[]{var4.func_byte_a(this.field_class_e_a)};
               super.field_class_cb_b = new class_m(this, var9, (byte)10, class_aa.field_class_z_a.func_array_char_a(10));
               this.field_int_a = this.field_class_e_a.field_byte_e * 100;
               this.field_byte_c = (byte)(this.field_class_e_a.field_byte_e + 1);
            } else {
               class_n.func_class_ao_a().field_class_g_a.func_void_a(this.field_class_e_a, (byte)1);
               this.field_class_e_a = null;
               class_n.func_void_o();
               this.func_void_a(new Object[]{class_aa.field_class_z_a.func_array_char_a(26), class_aa.field_class_z_a.func_array_char_a(29)});
            }
         } catch (Exception var7) {
         }
      }

      var8 = class_bh.func_int_a(155, 80);
      class_cb.func_void_a(var1, var2 + (155 - var8 >> 1), var3 + 138, var8, class_aa.field_class_z_a.func_array_char_a(18), super.field_byte_b == 1);
   }
}
