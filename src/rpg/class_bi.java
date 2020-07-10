package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bi
public final class class_bi extends class_cb {
   // $FF: renamed from: a short
   private short field_short_a;
   // $FF: renamed from: a short[]
   private short[] field_array_short_a;

   public class_bi(class_q var1) {
      super(var1, (byte)4);
      this.field_short_a = class_n.func_class_ao_a().field_short_a;
      this.field_array_short_a = new short[4];
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 52 && var1 != 2) {
         if (var2 != 54 && var1 != 5) {
            if (var2 != 53 && var1 != 8) {
               if (var2 == -8) {
                  super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
                  return true;
               } else {
                  return true;
               }
            } else {
               Object[] var3;
               if (this.field_array_short_a[0] == 0 && this.field_array_short_a[1] == 0 && this.field_array_short_a[2] == 0 && this.field_array_short_a[3] == 0) {
                  var3 = new Object[]{class_ai.field_class_z_a.loadByIndex(34), class_ai.field_class_z_a.loadByIndex(35)};
                  this.func_void_a((byte)1, (byte)1, var3);
               } else {
                  var3 = new Object[]{class_ai.field_class_z_a.loadByIndex(33)};
                  this.func_void_a((byte)2, (byte)2, var3);
               }

               return true;
            }
         } else {
            this.func_void_b((byte)4);
            return true;
         }
      } else {
         this.func_void_b((byte)3);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 36;
      var3 += 37;
      class_ao var4 = class_n.func_class_ao_a();
      class_cb.func_void_b(var1, var2, var3, 101, 26, 4136767);
      var1.setColor(16777215);
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(36), var2 + 3, var3 + 3);
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(37), var2 + 3, var3 + 10 + 4);
      MyGameCanvas.func_void_c(var1, this.field_short_a, var2 + 65, var3 + 10 + 4, 8);
      var1.setColor(6242111);
      var1.fillRect(var2, var3 + 30, 101, 62);

      for(byte var5 = 0; var5 < 4; ++var5) {
         if (super.field_byte_b == var5) {
            var1.setColor(16777215);
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 2, var3 + 35 + var5 * 15, 20);
         } else {
            var1.setColor(14663551);
         }

         int var6 = this.field_array_short_a[var5];
         switch(var5) {
         case 0:
            var6 += var4.field_short_b + var4.field_byte_m;
            break;
         case 1:
            var6 += var4.field_short_e + var4.field_byte_n;
            break;
         case 2:
            var6 += var4.field_short_f + var4.field_byte_o;
            break;
         case 3:
            var6 += var4.field_short_g + var4.field_byte_p;
         }

         class_bh.func_int_a(var1, var2 + 10, var3 + 35 + var5 * 15, class_ce.field_class_z_a.loadByIndex(9 + var5), 1);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_o, var2 + 45 + 25, var3 + 35 + var5 * 15, 20);
         MyGameCanvas.func_void_c(var1, var6, var2 + 65 + 25, var3 + 35 + var5 * 15, 8);
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 67 + 25, var3 + 35 + var5 * 15, 20);
      }

   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      if (var3 instanceof class_af && var1 == 2 && var2 == 0) {
         class_ao var4;
         class_ao var10000 = var4 = class_n.func_class_ao_a();
         var10000.field_short_b += this.field_array_short_a[0];
         var4.field_short_e += this.field_array_short_a[1];
         var4.field_short_f += this.field_array_short_a[2];
         var4.field_short_g += this.field_array_short_a[3];
         var4.field_short_a = this.field_short_a;
         var4.func_void_n();
         super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
      }

   }

   // $FF: renamed from: b (byte) void
   private void func_void_b(byte var1) {
      if (var1 == 4 && this.field_short_a > 0) {
         ++this.field_array_short_a[super.field_byte_b];
         --this.field_short_a;
      } else {
         if (var1 == 3 && this.field_array_short_a[super.field_byte_b] > 0) {
            --this.field_array_short_a[super.field_byte_b];
            ++this.field_short_a;
         }

      }
   }
}
