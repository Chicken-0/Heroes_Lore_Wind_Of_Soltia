package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bz
public final class class_bz extends class_cb {
   public class_bz(class_cb var1) {
      super(var1, (byte)5);
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         super.field_class_cb_a.field_boolean_a = true;
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         byte var3;
         var3 = -1;
         label36:
         switch(super.field_byte_b) {
         case 0:
            switch(class_n.field_byte_a) {
            case 6:
               var3 = 0;
               break label36;
            case 7:
               var3 = 2;
               break label36;
            case 8:
               var3 = 1;
            default:
               break label36;
            }
         case 1:
            if (class_n.field_byte_a == 8) {
               var3 = 3;
            }
            break;
         case 2:
            var3 = 5;
            break;
         case 3:
            var3 = 6;
            break;
         case 4:
            var3 = 4;
         }

         if (var3 != -1) {
            byte[] var4;
            if ((var4 = class_n.func_class_ao_a().field_class_g_a.func_array_byte_a(var3)).length > 0) {
               super.field_class_cb_b = new class_m(this, var4, super.field_byte_b, class_ai.field_class_z_a.func_array_char_a(16));
            } else {
               Object[] var5 = new Object[]{BabbleText.instance.getTextById(3937).toCharArray()};
               this.func_void_a(var5);
            }
         } else {
            Object[] var6 = new Object[]{BabbleText.instance.getTextById(3937).toCharArray()};
            this.func_void_a(var6);
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      if (var3 instanceof class_m && var1 != -1) {
         class_ao var4;
         if (!((class_e)(var4 = class_n.func_class_ao_a()).field_class_g_a.func_class_ad_a(var2)).field_boolean_b) {
            Object[] var6 = new Object[]{class_ai.field_class_z_a.func_array_char_a(18), class_ai.field_class_z_a.func_array_char_a(19)};
            this.func_void_a(var6);
            return;
         }

         var4.func_void_b(var2, var1);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 15;
      class_ao var4 = class_n.func_class_ao_a();
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.func_array_char_a(20), var2 + 5, var3);
      this.func_void_a(var1, var2, var3, false);

      class_ad var5;
      for(int var6 = this.func_int_c(); var6 <= this.func_int_d(); ++var6) {
         if ((var5 = var4.func_class_ad_a(var6)) != null) {
            class_cb.func_void_a(var1, var2 + 13, var3 + 18 + 23 * (var6 % 5), var5, false);
         } else {
            var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_o[var6], var2 + 13, var3 + 19 + 23 * (var6 % 5), 3);
         }
      }

      if ((var5 = var4.func_class_ad_a(super.field_byte_b)) != null) {
         class_cb.func_void_a(var1, var2 + 33, var3 + 14, var5);
      } else {
         var1.setColor(16777215);
         if (super.field_byte_b == 1 && class_n.field_byte_a != 8) {
            class_bh.func_int_a(var1, var2 + 30, var3 + 14, class_ai.field_class_z_a.func_array_char_a(49), 1);
         } else {
            class_bh.func_int_a(var1, var2 + 33, var3 + 14, class_ai.field_class_z_a.func_array_char_a(21), 1);
         }
      }
   }
}
