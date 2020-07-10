package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ay
public final class class_ay extends class_cb {
   public class_ay(class_cb var1) {
      super(var1, (byte)30);
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
         class_ad var3;
         if ((var3 = class_n.func_class_ao_a().field_class_g_a.func_class_ad_a(super.field_byte_b)) != null) {
            if (var3 instanceof class_e) {
               class_e var4;
               Object[] var5;
               if ((var4 = (class_e)var3).field_boolean_b) {
                  if (var4 instanceof class_l) {
                     if ((class_n.field_byte_a != 6 || var4.field_byte_f != 0) && (class_n.field_byte_a != 7 || var4.field_byte_f != 2) && (class_n.field_byte_a != 8 || var4.field_byte_f != 1)) {
                        var5 = new Object[2];
                        if (var4.field_byte_f == 0) {
                           var5[0] = class_ai.field_class_z_a.loadByIndex(8);
                        } else if (var4.field_byte_f == 2) {
                           var5[0] = class_ai.field_class_z_a.loadByIndex(9);
                        } else if (var4.field_byte_f == 1) {
                           var5[0] = class_ai.field_class_z_a.loadByIndex(50);
                        }

                        var5[1] = class_ai.field_class_z_a.loadByIndex(12);
                        this.func_void_a((byte)6, (byte)2, var5);
                     } else {
                        var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(11), class_ai.field_class_z_a.loadByIndex(10)};
                        this.func_void_a((byte)4, (byte)2, var5);
                     }
                  } else if (var4.field_byte_f == 3 && class_n.field_byte_a != 8) {
                     var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(12)};
                     this.func_void_a((byte)6, (byte)2, var5);
                  } else {
                     var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(11), class_ai.field_class_z_a.loadByIndex(10)};
                     this.func_void_a((byte)4, (byte)2, var5);
                  }
               } else {
                  var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(12)};
                  this.func_void_a((byte)6, (byte)2, var5);
               }
            } else {
               Object[] var6;
               if (var3.func_boolean_a()) {
                  var6 = new Object[]{class_ai.field_class_z_a.loadByIndex(13), class_ai.field_class_z_a.loadByIndex(10)};
                  this.func_void_a((byte)5, (byte)2, var6);
               } else if (var3.func_boolean_b()) {
                  var6 = new Object[]{class_ai.field_class_z_a.loadByIndex(14)};
                  this.func_void_a(var6);
               } else {
                  var6 = new Object[]{class_ai.field_class_z_a.loadByIndex(12)};
                  this.func_void_a((byte)6, (byte)2, var6);
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      class_ao var3;
      class_g var4 = (var3 = class_n.func_class_ao_a()).field_class_g_a;
      if (var1 == 4 && var2 == 0) {
         switch(((class_e)var4.func_class_ad_a(super.field_byte_b)).field_byte_f) {
         case 0:
         case 1:
         case 2:
            var3.func_void_b(super.field_byte_b, (byte)0);
            break;
         case 3:
            var3.func_void_b(super.field_byte_b, (byte)1);
            break;
         case 4:
            var3.func_void_b(super.field_byte_b, (byte)4);
            break;
         case 5:
            var3.func_void_b(super.field_byte_b, (byte)2);
            break;
         case 6:
            var3.func_void_b(super.field_byte_b, (byte)3);
         }

      } else if (var1 == 5 && var2 == 0) {
         var3.func_void_a(var4.func_class_ad_a(super.field_byte_b));
      } else if ((var1 != 4 || var2 != 1) && (var1 != 5 || var2 != 1)) {
         if (var1 == 6 && var2 == 0) {
            var4.func_void_a(super.field_byte_b, (byte)1);
         }

      } else {
         Object[] var5 = new Object[]{class_ai.field_class_z_a.loadByIndex(12)};
         this.func_void_a((byte)6, (byte)2, var5);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var2 += 2;
      var3 += 15;
      class_g var4 = class_n.func_class_ao_a().field_class_g_a;
      MyGameCanvas.func_int_a(var1, class_ce.field_class_z_g.loadByIndex(2), var2 + 5, var3);
      this.func_void_a(var1, var2, var3, true);

      class_ad var5;
      for(int var6 = this.func_int_c(); var6 <= this.func_int_d(); ++var6) {
         if ((var5 = var4.func_class_ad_a(var6)) != null) {
            class_cb.func_void_a(var1, var2 + 13, var3 + 18 + 23 * (var6 % 5), var5, true);
         }
      }

      if ((var5 = var4.func_class_ad_a(super.field_byte_b)) != null) {
         class_cb.func_void_a(var1, var2 + 33, var3 + 14, var5);
      } else {
         var1.setColor(16777215);
         UIGeneral.func_int_a(var1, var2 + 33, var3 + 14, class_ai.field_class_z_a.loadByIndex(15), 1);
      }
   }
}
