package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bb
public final class class_bb extends class_m {
   public class_bb(class_cb var1, byte[] var2) {
      super(var1, var2, (byte)0, class_bp.field_class_z_a.loadByIndex(18));
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 != -8 && var2 != 35) {
            return true;
         } else {
            super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
            return true;
         }
      } else {
         byte var10001 = super.field_array_byte_h[super.field_byte_b];
         class_ad var3;
         if ((var3 = class_n.func_class_ao_a().field_class_g_a.func_class_ad_a(var10001)).func_boolean_b()) {
            this.func_void_a((byte)1, (byte)0, new Object[]{class_bp.field_class_z_a.loadByIndex(19), class_bp.field_class_z_a.loadByIndex(20)});
         } else {
            super.field_class_cb_b = new class_ab(this, var3, false);
         }

         return true;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_cb var3 = super.field_class_cb_b;
      super.func_void_a(var1, var2);
      if (var3 instanceof class_ab) {
         super.field_class_cb_a.func_void_a();
         byte[] var4;
         if ((var4 = class_n.func_class_ao_a().field_class_g_a.func_array_byte_a()).length > 0) {
            super.field_class_cb_a.field_class_cb_b = new class_bb(super.field_class_cb_a, var4);
            return;
         }

         super.field_class_cb_a.func_void_a((byte)1, (byte)0, new Object[]{class_bp.field_class_z_a.loadByIndex(21), class_bp.field_class_z_a.loadByIndex(22)});
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      UIGeneral.func_void_a(var1);
      UIGeneral.func_void_a(var1, UIGeneral.labelTextSelect, UIGeneral.labelTextBack);
      super.func_void_a(var1, var2, var3);
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_b, class_bp.field_int_a + 155 - 38, class_bp.field_int_b + 170 - 22, 20);
   }
}
