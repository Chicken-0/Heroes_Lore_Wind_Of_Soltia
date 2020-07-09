package rpg;

import java.util.Vector;

// $FF: renamed from: ad
public class class_ad {
   // $FF: renamed from: b z
   public static class_z field_class_z_b;
   // $FF: renamed from: b boolean[]
   public static final boolean[] field_array_boolean_b = new boolean[]{false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, true};
   // $FF: renamed from: c boolean[]
   public static final boolean[] field_array_boolean_c = new boolean[]{false, false, false, false, false, false, false, true, false, true, false, false, true, true, true, true, true, false, false, false, false, false, false, false};
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: g byte
   public byte field_byte_g;
   // $FF: renamed from: a char[]
   public char[] field_array_char_a;
   // $FF: renamed from: b char[]
   public char[] field_array_char_b;
   // $FF: renamed from: a int
   public int field_int_a;
   // $FF: renamed from: h byte
   public byte field_byte_h;

   public class_ad(byte var1, byte var2) {
      this.field_byte_f = var1;
      this.field_byte_g = var2;
      this.field_byte_h = 1;
   }

   // $FF: renamed from: a (boolean) void
   public final void func_void_a(boolean var1) {
      byte[] var2 = class_ce.func_array_byte_a(this.field_byte_f, this.field_byte_g);
      boolean var3 = false;
      this.func_int_a(var1, var2, 1);
   }

   // $FF: renamed from: a (boolean, byte[], int) int
   public int func_int_a(boolean var1, byte[] var2, int var3) {
      return (var3 = (var3 += this.func_int_a(var2, var3)) + this.func_int_b(var2, var3)) + this.func_int_c(var2, var3);
   }

   // $FF: renamed from: a (byte[], int) int
   public final int func_int_a(byte[] var1, int var2) {
      byte var3 = var1[var2++];
      this.field_array_char_a = class_bh.func_array_char_a(new String(var1, var2, var3));
      return 1 + var3;
   }

   // $FF: renamed from: b (byte[], int) int
   public final int func_int_b(byte[] var1, int var2) {
      byte var3 = var1[var2++];
      this.field_array_char_b = class_bh.func_array_char_a(new String(var1, var2, var3));
      return 1 + var3;
   }

   // $FF: renamed from: c (byte[], int) int
   public final int func_int_c(byte[] var1, int var2) {
      this.field_int_a += (var1[var2 + 3] & 255) * 16777216;
      this.field_int_a += (var1[var2 + 2] & 255) * 65536;
      this.field_int_a += (var1[var2 + 1] & 255) * 256;
      this.field_int_a += var1[var2] & 255;
      return 4;
   }

   // $FF: renamed from: a () byte[]
   public byte[] func_array_byte_a() {
      byte[] var1;
      (var1 = new byte[10])[0] = this.field_byte_f;
      var1[1] = this.field_byte_g;
      var1[2] = this.field_byte_h;
      return var1;
   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      this.field_byte_h += var1;
   }

   // $FF: renamed from: b (byte) void
   public final void func_void_b(byte var1) {
      this.field_byte_h -= var1;
   }

   // $FF: renamed from: a () char[]
   public final char[] func_array_char_a() {
      return field_class_z_b.func_array_char_a(this.field_byte_f);
   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return this.field_byte_f == 10 || this.field_byte_f == 7 || this.field_byte_f == 8 || this.field_byte_f == 9;
   }

   // $FF: renamed from: b () boolean
   public final boolean func_boolean_b() {
      return this.field_byte_f == 18 || this.field_byte_f == 19 || this.field_byte_f == 20 || this.field_byte_f == 21;
   }

   // $FF: renamed from: a (byte, byte, boolean, boolean) ad
   public static final class_ad func_class_ad_a(byte var0, byte var1, boolean var2, boolean var3) {
      Object var4 = null;
      switch(var0) {
      case 0:
      case 1:
      case 2:
         var4 = new class_l(var0, var1);
         break;
      case 3:
         var4 = new class_t(var0, var1);
         break;
      case 4:
      case 5:
      case 6:
         var4 = new class_e(var0, var1);
         break;
      default:
         var4 = new class_ad(var0, var1);
      }

      if (var2) {
         ((class_ad)var4).func_void_a(var3);
      }

      ((class_ad)var4).field_byte_h = 1;
      return (class_ad)var4;
   }

   // $FF: renamed from: a (byte[], int, boolean, boolean) ad
   public static final class_ad func_class_ad_a(byte[] var0, int var1, boolean var2, boolean var3) {
      Object var4 = null;
      byte var5 = var0[var1++];
      byte var6 = var0[var1++];
      switch(var5) {
      case 0:
      case 1:
      case 2:
         var4 = new class_l(var5, var6);
         break;
      case 3:
         var4 = new class_t(var5, var6);
         break;
      case 4:
      case 5:
      case 6:
         var4 = new class_e(var5, var6);
         break;
      default:
         var4 = new class_ad(var5, var6);
      }

      if (var2) {
         ((class_ad)var4).func_int_a(var3, var0, var1);
      }

      return (class_ad)var4;
   }

   // $FF: renamed from: a (byte[]) ad
   public static final class_ad func_class_ad_a(byte[] var0) {
      class_ad var1;
      (var1 = func_class_ad_a(var0[0], var0[1], true, true)).field_byte_h = var0[2];
      if (var1 instanceof class_e) {
         ((class_e)var1).field_boolean_b = var0[3] == 1;
         ((class_e)var1).field_byte_e = var0[4];
         ((class_e)var1).func_void_a(var0[5], var0[6], var0[7], var0[8]);
      }

      if (var1 instanceof class_t) {
         ((class_t)var1).field_byte_c = var0[9];
      }

      return var1;
   }

   // $FF: renamed from: a () java.util.Vector[]
   public static final Vector[] func_array_class_java_util_Vector_a() {
      Vector[] var0 = new Vector[6];

      for(int var1 = 0; var1 < 6; ++var1) {
         var0[var1] = new Vector();
      }

      byte[] var6 = class_ce.func_array_byte_a();
      int var2 = 0;

      while(var2 < var6.length) {
         byte var3 = var6[var2++];
         class_ad var4 = func_class_ad_a(var6, var2, true, false);
         var2 += var3;
         switch(var4.field_byte_f) {
         case 0:
         case 1:
         case 2:
            ((class_e)var4).field_boolean_b = true;
            var0[1].addElement(var4);
            break;
         case 3:
            ((class_e)var4).field_boolean_b = true;
            var0[2].addElement(var4);
            break;
         case 4:
            ((class_e)var4).field_boolean_b = true;
            var0[5].addElement(var4);
            break;
         case 5:
            ((class_e)var4).field_boolean_b = true;
            var0[3].addElement(var4);
            break;
         case 6:
            ((class_e)var4).field_boolean_b = true;
            var0[4].addElement(var4);
            break;
         case 7:
         case 9:
         case 10:
            var0[0].addElement(var4);
         case 8:
         }
      }

      for(int var5 = 0; var5 < 6; ++var5) {
         var0[var5].trimToSize();
      }

      return var0;
   }

   // $FF: renamed from: a (ad, ad, ad) ad
   public static final class_ad func_class_ad_a(class_ad var0, class_ad var1, class_ad var2) {
      int var3 = 0;
      if (var0 != null) {
         ++var3;
      }

      if (var1 != null) {
         ++var3;
      }

      if (var2 != null) {
         ++var3;
      }

      byte[] var4 = class_ce.func_array_byte_a("/itm/mixtbl");
      int var5 = 0;

      boolean var8;
      byte var10;
      byte var14;
      do {
         if (var5 >= var4.length) {
            return null;
         }

         class_ad[] var6 = new class_ad[]{var0, var1, var2};
         byte var7 = var4[var5++];
         var8 = true;

         for(int var9 = 0; var9 < var7; ++var9) {
            var10 = var4[var5++];
            byte var11 = var4[var5++];
            boolean var12 = false;

            for(int var13 = 0; var13 < 3; ++var13) {
               if (var6[var13] != null && var6[var13].field_byte_f == var10 && var6[var13].field_byte_g == var11) {
                  var12 = true;
                  var6[var13] = null;
                  break;
               }
            }

            if (!var12) {
               var8 = false;
            }
         }

         var14 = var4[var5++];
         var10 = var4[var5++];
         if (var7 != var3) {
            var8 = false;
         }
      } while(!var8);

      return func_class_ad_a(var14, var10, true, true);
   }
}
