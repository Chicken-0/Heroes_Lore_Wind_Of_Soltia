package rpg;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ck
public abstract class class_ck implements class_u {
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public boolean field_boolean_b;
   // $FF: renamed from: c short
   public short field_short_c;
   // $FF: renamed from: d short
   public short field_short_d;
   // $FF: renamed from: c byte
   public byte field_byte_c;
   // $FF: renamed from: d byte
   public byte field_byte_d;
   // $FF: renamed from: e byte
   public byte field_byte_e = 1;
   // $FF: renamed from: a java.util.Random
   public static Random field_class_java_util_Random_a = new Random();
   // $FF: renamed from: a ck
   public class_ck field_class_ck_a;
   // $FF: renamed from: b ck
   public class_ck field_class_ck_b;
   // $FF: renamed from: c boolean
   public boolean field_boolean_c = false;

   public class_ck(short var1, short var2, byte var3, byte var4) {
      this.func_void_a(var1, var2);
      this.func_void_b();
      this.field_byte_c = var3;
      this.field_byte_d = var4;
   }

   // $FF: renamed from: a (short, short) void
   public void func_void_a(short var1, short var2) {
      this.field_short_c = var1;
      this.field_short_d = var2;
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      this.field_byte_b = (byte)(this.field_short_d >> 4);
      this.field_byte_a = (byte)(this.field_short_c >> 4);
      this.field_boolean_b = (this.field_short_d & 15) != 0;
      this.field_boolean_a = (this.field_short_c & 15) != 0;
   }

   // $FF: renamed from: a (byte, byte) ck
   public final class_ck func_class_ck_a(byte var1, byte var2) {
      class_ae var3 = class_n.field_class_ae_a;
      switch(var1) {
      case 1:
         if (this.field_byte_b - var2 < 0) {
            return null;
         }

         return var3.field_array_array_class_ck_a[this.field_byte_b - var2][this.field_byte_a];
      case 2:
         if (this.field_byte_b + var2 >= var3.field_int_b) {
            return null;
         }

         return var3.field_array_array_class_ck_a[this.field_byte_b + var2][this.field_byte_a];
      case 3:
         if (this.field_byte_a - var2 < 0) {
            return null;
         }

         return var3.field_array_array_class_ck_a[this.field_byte_b][this.field_byte_a - var2];
      case 4:
         if (this.field_byte_a + var2 >= var3.field_int_a) {
            return null;
         }

         return var3.field_array_array_class_ck_a[this.field_byte_b][this.field_byte_a + var2];
      default:
         return null;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public abstract void func_void_a(Graphics var1, int var2, int var3);
}
