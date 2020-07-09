package rpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

// $FF: renamed from: g
public final class class_g {
   // $FF: renamed from: a byte[]
   private static final byte[] field_array_byte_a = new byte[]{7, 8, 9, 10};
   // $FF: renamed from: a ad[]
   private class_ad[] field_array_class_ad_a;
   // $FF: renamed from: a byte
   private byte field_byte_a;
   // $FF: renamed from: b byte
   private byte field_byte_b;
   // $FF: renamed from: a int
   public int field_int_a;

   public class_g(byte var1) {
      this.field_array_class_ad_a = new class_ad[var1];
      this.func_void_a();
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_byte_a = -1;
      this.field_byte_b = -1;
      this.func_void_b();
   }

   // $FF: renamed from: a (int) ad
   public final class_ad func_class_ad_a(int var1) {
      return this.field_array_class_ad_a[var1];
   }

   // $FF: renamed from: a () byte[]
   public final byte[] func_array_byte_a() {
      int var1 = 0;

      for(byte var2 = 0; var2 < this.field_array_class_ad_a.length; ++var2) {
         if (this.field_array_class_ad_a[var2] != null) {
            ++var1;
         }
      }

      byte[] var5 = new byte[var1];
      int var3 = 0;

      for(byte var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null) {
            var5[var3++] = var4;
         }
      }

      return var5;
   }

   // $FF: renamed from: a (boolean, byte) byte[]
   public final byte[] func_array_byte_a(boolean var1, byte var2) {
      int var3 = 0;

      for(byte var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null && this.field_array_class_ad_a[var4] instanceof class_e && (!var1 || this.field_array_class_ad_a[var4] instanceof class_t) && (var2 != 1 || ((class_e)this.field_array_class_ad_a[var4]).field_boolean_b) && (var2 != -1 || !((class_e)this.field_array_class_ad_a[var4]).field_boolean_b)) {
            ++var3;
         }
      }

      byte[] var7 = new byte[var3];
      int var5 = 0;

      for(byte var6 = 0; var6 < this.field_array_class_ad_a.length; ++var6) {
         if (this.field_array_class_ad_a[var6] != null && this.field_array_class_ad_a[var6] instanceof class_e && (!var1 || this.field_array_class_ad_a[var6] instanceof class_t) && (var2 != 1 || ((class_e)this.field_array_class_ad_a[var6]).field_boolean_b) && (var2 != -1 || !((class_e)this.field_array_class_ad_a[var6]).field_boolean_b)) {
            var7[var5++] = var6;
         }
      }

      return var7;
   }

   // $FF: renamed from: a (byte) byte[]
   public final byte[] func_array_byte_a(byte var1) {
      int var2 = 0;

      for(byte var3 = 0; var3 < this.field_array_class_ad_a.length; ++var3) {
         if (this.field_array_class_ad_a[var3] != null && this.field_array_class_ad_a[var3].field_byte_f == var1) {
            ++var2;
         }
      }

      byte[] var6 = new byte[var2];
      int var4 = 0;

      for(byte var5 = 0; var5 < this.field_array_class_ad_a.length; ++var5) {
         if (this.field_array_class_ad_a[var5] != null && this.field_array_class_ad_a[var5].field_byte_f == var1) {
            var6[var4++] = var5;
         }
      }

      return var6;
   }

   // $FF: renamed from: b () byte[]
   public final byte[] func_array_byte_b() {
      int var1 = 0;

      for(byte var2 = 0; var2 < this.field_array_class_ad_a.length; ++var2) {
         if (this.field_array_class_ad_a[var2] != null && class_ad.field_array_boolean_c[this.field_array_class_ad_a[var2].field_byte_f]) {
            ++var1;
         }
      }

      byte[] var5 = new byte[var1];
      int var3 = 0;

      for(byte var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null && class_ad.field_array_boolean_c[this.field_array_class_ad_a[var4].field_byte_f]) {
            var5[var3++] = var4;
         }
      }

      return var5;
   }

   // $FF: renamed from: a (ad, byte) ad
   public final class_ad func_class_ad_a(class_ad var1, byte var2) {
      class_ad var3 = this.field_array_class_ad_a[var2];
      this.field_array_class_ad_a[var2] = var1;
      return var3;
   }

   // $FF: renamed from: a () ad
   public final class_ad func_class_ad_a() {
      return this.field_byte_a == -1 ? null : this.field_array_class_ad_a[this.field_byte_a];
   }

   // $FF: renamed from: a () byte
   public final byte func_byte_a() {
      return field_array_byte_a[this.field_byte_b];
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      ++this.field_byte_b;
      if (this.field_byte_b == 4) {
         this.field_byte_b = 0;
      }

      this.field_byte_a = this.func_byte_a(field_array_byte_a[this.field_byte_b], (byte)0);
   }

   // $FF: renamed from: f () void
   private final void func_void_f() {
      if (this.field_byte_a != -1) {
         if (this.field_array_class_ad_a[this.field_byte_a] == null) {
            this.field_byte_a = -1;
            return;
         }

         if (this.field_array_class_ad_a[this.field_byte_a].field_byte_f != field_array_byte_a[this.field_byte_b]) {
            this.field_byte_a = this.func_byte_a(field_array_byte_a[this.field_byte_b], (byte)0);
         }
      }

   }

   // $FF: renamed from: g () void
   private final void func_void_g() {
      if (this.field_byte_a == -1) {
         this.field_byte_a = this.func_byte_a(field_array_byte_a[this.field_byte_b], (byte)0);
      }

   }

   // $FF: renamed from: a (ad, int) boolean
   public final boolean func_boolean_a(class_ad var1, int var2) {
      if (!this.func_boolean_a(var1.field_byte_f, var1.field_byte_g, var2)) {
         return false;
      } else {
         byte var3 = this.func_byte_b();
         if (!class_ad.field_array_boolean_b[var1.field_byte_f]) {
            if (var3 != -1) {
               class_x.func_void_a(var1.field_byte_h == 1);
               this.field_array_class_ad_a[var3] = var1;
               return true;
            }
         } else {
            class_ad[] var4 = this.func_array_class_ad_a(var1.field_byte_f, var1.field_byte_g);

            for(int var5 = 0; var5 < var4.length; ++var5) {
               if (var4[var5].field_byte_h + var2 <= 99) {
                  var4[var5].func_void_a((byte)var2);
                  this.func_void_e();
                  this.func_void_g();
                  return true;
               }
            }

            if (var3 != -1) {
               var1.field_byte_h = (byte)var2;
               this.field_array_class_ad_a[var3] = var1;
               this.func_void_e();
               this.func_void_g();
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (byte, byte, byte) void
   public final void func_void_a(byte var1, byte var2, byte var3) {
      for(int var4 = this.field_array_class_ad_a.length; var4 > 0 && var3 > 0; --var4) {
         class_ad var5;
         if ((var5 = this.func_class_ad_a(var1, var2)) != null) {
            byte var6 = var5.field_byte_h < var3 ? var5.field_byte_h : var3;
            this.func_void_a(var5, var6);
            var3 -= var6;
         }
      }

      class_x.func_void_a(var3 == 0);
      this.func_void_e();
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      this.func_void_a(this.field_array_class_ad_a[var1], var2);
   }

   // $FF: renamed from: a (ad, byte) void
   public final void func_void_a(class_ad var1, byte var2) {
      class_x.func_void_a(var1.field_byte_h >= var2);
      var1.func_void_b(var2);
      if (var1.field_byte_h < 1) {
         this.func_void_a(var1);
      }

      this.func_void_f();
      this.func_void_e();
   }

   // $FF: renamed from: a (ad) void
   private void func_void_a(class_ad var1) {
      for(int var2 = 0; var2 < this.field_array_class_ad_a.length; ++var2) {
         if (this.field_array_class_ad_a[var2] == var1) {
            this.field_array_class_ad_a[var2] = null;
            this.func_void_d();
            return;
         }
      }

   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      for(int var1 = 0; var1 < this.field_array_class_ad_a.length; ++var1) {
         if (this.field_array_class_ad_a[var1] != null && this.field_array_class_ad_a[var1].func_boolean_b()) {
            this.field_array_class_ad_a[var1] = null;
            this.func_void_d();
         }
      }

   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      for(int var1 = 0; var1 < this.field_array_class_ad_a.length; ++var1) {
         if (this.field_array_class_ad_a[var1] == null) {
            int var2;
            for(var2 = var1; var2 < this.field_array_class_ad_a.length - 1; ++var2) {
               this.field_array_class_ad_a[var2] = this.field_array_class_ad_a[var2 + 1];
            }

            this.field_array_class_ad_a[var2] = null;
            return;
         }
      }

   }

   // $FF: renamed from: a (byte, byte) ad
   public final class_ad func_class_ad_a(byte var1, byte var2) {
      byte var3;
      return (var3 = this.func_byte_a(var1, var2)) == -1 ? null : this.field_array_class_ad_a[var3];
   }

   // $FF: renamed from: a (byte, byte) ad[]
   public final class_ad[] func_array_class_ad_a(byte var1, byte var2) {
      Vector var3 = new Vector(2);

      for(int var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null && this.field_array_class_ad_a[var4].field_byte_f == var1 && this.field_array_class_ad_a[var4].field_byte_g == var2) {
            var3.addElement(this.field_array_class_ad_a[var4]);
         }
      }

      class_ad[] var6 = new class_ad[var3.size()];

      for(int var5 = 0; var5 < var3.size(); ++var5) {
         var6[var5] = (class_ad)var3.elementAt(var5);
      }

      return var6;
   }

   // $FF: renamed from: a (byte, byte) int
   public final int func_int_a(byte var1, byte var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null && this.field_array_class_ad_a[var4].field_byte_f == var1 && this.field_array_class_ad_a[var4].field_byte_g == var2) {
            var3 += this.field_array_class_ad_a[var4].field_byte_h;
         }
      }

      return var3;
   }

   // $FF: renamed from: a (ad) byte
   public final byte func_byte_a(class_ad var1) {
      for(byte var2 = 0; var2 < this.field_array_class_ad_a.length; ++var2) {
         if (this.field_array_class_ad_a[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (byte, byte) byte
   public final byte func_byte_a(byte var1, byte var2) {
      for(byte var3 = 0; var3 < this.field_array_class_ad_a.length; ++var3) {
         if (this.field_array_class_ad_a[var3] != null && this.field_array_class_ad_a[var3].field_byte_f == var1 && this.field_array_class_ad_a[var3].field_byte_g == var2) {
            return var3;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (byte, byte, int) boolean
   public final boolean func_boolean_a(byte var1, byte var2, int var3) {
      this.func_void_e();
      byte var4 = this.func_byte_b();
      if (var3 > 99) {
         return false;
      } else if (var4 != -1) {
         return true;
      } else if (!class_ad.field_array_boolean_b[var1]) {
         return false;
      } else {
         class_ad[] var5 = this.func_array_class_ad_a(var1, var2);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            if (var5[var6].field_byte_h + var3 <= 99) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: b () byte
   private final byte func_byte_b() {
      for(byte var1 = 0; var1 < this.field_array_class_ad_a.length; ++var1) {
         if (this.field_array_class_ad_a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (byte, byte, byte) boolean
   public final boolean func_boolean_a(byte var1, byte var2, byte var3) {
      for(int var4 = 0; var4 < this.field_array_class_ad_a.length; ++var4) {
         if (this.field_array_class_ad_a[var4] != null && this.field_array_class_ad_a[var4].field_byte_f == var1 && this.field_array_class_ad_a[var4].field_byte_g == var2 && this.field_array_class_ad_a[var4].field_byte_h >= var3) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      for(byte var1 = 0; var1 < this.field_array_class_ad_a.length - 1; ++var1) {
         if (this.field_array_class_ad_a[var1] != null && class_ad.field_array_boolean_b[this.field_array_class_ad_a[var1].field_byte_f] && this.field_array_class_ad_a[var1].field_byte_h < 99) {
            for(byte var2 = (byte)(var1 + 1); var2 < this.field_array_class_ad_a.length; ++var2) {
               if (this.field_array_class_ad_a[var2] != null && this.field_array_class_ad_a[var2].field_byte_f == this.field_array_class_ad_a[var1].field_byte_f && this.field_array_class_ad_a[var2].field_byte_g == this.field_array_class_ad_a[var1].field_byte_g) {
                  byte var3 = this.field_array_class_ad_a[var1].field_byte_h;
                  byte var4 = this.field_array_class_ad_a[var2].field_byte_h;
                  if (var3 + var4 <= 99) {
                     this.field_array_class_ad_a[var1].func_void_a(var4);
                     this.field_array_class_ad_a[var2] = null;
                     if (this.field_byte_a == var2) {
                        this.field_byte_a = var1;
                     }
                  } else {
                     byte var5 = (byte)(99 - var3);
                     this.field_array_class_ad_a[var1].func_void_a(var5);
                     this.field_array_class_ad_a[var2].func_void_b(var5);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: c () byte[]
   public final byte[] func_array_byte_c() {
      ByteArrayOutputStream var1 = null;
      DataOutputStream var2 = null;
      boolean var12 = false;

      byte[] var18;
      label126: {
         try {
            var12 = true;
            var1 = new ByteArrayOutputStream();
            (var2 = new DataOutputStream(var1)).writeInt(this.field_int_a);

            for(int var3 = 0; var3 < this.field_array_class_ad_a.length; ++var3) {
               if (this.field_array_class_ad_a[var3] == null) {
                  var2.writeByte(0);
               } else {
                  var2.writeByte(1);
                  var2.write(this.field_array_class_ad_a[var3].func_array_byte_a());
               }
            }

            var18 = var1.toByteArray();
            var12 = false;
            break label126;
         } catch (IOException var16) {
            var16.printStackTrace();
            var12 = false;
         } finally {
            if (var12) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }
               } catch (IOException var14) {
               }

            }
         }

         try {
            if (var2 != null) {
               var2.close();
            }

            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var13) {
         }

         return null;
      }

      try {
         var2.close();
         var1.close();
      } catch (IOException var15) {
      }

      return var18;
   }

   // $FF: renamed from: a (byte[]) void
   public final void func_void_a(byte[] var1) {
      ByteArrayInputStream var2 = null;
      DataInputStream var3 = null;
      boolean var15 = false;

      label118: {
         label117: {
            try {
               var15 = true;
               var2 = new ByteArrayInputStream(var1);
               var3 = new DataInputStream(var2);
               this.field_int_a = var3.readInt();
               int var4 = 0;

               for(int var5 = 0; var5 < this.field_array_class_ad_a.length; ++var5) {
                  if (var3.readByte() != 0) {
                     byte[] var7 = new byte[10];
                     var3.read(var7);
                     this.field_array_class_ad_a[var4++] = class_ad.func_class_ad_a(var7);
                  }
               }

               var15 = false;
               break label117;
            } catch (IOException var19) {
               var19.printStackTrace();
               var15 = false;
            } finally {
               if (var15) {
                  try {
                     if (var3 != null) {
                        var3.close();
                     }

                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (IOException var16) {
                  }

               }
            }

            try {
               if (var3 != null) {
                  var3.close();
               }

               if (var2 != null) {
                  var2.close();
               }
            } catch (IOException var17) {
            }
            break label118;
         }

         try {
            var3.close();
            var2.close();
         } catch (IOException var18) {
         }
      }

      this.func_void_a();
   }
}
