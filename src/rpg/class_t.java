package rpg;

// $FF: renamed from: t
public class class_t extends class_e implements class_u {
   // $FF: renamed from: h byte[]
   public static final byte[] field_array_byte_h = new byte[]{0, 1, -1, -1, -1, 4, 3, 2, -1};
   // $FF: renamed from: a z
   public static class_z field_class_z_a;
   // $FF: renamed from: i byte[]
   public static final byte[] field_array_byte_i = new byte[]{20, 16, 6, 13, 13, 10, 10, 10, 10};
   // $FF: renamed from: c byte
   public byte field_byte_c;

   public class_t(byte var1, byte var2) {
      super(var1, var2);
   }

   // $FF: renamed from: a (boolean, byte[], int) int
   public int func_int_a(boolean var1, byte[] var2, int var3) {
      var3 = super.func_int_a(var1, var2, var3);
      this.field_byte_c = var2[var3++];
      return var3;
   }

   // $FF: renamed from: a () byte[]
   public final byte[] func_array_byte_a() {
      byte[] var1;
      (var1 = super.func_array_byte_a())[9] = this.field_byte_c;
      return var1;
   }
}
