package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: q
public final class class_q extends class_cb {
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;

   public class_q(class_cb var1) {
      super(var1, (byte)4);
      this.field_array_char_a = class_ce.field_class_z_a.loadByIndex(class_n.field_byte_a - 6);
      int var2 = 3 + class_n.field_byte_a - 6;
      if (class_n.field_byte_g == 1) {
         var2 += 15;
      } else if (class_n.field_byte_g >= 2) {
         var2 += 18;
      }

      this.field_array_char_b = class_ce.field_class_z_a.loadByIndex(var2);
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (super.field_byte_b != 3 || var2 != 53 && var1 != 8) {
         return false;
      } else {
         if (class_n.func_class_ao_a().field_short_a > 0) {
            super.field_class_cb_b = new class_bi(this);
         } else {
            Object[] var3 = new Object[]{class_ai.field_class_z_a.loadByIndex(0), class_ai.field_class_z_a.loadByIndex(1)};
            this.func_void_a(var3);
         }

         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 15;
      class_ao var4 = class_n.func_class_ao_a();
      char[] var5 = class_ai.field_class_z_a.loadByIndex(2);
      MyGameCanvas.func_int_a(var1, var5, var2 + 5, var3);
      class_cb.func_void_a(var1, var2 + 110, var3 + 2, var4.field_class_g_a.field_int_a);
      this.func_void_a(var1, var2, var3, false);
      MyGameCanvas.func_void_c(var1, 1, var2 + 12, var3 + 16, 4);
      MyGameCanvas.func_void_c(var1, 2, var2 + 12, var3 + 16 + 23, 4);
      MyGameCanvas.func_void_c(var1, 3, var2 + 12, var3 + 16 + 46, 4);
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_a, var2 + 10, var3 + 14 + 69, 20);
      if (var4.field_short_a > 0) {
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_l, var2 + 3, var3 + 18 + 69, 36);
      }

      switch(super.field_byte_b) {
      case 0:
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 35, var3 + 18, this.field_array_char_a, 1);
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 33, var3 + 35, this.field_array_char_b, 1);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_g, var2 + 35, var3 + 52, 20);
         MyGameCanvas.func_void_c(var1, var4.field_byte_g, var2 + 52, var3 + 52, 4);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_e, var2 + 34, var3 + 70, 20);
         MyGameCanvas.func_void_c(var1, var4.field_int_c, var2 + 102, var3 + 70, 8);
         var1.setColor(4136767);
         var1.fillRect(var2 + 34, var3 + 79, 72, 3);
         var1.setColor(16777215);
         var1.fillRect(var2 + 34 + 1, var3 + 79 + 1, var4.field_int_c * 70 / var4.field_int_f, 1);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_h, var2 + 38, var3 + 84, 20);
         MyGameCanvas.func_void_c(var1, var4.field_int_f, var2 + 102, var3 + 84, 8);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_f, var2 + 34, var3 + 97, 20);
         MyGameCanvas.func_void_d(var1, var2 + 102, var3 + 96, var4.field_int_a, var4.field_int_d);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_j, var2 + 34, var3 + 106, 20);
         MyGameCanvas.func_void_d(var1, var2 + 102, var3 + 105, var4.field_int_b, var4.field_int_e);
         return;
      case 1:
         var1.setColor(14663551);

         for(int var7 = 0; var7 < 6; ++var7) {
            class_bh.func_int_a(var1, var2 + 38, var3 + 21 + var7 * 15, class_ce.field_class_z_a.loadByIndex(9 + var7), 1);
         }

         MyGameCanvas.func_void_c(var1, var4.field_short_b + var4.field_byte_m, var2 + 100, var3 + 22, 8);
         MyGameCanvas.func_void_c(var1, var4.field_short_e + var4.field_byte_n, var2 + 100, var3 + 22 + 15, 8);
         MyGameCanvas.func_void_c(var1, var4.field_short_f + var4.field_byte_o, var2 + 100, var3 + 22 + 30, 8);
         MyGameCanvas.func_void_c(var1, var4.field_short_g + var4.field_byte_p, var2 + 100, var3 + 22 + 45, 8);
         MyGameCanvas.func_void_c(var1, var4.field_short_h, var2 + 100, var3 + 22 + 60, 8);
         MyGameCanvas.func_void_c(var1, var4.field_short_i, var2 + 100, var3 + 22 + 75, 8);
         return;
      case 2:
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 34, var3 + 18, this.field_array_char_a, 1);
         var1.setColor(16777215);
         char[] var6 = class_ce.field_class_z_a.loadByIndex(class_n.field_byte_a);
         if (MyGameCanvas.canvasWidth > 128) {
            class_bh.func_int_a(var1, var2 + 34, var3 + 30, 110, 1, var6);
            return;
         }

         class_bh.func_int_a(var1, var2 + 34, var3 + 30, 75, 1, var6);
         return;
      case 3:
         class_cb.func_void_b(var1, var2 + 34, var3 + 22, 100, 26, 4136767);
         var1.setColor(16777215);
         MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(3), var2 + 37, var3 + 25);
         MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(4), var2 + 37, var3 + 32 + 4);
         MyGameCanvas.func_void_c(var1, class_n.func_class_ao_a().field_short_a, var2 + 99, var3 + 32 + 4, 8);
         class_cb.func_void_b(var1, var2 + 34, var3 + 62, 100, 33, 4136767);
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 40, var3 + 72, class_ai.field_class_z_a.loadByIndex(5), 1);
         var1.setColor(14663551);
         class_bh.func_int_a(var1, var2 + 60, var3 + 67, class_ai.field_class_z_a.loadByIndex(6), 1);
         class_bh.func_int_a(var1, var2 + 60, var3 + 80, class_ai.field_class_z_a.loadByIndex(7), 1);
      default:
      }
   }
}
