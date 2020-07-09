package rpg;

// $FF: renamed from: an
public final class class_an {
   // $FF: renamed from: a int
   private int field_int_a = 1;

   // $FF: renamed from: a (byte[], int, int) void
   public final void func_void_a(byte[] var1, int var2, int var3) {
      int var4 = this.field_int_a & '\uffff';

      int var5;
      for(var5 = this.field_int_a >> 16 & '\uffff'; var3 > 0; var5 %= 65521) {
         int var6 = var3 < 5552 ? var3 : 5552;

         for(var3 -= var6; var6-- > 0; var5 += var4) {
            var4 += var1[var2++] & 255;
         }

         var4 %= 65521;
      }

      this.field_int_a = var5 << 16 | var4;
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_int_a = 1;
   }

   // $FF: renamed from: a () long
   public final long func_long_a() {
      return (long)this.field_int_a & -1L;
   }
}
