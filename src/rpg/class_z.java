package rpg;

import java.io.IOException;

// $FF: renamed from: z
public final class class_z {
   // $FF: renamed from: a int[]
   private int[] field_array_int_a;
   // $FF: renamed from: a short
   public short field_short_a;

   public class_z(String var1) throws IOException {
      byte[] var2 = class_ce.func_array_byte_a(var1 + ".tdf");
      byte var3 = 0;
      int var7 = var3 + 1;
      this.field_short_a = (short)(var2[0] & 255);
      this.field_array_int_a = new int[this.field_short_a];

      for(int var5 = 0; var5 < this.field_short_a; ++var5) {
         int var4 = ((var2[var7++] & 255) << 8) + (var2[var7++] & 255);
         String var6 = new String(var2, var7, var4);
         this.field_array_int_a[var5] = Integer.parseInt(var6.trim());
         var7 += var4;
      }

   }

   // $FF: renamed from: a (int) char[]
   public final char[] func_array_char_a(int var1) {
      return class_cj.field_class_cj_a.func_class_java_lang_String_a(this.field_array_int_a[var1]).replace(';', '\n').toCharArray();
   }
}
