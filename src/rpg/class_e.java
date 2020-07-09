package rpg;

// $FF: renamed from: e
public class class_e extends class_ad {
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: d byte
   public byte field_byte_d;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public boolean field_boolean_b;
   // $FF: renamed from: e byte
   public byte field_byte_e;
   // $FF: renamed from: j byte[]
   public byte[] field_array_byte_j = new byte[4];

   public class_e(byte var1, byte var2) {
      super(var1, var2);
   }

   // $FF: renamed from: a (boolean, byte[], int) int
   public int func_int_a(boolean var1, byte[] var2, int var3) {
      return (var3 = super.func_int_a(var1, var2, var3)) + this.func_int_a(var2, var3, var1);
   }

   // $FF: renamed from: a (byte[], int, boolean) int
   public final int func_int_a(byte[] var1, int var2, boolean var3) {
      this.field_short_a = (short)(var1[var2++] & 255);
      this.field_byte_d = var1[var2++];
      this.field_boolean_a = var1[var2++] != 0;
      boolean var4 = false;

      for(int var5 = 1; var5 <= 8; ++var5) {
         if (var1[var2 + var5] != 0) {
            var4 = true;
            break;
         }
      }

      if (!var4) {
         this.field_boolean_b = true;
      }

      if (var3 && var4) {
         byte[] var7 = new byte[]{var1[var2 + 1], var1[var2 + 3], var1[var2 + 5], var1[var2 + 7]};
         byte[] var6 = new byte[]{var1[var2 + 2], var1[var2 + 4], var1[var2 + 6], var1[var2 + 8]};
         this.func_void_a(var1[var2], var7, var6, (byte)0);
      }

      return 12;
   }

   // $FF: renamed from: a () byte[]
   public byte[] func_array_byte_a() {
      byte[] var1;
      (var1 = super.func_array_byte_a())[3] = (byte)(this.field_boolean_b ? 1 : 0);
      var1[4] = this.field_byte_e;
      System.arraycopy(this.field_array_byte_j, 0, var1, 5, 4);
      return var1;
   }

   // $FF: renamed from: a (byte, byte[], byte[], byte) void
   public final void func_void_a(byte var1, byte[] var2, byte[] var3, byte var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6;
         do {
            do {
               var6 = class_h.func_int_a(0, 3);
            } while(this.field_array_byte_j[var6] != 0);
         } while(var2[var6] == 0 && var3[var6] == 0);

         this.field_array_byte_j[var6] = (byte)class_h.func_int_a(var2[var6], var3[var6]);
      }

      this.field_byte_e = var4;
   }

   // $FF: renamed from: a (byte, byte, byte, byte) void
   public final void func_void_a(byte var1, byte var2, byte var3, byte var4) {
      this.field_array_byte_j[0] = var1;
      this.field_array_byte_j[1] = var2;
      this.field_array_byte_j[2] = var3;
      this.field_array_byte_j[3] = var4;
   }
}
