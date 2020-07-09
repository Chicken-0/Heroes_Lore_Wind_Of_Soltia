package rpg;

// $FF: renamed from: l
public final class class_l extends class_t {
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;

   public class_l(byte var1, byte var2) {
      super(var1, var2);
   }

   // $FF: renamed from: a (boolean, byte[], int) int
   public final int func_int_a(boolean var1, byte[] var2, int var3) {
      var3 = (var3 = (var3 = (var3 += this.func_int_a(var2, var3)) + this.func_int_b(var2, var3)) + this.func_int_c(var2, var3)) + this.func_int_a(var2, var3, var1);
      this.field_byte_a = var2[var3++];
      this.field_byte_b = var2[var3++];
      super.field_byte_c = var2[var3++];
      return var3;
   }
}
