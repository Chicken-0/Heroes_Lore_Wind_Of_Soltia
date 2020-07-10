package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: c
public final class class_c extends class_cb {
   public class_c(class_bf var1) {
      super(var1, (byte)3);
      super.field_byte_b = 2;
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
         if (super.field_byte_b != 0 && super.field_byte_b != 1) {
            super.field_class_cb_b = new class_by(this, (byte)(6 + (2 - super.field_byte_b)));
         } else if (!class_bs.field_class_bs_a.field_boolean_b) {
            Object[] var3 = new Object[]{class_ce.field_class_z_g.loadByIndex(6), class_ce.field_class_z_g.loadByIndex(7)};
            this.func_void_a(var3);
         } else {
            boolean var5 = false;
            super.field_class_cb_b = new class_by(this, (byte)(6 + (2 - super.field_byte_b)));
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if ((var1 == 2 || var1 == 12) && var2 == 0) {
         class_bf.func_void_d();
         class_ce.func_void_B();
         class_bs.field_class_bs_a.func_void_e();
         class_n.field_int_e = 0;
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      class_bf.func_void_c(var1, var2, var3);
      class_bh.func_void_a(var1, 1, var2 + 155 >> 1, var3 + 5);
      class_bf.func_void_b(var1, var2, var3 + 24, 3);
      var2 += 15;
      var3 += 10;
      if (super.field_byte_b != 0) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[5], var2 + 6, var3 + 38, 20);
      }

      if (super.field_byte_b != 1) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[4], var2 + 34, var3 + 38, 20);
      }

      if (super.field_byte_b != 2) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[3], var2 + 59, var3 + 38, 20);
      }

      if (super.field_byte_b == 0) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[2], var2 + 6, var3 + 38, 20);
      }

      if (super.field_byte_b == 1) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[1], var2 + 34, var3 + 38, 20);
      }

      if (super.field_byte_b == 2) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[0], var2 + 59, var3 + 38, 20);
      }

      var1.setColor(0);
      class_bh.func_int_a(var1, var2 + 11, var3 + 104, class_ce.field_class_z_g.loadByIndex(12), 1);
      class_bh.func_int_a(var1, var2 + 11, var3 + 119, class_ce.field_class_z_g.loadByIndex(13), 1);
      class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_e);
   }
}
