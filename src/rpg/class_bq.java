package rpg;

// $FF: renamed from: bq
public final class class_bq {
   // $FF: renamed from: a (byte[], byte[]) byte[]
   public static final byte[] func_array_byte_a(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length + 1];
      int var3 = 0;
      int var5 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         byte var6 = var0[var4];
         ++var5;
         if (var5 == var1.length) {
            var5 = 0;
         }

         int var7 = var6 ^ var1[var5];
         var3 += var1[var5] & 255;
         var2[var4] = (byte)var7;
      }

      var2[var0.length] = (byte)var3;
      return var2;
   }

   // $FF: renamed from: b (byte[], byte[]) byte[]
   public static final byte[] func_array_byte_b(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length + 1];
      int var3 = 0;
      if (var0.length < 1) {
         return null;
      } else {
         int var5 = 0;

         int var4;
         try {
            for(var4 = 0; var4 < var0.length - 1; ++var4) {
               byte var6 = var0[var4];
               ++var5;
               if (var5 == var1.length) {
                  var5 = 0;
               }

               int var9 = var6 ^ var1[var5];
               var3 += var1[var5] & 255;
               var2[var4] = (byte)var9;
            }
         } catch (Exception var8) {
            return null;
         }

         return (var3 & 255) != (var0[var4] & 255) ? null : var2;
      }
   }
}
