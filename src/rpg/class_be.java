package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: be
public final class class_be extends class_cb {
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;
   // $FF: renamed from: a bs
   private class_bs field_class_bs_a;

   public class_be(class_cb var1, boolean var2) {
      super(var1, (byte)4);
      this.field_boolean_c = var2;
      this.field_class_bs_a = class_bs.field_class_bs_a;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_a(var1, var2, false)) {
         return true;
      } else {
         if (var2 == 52 || var1 == 2 || var2 == 54 || var1 == 5) {
            switch(super.field_byte_b) {
            case 0:
               if (var2 != 52 && var1 != 2) {
                  if (var2 == 54 || var1 == 5) {
                     this.field_class_bs_a.field_int_a = class_bw.field_int_a;
                  }
               } else {
                  this.field_class_bs_a.field_int_a = 0;
               }

               class_bw.func_void_a(this.field_class_bs_a.field_int_a);
               if (this.field_class_bs_a.field_int_a == 0) {
                  class_bw.func_void_d();
               }
               break;
            case 1:
               if (var2 == 52 || var1 == 2) {
                  --this.field_class_bs_a.field_byte_a;
                  if (this.field_class_bs_a.field_byte_a < 0) {
                     this.field_class_bs_a.field_byte_a = 2;
                  }
               }

               if (var2 == 54 || var1 == 5) {
                  ++this.field_class_bs_a.field_byte_a;
                  if (this.field_class_bs_a.field_byte_a > 2) {
                     this.field_class_bs_a.field_byte_a = 0;
                  }
               }

               this.field_class_bs_a.func_void_a(this.field_class_bs_a.field_byte_a);
               break;
            case 2:
               this.field_class_bs_a.field_boolean_c = !this.field_class_bs_a.field_boolean_c;
               break;
            case 3:
               this.field_class_bs_a.field_boolean_d = !this.field_class_bs_a.field_boolean_d;
            }
         }

         if (var2 == -8) {
            if (this.field_class_bs_a.field_boolean_d) {
               class_n.field_int_c = class_n.field_int_a;
               class_n.field_int_d = class_n.field_int_b;
            }

            try {
               class_bs.field_class_bs_a.func_void_i();
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            super.field_class_cb_a.func_void_a();
            return true;
         } else {
            return true;
         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = 0;
      int var5 = 0;
      if (this.field_boolean_c) {
         var2 += 6;
         var3 += 25;
         class_cb.func_void_a(var1, var2, var3, 143, 139);
         class_cb.func_void_b(var1, var2, var3, 143, 139);
         var4 = 10452799;
         var5 = 16777215;
         var2 += 5;
         var3 += 15;
         class_bh.func_void_a(var1, class_bh.field_array_char_m, class_bh.field_array_char_e);
         var2 += 15;
         var3 += 10;
      } else {
         var1.setColor(4136767);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         class_bf.func_void_c(var1, var2, var3);
         class_bh.func_void_a(var1, 5, var2 + 155 >> 1, var3 + 5);
         class_bf.func_void_b(var1, var2, var3 + 24, 3);
         var2 += 15;
         var3 += 10;
         var2 += 12;
         var3 += 46;
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 1, var3 + 16, 20);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 1, var3 + 36, 20);
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 1, var3 + 56, 20);
         class_bh.func_void_a(var1, (char[])null, class_bh.field_array_char_e);
      }

      byte var7 = super.field_byte_b;
      var1.setColor(var7 == 0 ? 16777215 : var4);
      class_bh.func_int_a(var1, var2, var3, class_ce.field_class_z_g.func_array_char_a(18), 1);
      var1.setColor(var5);
      if (this.field_class_bs_a.field_int_a == 0) {
         class_bh.func_void_a(var1, var2 + 70, var3, BabbleText.instance.getTextById(3945).toCharArray(), 0);
      } else {
         class_bh.func_void_a(var1, var2 + 70, var3, BabbleText.instance.getTextById(3944).toCharArray(), 0);
      }

      int var6 = var3 + 20;
      var1.setColor(var7 == 1 ? 16777215 : var4);
      class_bh.func_int_a(var1, var2, var6, class_ce.field_class_z_g.func_array_char_a(19), 1);
      var1.setColor(var5);
      char[] var8 = class_ce.field_class_z_g.func_array_char_a(60 + this.field_class_bs_a.field_byte_a);
      class_bh.func_void_a(var1, var2 + 70, var6, var8, 0);
      var6 += 20;
      var1.setColor(var7 == 2 ? 16777215 : var4);
      class_bh.func_int_a(var1, var2, var6, class_ce.field_class_z_g.func_array_char_a(20), 1);
      var1.setColor(var5);
      class_bh.func_void_a(var1, var2 + 70, var6, (this.field_class_bs_a.field_boolean_c ? BabbleText.instance.getTextById(3942) : BabbleText.instance.getTextById(3943)).toCharArray(), 0);
      var6 += 20;
      var1.setColor(var7 == 3 ? 16777215 : var4);
      class_bh.func_int_a(var1, var2, var6, class_ce.field_class_z_g.func_array_char_a(21), 1);
      var1.setColor(var5);
      class_bh.func_void_a(var1, var2 + 70, var6, (this.field_class_bs_a.field_boolean_d ? BabbleText.instance.getTextById(3944) : BabbleText.instance.getTextById(3945)).toCharArray(), 0);

      for(byte var9 = 0; var9 < super.field_byte_a; ++var9) {
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_o, var2 + 42, var3 + var9 * 20, 20);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 92, var3 + var9 * 20, 20);
      }

   }
}
