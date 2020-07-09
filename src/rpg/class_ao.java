package rpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ao
public final class class_ao extends class_o implements class_u {
   // $FF: renamed from: b byte[][]
   private static final byte[][] field_array_array_byte_b = new byte[][]{{4, 4, 4, 4, 0}, {4, 0, 4, 4, 8}};
   // $FF: renamed from: c byte[][]
   private static final byte[][] field_array_array_byte_c = new byte[][]{{3, 3, 3, 6, 0}, {4, 0, 7, 9, 14}};
   // $FF: renamed from: d byte[][]
   private static final byte[][] field_array_array_byte_d = new byte[][]{{3, 3, 3, 3, 0}, {3, 0, 3, 3, 6}};
   // $FF: renamed from: h byte[]
   private byte[] field_array_byte_h;
   // $FF: renamed from: q byte
   private byte field_byte_q;
   // $FF: renamed from: r byte
   private byte field_byte_r = 0;
   // $FF: renamed from: s byte
   private byte field_byte_s;
   // $FF: renamed from: t byte
   private byte field_byte_t;
   // $FF: renamed from: u byte
   private byte field_byte_u;
   // $FF: renamed from: v byte
   private byte field_byte_v;
   // $FF: renamed from: w byte
   private byte field_byte_w;
   // $FF: renamed from: x byte
   private byte field_byte_x = 0;
   // $FF: renamed from: y byte
   private byte field_byte_y;
   // $FF: renamed from: i boolean
   private boolean field_boolean_i;
   // $FF: renamed from: e byte[][]
   private byte[][] field_array_array_byte_e;
   // $FF: renamed from: d boolean
   public boolean field_boolean_d;
   // $FF: renamed from: e boolean
   public boolean field_boolean_e;
   // $FF: renamed from: f boolean
   public boolean field_boolean_f;
   // $FF: renamed from: g boolean
   public boolean field_boolean_g;
   // $FF: renamed from: h boolean
   public boolean field_boolean_h;
   // $FF: renamed from: z byte
   private byte field_byte_z;
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: g byte
   public byte field_byte_g;
   // $FF: renamed from: b short
   public short field_short_b;
   // $FF: renamed from: e short
   public short field_short_e;
   // $FF: renamed from: f short
   public short field_short_f;
   // $FF: renamed from: g short
   public short field_short_g;
   // $FF: renamed from: m byte
   public byte field_byte_m;
   // $FF: renamed from: n byte
   public byte field_byte_n;
   // $FF: renamed from: o byte
   public byte field_byte_o;
   // $FF: renamed from: p byte
   public byte field_byte_p;
   // $FF: renamed from: a int
   public int field_int_a;
   // $FF: renamed from: b int
   public int field_int_b;
   // $FF: renamed from: c int
   public int field_int_c;
   // $FF: renamed from: h short
   public short field_short_h;
   // $FF: renamed from: i short
   public short field_short_i;
   // $FF: renamed from: d int
   public int field_int_d;
   // $FF: renamed from: e int
   public int field_int_e;
   // $FF: renamed from: f int
   public int field_int_f;
   // $FF: renamed from: a g
   public class_g field_class_g_a = new class_g((byte)30);
   // $FF: renamed from: a e[]
   private class_e[] field_array_class_e_a = new class_e[5];
   // $FF: renamed from: a p[]
   public class_p[] field_array_class_p_a = new class_p[5];
   // $FF: renamed from: a p
   private class_p field_class_p_a;
   // $FF: renamed from: b g
   public class_g field_class_g_b = new class_g((byte)15);
   // $FF: renamed from: i int
   private int field_int_i;
   // $FF: renamed from: j boolean
   private boolean field_boolean_j;
   // $FF: renamed from: A byte
   private byte field_byte_A;
   // $FF: renamed from: g int
   public int field_int_g;
   // $FF: renamed from: h int
   public int field_int_h;

   public class_ao(short var1, short var2, byte var3, byte var4, byte var5) {
      super(var1, var2, var3, var4);
      this.func_void_a();
      this.func_void_h();
      switch(var5) {
      case 6:
         this.field_array_array_byte_e = field_array_array_byte_b;
         break;
      case 7:
         this.field_array_array_byte_e = field_array_array_byte_c;
         break;
      case 8:
         this.field_array_array_byte_e = field_array_array_byte_d;
      }

      this.field_int_g = (int)(System.currentTimeMillis() / 1000L);
   }

   // $FF: renamed from: c (byte) void
   public final void func_void_c(byte var1) {
      class_x.func_void_a(this.field_array_class_p_a[0] != null);
      class_x.func_void_a(this.field_array_class_p_a[1] != null);
      this.func_boolean_a(this.field_array_class_p_a[0]);
      switch(var1) {
      case 6:
         this.field_short_b = 8;
         this.field_short_e = 5;
         this.field_short_f = 3;
         this.field_short_g = 4;
         this.field_array_class_e_a[0] = (class_e)class_ad.func_class_ad_a((byte)0, (byte)0, true, false);
         this.field_array_class_e_a[0].field_boolean_b = true;
         this.field_array_class_e_a[0].field_byte_h = 1;
         break;
      case 7:
         this.field_short_b = 3;
         this.field_short_e = 4;
         this.field_short_f = 8;
         this.field_short_g = 5;
         this.field_array_class_e_a[0] = (class_e)class_ad.func_class_ad_a((byte)2, (byte)0, true, false);
         this.field_array_class_e_a[0].field_boolean_b = true;
         this.field_array_class_e_a[0].field_byte_h = 1;
         break;
      case 8:
         this.field_short_b = 5;
         this.field_short_e = 8;
         this.field_short_f = 4;
         this.field_short_g = 3;
         this.field_array_class_e_a[0] = (class_e)class_ad.func_class_ad_a((byte)1, (byte)0, true, false);
         this.field_array_class_e_a[0].field_boolean_b = true;
         this.field_array_class_e_a[0].field_byte_h = 1;
         this.field_array_class_e_a[1] = (class_e)class_ad.func_class_ad_a((byte)3, (byte)0, true, false);
         this.field_array_class_e_a[1].field_boolean_b = true;
         this.field_array_class_e_a[1].field_byte_h = 1;
      }

      this.field_array_class_e_a[2] = (class_e)class_ad.func_class_ad_a((byte)5, (byte)0, true, false);
      this.field_array_class_e_a[2].field_boolean_b = true;
      this.field_array_class_e_a[2].field_byte_h = 1;
      this.field_array_class_e_a[3] = (class_e)class_ad.func_class_ad_a((byte)6, (byte)0, true, false);
      this.field_array_class_e_a[3].field_boolean_b = true;
      this.field_array_class_e_a[3].field_byte_h = 1;
      this.field_array_class_e_a[4] = (class_e)class_ad.func_class_ad_a((byte)4, (byte)0, true, false);
      this.field_array_class_e_a[4].field_boolean_b = true;
      this.field_array_class_e_a[4].field_byte_h = 1;
      this.field_byte_g = 1;
      this.field_byte_z = 1;
      this.field_class_g_a.field_int_a = 300;
      this.field_short_a = 0;
      this.func_void_n();
      this.field_int_a = this.field_int_d;
      this.field_int_b = this.field_int_e;
      this.field_int_c = 0;
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      super.func_void_a();
      this.field_array_byte_h = new byte[5];
      this.field_byte_q = -1;
      this.field_byte_v = 67 + this.field_byte_g < 100 ? (byte)(67 + this.field_byte_g) : 100;
      this.field_byte_w = 21;
      this.field_byte_y = 0;
      this.field_boolean_f = false;
      if (this.field_class_p_a != null) {
         this.field_class_p_a.func_void_c();
      }

      this.field_boolean_i = false;
   }

   // $FF: renamed from: h () void
   public final void func_void_h() {
      super.field_class_java_util_Vector_b = new Vector(3);
      this.field_boolean_d = false;
      this.field_boolean_e = false;
      this.field_boolean_f = false;
      this.field_boolean_g = false;
      this.field_boolean_h = false;
   }

   // $FF: renamed from: a (short, short) void
   public final void func_void_a(short var1, short var2) {
      super.func_void_a(var1, var2);
      this.func_void_b();
   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      if (this.func_class_al_a() == null) {
         if (this.func_class_al_a(class_u.field_array_byte_f[super.field_byte_i]) != null) {
            this.func_void_b(class_u.field_array_byte_f[super.field_byte_i]);
            return;
         }

         if (this.func_class_al_a(class_u.field_array_byte_e[super.field_byte_i]) != null) {
            this.func_void_b(class_u.field_array_byte_e[super.field_byte_i]);
            return;
         }

         if (this.func_class_al_a(class_u.field_array_byte_g[super.field_byte_i]) != null) {
            this.func_void_b(class_u.field_array_byte_g[super.field_byte_i]);
         }
      }

   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      this.func_void_f();
      super.field_short_c = (short)(super.field_short_c + class_u.field_array_byte_a[var1] * var2);
      super.field_short_d = (short)(super.field_short_d + class_u.field_array_byte_b[var1] * var2);
      this.func_void_b();
      this.func_void_g();
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      ++super.field_byte_k;
      if (this.field_byte_t > 0) {
         --this.field_byte_t;
      }

      if (class_n.field_int_e == 2) {
         if (super.field_byte_h == 1) {
            this.field_byte_v = (byte)(this.field_byte_v - 2);
         } else if (super.field_byte_h == 2) {
            --this.field_byte_v;
         }

         if (this.field_byte_v <= 0) {
            this.func_void_b((this.field_short_e + this.field_byte_n) * (this.field_boolean_h ? 2 : 1));
            this.field_byte_v = 67 + this.field_byte_g < 100 ? (byte)(67 + this.field_byte_g) : 100;
         }

         if (super.field_byte_h == 1) {
            this.field_byte_w = (byte)(this.field_byte_w - 3);
         } else if (super.field_byte_h == 2) {
            --this.field_byte_w;
         }

         if (this.field_byte_w <= 0) {
            this.func_void_d((this.field_short_g + this.field_byte_p) * (this.field_boolean_h ? 2 : 1));
            this.field_byte_w = 21;
         }
      }

      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         for(int var2 = super.field_class_java_util_Vector_b.size() - 1; var2 >= 0; --var2) {
            class_cf var1;
            (var1 = (class_cf)super.field_class_java_util_Vector_b.elementAt(var2)).func_void_a();
            if (var1.field_byte_a == 7 && var1.field_short_b % 10 == 0 && this.field_int_a > 1) {
               int var3;
               if ((var3 = this.field_int_d / 25) > this.field_int_a - 1) {
                  var3 = this.field_int_a - 1;
               }

               this.func_void_b(-var3);
               this.func_void_a(new class_aw((byte)7, (short)4, (short)(-(this.field_int_d / 12))));
            }

            if (var1.field_boolean_a) {
               super.field_class_java_util_Vector_b.removeElementAt(var2);
               switch(var1.field_byte_a) {
               case 5:
                  this.field_boolean_d = false;
                  break;
               case 6:
                  this.field_boolean_e = false;
               case 7:
               }
            }
         }
      }

      switch(super.field_byte_h) {
      case 0:
         return;
      case 1:
         this.field_byte_x = 0;
         if (super.field_byte_k == 1) {
            super.field_byte_k = 0;
         }
         break;
      case 2:
         if (this.field_byte_x != 0 && !super.field_boolean_a && !super.field_boolean_b) {
            this.func_void_b(this.field_byte_x);
            this.field_byte_x = 0;
         }

         if (super.field_byte_k == 4) {
            super.field_byte_k = 0;
         }
         break;
      case 3:
         if (this.field_byte_q == -1) {
            this.field_byte_q = 0;
         }

         this.func_void_o();
      case 4:
      case 5:
      default:
         break;
      case 6:
         super.field_byte_k = 0;
         if (this.field_byte_u <= 0) {
            this.func_void_q();
            return;
         }

         --this.field_byte_u;
      }

      byte var8 = super.field_byte_h;
      class_ae var9 = class_n.field_class_ae_a;
      if ((super.field_byte_h == 2 || super.field_byte_h == 4) && this.func_boolean_a()) {
         class_al var10;
         if ((var10 = this.func_class_al_a()) != null) {
            class_bs.field_class_as_a.func_void_a(var10, false);
         }

         byte var11 = super.field_byte_i;
         byte var4 = class_u.field_array_byte_e[var11];
         byte var5 = class_u.field_array_byte_f[var11];
         byte var6 = class_u.field_array_byte_c[var11];
         byte var7 = class_u.field_array_byte_d[var11];
         if (var9.field_array_array_byte_c[super.field_byte_b + class_u.field_array_byte_b[var11]][super.field_byte_a + class_u.field_array_byte_a[var11]] == -128 && var9.func_boolean_a(super.field_byte_a + class_u.field_array_byte_a[var5], super.field_byte_b + class_u.field_array_byte_b[var5]) && var9.func_boolean_a(super.field_byte_a + class_u.field_array_byte_a[var7], super.field_byte_b + class_u.field_array_byte_b[var7])) {
            this.field_byte_x = super.field_byte_i;
            this.func_void_a((byte)2);
            this.func_void_b(var5);
         } else if (var9.field_array_array_byte_c[super.field_byte_b + class_u.field_array_byte_b[var11]][super.field_byte_a + class_u.field_array_byte_a[var11]] == -128 && var9.func_boolean_a(super.field_byte_a + class_u.field_array_byte_a[var4], super.field_byte_b + class_u.field_array_byte_b[var4]) && var9.func_boolean_a(super.field_byte_a + class_u.field_array_byte_a[var6], super.field_byte_b + class_u.field_array_byte_b[var6])) {
            this.field_byte_x = super.field_byte_i;
            this.func_void_a((byte)2);
            this.func_void_b(var4);
         }

         super.field_byte_k = 0;
      }

      if (super.field_byte_h == 2 || super.field_byte_h == 4) {
         super.func_void_a((int)8);
         this.field_boolean_i = false;
      }

      if (class_n.field_int_e != 4) {
         boolean var12 = false;
         if (super.field_byte_h != 3 && !this.field_boolean_i) {
            var12 = class_ah.func_boolean_a(this);
            this.field_boolean_i = true;
         }

         if (var8 == 2 && super.field_byte_h == 1 && !var12) {
            var12 = class_ah.func_boolean_b();
         }

         if (var12) {
            this.func_void_a((byte)1);
            this.field_byte_x = 0;
            super.field_byte_k = 0;
         }
      }

   }

   // $FF: renamed from: o () void
   private final void func_void_o() {
      if (super.field_byte_k == this.field_array_array_byte_e[this.field_array_byte_h[this.field_byte_q] - 1][this.field_byte_q]) {
         if (this.field_byte_q + 1 == this.field_byte_z || this.field_array_byte_h[this.field_byte_q + 1] == 0) {
            this.func_void_h(this.field_byte_q);
            return;
         }

         ++this.field_byte_q;
         super.field_byte_k = 0;
      }

      this.field_byte_y = 0;
      if (super.field_byte_k == 0) {
         int var1 = ((class_l)this.func_class_ad_a(0)).field_short_a / 4 + 4;
         if (this.field_array_byte_h[this.field_byte_q] == 2) {
            var1 = var1 * 7 / 5;
         }

         if (this.field_int_b < var1 && (this.field_byte_q != 0 || this.field_array_byte_h[this.field_byte_q] != 1)) {
            this.func_void_h(this.field_byte_q - 1);
            return;
         }

         this.func_void_d(-var1);
      }

      byte var2 = this.field_array_byte_h[this.field_byte_q];
      switch(class_n.field_byte_a) {
      case 6:
         if (var2 == 2 && this.field_byte_q == 4) {
            if (super.field_byte_k == 1 || super.field_byte_k == 6) {
               this.func_void_p();
               return;
            }
            break;
         }

         if (super.field_byte_k == 2) {
            this.func_void_p();
            return;
         }
         break;
      case 7:
         if (var2 == 2 && this.field_byte_q == 4) {
            if (super.field_byte_k != 0 && super.field_byte_k != 2 && super.field_byte_k != 4 && super.field_byte_k != 6 && super.field_byte_k != 8 && super.field_byte_k != 10) {
               break;
            }

            this.func_void_p();
            return;
         } else {
            if (var2 == 2 && this.field_byte_q == 3) {
               if (super.field_byte_k == 4) {
                  this.func_void_p();
                  return;
               }
               break;
            }

            if (super.field_byte_k == 1) {
               this.func_void_p();
               return;
            }
            break;
         }
      case 8:
         if (var2 == 2 && this.field_byte_q == 4) {
            if (super.field_byte_k == 4) {
               this.func_void_p();
               return;
            }
         } else if (super.field_byte_k == 1) {
            this.func_void_p();
         }
      }

   }

   // $FF: renamed from: p () void
   private final void func_void_p() {
      this.field_int_i = this.func_int_a();
      this.field_byte_A = this.func_byte_a();
      this.field_boolean_j = this.func_boolean_e();
      if (this.func_class_al_a() != null) {
         switch(this.field_byte_A) {
         case 2:
            this.func_void_a(new class_aw((byte)10, (short)8, (short)8));
            break;
         case 3:
            this.func_void_a(new class_aw((byte)10, (short)8, (short)10));
            break;
         case 4:
            this.func_void_a(new class_aw((byte)10, (short)8, (short)11));
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 8:
            int var1 = this.field_int_d / 25;
            this.func_void_b(-var1);
            super.field_class_java_util_Vector_a.addElement(new class_aw((byte)7, (short)4, (short)(-var1)));
            this.func_void_a(new class_aw((byte)10, (short)8, (short)0));
         }
      }

      boolean var2 = false;
      switch(class_n.field_byte_a) {
      case 6:
         var2 = this.func_boolean_b();
         break;
      case 7:
         var2 = this.func_boolean_c();
         break;
      case 8:
         var2 = this.func_boolean_d();
      }

      if (!var2) {
         class_bw.func_void_a((byte)14, false);
      }

   }

   // $FF: renamed from: b () boolean
   private final boolean func_boolean_b() {
      byte var1 = this.field_array_byte_h[this.field_byte_q];
      byte var2 = 1;
      if (var1 == 1 && this.field_byte_q == 3 || var1 == 2 && this.field_byte_q == 4) {
         var2 = 5;
      }

      class_ae var3 = class_n.field_class_ae_a;
      class_al var4 = null;
      class_al var5 = null;
      boolean var6 = false;
      if (var1 == 1 && (this.field_byte_q == 0 || this.field_byte_q == 3) || var1 == 2 && this.field_byte_q == 4 && super.field_byte_k == 6) {
         if ((var4 = this.func_class_al_a()) != null) {
            var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
            var6 = true;
         }
      } else if ((var1 != 1 || this.field_byte_q != 1 && this.field_byte_q != 2) && (var1 != 2 || this.field_byte_q != 0)) {
         byte var7;
         if (var1 == 2 && this.field_byte_q == 4) {
            for(var7 = 1; var7 <= 8; ++var7) {
               if ((var4 = this.func_class_al_a(var7)) != null) {
                  var4.func_void_a(this.field_int_i, true, var7, this.field_boolean_j, var2, this.field_byte_A, this);
                  var6 = true;
               }
            }
         } else if (var1 == 2 && (this.field_byte_q == 2 || this.field_byte_q == 3)) {
            if ((var4 = this.func_class_al_a()) != null) {
               var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
               var6 = true;
            }

            var7 = class_u.field_array_byte_a[super.field_byte_i];
            byte var8 = class_u.field_array_byte_b[super.field_byte_i];
            if (var3.field_array_array_byte_c[super.field_byte_b + var8][super.field_byte_a + var7] == 0 && var3.func_boolean_a(super.field_byte_a + var7 * 2, super.field_byte_b + var8 * 2)) {
               super.func_void_a((int)32);
               this.field_boolean_i = false;
               this.field_byte_y = 2;
            } else if (var3.func_boolean_a(super.field_byte_a + var7, super.field_byte_b + var8)) {
               super.func_void_a((int)16);
               this.field_boolean_i = false;
               this.field_byte_y = 1;
            }

            if (this.field_byte_q == 3 && this.field_byte_y != 0 && (var4 = this.func_class_al_a()) != null) {
               var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
               var6 = true;
            }
         }
      } else {
         if ((var4 = this.func_class_al_a(super.field_byte_i)) != null) {
            var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
            var6 = true;
         }

         var5 = var4;
         if ((var4 = this.func_class_al_a(class_u.field_array_byte_d[super.field_byte_i])) != null && var4 != var5) {
            var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
            var6 = true;
         }

         var5 = var4;
         if ((var4 = this.func_class_al_a(class_u.field_array_byte_c[super.field_byte_i])) != null && var4 != var5) {
            var4.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, var2, this.field_byte_A, this);
            var6 = true;
         }
      }

      return var6;
   }

   // $FF: renamed from: c () boolean
   private final boolean func_boolean_c() {
      byte var1 = this.field_array_byte_h[this.field_byte_q];
      boolean var2 = false;
      class_al var3 = null;
      class_al var4 = null;
      boolean var5 = false;
      if (var1 == 1 && this.field_byte_q == 3) {
         if ((var3 = this.func_class_al_a(super.field_byte_i)) != null) {
            var3.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
            var5 = true;
         }

         var4 = var3;
         if ((var3 = this.func_class_al_a(class_u.field_array_byte_d[super.field_byte_i])) != null && var3 != var4) {
            var3.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
            var5 = true;
         }

         var4 = var3;
         if ((var3 = this.func_class_al_a(class_u.field_array_byte_c[super.field_byte_i])) != null && var3 != var4) {
            var3.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
            var5 = true;
         }
      } else {
         class_ck var6;
         if ((var6 = this.func_class_ck_a(super.field_byte_i, (byte)1)) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
            var5 = true;
         }

         if ((var6 = this.func_class_ck_a(super.field_byte_i, (byte)2)) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
            var5 = true;
         }
      }

      return var5;
   }

   // $FF: renamed from: d () boolean
   private final boolean func_boolean_d() {
      byte var1 = this.field_array_byte_h[this.field_byte_q];
      boolean var2 = false;
      class_al var3 = null;
      boolean var4 = false;
      if (var1 == 2 && this.field_byte_q == 2) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + class_u.field_array_byte_a[super.field_byte_i]), (byte)(super.field_byte_b + class_u.field_array_byte_b[super.field_byte_i]), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_b[0]), this, true, super.field_byte_i, (byte)3, (byte)2, this.field_int_i, this.field_byte_A, this.field_boolean_j)));
      } else if (var1 == 2 && this.field_byte_q == 3) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + class_u.field_array_byte_a[super.field_byte_i]), (byte)(super.field_byte_b + class_u.field_array_byte_b[super.field_byte_i]), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_b[1]), this, true, super.field_byte_i, (byte)3, (byte)2, this.field_int_i, this.field_byte_A, this.field_boolean_j)));
      } else if (var1 == 2 && this.field_byte_q == 4) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + class_u.field_array_byte_a[super.field_byte_i]), (byte)(super.field_byte_b + class_u.field_array_byte_b[super.field_byte_i]), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_b[2]), this, true, super.field_byte_i, (byte)3, (byte)2, this.field_int_i, this.field_byte_A, this.field_boolean_j)));
      } else if ((var3 = this.func_class_al_a()) != null) {
         var3.func_void_a(this.field_int_i, false, super.field_byte_i, this.field_boolean_j, (byte)1, this.field_byte_A, this);
         var4 = true;
      }

      return var4;
   }

   // $FF: renamed from: a () int
   private final int func_int_a() {
      int var1 = this.field_short_h;
      if (this.field_boolean_d) {
         var1 = this.field_short_h * 3 / 2;
      }

      if (this.field_array_byte_h[this.field_byte_q] == 2) {
         var1 = var1 * 17 / 10;
      } else {
         switch(this.field_byte_q) {
         case 0:
            var1 = var1 * 10 / 10;
            break;
         case 1:
            var1 = var1 * 12 / 10;
            break;
         case 2:
            var1 = var1 * 13 / 10;
            break;
         case 3:
            var1 = var1 * 14 / 10;
            break;
         case 4:
            var1 = var1 * 17 / 10;
         }
      }

      int var10001 = var1 >= 10 ? class_ck.field_class_java_util_Random_a.nextInt() % (var1 / 10) : 0;
      int var10000 = var1 + var10001;
      var10001 += var1;
      return var10000;
   }

   // $FF: renamed from: e () boolean
   private final boolean func_boolean_e() {
      return Math.abs(class_ck.field_class_java_util_Random_a.nextInt() % 100) < (this.field_short_f + this.field_byte_o) / 3 + (this.field_short_g + this.field_byte_p) / 10 + ((class_l)this.field_array_class_e_a[0]).field_byte_a;
   }

   // $FF: renamed from: a () byte
   private final byte func_byte_a() {
      class_l var1 = (class_l)this.field_array_class_e_a[0];
      class_t var2 = (class_t)this.field_array_class_e_a[1];
      byte var3 = -1;
      if (var1.field_byte_c != -1 && class_h.func_int_a(0, 99) < class_t.field_array_byte_i[var1.field_byte_c]) {
         var3 = var1.field_byte_c;
      }

      if (var3 == -1 && var2 != null && var2.field_byte_c != -1 && class_h.func_int_a(0, 99) < class_t.field_array_byte_i[var2.field_byte_c]) {
         var3 = var2.field_byte_c;
      }

      return var3;
   }

   // $FF: renamed from: h (int) void
   private final void func_void_h(int var1) {
      if (var1 == -1 || var1 == 0 && this.field_array_byte_h[var1] == 1) {
         this.field_byte_t = 1;
      } else if (var1 == 0 && this.field_array_byte_h[var1] == 2) {
         this.field_byte_t = 3;
      } else if (this.field_array_byte_h[var1] == 1) {
         this.field_byte_t = 1;
      } else {
         this.field_byte_t = 3;
      }

      this.func_void_j();
      this.func_void_a((byte)1);
      super.field_byte_k = 0;
   }

   // $FF: renamed from: q () void
   private final void func_void_q() {
      class_n.func_void_a((byte)16);
      class_bw.func_void_f();
   }

   // $FF: renamed from: a (boolean) boolean
   public final boolean func_boolean_a(boolean var1) {
      if (!class_n.field_class_ae_a.field_boolean_c) {
         return false;
      } else if (this.field_byte_q + 1 >= this.field_byte_z) {
         return false;
      } else if (this.field_byte_t > 0) {
         return false;
      } else {
         if (this.field_array_byte_h[this.field_byte_q + 1] == 0) {
            if (this.field_byte_q >= 0 && this.field_array_byte_h[this.field_byte_q] == 2) {
               return false;
            }

            if (this.field_byte_q == 0 && var1) {
               return false;
            }

            if (this.field_byte_q == 3 && !var1) {
               return false;
            }

            this.field_array_byte_h[this.field_byte_q + 1] = (byte)(var1 ? 2 : 1);
         }

         return true;
      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      this.field_byte_q = -1;

      for(int var1 = 0; var1 < this.field_array_byte_h.length; ++var1) {
         this.field_array_byte_h[var1] = 0;
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      if (this.field_byte_r == 1) {
         var4 += class_u.field_array_byte_a[this.field_byte_s] * 2;
         var5 += class_u.field_array_byte_b[this.field_byte_s] * 2;
         --this.field_byte_r;
      }

      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_u, var4, var5 - 3, 17);
      switch(super.field_byte_h) {
      case 1:
      case 4:
         this.func_void_a((byte)0, super.field_byte_i, var1, var4, var5);
         break;
      case 2:
         this.func_void_a((byte)1, super.field_byte_i, var1, var4, var5);
         break;
      case 3:
         this.func_void_e(var1, var4, var5);
         if (this.field_byte_y != 0) {
            this.func_void_e(var1, var4 + class_u.field_array_byte_a[class_u.field_array_byte_g[super.field_byte_i]] * 16 * this.field_byte_y, var5 + class_u.field_array_byte_b[class_u.field_array_byte_g[super.field_byte_i]] * 16 * this.field_byte_y);
         }
      case 5:
      default:
         break;
      case 6:
         this.func_void_a((byte)2, (byte)1, var1, var4, var5);
      }

      this.func_void_c(var1, var4, var5 - 8);
      this.func_void_b(var1, var4, var5);
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_d(Graphics var1, int var2, int var3) {
      this.func_void_a((byte)2, (byte)1, var1, var2, var3);
   }

   // $FF: renamed from: a (byte, byte, javax.microedition.lcdui.Graphics, int, int) void
   private void func_void_a(byte var1, byte var2, Graphics var3, int var4, int var5) {
      int var6 = var1 * 36 + (var2 - 1) * 9;

      for(int var7 = 0; var7 < 9; ++var7) {
         if (var7 != 6 && var7 != 7 || class_n.field_class_ae_a.field_boolean_c) {
            if (var7 == 7) {
               class_as.func_void_b(var3, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_a[var6 + var7]), super.field_byte_k, var4, var5);
            } else {
               class_as.func_void_a(var3, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_a[var6 + var7]), super.field_byte_k, var4, var5);
            }
         }
      }

   }

   // $FF: renamed from: e (javax.microedition.lcdui.Graphics, int, int) void
   private void func_void_e(Graphics var1, int var2, int var3) {
      byte var4 = -1;
      switch(this.field_byte_q) {
      case 0:
         if (this.field_array_byte_h[this.field_byte_q] == 1) {
            var4 = 3;
         } else {
            var4 = 7;
         }
         break;
      case 1:
         var4 = 4;
         break;
      case 2:
         if (this.field_array_byte_h[this.field_byte_q] == 1) {
            var4 = 5;
         } else {
            var4 = 8;
         }
         break;
      case 3:
         if (this.field_array_byte_h[this.field_byte_q] == 1) {
            var4 = 6;
         } else {
            var4 = 9;
         }
         break;
      case 4:
         var4 = 10;
      }

      this.func_void_a(var4, super.field_byte_i, var1, var2, var3);
   }

   // $FF: renamed from: a (al, byte) void
   public final void func_void_a(class_al var1, byte var2) {
      this.func_void_a(var1, var1.field_class_j_a.field_short_b, var2);
   }

   // $FF: renamed from: a (al, short, byte) void
   public final void func_void_a(class_al var1, short var2, byte var3) {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         if (!this.field_boolean_f) {
            if (this.field_boolean_g) {
               var1.func_void_b(this.field_class_p_a.field_short_a * 2 + 40 + this.field_short_g);
            }

            class_bs.field_class_as_a.func_void_a(var1, true);
            int var4 = this.field_short_f + this.field_byte_o - var1.field_class_j_a.field_short_d + 10;
            if (this.field_array_class_e_a[2] != null) {
               var4 += this.field_array_class_e_a[2].field_byte_e;
            }

            if (var4 > 60) {
               var4 = 60;
            }

            if (var4 < 8) {
               var4 = 8;
            }

            if (class_h.func_int_a(0, 99) < var4) {
               super.field_class_java_util_Vector_a.addElement(new class_aw((byte)2));
            } else {
               int var5;
               if ((var5 = var2 + class_h.func_int_a(-(var2 / 10), var2 / 10) - (this.field_boolean_e ? this.field_short_i * 2 : this.field_short_i)) > 0) {
                  this.func_void_b(-var5);
                  this.func_void_a(new class_aw((byte)6));
               }

               if (var5 < 0) {
                  var5 = 0;
               }

               super.field_class_java_util_Vector_a.addElement(new class_aw((byte)7, (short)4, (short)(-var5)));
               if (var1.field_class_j_a.field_byte_d == 1 && class_h.func_int_a(0, 99) < 15) {
                  this.func_boolean_a((byte)7);
               }

               this.field_byte_r = 1;
               this.field_byte_s = var3;
            }
         }
      }
   }

   // $FF: renamed from: b (int) void
   public final void func_void_b(int var1) {
      this.field_int_a += var1;
      if (this.field_int_a > this.field_int_d) {
         this.field_int_a = this.field_int_d;
      }

      if (this.field_int_a < 0) {
         this.field_int_a = 0;
      }

      class_bs.field_class_as_a.func_void_c();
      if (this.field_int_a == 0) {
         this.func_void_a((byte)6);
         super.field_byte_k = 0;
         this.field_byte_u = 24;
      }
   }

   // $FF: renamed from: c (int) void
   public final void func_void_c(int var1) {
      int var2 = this.field_int_d * var1 / 100;
      this.func_void_b(var2);
   }

   // $FF: renamed from: d (int) void
   public final void func_void_d(int var1) {
      this.field_int_b += var1;
      if (this.field_int_b > this.field_int_e) {
         this.field_int_b = this.field_int_e;
      }

      if (this.field_int_b < 0) {
         this.field_int_b = 0;
      }

      class_bs.field_class_as_a.func_void_d();
   }

   // $FF: renamed from: e (int) void
   public final void func_void_e(int var1) {
      int var2 = this.field_int_e * var1 / 100;
      this.func_void_d(var2);
   }

   // $FF: renamed from: f (int) void
   public final void func_void_f(int var1) {
      var1 *= 4;
      this.field_int_c += var1;

      while(this.field_int_c >= this.field_int_f) {
         this.field_int_c -= this.field_int_f;
         this.func_void_r();
      }

      if (this.field_int_c < 0) {
         this.field_int_c = 0;
      }

      class_bs.field_class_as_a.func_void_e();
      this.field_class_p_a.func_void_a(var1);
   }

   // $FF: renamed from: g (int) void
   public final void func_void_g(int var1) {
      class_g var10000 = this.field_class_g_a;
      var10000.field_int_a += var1;
      if (this.field_class_g_a.field_int_a < 0) {
         this.field_class_g_a.field_int_a = 0;
      }

   }

   // $FF: renamed from: r () void
   private final void func_void_r() {
      if (this.field_byte_g < 99) {
         ++this.field_byte_g;
         this.func_void_n();
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)3));
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)4));
         this.field_short_a = (short)(this.field_short_a + 3);
      }

      this.func_void_c((int)100);
      this.func_void_e((int)100);
      if (class_w.field_boolean_c && this.field_byte_g >= 8) {
         class_n.func_void_a((byte)13);
      }

   }

   // $FF: renamed from: d (byte) void
   public final void func_void_d(byte var1) {
      if (this.field_byte_z < var1) {
         this.field_byte_z = var1;
      }

   }

   // $FF: renamed from: k () void
   public final void func_void_k() {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         class_ad var1;
         if ((var1 = this.field_class_g_a.func_class_ad_a()) != null) {
            this.func_void_a(var1);
         }

      }
   }

   // $FF: renamed from: a (boolean, byte) byte[]
   public final byte[] func_array_byte_a(boolean var1, byte var2) {
      byte[] var3 = this.field_class_g_a.func_array_byte_a(var1, var2);
      int var4 = 0;

      for(int var5 = 0; var5 < 5; ++var5) {
         if (this.field_array_class_e_a[var5] != null && (!var1 || this.field_array_class_e_a[var5] instanceof class_t) && (var2 != 1 || this.field_array_class_e_a[var5].field_boolean_b) && (var2 != -1 || !this.field_array_class_e_a[var5].field_boolean_b)) {
            ++var4;
         }
      }

      byte[] var8 = new byte[var3.length + var4];
      int var6 = 0;

      for(int var7 = 0; var7 < 5; ++var7) {
         if (this.field_array_class_e_a[var7] != null && (!var1 || this.field_array_class_e_a[var7] instanceof class_t) && (var2 != 1 || this.field_array_class_e_a[var7].field_boolean_b) && (var2 != -1 || !this.field_array_class_e_a[var7].field_boolean_b)) {
            var8[var6++] = (byte)(var7 + 100);
         }
      }

      System.arraycopy(var3, 0, var8, var6, var3.length);
      return var8;
   }

   // $FF: renamed from: a (ad) byte
   public final byte func_byte_a(class_ad var1) {
      byte var2;
      if ((var2 = this.field_class_g_a.func_byte_a(var1)) == -1) {
         for(int var3 = 0; var3 < 5; ++var3) {
            if (var1 == this.field_array_class_e_a[var3]) {
               return (byte)(var3 + 100);
            }
         }

         return -1;
      } else {
         return var2;
      }
   }

   // $FF: renamed from: b (byte, byte) void
   public final void func_void_b(byte var1, byte var2) {
      this.field_array_class_e_a[var2] = (class_e)this.field_class_g_a.func_class_ad_a(this.field_array_class_e_a[var2], var1);
      this.func_void_n();
   }

   // $FF: renamed from: a (int) ad
   public final class_ad func_class_ad_a(int var1) {
      return this.field_array_class_e_a[var1];
   }

   // $FF: renamed from: a () l
   public final class_l func_class_l_a() {
      return (class_l)this.field_array_class_e_a[0];
   }

   // $FF: renamed from: a () t
   public final class_t func_class_t_a() {
      return (class_t)this.field_array_class_e_a[1];
   }

   // $FF: renamed from: a () e
   public final class_e func_class_e_a() {
      return this.field_array_class_e_a[2];
   }

   // $FF: renamed from: b () e
   public final class_e func_class_e_b() {
      return this.field_array_class_e_a[3];
   }

   // $FF: renamed from: c () e
   public final class_e func_class_e_c() {
      return this.field_array_class_e_a[4];
   }

   // $FF: renamed from: a (ad) void
   public final void func_void_a(class_ad var1) {
      byte var2;
      if ((var2 = var1.field_byte_f) == 7) {
         this.func_void_c((int)20);
      } else if (var2 == 8) {
         this.func_void_c((int)40);
      } else if (var2 == 10) {
         for(int var4 = 0; var4 < super.field_class_java_util_Vector_b.size(); ++var4) {
            class_cf var3;
            if ((var3 = (class_cf)super.field_class_java_util_Vector_b.elementAt(var4)).field_byte_a == 7) {
               var3.func_void_b();
               break;
            }
         }
      } else if (var2 == 9) {
         this.func_void_e((int)30);
      } else {
         class_x.func_void_a(false);
      }

      this.field_class_g_a.func_void_a(var1, (byte)1);
      class_bs.field_class_as_a.func_void_b();
   }

   // $FF: renamed from: e (byte) void
   public final void func_void_e(byte var1) {
      byte var2 = 0;
      if (this.field_class_p_a != null) {
         var2 = this.field_class_p_a.func_byte_a();
      }

      switch(var1) {
      case 0:
         class_bu.func_void_a(class_n.field_byte_a, (class_l)((class_l)this.field_array_class_e_a[0]), false, var2);
         return;
      case 1:
         class_bu.func_void_c(class_n.field_byte_a, this.field_array_class_e_a[1].field_byte_g);
      default:
         return;
      case 2:
         class_bu.func_void_a(class_n.field_byte_a, this.field_array_class_e_a[2].field_byte_g);
         return;
      case 3:
         class_bu.func_void_b(class_n.field_byte_a, this.field_array_class_e_a[3].field_byte_g);
      }
   }

   // $FF: renamed from: a (byte) p
   public final class_p func_class_p_a(byte var1) {
      int var2;
      for(var2 = 0; var2 < this.field_array_class_p_a.length; ++var2) {
         if (this.field_array_class_p_a[var2] != null && this.field_array_class_p_a[var2].field_byte_f == var1) {
            return null;
         }
      }

      for(var2 = 0; var2 < this.field_array_class_p_a.length; ++var2) {
         if (this.field_array_class_p_a[var2] == null) {
            this.field_array_class_p_a[var2] = new class_p((short)0, (short)0, var1);
            return this.field_array_class_p_a[var2];
         }
      }

      return null;
   }

   // $FF: renamed from: a () p
   public final class_p func_class_p_a() {
      class_x.func_void_a(this.field_class_p_a != null);
      return this.field_class_p_a;
   }

   // $FF: renamed from: a (p) boolean
   public final boolean func_boolean_a(class_p var1) {
      if (this.field_class_p_a != null && this.field_class_p_a.field_byte_i != 0) {
         return false;
      } else {
         this.func_class_p_b();
         this.field_class_p_a = var1;
         return true;
      }
   }

   // $FF: renamed from: l () void
   public final void func_void_l() {
      class_n.func_void_a((int)1);
      this.func_void_m();
      class_bs.field_class_bs_a.func_void_g();
      class_bu.func_void_c();
   }

   // $FF: renamed from: a (boolean) void
   public final void func_void_a(boolean var1) {
      if (class_n.field_class_ae_a.field_boolean_c) {
         if (this.field_class_p_a != null && this.field_class_p_a.field_byte_i == 0) {
            this.field_class_p_a.func_void_a(var1, super.field_byte_i, super.field_byte_a, super.field_byte_b);
         }
      }
   }

   // $FF: renamed from: b () p
   public final class_p func_class_p_b() {
      class_p var1;
      if ((var1 = this.field_class_p_a) == null) {
         return null;
      } else {
         if (class_n.field_class_ae_a != null) {
            class_n.field_class_ae_a.func_void_a((class_ck)var1);
         }

         this.field_class_p_a = null;
         return var1;
      }
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      class_n.field_class_ae_a.func_void_b((class_ck)this.field_class_p_a);
   }

   // $FF: renamed from: n () void
   public final void func_void_n() {
      class_e[] var1 = (class_e[])this.field_array_class_e_a;
      this.field_byte_m = 0;
      this.field_byte_n = 0;
      this.field_byte_o = 0;
      this.field_byte_p = 0;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (var1[var2] != null) {
            this.field_byte_m += var1[var2].field_array_byte_j[0];
            this.field_byte_n += var1[var2].field_array_byte_j[1];
            this.field_byte_o += var1[var2].field_array_byte_j[2];
            this.field_byte_p += var1[var2].field_array_byte_j[3];
         }
      }

      this.field_int_d = 0;
      this.field_int_e = 0;
      this.field_int_f = 0;
      this.field_short_h = 0;
      this.field_short_i = 0;
      this.field_int_d = (this.field_short_e + this.field_byte_n + this.field_byte_g) * 12;
      this.field_int_e = (this.field_short_g + this.field_byte_p + this.field_byte_g) * 12;
      this.field_int_f = this.field_byte_g * this.field_byte_g * this.field_byte_g - this.field_byte_g * this.field_byte_g + 80 * this.field_byte_g;
      this.field_short_h = (short)(this.field_short_h + (var1[0] != null ? var1[0].field_short_a + var1[0].field_byte_e * 5 / 2 : 0));
      this.field_short_h = (short)(this.field_short_h + (this.field_short_b + this.field_byte_m) * 4 / 5);
      this.field_short_i = (short)(this.field_short_i + (var1[1] != null ? var1[1].field_short_a + var1[1].field_byte_e : 0));
      this.field_short_i = (short)(this.field_short_i + (var1[2] != null ? var1[2].field_short_a + var1[2].field_byte_e * 2 : 0));
      this.field_short_i += var1[3] != null ? var1[3].field_short_a : 0;
      this.field_short_i += var1[4] != null ? var1[4].field_short_a : 0;
      this.field_short_i = (short)(this.field_short_i + (this.field_short_b + this.field_byte_m) / 5);
      this.field_short_i = (short)(this.field_short_i + this.field_byte_g / 3);
      if (this.field_int_a > this.field_int_d) {
         this.field_int_a = this.field_int_d;
      }

      if (this.field_int_b > this.field_int_e) {
         this.field_int_b = this.field_int_e;
      }

      class_bs.field_class_as_a.func_void_b();
   }

   // $FF: renamed from: a () byte[]
   public final byte[] func_array_byte_a() {
      ByteArrayOutputStream var1 = null;
      DataOutputStream var2 = null;
      boolean var13 = false;

      byte[] var19;
      label203: {
         try {
            var13 = true;
            var1 = new ByteArrayOutputStream();
            (var2 = new DataOutputStream(var1)).writeByte(this.field_byte_f);
            var2.writeByte(this.field_byte_g);
            var2.writeInt(this.field_int_a);
            var2.writeInt(this.field_int_b);
            var2.writeInt(this.field_int_c);
            var2.writeInt(this.field_int_d);
            var2.writeInt(this.field_int_e);
            var2.writeInt(this.field_int_f);
            var2.writeByte(this.field_byte_z);
            var2.writeShort(this.field_short_a);
            var2.writeShort(this.field_short_b);
            var2.writeShort(this.field_short_e);
            var2.writeShort(this.field_short_f);
            var2.writeShort(this.field_short_g);

            int var3;
            for(var3 = 0; var3 < 5; ++var3) {
               if (this.field_array_class_e_a[var3] == null) {
                  var2.writeByte(0);
               } else {
                  var2.writeByte(1);
                  var2.write(this.field_array_class_e_a[var3].func_array_byte_a());
               }
            }

            for(var3 = 0; var3 < this.field_array_class_p_a.length; ++var3) {
               if (this.field_array_class_p_a[var3] == null) {
                  var2.writeByte(0);
               } else {
                  var2.writeByte(1);
                  var2.writeByte(this.field_array_class_p_a[var3].field_byte_f);
                  var2.writeShort(this.field_array_class_p_a[var3].field_short_a);
                  var2.writeInt(1);
                  var2.writeInt(1);
                  var2.writeInt(this.field_array_class_p_a[var3].field_int_a);
                  var2.writeByte(this.field_array_class_p_a[var3].field_byte_g);
                  var2.writeByte(this.field_array_class_p_a[var3].field_byte_h);
               }
            }

            class_x.func_void_a(this.field_class_p_a != null);
            byte var20 = -1;
            byte var4 = 0;

            while(true) {
               if (var4 < this.field_array_class_p_a.length) {
                  if (this.field_class_p_a != this.field_array_class_p_a[var4]) {
                     ++var4;
                     continue;
                  }

                  var20 = var4;
               }

               class_x.func_void_a(var20 != -1);
               var2.writeByte(var20);
               var2.writeInt(this.field_int_h + (int)(System.currentTimeMillis() / 1000L - (long)this.field_int_g));
               var19 = var1.toByteArray();
               var13 = false;
               break label203;
            }
         } catch (IOException var17) {
            var17.printStackTrace();
            var13 = false;
         } finally {
            if (var13) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }
               } catch (IOException var15) {
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
         } catch (IOException var14) {
         }

         return null;
      }

      try {
         var2.close();
         var1.close();
      } catch (IOException var16) {
      }

      return var19;
   }

   // $FF: renamed from: a (byte[]) void
   public final void func_void_a(byte[] var1) {
      ByteArrayInputStream var2 = null;
      DataInputStream var3 = null;
      boolean var14 = false;

      label167: {
         label166: {
            try {
               var14 = true;
               var2 = new ByteArrayInputStream(var1);
               var3 = new DataInputStream(var2);
               this.field_byte_f = var3.readByte();
               this.field_byte_g = var3.readByte();
               this.field_int_a = var3.readInt();
               this.field_int_b = var3.readInt();
               this.field_int_c = var3.readInt();
               var3.readInt();
               var3.readInt();
               var3.readInt();
               this.field_byte_z = var3.readByte();
               this.field_short_a = var3.readShort();
               this.field_short_b = var3.readShort();
               this.field_short_e = var3.readShort();
               this.field_short_f = var3.readShort();
               this.field_short_g = var3.readShort();

               int var4;
               for(var4 = 0; var4 < 5; ++var4) {
                  if (var3.readByte() != 0) {
                     byte[] var6 = new byte[10];
                     var3.read(var6);
                     this.field_array_class_e_a[var4] = (class_e)class_ad.func_class_ad_a(var6);
                  }
               }

               class_x.func_void_a(this.field_array_class_p_a[0] == null);
               class_x.func_void_a(this.field_class_p_a == null);

               for(var4 = 0; var4 < this.field_array_class_p_a.length; ++var4) {
                  if (var3.readByte() != 0) {
                     class_p var5;
                     (var5 = this.func_class_p_a(var3.readByte())).field_short_a = var3.readShort();
                     var3.readInt();
                     var3.readInt();
                     var5.field_int_a = var3.readInt();
                     var5.func_boolean_a(true, var3.readByte(), true);
                     var5.func_boolean_a(false, var3.readByte(), true);
                     var5.func_void_a();
                  }
               }

               this.func_boolean_a(this.field_array_class_p_a[var3.readByte()]);
               this.field_int_h = var3.readInt();
               var14 = false;
               break label166;
            } catch (IOException var18) {
               var18.printStackTrace();
               var14 = false;
            } finally {
               if (var14) {
                  try {
                     if (var3 != null) {
                        var3.close();
                     }

                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (IOException var15) {
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
            } catch (IOException var16) {
            }
            break label167;
         }

         try {
            var3.close();
            var2.close();
         } catch (IOException var17) {
         }
      }

      this.func_void_n();
   }
}
