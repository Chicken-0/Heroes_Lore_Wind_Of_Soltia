package rpg;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bp
public final class class_bp extends class_cb {
   // $FF: renamed from: a java.util.Vector[]
   private Vector[] field_array_class_java_util_Vector_a = class_ad.func_array_class_java_util_Vector_a();
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: a z
   public static TableDefineTextFile field_class_z_a;
   // $FF: renamed from: a bp
   private static class_bp field_class_bp_a;

   // $FF: renamed from: a () bp
   public static final class_bp func_class_bp_a() {
      if (field_class_bp_a == null) {
         field_class_bp_a = new class_bp();
         field_int_a = MyGameCanvas.canvasHalfWidth - 77;
         field_int_b = MyGameCanvas.field_int_j - 85;
      }

      return field_class_bp_a;
   }

   private class_bp() {
      super((class_cb)null, (byte)6);
      super.field_class_cb_b = new class_v(this, this.field_array_class_java_util_Vector_a[super.field_byte_b], super.field_byte_b);
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      try {
         field_class_z_a = new TableDefineTextFile("/sgui/shop");
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: e () void
   private void func_void_e() {
      field_class_bp_a = null;
      field_class_z_a = null;
      this.field_array_class_java_util_Vector_a = null;
      super.field_class_cb_b = null;
      class_n.func_void_a((int)2);
      class_bs.field_class_as_a.func_void_b();
      System.gc();
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_d(var1, var2)) {
         return true;
      } else if (var2 == -8) {
         this.func_void_e();
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      super.func_void_a(var1);
      super.field_class_cb_b = new class_v(this, this.field_array_class_java_util_Vector_a[super.field_byte_b], super.field_byte_b);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      this.func_void_b(var1, field_int_a, field_int_b);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      class_bh.func_void_a(var1);
      class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_e);
      var1.setColor(4136767);
      var1.fillRect(var2, var3, 155, 170);
      class_cb.func_void_c(var1, var2 + 2, var3 + 15, 151, 155);
      var1.setColor(16768959);
      var1.fillRect(var2 + 11 + super.field_byte_b * 16 + 1, var3, 14, 1);
      var1.fillRect(var2 + 11 + super.field_byte_b * 16, var3 + 1, 1, 16);
      var1.setColor(12558207);
      var1.fillRect(var2 + 11 + super.field_byte_b * 16 + 15, var3 + 1, 1, 15);
      var1.setColor(14663551);
      var1.fillRect(var2 + 11 + super.field_byte_b * 16 + 1, var3 + 1, 14, 16);

      for(int var4 = 0; var4 < 6; ++var4) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_p[var4], var2 + 13 + var4 * 16, var3 + 1, 20);
      }

      MyGameCanvas.func_int_a(var1, field_class_z_a.loadByIndex(super.field_byte_b + 1), var2 + 3, var3 + 15);
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_o, var2 + 4, var3 + 4, 20);
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 109, var3 + 4, 20);
   }
}
