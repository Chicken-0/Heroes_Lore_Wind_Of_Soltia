package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bm
public final class class_bm extends class_cb {
   public class_bm(class_cb var1) {
      super(var1, (byte)5);
      class_ao var2 = class_n.func_class_ao_a();

      for(byte var3 = 0; var3 < 5; ++var3) {
         if (var2.field_array_class_p_a[var3] == var2.func_class_p_a()) {
            super.field_byte_b = var3;
            return;
         }
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else {
         class_ao var3 = class_n.func_class_ao_a();
         if ((var2 == 53 || var1 == 8) && var3.field_array_class_p_a[super.field_byte_b] != null) {
            Object[] var4 = new Object[]{class_ai.field_class_z_a.loadByIndex(22), class_ai.field_class_z_a.loadByIndex(23)};
            this.func_void_a((byte)3, (byte)2, var4);
         }

         return false;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      class_ao var4 = class_n.func_class_ao_a();
      if (var3 instanceof class_af && var1 == 3) {
         switch(var2) {
         case 0:
            if (var4.func_boolean_a(var4.field_array_class_p_a[super.field_byte_b])) {
               char[] var7 = (BabbleText.instance.getTextById(3933) + " " + new String(class_ce.field_class_z_b.loadByIndex(var4.field_array_class_p_a[super.field_byte_b].field_byte_f))).toCharArray();
               Object[] var6 = new Object[]{var7};
               this.func_void_a(var6);
               return;
            }

            Object[] var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(27), class_ai.field_class_z_a.loadByIndex(28), class_ai.field_class_z_a.loadByIndex(29)};
            this.func_void_a(var5);
            return;
         case 1:
            super.field_class_cb_b = new class_bn(this, var4.field_array_class_p_a[super.field_byte_b]);
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 15;
      class_ao var4 = class_n.func_class_ao_a();
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(30), var2 + 5, var3);
      this.func_void_a(var1, var2, var3, false);

      for(int var5 = 0; var5 < 5; ++var5) {
         if (var4.field_array_class_p_a[var5] != null) {
            var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_b[var4.field_array_class_p_a[var5].field_byte_f], var2 + 15, var3 + 19 + var5 % 5 * 23, 3);
         }
      }

      if (var4.field_array_class_p_a[super.field_byte_b] == null) {
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 34, var3 + 18, class_ai.field_class_z_a.loadByIndex(31), 1);
      } else {
         class_p var6 = var4.field_array_class_p_a[super.field_byte_b];
         MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(32), var2 + 89, var3 + 22);
         if (var6 == var4.func_class_p_a()) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_l, var2 + 100, var3 + 26, 36);
         }

         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 34, var3 + 18, class_ce.field_class_z_b.loadByIndex(var4.field_array_class_p_a[super.field_byte_b].field_byte_f), 1);
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 34, var3 + 35, class_ce.field_class_z_b.loadByIndex(var4.field_array_class_p_a[super.field_byte_b].field_byte_f + 6), 1);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_g, var2 + 34, var3 + 53, 20);
         MyGameCanvas.func_void_c(var1, var6.field_short_a, var2 + 50, var3 + 53, 4);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_e, var2 + 34, var3 + 67, 20);
         MyGameCanvas.func_void_c(var1, var6.field_int_a, var2 + 102, var3 + 67, 8);
         var1.setColor(4136767);
         var1.fillRect(var2 + 34, var3 + 76, 72, 3);
         var1.setColor(16777215);
         var1.fillRect(var2 + 35, var3 + 77, var6.field_int_a * 70 / var6.field_int_b, 1);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_h, var2 + 38, var3 + 81, 20);
         MyGameCanvas.func_void_c(var1, var6.field_int_b, var2 + 102, var3 + 81, 8);
      }
   }
}
