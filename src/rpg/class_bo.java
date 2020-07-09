package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bo
public final class class_bo extends class_cb {
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: a java.lang.Object[]
   private Object[] field_array_class_java_lang_Object_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: c byte
   private byte field_byte_c;

   public class_bo(class_cb var1, char[] var2, Object[] var3, char[] var4, int var5, byte var6) {
      super(var1, (byte)0);
      this.field_array_char_a = var2;
      this.field_byte_c = var6;
      this.field_array_class_java_lang_Object_a = var3;
      this.field_array_char_b = var4;
      this.field_int_a = var5;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (var2 == -8) {
         super.field_class_cb_a.func_void_a();
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return true;
      } else {
         super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)0);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      boolean var4 = false;
      var2 = class_r.field_int_i - 67;
      var3 = class_r.field_int_j - 60;
      class_ao var5 = class_n.func_class_ao_a();
      class_cb.func_void_c(var1, var2, var3, 135, 120);
      class_cb.func_void_b(var1, var2 + 3, var3 + 3, 129, 17, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 6, var3 + 4, this.field_array_char_a, 1);
      class_cb.func_void_b(var1, var2 + 3, var3 + 25, 129, 60, 10452863);
      var1.setColor(16777215);

      for(int var6 = 0; var6 < this.field_array_class_java_lang_Object_a.length; ++var6) {
         if (this.field_array_class_java_lang_Object_a[var6] != null) {
            class_bh.func_int_a(var1, var2 + 6, var3 + 27 + var6 * 18, (char[])((char[])this.field_array_class_java_lang_Object_a[var6]), 1);
         }
      }

      class_cb.func_void_a(var1, var2 + 135 - 5, var3 + 90, var5.field_class_g_a.field_int_a);
      class_cb.func_void_b(var1, var2 + 3, var3 + 98, 129, 15, 10452863);
      var1.setColor(16777215);
      class_bh.func_int_a(var1, var2 + 6, var3 + 99, this.field_array_char_b, 1);
      class_cb.func_void_a(var1, var2 + 135 - 5, var3 + 105, this.field_int_a);
   }
}
