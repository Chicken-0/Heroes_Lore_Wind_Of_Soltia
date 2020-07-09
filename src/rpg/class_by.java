package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: by
public final class class_by extends class_cb {
   // $FF: renamed from: c byte
   private byte field_byte_c;

   public class_by(class_c var1, byte var2) {
      super(var1, (byte)2);
      super.field_byte_b = 1;
      this.field_byte_c = var2;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_d(var1, var2)) {
         return true;
      } else {
         switch(var1) {
         case 8:
            if (super.field_byte_b == 0) {
               super.field_class_cb_b = new class_bk(this, this.field_byte_c);
            } else {
               super.field_class_cb_a.func_void_a();
            }
            break;
         default:
            switch(var2) {
            case -8:
               super.field_class_cb_a.func_void_a();
               break;
            case 53:
               if (super.field_byte_b == 0) {
                  super.field_class_cb_b = new class_bk(this, this.field_byte_c);
               } else {
                  super.field_class_cb_a.func_void_a();
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_bf.func_void_c(var1, var2, var3);
      class_bh.func_void_a(var1, 1, var2 + 77, var3 + 5);
      class_bf.func_void_b(var1, var2, var3 + 24, 3);
      var3 += 5;
      var2 += 10;
      var1.setColor(0);
      class_bh.func_int_a(var1, var2 + 11, var3 + 34, 133, 1, class_ce.field_class_z_a.func_array_char_a(15 + this.field_byte_c - 6));
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 7, var3 + 80, 20);
      class_bh.func_int_a(var1, var2 + 11, var3 + 84, class_ce.field_class_z_a.func_array_char_a(this.field_byte_c - 6), 1);
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[this.field_byte_c - 6], var2 + 125, var3 + 137, 40);
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[17], var2 + 5 + (super.field_byte_b == 0 ? 0 : 28), var3 + 118, 20);
      if (super.field_byte_b == 0) {
         var1.setColor(16777215);
      } else {
         var1.setColor(0);
      }

      class_bh.func_int_a(var1, var2 + 9, var3 + 121, class_ce.field_class_z_g.func_array_char_a(14), 1);
      if (super.field_byte_b == 1) {
         var1.setColor(16777215);
      } else {
         var1.setColor(0);
      }

      class_bh.func_int_a(var1, var2 + 37, var3 + 121, class_ce.field_class_z_g.func_array_char_a(15), 1);
      class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_e);
   }
}
