package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: p
public final class class_p extends class_ck implements class_u {
   // $FF: renamed from: a short[]
   public static final short[] field_array_short_a = new short[]{1, 1, 1, 1, 10, 20};
   // $FF: renamed from: h byte[]
   public static final byte[] field_array_byte_h = new byte[]{1, 9, 20, 30};
   // $FF: renamed from: b short[]
   public static final short[] field_array_short_b = new short[]{56, 280, 280, 220, 160, 270, 56, 270, 220, 80, 270, 270, 80, 270, 220, 80, 270, 270};
   // $FF: renamed from: i byte[]
   private static final byte[] field_array_byte_i = new byte[]{0, 0, 10, 4, 4, 10, 0, 4, 0, 4, 10, 8, 0, 6, 6, 0, 10, 8};
   // $FF: renamed from: d short[]
   private static final short[] field_array_short_d = new short[]{16, 9, 161, 9, 10, 81, 16, 9, 13, 25, 81, 8, 31, 81, 16, 31, 87, 8};
   // $FF: renamed from: j byte[]
   private byte[] field_array_byte_j = new byte[4];
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: g byte
   public byte field_byte_g;
   // $FF: renamed from: h byte
   public byte field_byte_h;
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: a int
   public int field_int_a;
   // $FF: renamed from: b int
   public int field_int_b;
   // $FF: renamed from: i byte
   public byte field_byte_i;
   // $FF: renamed from: j byte
   public byte field_byte_j;
   // $FF: renamed from: b short
   private short field_short_b;
   // $FF: renamed from: e short
   private short field_short_e;
   // $FF: renamed from: k byte
   private byte field_byte_k;
   // $FF: renamed from: l byte
   private byte field_byte_l;
   // $FF: renamed from: m byte
   private byte field_byte_m;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d;
   // $FF: renamed from: c short[]
   public short[] field_array_short_c;

   public class_p(short var1, short var2, byte var3) {
      super(var1, var2, (byte)8, (byte)8);
      this.field_byte_f = var3;
      this.field_array_short_c = new short[3];
      this.field_array_short_c[0] = field_array_short_b[var3 * 3 + 0];
      this.field_array_short_c[1] = field_array_short_b[var3 * 3 + 1];
      this.field_array_short_c[2] = field_array_short_b[var3 * 3 + 2];
      this.field_short_a = field_array_short_a[var3];
      this.func_void_a();
      this.field_int_a = 0;
      this.func_void_d();
      this.func_boolean_a(true, (byte)0, true);
      this.func_boolean_a(false, (byte)1, true);
   }

   // $FF: renamed from: a (int) void
   public final void func_void_a(int var1) {
      this.field_int_a += var1;

      while(this.field_int_a >= this.field_int_b) {
         this.field_int_a -= this.field_int_b;
         this.func_void_f();
      }

   }

   // $FF: renamed from: f () void
   private final void func_void_f() {
      ++this.field_short_a;
      this.func_void_a();
      if (this.field_short_a == field_array_byte_h[1]) {
         this.func_boolean_a(false, (byte)1, true);
      }

   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_int_b = this.field_short_a * this.field_short_a * this.field_short_a - this.field_short_a * this.field_short_a + this.field_short_a * 80;
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      this.field_byte_i = 0;
   }

   // $FF: renamed from: a () byte
   public final byte func_byte_a() {
      if (this.field_byte_f != 0 && this.field_byte_f != 3) {
         if (this.field_byte_f != 1 && this.field_byte_f != 4) {
            return (byte)(this.field_byte_f != 2 && this.field_byte_f != 5 ? 0 : 3);
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return this.field_byte_k - this.field_byte_l < 10;
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      this.func_boolean_a(true, (byte)-1, true);
      this.func_boolean_a(false, (byte)-1, true);
   }

   // $FF: renamed from: a (boolean, byte, boolean) boolean
   public final boolean func_boolean_a(boolean var1, byte var2, boolean var3) {
      if (var2 == -1) {
         if (var1) {
            this.field_byte_g = var2;
         } else {
            this.field_byte_h = var2;
         }

         return true;
      } else if (field_array_byte_h[var2] > this.field_short_a) {
         return false;
      } else {
         if (var1) {
            this.field_byte_g = var2;
            if (var3 && var2 != -1) {
               this.field_array_short_c[var2] = field_array_short_b[this.field_byte_f * 3 + var2];
            }
         } else {
            this.field_byte_h = var2;
            if (var3 && var2 != -1) {
               this.field_array_short_c[var2] = field_array_short_b[this.field_byte_f * 3 + var2];
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (boolean, byte, int, int) void
   public final void func_void_a(boolean var1, byte var2, int var3, int var4) {
      if (var1 && this.field_byte_g >= 0 && this.field_byte_g <= 2 && this.field_array_short_c[this.field_byte_g] == 0) {
         this.field_byte_m = this.field_byte_g;
         this.field_array_short_c[this.field_byte_g] = field_array_short_b[this.field_byte_f * 3 + this.field_byte_g];
      } else {
         if (var1 || this.field_byte_h < 0 || this.field_byte_h > 2 || this.field_array_short_c[this.field_byte_h] != 0) {
            return;
         }

         this.field_byte_m = this.field_byte_h;
         this.field_array_short_c[this.field_byte_h] = field_array_short_b[this.field_byte_f * 3 + this.field_byte_h];
      }

      this.field_byte_i = 1;
      this.field_short_b = -1;
      this.field_byte_k = field_array_byte_i[this.field_byte_f * 3 + this.field_byte_m];
      this.field_byte_l = this.field_byte_k;
      this.field_boolean_d = false;
      this.func_void_a((short)((var3 + class_u.field_array_byte_a[var2]) * 16), (short)((var4 + class_u.field_array_byte_b[var2]) * 16));
      this.field_byte_j = var2;
      super.field_byte_b = (byte)(super.field_short_d >> 4);
      super.field_byte_a = (byte)(super.field_short_c >> 4);
      super.field_boolean_b = false;
      super.field_boolean_a = false;
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      if ((this.field_byte_i == 0 || this.field_byte_m != this.field_byte_g) && this.field_byte_g != -1 && this.field_array_short_c[this.field_byte_g] > 0) {
         --this.field_array_short_c[this.field_byte_g];
      }

      if ((this.field_byte_i == 0 || this.field_byte_m != this.field_byte_h) && this.field_byte_h != -1 && this.field_array_short_c[this.field_byte_h] > 0) {
         --this.field_array_short_c[this.field_byte_h];
      }

      switch(this.field_byte_i) {
      case 0:
         return;
      case 1:
         ++this.field_short_b;
         if (this.field_short_b >= 10) {
            if (this.field_byte_l > 0) {
               this.field_byte_i = 2;
            } else {
               this.field_byte_i = 3;
               this.field_short_b = 0;
               this.field_short_e = 0;
            }

            this.field_short_b = 0;
         }
         break;
      case 2:
         ++this.field_short_b;
         --this.field_byte_l;
         if (this.field_short_b >= 4) {
            this.field_short_b = 0;
         }

         if (this.field_byte_l <= 0) {
            this.field_byte_i = 3;
            this.field_short_b = 0;
            this.field_short_e = 0;
         }
         break;
      case 3:
         ++this.field_short_b;
         if (this.field_short_b >= 11) {
            this.field_short_b = 11;
            if (this.field_boolean_d) {
               this.field_byte_i = 0;
               this.field_byte_j = 0;
            }
         }
      }

      if (this.field_byte_i == 3) {
         this.func_void_a(this.field_byte_f, this.field_byte_m);
         ++this.field_short_e;
      }

   }

   // $FF: renamed from: a (byte, byte) void
   private final void func_void_a(byte var1, byte var2) {
      class_ao var3 = class_n.func_class_ao_a();
      label132:
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            this.func_void_g();
            this.func_void_i();
            break label132;
         case 1:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)8, var1, var2));
               var3.func_boolean_a((byte)5);
               var3.field_boolean_d = true;
               class_bw.func_void_a((byte)21, false);
            }
            break label132;
         case 2:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)160, var1, var2));
               var3.field_boolean_g = true;
               class_bw.func_void_a((byte)21, false);
            }

            if (this.field_short_e == field_array_short_d[var1 * 3 + var2]) {
               var3.field_boolean_g = false;
            }
         default:
            break label132;
         }
      case 1:
         switch(var2) {
         case 0:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)8, var1, var2));
               var3.func_void_c((int)30);
               class_bw.func_void_a((byte)20, false);
            }
            break label132;
         case 1:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)9, var1, var2));
               var3.func_void_e((int)20);
               class_bw.func_void_a((byte)20, false);
            }
            break label132;
         case 2:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)80, var1, var2));
               var3.func_void_a(new class_bj((short)4, (short)8, var1, (byte)0));
               var3.func_void_a(new class_bj((short)24, (short)8, var1, (byte)0));
               var3.func_void_a(new class_bj((short)44, (short)8, var1, (byte)0));
               var3.field_boolean_h = true;
               class_bw.func_void_a((byte)20, false);
            }

            if (this.field_short_e == field_array_short_d[var1 * 3 + var2]) {
               var3.field_boolean_h = false;
            }
         default:
            break label132;
         }
      case 2:
         switch(var2) {
         case 0:
            this.func_void_h();
            this.func_void_j();
            break label132;
         case 1:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)8, var1, var2));
               var3.func_boolean_a((byte)6);
               var3.field_boolean_e = true;
               class_bw.func_void_a((byte)21, false);
            }
            break label132;
         case 2:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)12, var1, var2));
               var3.field_class_java_util_Vector_b.removeAllElements();
               var3.field_boolean_d = false;
               var3.field_boolean_e = false;
               class_bw.func_void_a((byte)21, false);
            }
         default:
            break label132;
         }
      case 3:
         switch(var2) {
         case 0:
            this.func_void_a(4, 3, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(10, 3, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(16, 3, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a((byte)5, 0, 3);
            this.func_void_a((byte)5, 6, 3);
            this.func_void_a((byte)5, 12, 3);
            if (this.field_short_e == 0 || this.field_short_e == 6 || this.field_short_e == 12) {
               class_bw.func_void_a((byte)16, false);
            }
            break label132;
         case 1:
            this.func_void_b(2);
            this.func_void_a((short)80, (int)(this.field_short_a + 45 + class_n.func_class_ao_a().field_short_g * 3 / 2));
            this.func_void_a(super.field_short_c, super.field_short_d, (short)80, (byte)6);
            if (this.field_short_e % 8 == 0) {
               class_bw.func_void_a((byte)16, false);
            }
            break label132;
         case 2:
            if (this.field_short_e == 0) {
               this.func_void_a((byte)7);
               this.func_void_a((short)7);
               class_bw.func_void_a((byte)16, false);
            }
         default:
            break label132;
         }
      case 4:
         switch(var2) {
         case 0:
            this.func_void_a(4, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(10, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(16, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a((byte)7, 0, 5);
            this.func_void_a((byte)7, 6, 5);
            this.func_void_a((byte)7, 12, 5);
            if (this.field_short_e == 0 || this.field_short_e == 6 || this.field_short_e == 12 || this.field_short_e == 18 || this.field_short_e == 24) {
               class_bw.func_void_a((byte)18, false);
            }
            break label132;
         case 1:
            this.func_void_b(2);
            if (Math.abs(super.field_byte_a - var3.field_byte_a) + Math.abs(super.field_byte_b - var3.field_byte_b) <= 2) {
               var3.field_boolean_f = true;
            } else {
               var3.field_boolean_f = false;
            }

            this.func_void_a(super.field_short_c, super.field_short_d, (short)80, (byte)8);
            if (this.field_short_e % 8 == 0) {
               class_bw.func_void_a((byte)18, false);
            }

            if (this.field_short_e == field_array_short_d[var1 * 3 + var2]) {
               var3.field_boolean_f = false;
            }
            break label132;
         case 2:
            if (this.field_short_e == 0) {
               var3.func_void_a(new class_bj((short)0, (short)15, var1, var2));
               var3.func_void_c((int)20);
               var3.func_void_e((int)20);
               class_bw.func_void_a((byte)20, false);
            }
         default:
            break label132;
         }
      case 5:
         switch(var2) {
         case 0:
            this.func_void_a(4, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(10, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a(16, 5, (int)3, (int)(this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g));
            this.func_void_a((byte)4, 0, 5);
            this.func_void_a((byte)4, 6, 5);
            this.func_void_a((byte)4, 12, 5);
            if (this.field_short_e == 0 || this.field_short_e == 6 || this.field_short_e == 12 || this.field_short_e == 18 || this.field_short_e == 24) {
               class_bw.func_void_a((byte)17, false);
            }
            break;
         case 1:
            this.func_void_b(2);
            this.func_void_a((short)80, (int)(this.field_short_a + 45 + class_n.func_class_ao_a().field_short_g * 3 / 2));
            this.func_void_a(super.field_short_c, super.field_short_d, (short)80, (byte)9);
            if (this.field_short_e % 8 == 0) {
               class_bw.func_void_a((byte)17, false);
            }
            break;
         case 2:
            if (this.field_short_e == 0) {
               this.func_void_a((byte)9);
               this.func_void_a((short)9);
               class_bw.func_void_a((byte)17, false);
            }
         }
      }

      if (this.field_short_e == field_array_short_d[var1 * 3 + var2]) {
         this.field_boolean_d = true;
      }

   }

   // $FF: renamed from: g () void
   private final void func_void_g() {
      int var1 = this.field_short_a * 3 + 40 + class_n.func_class_ao_a().field_short_g;
      class_ck var2;
      if ((this.field_short_e == 1 || this.field_short_e == 5) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)0)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 2 || this.field_short_e == 6) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)1)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 3 || this.field_short_e == 7) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)2)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 5 || this.field_short_e == 9) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)3)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if (this.field_short_e == 8 || this.field_short_e == 12) {
         int var7 = super.field_byte_a + class_u.field_array_byte_a[this.field_byte_j] * 3 + class_u.field_array_byte_a[class_u.field_array_byte_e[this.field_byte_j]];
         int var3 = super.field_byte_b + class_u.field_array_byte_b[this.field_byte_j] * 3 + class_u.field_array_byte_b[class_u.field_array_byte_e[this.field_byte_j]];
         int var4 = super.field_byte_a + class_u.field_array_byte_a[this.field_byte_j] * 3 + class_u.field_array_byte_a[class_u.field_array_byte_f[this.field_byte_j]];
         int var5 = super.field_byte_b + class_u.field_array_byte_b[this.field_byte_j] * 3 + class_u.field_array_byte_b[class_u.field_array_byte_f[this.field_byte_j]];
         class_ck var6;
         if (var7 > 0 && var7 < class_n.field_class_ae_a.field_int_a - 1 && var3 > 0 && var3 < class_n.field_class_ae_a.field_int_b - 1 && (var6 = class_n.field_class_ae_a.field_array_array_class_ck_a[var3][var7]) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(var1, this.func_byte_a());
         }

         if (var4 > 0 && var4 < class_n.field_class_ae_a.field_int_a - 1 && var5 > 0 && var5 < class_n.field_class_ae_a.field_int_b - 1 && (var6 = class_n.field_class_ae_a.field_array_array_class_ck_a[var5][var4]) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(var1, this.func_byte_a());
         }
      }

   }

   // $FF: renamed from: h () void
   private final void func_void_h() {
      if (this.field_short_e >= 0 && this.field_short_e <= 5) {
         class_n.field_class_ae_a.field_int_e = class_h.func_int_a(-4, 4);
         class_n.field_class_ae_a.field_int_f = class_h.func_int_a(-4, 4);
      }

      int var1 = this.field_short_a * 3 + 35 + class_n.func_class_ao_a().field_short_g * 3 / 2;
      class_ck var2;
      if ((this.field_short_e == 2 || this.field_short_e == 6) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)0)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 3 || this.field_short_e == 7) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)1)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 4 || this.field_short_e == 8) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)2)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

      if ((this.field_short_e == 5 || this.field_short_e == 9) && (var2 = this.func_class_ck_a(this.field_byte_j, (byte)3)) != null && var2 instanceof class_al) {
         ((class_al)var2).func_void_a(var1, this.func_byte_a());
      }

   }

   // $FF: renamed from: a (short, int) void
   private final void func_void_a(short var1, int var2) {
      class_ae var3 = class_n.field_class_ae_a;
      if (this.field_short_e < var1) {
         int var4 = super.field_byte_a + this.field_array_byte_j[0];
         int var5 = super.field_byte_b + this.field_array_byte_j[1];
         class_ck var6;
         if (var4 >= 0 && var5 >= 0 && var4 < var3.field_int_a && var5 < var3.field_int_b && (var6 = var3.field_array_array_class_ck_a[var5][var4]) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(var2, this.func_byte_a());
         }

         var4 = super.field_byte_a + this.field_array_byte_j[2];
         var5 = super.field_byte_b + this.field_array_byte_j[3];
         if (var4 >= 0 && var5 >= 0 && var4 < var3.field_int_a && var5 < var3.field_int_b && (var6 = var3.field_array_array_class_ck_a[var5][var4]) != null && var6 instanceof class_al) {
            ((class_al)var6).func_void_a(var2, this.func_byte_a());
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int) void
   private final void func_void_a(int var1, int var2, int var3, int var4) {
      int var5;
      int var6 = (var5 = this.field_short_e - var1) / var2;
      if (var5 >= 0) {
         if (var5 % var2 == 0) {
            class_ck var7;
            if (var6 == 0) {
               if ((var7 = this.func_class_ck_a(this.field_byte_j, (byte)0)) != null && var7 instanceof class_al) {
                  ((class_al)var7).func_void_a(var4, this.func_byte_a());
                  return;
               }
            } else {
               for(byte var8 = 1; var8 <= 4; ++var8) {
                  if ((var7 = this.func_class_ck_a(var8, (byte)var6)) != null && var7 instanceof class_al) {
                     ((class_al)var7).func_void_a(var4, this.func_byte_a());
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: a (byte) void
   private final void func_void_a(byte var1) {
      if (this.field_short_e == 0) {
         for(int var3 = 0; var3 <= 3; ++var3) {
            class_ck var2;
            if ((var2 = this.func_class_ck_a(this.field_byte_j, (byte)var3)) != null && var2 instanceof class_al && !(var2 instanceof class_av) && ((class_al)var2).field_class_j_a.field_byte_c == this.func_byte_a()) {
               ((class_al)var2).func_void_c(var1);
            }
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      int var6 = class_ce.field_array_class_javax_microedition_lcdui_Image_a[0].getHeight();
      Image[] var7;
      Image var8 = (var7 = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[12])[0];
      Image var9 = var7[1];
      Image var10 = var7[2];
      Image var11 = var7[3];
      Image var12 = class_ce.field_array_class_javax_microedition_lcdui_Image_a[0];
      Image var13 = class_ce.field_array_class_javax_microedition_lcdui_Image_a[1];
      switch(this.field_byte_i) {
      case 0:
         return;
      case 1:
         switch(this.field_short_b) {
         case 0:
            var1.drawImage(var10, var4, var5, 33);
            break;
         case 1:
            var1.drawImage(var11, var4, var5, 33);
            break;
         case 2:
            var1.drawImage(var11, var4, var5, 33);
            var1.drawImage(var8, var4, var5 + 3, 33);
            break;
         case 3:
            var1.drawImage(var11, var4, var5, 33);
            var1.drawImage(var8, var4, var5 + 3, 33);
            var1.drawImage(var9, var4, var5 + 6, 33);
            break;
         case 4:
            var1.drawImage(var10, var4, var5, 33);
            var1.drawImage(var9, var4, var5 + 6, 33);
            break;
         case 5:
            var6 = var6 * 7 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            break;
         case 6:
            var6 = var6 * 5 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var10, var4, var5, 33);
            break;
         case 7:
            var6 = var6 * 3 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var11, var4, var5, 33);
            break;
         case 8:
            var6 = var6 * 1 / 5;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var11, var4, var5, 33);
            break;
         case 9:
            var1.drawImage(var12, var4, var5, 33);
            var1.drawImage(var10, var4, var5, 33);
         }

         return;
      case 2:
         var1.drawImage(var13, var4, var5 + (this.field_byte_l % 3 == 0 ? 1 : 0), 33);
         switch(this.field_short_b) {
         case 1:
            var1.drawImage(var8, var4, var5 + 3, 33);
            break;
         case 2:
            var1.drawImage(var8, var4, var5 + 3, 33);
            var1.drawImage(var9, var4, var5 + 6, 33);
            break;
         case 3:
            var1.drawImage(var9, var4, var5 + 6, 33);
         }

         return;
      case 3:
         if (this.field_short_b < 6) {
            var1.drawImage(var13, var4, var5, 33);
         }

         switch(this.field_short_b) {
         case 6:
            var6 = var6 * 1 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var11, var4, var5, 33);
            var1.drawImage(var8, var4, var5 + 3, 33);
            var1.drawImage(var9, var4, var5 + 6, 33);
            return;
         case 7:
            var6 = var6 * 3 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var11, var4, var5, 33);
            var1.drawImage(var8, var4, var5 + 3, 33);
            return;
         case 8:
            var6 = var6 * 5 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var11, var4, var5, 33);
            return;
         case 9:
            var6 = var6 * 7 / 10;
            class_as.func_void_a(var1, var4 - 20, var5 - 50, 40, 50);
            var1.drawImage(var12, var4, var5 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            var1.drawImage(var10, var4, var5, 33);
         }
      default:
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      int var2 = (class_r.field_int_g - 80) / 2;
      boolean var3 = false;
      class_cb.func_void_a(var1, var2, 2, 80, 25, false);
      var1.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      var1.translate(var2 + 2, 4);
      boolean var4 = false;
      class_cb.func_void_a(var1, 0, 0, 80, 21, class_ce.field_class_z_c.func_array_char_a(this.field_byte_f * 8 + this.field_byte_m * 2), 0, 1, 6233919, 16777215);
      var1.setColor(0);
      var1.fillRect(3, 18, 74, 2);
      var1.translate(-(var2 + 2), -4);
      var1.setColor(16733525);
      var1.fillRect(var2 + 5, 22, 70 * (this.field_byte_k - this.field_byte_l + 1) / this.field_byte_k, 2);
   }

   // $FF: renamed from: i () void
   private final void func_void_i() {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      class_ae var4 = class_n.field_class_ae_a;
      switch(this.field_short_e) {
      case 0:
         class_bw.func_void_a((byte)16, false);
      case 5:
         func_void_a(var4, super.field_short_c, super.field_short_d, (byte)1);
         return;
      case 1:
      case 6:
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 16), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 16), (byte)1);
         return;
      case 2:
      case 7:
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 32), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 32), (byte)1);
         return;
      case 4:
      case 8:
         class_bw.func_void_a((byte)16, false);
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 48), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 48), (byte)2);
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 48 + class_u.field_array_byte_a[class_u.field_array_byte_e[this.field_byte_j]] * 16), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 48 + class_u.field_array_byte_b[class_u.field_array_byte_e[this.field_byte_j]] * 16), (byte)2);
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 48 + class_u.field_array_byte_a[class_u.field_array_byte_f[this.field_byte_j]] * 16), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 48 + class_u.field_array_byte_b[class_u.field_array_byte_f[this.field_byte_j]] * 16), (byte)2);
      case 3:
      default:
      }
   }

   // $FF: renamed from: j () void
   private final void func_void_j() {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      class_ae var4 = class_n.field_class_ae_a;
      switch(this.field_short_e) {
      case 0:
         class_bw.func_void_a((byte)17, false);
      case 4:
         func_void_a(var4, super.field_short_c, super.field_short_d, (byte)4);
         return;
      case 1:
      case 5:
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 16), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 16), (byte)4);
         return;
      case 2:
      case 6:
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 32), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 32), (byte)4);
         return;
      case 3:
      case 7:
         class_bw.func_void_a((byte)17, false);
         func_void_a(var4, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 48), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 48), (byte)4);
      default:
      }
   }

   // $FF: renamed from: a (int, int, short, byte) void
   private final void func_void_a(int var1, int var2, short var3, byte var4) {
      boolean var5 = false;
      class_ae var6 = class_n.field_class_ae_a;
      if (this.field_short_e < var3) {
         byte var7 = this.field_array_byte_j[0];
         byte var8 = this.field_array_byte_j[1];
         func_void_a(var6, (short)(var1 + 16 * var7), (short)(var2 + 16 * var8), var4);
         var7 = this.field_array_byte_j[2];
         var8 = this.field_array_byte_j[3];
         func_void_a(var6, (short)(var1 + 16 * var7), (short)(var2 + 16 * var8), var4);
      }

   }

   // $FF: renamed from: a (byte, int, int) void
   private final void func_void_a(byte var1, int var2, int var3) {
      int var4;
      if ((var4 = this.field_short_e - var2) >= 0) {
         if (var4 % var3 == 0) {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            class_ae var8 = class_n.field_class_ae_a;
            if (var4 / var3 == 0) {
               func_void_a(var8, super.field_short_c, super.field_short_d, var1);
            } else if (var4 / var3 == 1) {
               func_void_a(var8, (short)(super.field_short_c + 16), super.field_short_d, var1);
               func_void_a(var8, (short)(super.field_short_c - 16), super.field_short_d, var1);
               func_void_a(var8, super.field_short_c, (short)(super.field_short_d + 16), var1);
               func_void_a(var8, super.field_short_c, (short)(super.field_short_d - 16), var1);
            } else if (var4 / var3 == 2) {
               func_void_a(var8, (short)(super.field_short_c + 32), super.field_short_d, var1);
               func_void_a(var8, (short)(super.field_short_c - 32), super.field_short_d, var1);
               func_void_a(var8, super.field_short_c, (short)(super.field_short_d + 32), var1);
               func_void_a(var8, super.field_short_c, (short)(super.field_short_d - 32), var1);
            } else {
               if (var4 / var3 == 3) {
                  func_void_a(var8, (short)(super.field_short_c + 48), super.field_short_d, var1);
                  func_void_a(var8, (short)(super.field_short_c - 48), super.field_short_d, var1);
                  func_void_a(var8, super.field_short_c, (short)(super.field_short_d + 48), var1);
                  func_void_a(var8, super.field_short_c, (short)(super.field_short_d - 48), var1);
               }

            }
         }
      }
   }

   // $FF: renamed from: a (short) void
   private final void func_void_a(short var1) {
      if (this.field_short_e == 0) {
         class_ae var3 = class_n.field_class_ae_a;

         for(int var4 = 1; var4 <= 3; ++var4) {
            class_ck var2;
            if ((var2 = this.func_class_ck_a(this.field_byte_j, (byte)var4)) != null && var2 instanceof class_al && !(var2 instanceof class_av) && ((class_al)var2).field_class_j_a.field_byte_c == this.func_byte_a()) {
               ((class_al)var2).func_void_a(new class_bj((short)0, var1, this.field_byte_f, this.field_byte_m));
            } else {
               func_void_a(var3, (short)(super.field_short_c + class_u.field_array_byte_a[this.field_byte_j] * 16 * var4), (short)(super.field_short_d + class_u.field_array_byte_b[this.field_byte_j] * 16 * var4), (byte)10);
            }
         }
      }

   }

   // $FF: renamed from: a (ae, short, short, byte) void
   private static final void func_void_a(class_ae var0, short var1, short var2, byte var3) {
      var0.func_void_b((class_ck)(new class_y(var1, var2, var3)));
   }

   // $FF: renamed from: b (int) void
   private final void func_void_b(int var1) {
      this.field_array_byte_j[0] = (byte)(class_ck.field_class_java_util_Random_a.nextInt() % (var1 + 1));
      this.field_array_byte_j[1] = (byte)(class_ck.field_class_java_util_Random_a.nextInt() % (var1 - Math.abs(this.field_array_byte_j[0]) + 1));
      this.field_array_byte_j[2] = (byte)(class_ck.field_class_java_util_Random_a.nextInt() % (var1 + 1));
      this.field_array_byte_j[3] = (byte)(class_ck.field_class_java_util_Random_a.nextInt() % (var1 - Math.abs(this.field_array_byte_j[2]) + 1));
   }
}
