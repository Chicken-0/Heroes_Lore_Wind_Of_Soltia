package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ap
public final class class_ap extends class_cb {
   // $FF: renamed from: a t
   private class_t field_class_t_a;
   // $FF: renamed from: a ad
   private class_ad field_class_ad_a;

   public class_ap(class_cb var1) {
      super(var1, (byte)3);
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
         byte[] var4;
         if (super.field_byte_b == 0) {
            class_x.func_void_a((var4 = var3.func_array_byte_a(true, (byte)1)).length > 0);
            super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_ax.field_class_z_a.loadByIndex(3));
         } else if (super.field_byte_b == 1) {
            if ((var4 = var3.field_class_g_a.func_array_byte_a((byte)17)).length > 0) {
               super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_ax.field_class_z_a.loadByIndex(4));
            } else {
               Object[] var5 = new Object[]{class_ax.field_class_z_a.loadByIndex(5)};
               this.func_void_a(var5);
            }
         } else if (super.field_byte_b == 2) {
            Object[] var6;
            if (this.field_class_t_a == null) {
               var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(6)};
               this.func_void_a(var6);
            } else if (this.field_class_ad_a == null) {
               var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(7)};
               this.func_void_a(var6);
            } else if (var3.field_class_g_a.field_int_a < 500) {
               var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(8)};
               this.func_void_a(var6);
            } else {
               var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(9)};
               this.func_void_a((byte)2, (byte)2, var6);
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
         class_ao var7 = class_n.func_class_ao_a();
         this.field_class_t_a.field_byte_c = this.field_class_ad_a.field_byte_g;
         class_g var10000 = var7.field_class_g_a;
         var10000.field_int_a -= 500;
         var7.field_class_g_a.func_void_a(this.field_class_ad_a, (byte)1);
         byte[] var8 = new byte[]{var7.func_byte_a(this.field_class_t_a)};
         super.field_class_cb_b = new class_m(this, var8, (byte)10, class_ax.field_class_z_a.loadByIndex(10));
         this.field_class_t_a = null;
         this.field_class_ad_a = null;
      } else {
         if (var3 instanceof class_m && (var1 == 0 || var1 == 1)) {
            class_ad var4;
            if (var2 >= 100) {
               var4 = class_n.func_class_ao_a().func_class_ad_a(var2 - 100);
            } else {
               var4 = class_n.func_class_ao_a().field_class_g_a.func_class_ad_a(var2);
            }

            if (var1 == 0) {
               class_x.func_void_a(var4 instanceof class_t);
               class_t var5;
               Object[] var6;
               if (!(var5 = (class_t)var4).field_boolean_b) {
                  var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(11), class_ax.field_class_z_a.loadByIndex(13)};
                  this.func_void_a(var6);
               } else if (var5.field_byte_c != -1) {
                  var6 = new Object[]{class_ax.field_class_z_a.loadByIndex(12), class_ax.field_class_z_a.loadByIndex(13)};
                  this.func_void_a(var6);
               } else {
                  this.field_class_t_a = (class_t)var4;
               }

               return;
            }

            class_x.func_void_a(var4.field_byte_f == 17);
            this.field_class_ad_a = var4;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(var2, var3, 155, 170);
      class_cb.func_void_c(var1, var2 + 2, var3 + 4, 151, 162);
      MyGameCanvas.func_int_a(var1, class_ax.field_class_z_a.loadByIndex(14), var2 + 3, var3 - 2);
      class_cb.func_void_a(var1, var2 + 4, var3 + 9, this.field_class_t_a, (byte)1, class_ax.field_class_z_a.loadByIndex(15), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2 + 4, var3 + 9 + 36, this.field_class_ad_a, (byte)2, class_ax.field_class_z_a.loadByIndex(16), super.field_byte_b == 1);
      class_cb.func_void_b(var1, var2 + 4, var3 + 9 + 72, 147, 31, 12558207);
      int var4;
      if (this.field_class_t_a != null && this.field_class_ad_a != null) {
         var1.setColor(16777215);
         var4 = (var4 = (var4 = var2 + 6) + 2 + class_bh.func_int_a(var1, var4, var3 + 9 + 72 + 4, class_t.field_class_z_a.loadByIndex(this.field_class_ad_a.field_byte_g), 1)) + 2 + class_bh.func_int_a(var1, var4, var3 + 9 + 72 + 4, class_ax.field_class_z_a.loadByIndex(17), 1);
         class_bh.func_int_a(var1, var4, var3 + 9 + 72 + 4, class_ax.field_class_z_a.loadByIndex(18), 1);
         class_cb.func_void_a(var1, var2 + 155 - 10, var3 + 9 + 72 + 5, 500);
         class_cb.func_void_a(var1, var2 + 155 - 10, var3 + 9 + 72 + 20, class_n.func_class_ao_a().field_class_g_a.field_int_a);
      }

      var4 = class_bh.func_int_a(155, 80);
      class_cb.func_void_a(var1, var2 + (155 - var4 >> 1), var3 + 138, var4, class_ax.field_class_z_a.loadByIndex(19), super.field_byte_b == 2);
   }
}
