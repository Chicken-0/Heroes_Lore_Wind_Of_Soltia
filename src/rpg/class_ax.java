package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ax
public final class class_ax extends class_cb {
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: a z
   public static TableDefineTextFile field_class_z_a;
   // $FF: renamed from: a ax
   private static class_ax field_class_ax_a;

   // $FF: renamed from: a () ax
   public static final class_ax func_class_ax_a() {
      if (field_class_ax_a == null) {
         field_class_ax_a = new class_ax();
         field_int_a = MyGameCanvas.canvasHalfWidth - 77;
         field_int_b = MyGameCanvas.field_int_j - 85;
      }

      return field_class_ax_a;
   }

   public class_ax() {
      super((class_cb)null, (byte)0);
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      try {
         field_class_z_a = new TableDefineTextFile("/sgui/refi");
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      Object[] var1 = new Object[]{field_class_z_a.loadByIndex(0), field_class_z_a.loadByIndex(1), field_class_z_a.loadByIndex(2)};
      this.func_void_a((byte)8, (byte)2, var1);
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      field_class_ax_a = null;
      field_class_z_a = null;
      super.field_class_cb_b = null;
      class_n.func_void_a((int)2);
      class_bs.field_class_as_a.func_void_b();
      System.gc();
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else {
         if (var2 == -8) {
            this.func_void_e();
         }

         return false;
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if (var1 == 8 && var2 == 0) {
         super.field_class_cb_b = new class_ap(this);
      } else if (var1 == 8 && var2 == 1) {
         super.field_class_cb_b = new class_k(this);
      } else {
         this.func_void_e();
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      this.func_void_b(var1, field_int_a, field_int_b);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      UIGeneral.func_void_a(var1);
      UIGeneral.func_void_a(var1, UIGeneral.labelTextOk, UIGeneral.labelTextBack);
   }
}
