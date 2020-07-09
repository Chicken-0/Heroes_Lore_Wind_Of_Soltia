package rpg;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: o
public abstract class class_o extends class_ck implements class_u {
   // $FF: renamed from: a java.util.Vector
   public Vector field_class_java_util_Vector_a;
   // $FF: renamed from: b java.util.Vector
   public Vector field_class_java_util_Vector_b;
   // $FF: renamed from: h byte
   public byte field_byte_h;
   // $FF: renamed from: i byte
   public byte field_byte_i;
   // $FF: renamed from: j byte
   public byte field_byte_j;
   // $FF: renamed from: k byte
   public byte field_byte_k;
   // $FF: renamed from: l byte
   public byte field_byte_l = 0;

   public class_o(short var1, short var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
      this.func_void_a();
   }

   // $FF: renamed from: a () void
   public void func_void_a() {
      if (this.field_class_java_util_Vector_a == null) {
         this.field_class_java_util_Vector_a = new Vector(2);
      }

      if (this.field_class_java_util_Vector_b == null) {
         this.field_class_java_util_Vector_b = new Vector(3);
      }

      this.field_byte_h = 1;
      this.field_byte_i = 2;
      this.field_byte_j = 2;
      this.field_byte_k = -1;
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      this.field_class_java_util_Vector_a = new Vector(2);
   }

   // $FF: renamed from: a (byte) void
   public void func_void_a(byte var1) {
      this.field_byte_k = -1;
      this.field_byte_h = var1;
   }

   // $FF: renamed from: b (byte) void
   public final void func_void_b(byte var1) {
      this.field_byte_i = var1;
      this.field_byte_j = var1;
   }

   // $FF: renamed from: d () void
   public void func_void_d() {
      this.func_void_e();
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      if (this.field_byte_h == 2 || this.field_byte_h == 4) {
         this.func_boolean_a();
      }

      if (this.field_byte_h == 2 || this.field_byte_h == 4) {
         this.func_void_a((int)8);
      }

   }

   // $FF: renamed from: f () void
   public final void func_void_f() {
      class_ae var1 = class_n.field_class_ae_a;

      for(byte var2 = 0; var2 < super.field_byte_e; ++var2) {
         var1.field_array_array_class_ck_a[super.field_byte_b][super.field_byte_a + var2] = null;
         if (super.field_boolean_b) {
            var1.field_array_array_class_ck_a[super.field_byte_b + 1][super.field_byte_a + var2] = null;
         } else if (super.field_boolean_a) {
            var1.field_array_array_class_ck_a[super.field_byte_b][super.field_byte_a + 1 + var2] = null;
         }
      }

   }

   // $FF: renamed from: g () void
   public final void func_void_g() {
      class_ae var1 = class_n.field_class_ae_a;

      for(byte var2 = 0; var2 < super.field_byte_e; ++var2) {
         var1.field_array_array_class_ck_a[super.field_byte_b][super.field_byte_a + var2] = this;
         if (super.field_boolean_b) {
            var1.field_array_array_class_ck_a[super.field_byte_b + 1][super.field_byte_a + var2] = this;
         } else if (super.field_boolean_a) {
            var1.field_array_array_class_ck_a[super.field_byte_b][super.field_byte_a + 1 + var2] = this;
         }
      }

   }

   // $FF: renamed from: a () boolean
   public boolean func_boolean_a() {
      class_ae var1 = class_n.field_class_ae_a;
      if (!super.field_boolean_a && !super.field_boolean_b) {
         if (!var1.func_boolean_a(this, this.field_byte_i)) {
            this.func_void_a((byte)1);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (int) void
   public void func_void_a(int var1) {
      this.func_void_f();
      switch(this.field_byte_i) {
      case 1:
         class_x.func_void_a(super.field_short_d > 0);
         super.field_short_d = (short)(super.field_short_d - var1);
         if (super.field_boolean_b) {
            super.field_boolean_b = false;
         } else {
            super.field_boolean_b = true;
            --super.field_byte_b;
         }
         break;
      case 2:
         class_x.func_void_a(super.field_short_d < class_n.field_class_ae_a.field_int_d - 16);
         super.field_short_d = (short)(super.field_short_d + var1);
         if (super.field_boolean_b) {
            super.field_boolean_b = false;
            ++super.field_byte_b;
         } else {
            super.field_boolean_b = true;
         }
         break;
      case 3:
         class_x.func_void_a(super.field_short_c > 0);
         super.field_short_c = (short)(super.field_short_c - var1);
         if (super.field_boolean_a) {
            super.field_boolean_a = false;
         } else {
            super.field_boolean_a = true;
            --super.field_byte_a;
         }
         break;
      case 4:
         class_x.func_void_a(super.field_short_c < class_n.field_class_ae_a.field_int_c - 16);
         super.field_short_c = (short)(super.field_short_c + var1);
         if (super.field_boolean_a) {
            super.field_boolean_a = false;
            ++super.field_byte_a;
         } else {
            super.field_boolean_a = true;
         }
      }

      if (var1 != 8) {
         this.func_void_b();
      }

      this.func_void_g();
   }

   // $FF: renamed from: a (ck, byte) void
   public final void func_void_a(class_ck var1, byte var2) {
      byte var3 = var1.field_byte_a;
      byte var4 = var1.field_byte_b;
      class_ae var5 = class_n.field_class_ae_a;
      int var6 = 100;

      for(byte var7 = 0; var7 < super.field_byte_e; ++var7) {
         if (Math.abs(var6) > Math.abs(var3 - (super.field_byte_a + var7))) {
            var6 = var3 - (super.field_byte_a + var7);
         }
      }

      int var17 = var4 - super.field_byte_b;
      int var8 = Math.abs(var6);
      int var9 = Math.abs(var17);
      int var10 = class_ck.field_class_java_util_Random_a.nextInt();
      if ((var8 + var9 > var2 || var8 * var9 != 0) && var1 != this.func_class_ck_a(this.field_byte_j, var1)) {
         boolean var12 = false;
         int var18;
         if (var9 == var8) {
            int var13 = var6 > 0 ? 4 : 3;
            int var14 = var17 > 0 ? 2 : 1;
            boolean var15 = var5.func_boolean_a(this, (byte)var13);
            boolean var16 = var5.func_boolean_a(this, (byte)var14);
            if (var15 && var16) {
               var18 = class_ck.field_class_java_util_Random_a.nextInt() > 0 ? var13 : var14;
            } else if (var15) {
               var18 = var13;
            } else {
               var18 = var14;
            }
         } else if (var9 > var8) {
            if (var17 > 0) {
               var18 = 2;
            } else {
               var18 = 1;
            }
         } else if (var6 > 0) {
            var18 = 4;
         } else {
            var18 = 3;
         }

         if ((var8 <= var2 || var9 <= var2) && var8 != var9) {
            if (var8 <= var2 && var9 < var8) {
               if (var17 > 0 && var5.func_boolean_a(this, (byte)2)) {
                  var18 = 2;
               } else if (var17 < 0 && var5.func_boolean_a(this, (byte)1)) {
                  var18 = 1;
               }
            } else if (var9 <= var2 && var9 > var8) {
               if (var6 > 0 && var5.func_boolean_a(this, (byte)4)) {
                  var18 = 4;
               } else if (var6 < 0 && var5.func_boolean_a(this, (byte)3)) {
                  var18 = 3;
               }
            }
         }

         boolean var20 = false;
         int var19;
         if (var5.func_boolean_a(this, (byte)var18)) {
            var19 = var18;
            var20 = true;
         } else {
            boolean var21 = true;
            if (var18 == 1 && var6 > 0 || var18 == 2 && var6 < 0 || var18 == 3 && var17 < 0 || var18 == 4 && var17 > 0) {
               var21 = false;
            }

            if ((var19 = this.func_byte_a(var1, (byte)var18, var21)) != 0) {
               var20 = true;
            } else if ((var19 = this.func_byte_a(var1, (byte)var18, !var21)) != 0) {
               var20 = true;
            } else if (var21 && var5.func_boolean_a(this, class_u.field_array_byte_f[var18])) {
               var19 = class_u.field_array_byte_f[var18];
               var20 = true;
            } else if (!var21 && var5.func_boolean_a(this, class_u.field_array_byte_e[var18])) {
               var19 = class_u.field_array_byte_e[var18];
               var20 = true;
            }
         }

         if (!var20) {
            var19 = (byte)((var10 & 255) % 4 + 1);
         }

         this.func_void_a((byte)2);
         this.func_void_b((byte)var19);
      } else {
         byte var11;
         if (var17 != 0) {
            if (var17 < 0) {
               var11 = 1;
            } else {
               var11 = 2;
            }
         } else if (var6 < 0) {
            var11 = 3;
         } else {
            var11 = 4;
         }

         this.func_void_b(var11);
      }
   }

   // $FF: renamed from: a (ck, byte, boolean) byte
   private final byte func_byte_a(class_ck var1, byte var2, boolean var3) {
      class_ae var4 = class_n.field_class_ae_a;
      byte[] var5;
      byte[] var6;
      if (!var3) {
         var5 = class_u.field_array_byte_e;
         var6 = class_u.field_array_byte_c;
      } else {
         var5 = class_u.field_array_byte_f;
         var6 = class_u.field_array_byte_d;
      }

      byte var7;
      if (var2 != 1 && var2 != 2) {
         var7 = 1;
      } else {
         var7 = super.field_byte_e;
      }

      for(int var8 = -var7 + 1; var8 < var7; ++var8) {
         if (var4.func_boolean_a(this, super.field_byte_a + var8 + class_u.field_array_byte_a[var5[var2]], super.field_byte_b + class_u.field_array_byte_b[var5[var2]]) && (var4.func_boolean_a(this, super.field_byte_a + var8 + class_u.field_array_byte_a[var6[var2]], super.field_byte_b + class_u.field_array_byte_b[var6[var2]]) || var1 == var4.field_array_array_class_ck_a[super.field_byte_b + class_u.field_array_byte_b[var6[var2]]][super.field_byte_a + var8 + class_u.field_array_byte_a[var6[var2]]])) {
            return var5[var2];
         }
      }

      return 0;
   }

   // $FF: renamed from: a () al
   public final class_al func_class_al_a() {
      class_ck var1;
      return (var1 = this.func_class_ck_a(this.field_byte_i, (class_ck)null)) instanceof class_al ? (class_al)var1 : null;
   }

   // $FF: renamed from: a (byte) al
   public final class_al func_class_al_a(byte var1) {
      class_ck var2;
      return (var2 = this.func_class_ck_a(var1, (class_ck)null)) instanceof class_al ? (class_al)var2 : null;
   }

   // $FF: renamed from: a (byte, ck) ck
   public final class_ck func_class_ck_a(byte var1, class_ck var2) {
      class_ae var3 = class_n.field_class_ae_a;
      class_ck var4 = null;

      for(int var7 = 0; var7 < super.field_byte_e; ++var7) {
         int var5 = super.field_byte_a + class_u.field_array_byte_a[var1] + var7;
         int var6 = super.field_byte_b + class_u.field_array_byte_b[var1];
         class_x.func_void_a(var5 >= 0);
         class_x.func_void_a(var5 < var3.field_int_a);
         class_x.func_void_a(var6 >= 0);
         class_x.func_void_a(var6 < var3.field_int_b);
         if ((var4 = var3.field_array_array_class_ck_a[var6][var5]) != this) {
            if (var2 == null && var4 != null) {
               return var4;
            }

            if (var2 != null && var4 == var2) {
               return var4;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (f) void
   public final void func_void_a(class_f var1) {
      this.field_class_java_util_Vector_a.addElement(var1);
   }

   // $FF: renamed from: a (byte) boolean
   public final boolean func_boolean_a(byte var1) {
      class_x.func_void_a(var1 >= 0 && var1 < 8);
      boolean var3 = false;

      for(int var4 = 0; var4 < this.field_class_java_util_Vector_b.size(); ++var4) {
         class_cf var2;
         if (!(var2 = (class_cf)this.field_class_java_util_Vector_b.elementAt(var4)).field_boolean_a && var2.field_byte_a == var1) {
            var2.func_void_c();
            var3 = true;
            break;
         }
      }

      if (!var3) {
         this.field_class_java_util_Vector_b.addElement(new class_cf(var1));
      }

      return var3;
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_b(Graphics var1, int var2, int var3) {
      for(int var5 = this.field_class_java_util_Vector_a.size() - 1; var5 >= 0; --var5) {
         class_f var4;
         (var4 = (class_f)this.field_class_java_util_Vector_a.elementAt(var5)).func_void_a(var1, var2, var3);
         if (var4.field_boolean_a) {
            this.field_class_java_util_Vector_a.removeElementAt(var5);
         }
      }

   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_c(Graphics var1, int var2, int var3) {
      int var4 = -6 * (this.field_class_java_util_Vector_b.size() - 1);

      for(int var6 = this.field_class_java_util_Vector_b.size() - 1; var6 >= 0; --var6) {
         ((class_cf)this.field_class_java_util_Vector_b.elementAt(var6)).func_void_a(var1, var2 + var4, var3);
         var4 += 12;
      }

   }
}
