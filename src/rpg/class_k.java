package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: k
public final class class_k extends class_cb {
   // $FF: renamed from: a ad[]
   private class_ad[] field_array_class_ad_a = new class_ad[3];

   public class_k(class_cb var1) {
      super(var1, (byte)4);
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (super.field_class_cb_b != null && super.field_class_cb_b.func_boolean_a(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         class_ao var3 = class_n.func_class_ao_a();
         Object[] var5;
         if (super.field_byte_b < 3) {
            byte[] var4;
            if ((var4 = var3.field_class_g_a.func_array_byte_b()).length < 1) {
               var5 = new Object[]{class_ax.field_class_z_a.func_array_char_a(20)};
               this.func_void_a(var5);
            } else {
               super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_ax.field_class_z_a.func_array_char_a(21));
            }
         } else {
            byte var7 = 0;
            var5 = new Object[3];
            if (this.field_array_class_ad_a[0] != null) {
               var7 = 1;
               var5[0] = this.field_array_class_ad_a[0].field_array_char_a;
            }

            if (this.field_array_class_ad_a[1] != null) {
               var5[var7++] = this.field_array_class_ad_a[1].field_array_char_a;
            }

            if (this.field_array_class_ad_a[2] != null) {
               var5[var7++] = this.field_array_class_ad_a[2].field_array_char_a;
            }

            Object[] var6;
            if (var7 < 2) {
               var6 = new Object[]{class_ax.field_class_z_a.func_array_char_a(22), class_ax.field_class_z_a.func_array_char_a(23)};
               this.func_void_a(var6);
            } else if (500 > var3.field_class_g_a.field_int_a) {
               var6 = new Object[]{class_ax.field_class_z_a.func_array_char_a(24)};
               this.func_void_a(var6);
            } else {
               super.field_class_cb_b = new class_bo(this, class_ax.field_class_z_a.func_array_char_a(25), var5, class_ax.field_class_z_a.func_array_char_a(26), 500, (byte)20);
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      class_ao var4;
      class_ad var5;
      if (var3 instanceof class_af && var1 == 2 && var2 == 0) {
         var4 = class_n.func_class_ao_a();
         Object[] var10;
         if ((var5 = class_ad.func_class_ad_a(this.field_array_class_ad_a[0], this.field_array_class_ad_a[1], this.field_array_class_ad_a[2])) != null) {
            if (this.field_array_class_ad_a[0] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[0], (byte)1);
            }

            if (this.field_array_class_ad_a[1] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[1], (byte)1);
            }

            if (this.field_array_class_ad_a[2] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[2], (byte)1);
            }

            if (var4.field_class_g_a.func_boolean_a(var5, 1)) {
               byte[] var9 = new byte[]{var4.field_class_g_a.func_byte_a(var5.field_byte_f, var5.field_byte_g)};
               super.field_class_cb_b = new class_m(this, var9, (byte)10, class_ax.field_class_z_a.func_array_char_a(27));
               this.field_array_class_ad_a[0] = null;
               this.field_array_class_ad_a[1] = null;
               this.field_array_class_ad_a[2] = null;
            } else {
               if (this.field_array_class_ad_a[0] != null) {
                  var4.field_class_g_a.func_boolean_a(this.field_array_class_ad_a[0], 1);
               }

               if (this.field_array_class_ad_a[1] != null) {
                  var4.field_class_g_a.func_boolean_a(this.field_array_class_ad_a[1], 1);
               }

               if (this.field_array_class_ad_a[2] != null) {
                  var4.field_class_g_a.func_boolean_a(this.field_array_class_ad_a[2], 1);
               }

               var10 = new Object[]{class_ax.field_class_z_a.func_array_char_a(28), class_ax.field_class_z_a.func_array_char_a(29)};
               this.func_void_a(var10);
            }
         } else {
            if (this.field_array_class_ad_a[0] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[0], (byte)1);
            }

            if (this.field_array_class_ad_a[1] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[1], (byte)1);
            }

            if (this.field_array_class_ad_a[2] != null) {
               var4.field_class_g_a.func_void_a(this.field_array_class_ad_a[2], (byte)1);
            }

            this.field_array_class_ad_a[0] = null;
            this.field_array_class_ad_a[1] = null;
            this.field_array_class_ad_a[2] = null;
            var10 = new Object[]{class_ax.field_class_z_a.func_array_char_a(30)};
            this.func_void_a(var10);
         }

      } else if (!(var3 instanceof class_m) || var1 != 0 && var1 != 1 && var1 != 2) {
         if (var3 instanceof class_bo && var1 == 20) {
            Object[] var8 = new Object[]{class_ax.field_class_z_a.func_array_char_a(32)};
            this.func_void_a((byte)2, (byte)2, var8);
         }

      } else {
         var4 = class_n.func_class_ao_a();
         if (var2 >= 100) {
            var5 = class_n.func_class_ao_a().func_class_ad_a(var2 - 100);
         } else {
            var5 = class_n.func_class_ao_a().field_class_g_a.func_class_ad_a(var2);
         }

         class_x.func_void_a(class_ad.field_array_boolean_c[var5.field_byte_f]);
         int var6 = 0;

         for(int var7 = 0; var7 < 3; ++var7) {
            if (var1 != var7 && this.field_array_class_ad_a[var7] != null && this.field_array_class_ad_a[var7].field_byte_f == var5.field_byte_f && this.field_array_class_ad_a[var7].field_byte_g == var5.field_byte_g) {
               ++var6;
            }
         }

         if (var4.field_class_g_a.func_int_a(var5.field_byte_f, var5.field_byte_g) <= var6) {
            Object[] var11 = new Object[]{class_ax.field_class_z_a.func_array_char_a(31)};
            this.func_void_a(var11);
         } else {
            this.field_array_class_ad_a[var1] = var5;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(var2, var3, 155, 170);
      class_cb.func_void_c(var1, var2 + 2, var3 + 4, 151, 162);
      MyGameCanvas.func_int_a(var1, class_ax.field_class_z_a.func_array_char_a(14), var2 + 3, var3 - 2);
      class_cb.func_void_a(var1, var2 + 4, var3 + 9, this.field_array_class_ad_a[0], (byte)1, class_ax.field_class_z_a.func_array_char_a(33), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2 + 4, var3 + 9 + 36, this.field_array_class_ad_a[1], (byte)2, class_ax.field_class_z_a.func_array_char_a(33), super.field_byte_b == 1);
      class_cb.func_void_a(var1, var2 + 4, var3 + 9 + 72, this.field_array_class_ad_a[2], (byte)3, class_ax.field_class_z_a.func_array_char_a(33), super.field_byte_b == 2);
      int var4 = class_bh.func_int_a(155, 80);
      class_cb.func_void_a(var1, var2 + (155 - var4 >> 1), var3 + 138, var4, class_ax.field_class_z_a.func_array_char_a(25), super.field_byte_b == 3);
   }
}
