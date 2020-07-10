package rpg;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: v
public final class class_v extends class_cb {
   // $FF: renamed from: a ad[]
   private class_ad[] field_array_class_ad_a;
   // $FF: renamed from: c byte
   public byte field_byte_c;

   public class_v(class_cb var1, Vector var2, byte var3) {
      super(var1, (byte)var2.size());
      this.field_array_class_ad_a = new class_ad[var2.size()];

      for(int var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         this.field_array_class_ad_a[var4] = (class_ad)var2.elementAt(var4);
      }

      this.field_byte_c = var3;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         super.field_class_cb_a.field_boolean_a = true;
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == 35) {
            byte[] var3;
            if ((var3 = class_n.func_class_ao_a().field_class_g_a.func_array_byte_a()).length > 0) {
               super.field_class_cb_b = new class_bb(this, var3);
            } else {
               this.func_void_a((byte)1, (byte)0, new Object[]{class_bp.field_class_z_a.loadByIndex(16), class_bp.field_class_z_a.loadByIndex(17)});
            }

            return true;
         } else {
            return false;
         }
      } else {
         super.field_class_cb_b = new class_ab(this, this.field_array_class_ad_a[super.field_byte_b], true);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      class_bh.func_void_a(var1, class_bh.field_array_char_i, class_bh.field_array_char_e);
      var2 += 2;
      var3 += 15;
      this.func_void_a(var1, var2, var3, true);
      short var4 = -1;
      class_ao var5 = class_n.func_class_ao_a();
      switch(this.field_byte_c) {
      case 1:
         if (var5.func_class_l_a() != null) {
            var4 = var5.func_class_l_a().field_short_a;
         }
         break;
      case 2:
         if (var5.func_class_t_a() != null) {
            var4 = var5.func_class_t_a().field_short_a;
         }
         break;
      case 3:
         if (var5.func_class_e_a() != null) {
            var4 = var5.func_class_e_a().field_short_a;
         }
         break;
      case 4:
         if (var5.func_class_e_b() != null) {
            var4 = var5.func_class_e_b().field_short_a;
         }
         break;
      case 5:
         if (var5.func_class_e_c() != null) {
            var4 = var5.func_class_e_c().field_short_a;
         }
      }

      class_ad var6;
      for(int var7 = this.func_int_c(); var7 <= this.func_int_d(); ++var7) {
         if ((var6 = this.field_array_class_ad_a[var7]) != null) {
            class_cb.func_void_a(var1, var2 + 13, var3 + 18 + 23 * (var7 % 5), var6, false);
            if (this.field_byte_c != 0) {
               short var8 = ((class_e)this.field_array_class_ad_a[super.field_byte_b]).field_short_a;
               if (var4 > var8) {
                  var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_q, var2 + 20, var3 + 18 + super.field_byte_b % 5 * 23, 33);
               } else if (var4 < var8) {
                  var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_p, var2 + 20, var3 + 18 + super.field_byte_b % 5 * 23, 33);
               }
            }
         }
      }

      if ((var6 = this.field_array_class_ad_a[super.field_byte_b]) != null) {
         class_cb.func_void_a(var1, var2 + 33, var3 + 14, var6);
      }

      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_c, class_bp.field_int_a + 155 - 38, class_bp.field_int_b + 170 - 22, 20);
   }
}
