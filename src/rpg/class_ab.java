package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ab
public final class class_ab extends class_cb {
   // $FF: renamed from: a ad
   private class_ad field_class_ad_a;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;

   public class_ab(class_cb var1, class_ad var2, boolean var3) {
      super(var1, (byte)0);
      this.field_class_ad_a = var2;
      this.field_byte_c = 1;
      this.field_boolean_c = var3;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_d(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == -8) {
            super.field_class_cb_a.func_void_a();
            return true;
         } else {
            return true;
         }
      } else {
         if (this.field_boolean_c) {
            Object[] var3 = new Object[]{class_bp.field_class_z_a.func_array_char_a(7)};
            if (this.field_class_ad_a.field_byte_f == 0 && class_n.field_byte_a != 6 || this.field_class_ad_a.field_byte_f == 2 && class_n.field_byte_a != 7 || this.field_class_ad_a.field_byte_f == 1 && class_n.field_byte_a != 8 || this.field_class_ad_a.field_byte_f == 3 && class_n.field_byte_a != 8) {
               var3 = new Object[]{class_bp.field_class_z_a.func_array_char_a(26), class_bp.field_class_z_a.func_array_char_a(7)};
            }

            this.func_void_a((byte)2, (byte)2, var3);
         } else {
            this.func_void_a((byte)2, (byte)2, new Object[]{class_bp.field_class_z_a.func_array_char_a(23)});
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      class_ao var3 = class_n.func_class_ao_a();
      if (var1 == 2 && var2 == 0) {
         class_g var10000;
         if (this.field_boolean_c) {
            class_ad var4;
            if ((var4 = class_ad.func_class_ad_a(this.field_class_ad_a.field_byte_f, this.field_class_ad_a.field_byte_g, true, false)) instanceof class_e) {
               ((class_e)var4).field_boolean_b = true;
            }

            int var5 = var4.field_int_a * this.field_byte_c;
            if (var3.field_class_g_a.field_int_a < var5) {
               this.func_void_a(new Object[]{class_bp.field_class_z_a.func_array_char_a(8)});
            } else if (!var3.field_class_g_a.func_boolean_a(var4, this.field_byte_c)) {
               this.func_void_a(new Object[]{class_bp.field_class_z_a.func_array_char_a(9), class_bp.field_class_z_a.func_array_char_a(10)});
            } else {
               var10000 = var3.field_class_g_a;
               var10000.field_int_a -= var5;
               this.func_void_a(new Object[]{class_bp.field_class_z_a.func_array_char_a(11), class_bp.field_class_z_a.func_array_char_a(12)});
            }

         } else {
            var3.field_class_g_a.func_void_a(this.field_class_ad_a, this.field_byte_c);
            var10000 = var3.field_class_g_a;
            var10000.field_int_a += this.field_class_ad_a.field_int_a * this.field_byte_c / 5;
            this.func_void_a(new Object[]{this.field_class_ad_a.field_array_char_a, class_bp.field_class_z_a.func_array_char_a(24)});
         }
      } else {
         if (var1 == 1) {
            super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
         }

      }
   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      if (this.field_boolean_c && class_ad.field_array_boolean_b[this.field_class_ad_a.field_byte_f] || !this.field_boolean_c && this.field_class_ad_a.field_byte_h > 1) {
         if (var1 == 4 && this.field_byte_c < (this.field_boolean_c ? 99 : this.field_class_ad_a.field_byte_h)) {
            ++this.field_byte_c;
            return;
         }

         if (var1 == 4 && this.field_boolean_c && this.field_byte_c == 99) {
            this.field_byte_c = 1;
            return;
         }

         if (var1 == 3 && this.field_byte_c > 1) {
            --this.field_byte_c;
            return;
         }

         if (var1 == 3 && this.field_boolean_c && this.field_byte_c == 1) {
            this.field_byte_c = 99;
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      class_bh.func_void_a(var1);
      if (this.field_boolean_c) {
         class_bh.func_void_a(var1, class_bh.field_array_char_j, class_bh.field_array_char_e);
      } else {
         class_bh.func_void_a(var1, class_bh.field_array_char_h, class_bh.field_array_char_e);
      }

      var2 += 3;
      var3 += 20;
      boolean var4 = false;
      class_cb.func_void_a(var1, var2, var3, 149, 29);
      class_cb.func_void_b(var1, var2, var3, 149, 29);
      class_cb.func_void_a(var1, var2, var3 + 31, 149, 67);
      class_cb.func_void_b(var1, var2, var3 + 31, 149, 67);
      var2 += 15;
      var1.setColor(14663551);
      class_bh.func_int_a(var1, var2 + 8, var3 + 7, class_bp.field_class_z_a.func_array_char_a(13), 1);
      class_cb.func_void_a(var1, var2 + 102, var3 + 11, class_n.func_class_ao_a().field_class_g_a.field_int_a);
      var1.setColor(16777215);
      if ((!this.field_boolean_c || !class_ad.field_array_boolean_b[this.field_class_ad_a.field_byte_f]) && (this.field_boolean_c || this.field_class_ad_a.field_byte_h <= 1)) {
         class_bh.func_int_a(var1, var2 + 6, var3 + 38, class_bp.field_class_z_a.func_array_char_a(15), 1);
      } else {
         if (this.field_boolean_c) {
            class_bh.func_int_a(var1, var2 + 6, var3 + 38, class_bp.field_class_z_a.func_array_char_a(14), 1);
         } else {
            class_bh.func_int_a(var1, var2 + 6, var3 + 38, class_bp.field_class_z_a.func_array_char_a(25), 1);
         }

         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_o, var2 + 32, var3 + 65, 20);
         class_r.func_void_c(var1, this.field_byte_c, var2 + 68, var3 + 65, 8);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 77, var3 + 65, 20);
      }

      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_d[this.field_class_ad_a.field_byte_f], var2 + 45, var3 + 57, 20);
      if (this.field_boolean_c) {
         class_cb.func_void_a(var1, var2 + 77, var3 + 85, this.field_byte_c * this.field_class_ad_a.field_int_a);
      } else {
         class_cb.func_void_a(var1, var2 + 77, var3 + 85, this.field_byte_c * this.field_class_ad_a.field_int_a / 5);
      }
   }
}
