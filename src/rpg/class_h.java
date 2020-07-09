package rpg;

import java.util.Random;

// $FF: renamed from: h
public final class class_h {
   // $FF: renamed from: a java.util.Random
   public static Random field_class_java_util_Random_a = new Random();

   // $FF: renamed from: a (int, int) int
   public static final int func_int_a(int var0, int var1) {
      class_x.func_void_a(var0 <= var1);
      int var2;
      if ((var2 = var1 - var0 + 1) == 0) {
         return 0;
      } else {
         int var3 = Math.abs(field_class_java_util_Random_a.nextInt()) % var2;
         return var0 + var3;
      }
   }

   // $FF: renamed from: a (byte[], int) short
   public static final short func_short_a(byte[] var0, int var1) {
      if (var0.length - 2 < var1) {
         throw new ArrayIndexOutOfBoundsException();
      } else {
         boolean var2 = false;
         short var3;
         return (short)((var3 = (short)(0 | (var0[var1] & 255) << 8)) | var0[var1 + 1] & 255);
      }
   }

   // $FF: renamed from: a (char[], char[]) char[]
   public static final char[] func_array_char_a(char[] var0, char[] var1) {
      char[] var2 = new char[var0.length + var1.length];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }

   // $FF: renamed from: a (byte[], int) int
   public static final int func_int_a(byte[] var0, int var1) {
      boolean var2 = false;
      return var0.length < var1 + 4 ? -1 : (var0[var1] & 255) << 24 | (var0[var1 + 1] & 255) << 16 | (var0[var1 + 2] & 255) << 8 | var0[var1 + 3] & 255;
   }

   // $FF: renamed from: a (int, byte[], int) void
   public static final void func_void_a(int var0, byte[] var1, int var2) {
      byte[] var3 = new byte[]{0, 0, 0, 0};
      int var4 = var0 & -1;
      var3[0] = (byte)(var4 >> 24 & 255);
      var3[1] = (byte)(var4 >> 16 & 255);
      var3[2] = (byte)(var4 >> 8 & 255);
      var3[3] = (byte)(var4 & 255);
      System.arraycopy(var3, 0, var1, var2, 4);
   }
}
