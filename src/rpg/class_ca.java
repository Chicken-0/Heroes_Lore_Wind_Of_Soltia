package rpg;

// $FF: renamed from: ca
public final class class_ca {
   // $FF: renamed from: a int[]
   private static final int[] field_array_int_a = new int[256];
   // $FF: renamed from: a int
   private int field_int_a = -1;

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_int_a = -1;
   }

   // $FF: renamed from: a (byte[], int, int) void
   public final void func_void_a(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.field_int_a = this.field_int_a >>> 8 & 16777215 ^ field_array_int_a[(this.field_int_a ^ var1[var4]) & 255];
      }

   }

   // $FF: renamed from: a () int
   public final int func_int_a() {
      return ~this.field_int_a;
   }

   static {
      for(short var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(byte var2 = 1; var2 < 9; ++var2) {
            var0 = (var0 & 1) == 1 ? var0 >>> 1 ^ -306674912 : var0 >>> 1;
         }

         field_array_int_a[var1] = var0;
      }

   }
}
