package rpg;

// $FF: renamed from: j
public final class class_j {
   // $FF: renamed from: a j[]
   public static class_j[] field_array_class_j_a;
   // $FF: renamed from: a byte[]
   public static final byte[] field_array_byte_a = new byte[]{3, 2, 6, 2, 2, 1, 3, 4, 3, 2, 3, 4, 2, 3, 2, 2, 2, 3, 3, 3, 3, 3, 6, 3, 3, 3, 2, 2, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   // $FF: renamed from: a char[]
   public char[] field_array_char_a;
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;
   // $FF: renamed from: c byte
   public byte field_byte_c;
   // $FF: renamed from: d byte
   public byte field_byte_d;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public boolean field_boolean_b;
   // $FF: renamed from: c boolean
   public boolean field_boolean_c;
   // $FF: renamed from: d boolean
   public boolean field_boolean_d;
   // $FF: renamed from: e byte
   public byte field_byte_e;
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: b short
   public short field_short_b;
   // $FF: renamed from: c short
   public short field_short_c;
   // $FF: renamed from: d short
   public short field_short_d;
   // $FF: renamed from: g byte
   public byte field_byte_g;
   // $FF: renamed from: h byte
   public byte field_byte_h;
   // $FF: renamed from: i byte
   public byte field_byte_i;
   // $FF: renamed from: e short
   public short field_short_e;
   // $FF: renamed from: b byte[]
   public byte[] field_array_byte_b;
   // $FF: renamed from: j byte
   public byte field_byte_j;
   // $FF: renamed from: k byte
   public byte field_byte_k;
   // $FF: renamed from: l byte
   public byte field_byte_l;
   // $FF: renamed from: m byte
   public byte field_byte_m;

   // $FF: renamed from: a (int) void
   public static final void func_void_a(int var0) {
      field_array_class_j_a = new class_j[var0];
   }

   // $FF: renamed from: a (byte[], byte, byte) void
   public static final void func_void_a(byte[] var0, byte var1, byte var2) {
      int var3 = 1;

      for(int var6 = 0; var6 < var1; ++var6) {
         short var5 = class_h.func_short_a(var0, var3);
         var3 += 2 + var5;
      }

      var3 += 2;
      class_j var7 = new class_j();
      ++var3;
      byte var4 = var0[var3++];
      var7.field_array_char_a = class_bh.func_array_char_a(new String(var0, var3, var4));
      var3 += var4;
      var4 = var0[var3++];
      var7.field_byte_a = (byte)(var4 >> 6 & 3);
      var7.field_byte_b = (byte)(var4 >> 4 & 3);
      var7.field_byte_c = (byte)(var4 >> 2 & 3);
      var7.field_byte_d = (byte)(var4 & 3);
      var4 = var0[var3++];
      var7.field_boolean_a = (var4 >> 3 & 1) == 1;
      var7.field_boolean_b = (var4 >> 2 & 1) == 1;
      var7.field_boolean_c = (var4 >> 1 & 1) == 1;
      var7.field_boolean_d = (var4 & 1) == 1;
      if (var7.field_boolean_c) {
         var7.field_byte_e = (byte)(var4 >> 6 & 3);
      }

      var7.field_byte_f = var0[var3++];
      var7.field_short_a = class_h.func_short_a(var0, var3);
      var3 += 2;
      var7.field_short_b = class_h.func_short_a(var0, var3);
      var3 += 2;
      var7.field_short_c = class_h.func_short_a(var0, var3);
      var3 += 2;
      var7.field_short_d = class_h.func_short_a(var0, var3);
      var3 += 2;
      var7.field_byte_g = var0[var3++];
      var7.field_byte_h = var0[var3++];
      var7.field_byte_i = var0[var3++];
      var7.field_short_e = class_h.func_short_a(var0, var3);
      var3 += 2;
      var4 = var0[var3++];
      var7.field_array_byte_b = new byte[3 * var4];
      System.arraycopy(var0, var3, var7.field_array_byte_b, 0, var7.field_array_byte_b.length);
      field_array_class_j_a[var2] = var7;
   }

   // $FF: renamed from: a (byte) void
   public static final void func_void_a(byte var0) {
      class_j var1 = field_array_class_j_a[var0];
      byte[] var2;
      class_x.func_void_a((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_e[var0 * 12 + 0])) != null);
      var1.field_byte_j = var2[0];
      class_x.func_void_a((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_e[var0 * 12 + 4])) != null);
      var1.field_byte_k = var2[0];
      class_x.func_void_a((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_e[var0 * 12 + 8])) != null);
      var1.field_byte_l = var2[0];
   }

   // $FF: renamed from: b (byte) void
   public static final void func_void_b(byte var0) {
      class_j var1 = field_array_class_j_a[var0];
      byte[] var2;
      class_x.func_void_a((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[var0 * 16 + 0])) != null);
      var1.field_byte_j = var2[0];
      if ((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[var0 * 16 + 4])) != null) {
         var1.field_byte_k = var2[0];
      } else {
         var1.field_byte_k = -1;
      }

      if ((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[var0 * 16 + 12])) != null) {
         var1.field_byte_l = var2[0];
      } else {
         var1.field_byte_l = -1;
      }

      if ((var2 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[var0 * 16 + 8])) != null) {
         var1.field_byte_m = var2[0];
      } else {
         var1.field_byte_m = -1;
      }
   }
}
