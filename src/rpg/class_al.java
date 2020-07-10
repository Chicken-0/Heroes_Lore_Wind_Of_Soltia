package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: al
public class class_al extends class_o {
   // $FF: renamed from: m byte
   public byte field_byte_m;
   // $FF: renamed from: n byte
   public byte field_byte_n;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: b int
   private int field_int_b;
   // $FF: renamed from: a j
   public class_j field_class_j_a;
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: r byte
   private byte field_byte_r = 0;
   // $FF: renamed from: o byte
   public byte field_byte_o = 0;
   // $FF: renamed from: p byte
   public byte field_byte_p = 0;
   // $FF: renamed from: q byte
   public byte field_byte_q = 0;
   // $FF: renamed from: s byte
   private byte field_byte_s = 0;
   // $FF: renamed from: t byte
   private byte field_byte_t = 0;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d;
   // $FF: renamed from: e boolean
   private boolean field_boolean_e;
   // $FF: renamed from: b boolean[]
   private boolean[] field_array_boolean_b;
   // $FF: renamed from: c ck
   private class_ck field_class_ck_c;
   // $FF: renamed from: u byte
   private byte field_byte_u;
   // $FF: renamed from: f boolean
   private boolean field_boolean_f;

   public class_al(short var1, short var2, byte var3, byte var4) {
      super(var1, var2, (byte)8, (byte)8);
      this.field_int_a = super.field_byte_a;
      this.field_int_b = super.field_byte_b;
      this.field_byte_m = var3;
      this.field_byte_n = var4;
      this.field_class_j_a = class_j.field_array_class_j_a[var4];
      this.field_short_a = this.field_class_j_a.field_short_a;
      this.field_byte_o = this.field_class_j_a.field_byte_h;
      this.field_byte_p = this.field_class_j_a.field_byte_i;
      this.field_byte_u = -10;
      this.field_array_boolean_b = new boolean[5];
      this.field_boolean_d = false;
      if (this.field_class_j_a.field_boolean_d) {
         this.field_boolean_e = true;
      }

      super.field_byte_e = (byte)(this.field_class_j_a.field_byte_a == 2 ? 2 : 1);
      this.func_void_a(var1, var2);
      this.field_boolean_f = true;
   }

   // $FF: renamed from: a (short, short) void
   public final void func_void_a(short var1, short var2) {
      this.func_void_f();
      super.func_void_a(var1, var2);
      this.func_void_b();
      this.func_void_g();
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c + (super.field_byte_e - 1) * 8;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      if (var4 + 16 >= 0 && var5 >= 0 && var4 - 16 <= class_as.field_int_a && var5 <= class_as.field_int_b + 32) {
         this.field_boolean_f = true;
         if (!this.field_boolean_e) {
            int var6 = var4;
            int var7 = var5;
            if (this.field_byte_s == 3 || this.field_byte_s == 1) {
               var7 = var5 + class_u.field_array_byte_b[this.field_byte_t] * 3;
               var6 = var4 + class_u.field_array_byte_a[this.field_byte_t] * 3;
            }

            if (this.field_byte_m != 22 && this.field_byte_m != 16 && !(this instanceof class_av) || this instanceof class_cc) {
               if (super.field_byte_e == 1) {
                  var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_u, var6, var7 - 3, 17);
               } else {
                  var1.setColor(2047807);
                  var1.fillArc(var6 - 11, var7 - 6, 22, 9, 0, 360);
               }
            }

            boolean var8 = false;
            int var9;
            switch(super.field_byte_h) {
            case 2:
               var9 = this.field_byte_n * 12 + 4 + (super.field_byte_j - 1);
               break;
            case 3:
               var9 = this.field_byte_n * 12 + 8 + (super.field_byte_j - 1);
               break;
            default:
               var9 = this.field_byte_n * 12 + 0 + (super.field_byte_j - 1);
            }

            class_as.func_void_b(var1, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_e[var9]), super.field_byte_k, var6, var7);
            this.func_void_c(var1, var4, var5 - this.field_class_j_a.field_byte_a * 3);
            this.func_void_b(var1, var4, var5);
         }
      } else {
         this.func_void_b(var1, var4, var5);
         this.field_boolean_f = false;
      }
   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      super.field_byte_h = var1;
   }

   // $FF: renamed from: d () void
   public void func_void_d() {
      ++super.field_byte_k;
      this.func_void_s();
      if (!this.field_boolean_f) {
         class_ao var1 = class_n.func_class_ao_a();
         byte var2 = this.func_byte_a(var1);
         byte var3 = this.func_byte_b(var1);
         if ((var2 > this.field_class_j_a.field_byte_g || var3 > this.field_class_j_a.field_byte_g) && this.field_class_ck_c == null) {
            return;
         }
      }

      if (this.field_byte_s > 0) {
         --this.field_byte_s;
      }

      this.func_void_n();
      this.func_void_e();
      this.func_void_o();
   }

   // $FF: renamed from: s () void
   private final void func_void_s() {
      for(int var2 = super.field_class_java_util_Vector_b.size() - 1; var2 >= 0; --var2) {
         class_cf var1;
         (var1 = (class_cf)super.field_class_java_util_Vector_b.elementAt(var2)).func_void_a();
         if (var1.field_byte_a == 3 && var1.func_short_a() % 8 == 0) {
            this.func_void_b(class_h.func_int_a(15, 25));
         }

         if (var1.field_boolean_a) {
            super.field_class_java_util_Vector_b.removeElementAt(var2);
            this.field_array_boolean_b[var1.field_byte_a] = false;
         }
      }

   }

   // $FF: renamed from: n () void
   public void func_void_n() {
      boolean var1 = !super.field_boolean_a && !super.field_boolean_b;
      if (super.field_byte_h == 5) {
         if (this.field_byte_q < 1) {
            this.func_void_l();
         } else {
            --this.field_byte_q;
         }
      } else if (!this.field_array_boolean_b[0] && !this.field_array_boolean_b[2]) {
         switch(super.field_byte_h) {
         case 1:
            this.func_void_i();
            return;
         case 2:
            if (var1) {
               this.func_void_h();
               return;
            }
            break;
         case 3:
            if (super.field_byte_k >= this.field_class_j_a.field_byte_l) {
               this.func_void_a(false);
               this.func_void_i();
               return;
            }
            break;
         case 4:
            if (super.field_byte_l < 1) {
               this.func_void_a((byte)1);
            }

            --super.field_byte_l;
         }

      } else {
         this.func_void_a(false);
      }
   }

   // $FF: renamed from: h () void
   public void func_void_h() {
      if (this.field_byte_r < this.field_class_j_a.field_byte_h * 2 && class_ck.field_class_java_util_Random_a.nextInt() > 0) {
         this.field_byte_r += this.field_class_j_a.field_byte_h;
         this.field_byte_o = 0;
         this.func_void_i();
      } else {
         this.func_void_a(false);
         this.func_void_i();
      }
   }

   // $FF: renamed from: i () void
   public void func_void_i() {
      class_ao var1;
      class_p var2 = (var1 = class_n.func_class_ao_a()).func_class_p_a();
      if (this.field_byte_p == 0) {
         if ((this.field_class_j_a.field_byte_d == 0 || this.field_class_j_a.field_byte_d == 1) && this.func_class_ck_a(super.field_byte_i, var1) == var1) {
            this.func_void_q();
            return;
         }

         if (this.field_class_j_a.field_byte_d == 2 || this.field_class_j_a.field_byte_d == 3) {
            for(byte var3 = 1; var3 <= 3; ++var3) {
               if (this.func_class_ck_a(super.field_byte_i, var3) == var1) {
                  this.func_void_q();
                  return;
               }
            }
         }
      }

      if (this.field_byte_o == 0) {
         byte var5 = 1;
         if (this.field_class_j_a.field_byte_d == 2 || this.field_class_j_a.field_byte_d == 3) {
            var5 = 3;
         }

         if (this.field_class_ck_c == var2 && var2.field_byte_i == 2) {
            this.func_void_a(var2, var5);
         } else if (this.field_class_ck_c == var1 && !var2.func_boolean_a()) {
            this.func_void_a(var1, var5);
         } else {
            class_ck var4;
            if ((var4 = this.func_class_ck_a(var1, var2)) != null) {
               this.func_void_a(var4, var5);
               this.field_class_ck_c = var4;
            } else {
               this.func_void_r();
            }
         }
      }
   }

   // $FF: renamed from: o () void
   public void func_void_o() {
      if (this.field_class_j_a.field_boolean_c && this.field_boolean_d) {
         if (this.field_byte_u > 0) {
            --this.field_byte_u;
         }

         if (this.field_byte_u == 0) {
            class_n.field_class_ae_a.func_boolean_a(super.field_byte_a, super.field_byte_b, this.field_byte_m, this.field_byte_n, true, (byte)1, (byte)5);
            this.field_byte_u = -10;
         }
      }

      switch(super.field_byte_h) {
      case 2:
         if (super.field_byte_k >= this.field_class_j_a.field_byte_k) {
            super.field_byte_k = 0;
            return;
         }
         break;
      case 3:
         this.func_void_j();
         return;
      case 4:
      default:
         if (super.field_byte_k >= this.field_class_j_a.field_byte_j) {
            super.field_byte_k = 0;
         }

         if (this.field_byte_p > 0) {
            --this.field_byte_p;
         }

         if (this.field_byte_o > 0) {
            --this.field_byte_o;
         }
         break;
      case 5:
         this.func_void_k();
         return;
      }

   }

   // $FF: renamed from: j () void
   public void func_void_j() {
      class_ao var1 = class_n.func_class_ao_a();
      this.field_boolean_e = false;
      if (super.field_byte_k == class_j.field_array_byte_a[this.field_byte_m] - 1) {
         if ((this.field_class_j_a.field_byte_d == 0 || this.field_class_j_a.field_byte_d == 1) && this.func_class_ck_a(super.field_byte_i, var1) == var1) {
            var1.func_void_a(this, super.field_byte_i);
            return;
         }

         byte var2;
         if (this.field_class_j_a.field_byte_d == 2) {
            for(var2 = 1; var2 <= 3; ++var2) {
               if (this.func_class_ck_a(super.field_byte_i, var2) == var1) {
                  var1.func_void_a(new class_aw((byte)9, (short)-1, (short)this.field_byte_n));
                  var1.func_void_a(this, super.field_byte_i);
                  break;
               }
            }

            return;
         }

         if (this.field_class_j_a.field_byte_d == 3) {
            for(var2 = 1; var2 <= 3; ++var2) {
               if (this.func_class_ck_a(super.field_byte_i, var2) == var1) {
                  class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + class_u.field_array_byte_a[super.field_byte_j]), (byte)(super.field_byte_b + class_u.field_array_byte_b[super.field_byte_j]), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[this.field_byte_n]), this, super.field_byte_j, (byte)3, (byte)2)));
                  return;
               }
            }
         }
      }

   }

   // $FF: renamed from: k () void
   public void func_void_k() {
      if (super.field_byte_k >= this.field_class_j_a.field_byte_j) {
         super.field_byte_k = 0;
      }

   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      class_n.field_class_ae_a.func_void_b((class_ck)(new class_y(var1, var2, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[this.field_byte_n]))));
   }

   // $FF: renamed from: p () void
   public final void func_void_p() {
      class_n.field_class_ae_a.func_void_b((class_ck)(new class_y(super.field_byte_a, super.field_byte_b, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_g[this.field_class_j_a.field_byte_a]))));
   }

   // $FF: renamed from: a (boolean) void
   public final void func_void_a(boolean var1) {
      this.field_byte_o = (byte)(this.field_class_j_a.field_byte_h + this.field_byte_r);
      this.field_byte_r = 0;
      if (this.field_array_boolean_b[1]) {
         this.field_byte_p = (byte)(this.field_class_j_a.field_byte_i * 2 + 1);
      } else {
         this.field_byte_p = (byte)(this.field_class_j_a.field_byte_i + 1);
      }

      if (var1) {
         this.field_byte_p = (byte)(this.field_byte_p * class_h.func_int_a(1, 7) / 10);
      }

      this.func_void_a((byte)1);
      super.field_byte_k = 0;
   }

   // $FF: renamed from: q () void
   public final void func_void_q() {
      this.field_boolean_e = false;
      this.field_byte_o = (byte)(this.field_class_j_a.field_byte_h + this.field_byte_r);
      this.field_byte_r = 0;
      if (this.field_array_boolean_b[1]) {
         this.field_byte_p = (byte)(this.field_class_j_a.field_byte_i * 2 + 1);
      } else {
         this.field_byte_p = (byte)(this.field_class_j_a.field_byte_i + 1);
      }

      this.func_void_a((byte)3);
      super.field_byte_k = 0;
   }

   // $FF: renamed from: r () void
   public final void func_void_r() {
      if (class_ck.field_class_java_util_Random_a.nextInt() > 0) {
         this.func_void_a((byte)2);
      } else {
         this.func_void_a(true);
      }

      this.func_void_b((byte)((class_ck.field_class_java_util_Random_a.nextInt() & 255) % 4 + 1));
   }

   // $FF: renamed from: l () void
   public void func_void_l() {
      this.func_void_a((byte)6);
      if (this.field_class_j_a.field_byte_b != 2) {
         class_n.field_class_ae_a.func_void_a((int)this.field_byte_m, (int)this.field_class_j_a.field_short_e, (int)this.field_int_a, (int)this.field_int_b);
      }

      int var1 = class_h.func_int_a(1, 150);
      int var2 = this.field_class_j_a.field_array_byte_b.length / 3;
      byte var3 = -1;
      byte var4 = -1;

      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         if ((var1 -= this.field_class_j_a.field_array_byte_b[var5 * 3 + 2]) <= 0) {
            if (this.field_class_j_a.field_array_byte_b[var5 * 3 + 2] != 1) {
               var3 = this.field_class_j_a.field_array_byte_b[var5 * 3];
               var4 = this.field_class_j_a.field_array_byte_b[var5 * 3 + 1];
               break;
            }

            if (class_h.func_int_a(1, 100) <= 20) {
               var3 = this.field_class_j_a.field_array_byte_b[var5 * 3];
               var4 = this.field_class_j_a.field_array_byte_b[var5 * 3 + 1];
               break;
            }
         }
      }

      if (var3 != -1) {
         class_n.field_class_ae_a.func_void_a(super.field_byte_a, super.field_byte_b, var3, var4);
      }

      if (class_h.func_int_a(1, 100) <= 60) {
         class_n.field_class_ae_a.func_void_a(super.field_byte_a, super.field_byte_b, (short)(this.field_class_j_a.field_byte_f * 3));
      }

      if (class_h.func_int_a(1, 100) <= 20 + (this.field_class_j_a.field_byte_f - class_n.func_class_ao_a().field_byte_g)) {
         class_n.field_class_ae_a.func_void_a((byte)super.field_byte_a, (byte)super.field_byte_b, (byte)11, (byte)0);
      }

      if ((var5 = 20 - (class_n.func_class_ao_a().field_byte_g - this.field_class_j_a.field_byte_f)) > 26) {
         var5 = 26;
      }

      int var6;
      if ((var6 = this.field_class_j_a.field_byte_f * var5 / 2) > 0) {
         class_n.func_class_ao_a().func_void_f(var6);
      }

      this.func_void_p();
   }

   // $FF: renamed from: a (ck) byte
   public final byte func_byte_a(class_ck var1) {
      int var2;
      return (var2 = var1.field_byte_a - super.field_byte_a) > 0 ? (byte)var2 : (byte)(-var2);
   }

   // $FF: renamed from: b (ck) byte
   public final byte func_byte_b(class_ck var1) {
      int var2;
      return (var2 = var1.field_byte_b - super.field_byte_b) > 0 ? (byte)var2 : (byte)(-var2);
   }

   // $FF: renamed from: a (int, byte) void
   public void func_void_a(int var1, byte var2) {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         this.func_void_t();
         this.field_boolean_d = true;
         this.field_boolean_e = false;
         if (var1 < 0) {
            var1 = 0;
         }

         var1 = var1 * class_u.field_array_array_byte_a[var2][this.field_class_j_a.field_byte_c] / 10;
         this.field_short_a = (short)(this.field_short_a - var1);
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)7, (short)4, (short)var1));
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)1));
         this.field_byte_s = 4;
         this.field_byte_t = 4;
         if (this.field_short_a <= 0) {
            this.func_void_a((byte)5);
            super.field_byte_k = 0;
            this.field_byte_q = 3;
         }

      }
   }

   // $FF: renamed from: a (int, boolean, byte, boolean, byte, byte, ao) void
   public void func_void_a(int var1, boolean var2, byte var3, boolean var4, byte var5, byte var6, class_ao var7) {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         class_bs.field_class_as_a.func_void_a(this, false);
         class_l var8 = (class_l)var7.func_class_ad_a(0);
         byte var9 = var7.func_class_p_a().func_byte_a();
         if (!this.field_boolean_d && this.field_class_j_a.field_boolean_c && var9 != this.field_class_j_a.field_byte_e) {
            this.field_byte_u = 40;
         }

         this.func_void_t();
         this.field_boolean_d = true;
         this.field_boolean_e = false;
         if (this.field_class_j_a.field_boolean_b) {
            var1 /= 2;
         }

         if (this.field_array_boolean_b[4]) {
            var1 -= this.field_class_j_a.field_short_c / 2;
         } else {
            var1 -= this.field_class_j_a.field_short_c;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         var1 = var1 * class_u.field_array_array_byte_a[var9][this.field_class_j_a.field_byte_c] / 10;
         if (var4) {
            var1 += var1 * var8.field_byte_b / 10;
         }

         int var10 = (var10 = this.field_class_j_a.field_short_d - (var7.field_short_f + var7.field_byte_o) - var8.field_byte_e / 5 + 10) > 50 ? 50 : var10;
         boolean var11 = class_h.func_int_a(0, 99) < var10;
         byte var12 = var6 == -1 ? -1 : class_t.field_array_byte_h[var6];
         if (!var11) {
            switch(var6) {
            case 2:
               var1 = this.field_class_j_a.field_short_a;
               break;
            case 3:
               var7.func_void_d(var1 * 80 / 100);
               break;
            case 4:
               var7.func_void_b(var1 / 2);
            case 5:
            case 6:
            case 7:
            default:
               break;
            case 8:
               var1 *= 2;
            }

            if (var12 != -1) {
               this.func_boolean_a(var12);
               this.field_array_boolean_b[var12] = true;
            }

            super.field_class_java_util_Vector_a.addElement(new class_aw(var5));
            if (var2 && this.field_short_a > 0 && !super.field_boolean_a && !super.field_boolean_b) {
               this.func_void_a((byte)4);
               super.field_byte_l = 2;
               super.field_byte_i = var3;
            }

            this.field_byte_s = 4;
            this.field_byte_t = var3;
            this.func_void_b(var1);
         } else {
            super.field_class_java_util_Vector_a.addElement(new class_aw((byte)2));
         }

         if (var11) {
            SoundPlayerManager.startPlayer3((byte)14, false);
         } else if (var4) {
            SoundPlayerManager.startPlayer3((byte)15, false);
         } else {
            SoundPlayerManager.startPlayer3((byte)13, false);
         }
      }
   }

   // $FF: renamed from: t () void
   private final void func_void_t() {
      if (this.field_array_boolean_b[0]) {
         this.field_array_boolean_b[0] = false;

         for(int var2 = 0; var2 < super.field_class_java_util_Vector_b.size(); ++var2) {
            if (((class_cf)super.field_class_java_util_Vector_b.elementAt(var2)).field_byte_a == 0) {
               super.field_class_java_util_Vector_b.removeElementAt(var2);
               return;
            }
         }
      }

   }

   // $FF: renamed from: b (int) void
   public final void func_void_b(int var1) {
      this.field_short_a = (short)(this.field_short_a - var1);
      super.field_class_java_util_Vector_a.addElement(new class_aw((byte)7, (short)4, (short)var1));
      if (this.field_short_a <= 0) {
         this.func_void_a((byte)5);
         super.field_byte_k = -1;
         this.field_byte_q = 3;
      }

   }

   // $FF: renamed from: c (int) void
   public final void func_void_c(int var1) {
      this.field_short_a = (short)(this.field_short_a + var1);
      if (this.field_short_a > this.field_class_j_a.field_short_a) {
         this.field_short_a = this.field_class_j_a.field_short_a;
      }

   }

   // $FF: renamed from: c (byte) void
   public final void func_void_c(byte var1) {
      this.field_boolean_e = false;
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         this.func_void_b(this.field_class_j_a.field_short_a);
      }
   }

   // $FF: renamed from: a (ao, p) ck
   private final class_ck func_class_ck_a(class_ao var1, class_p var2) {
      byte var3 = this.func_byte_a(var2);
      byte var4 = this.func_byte_b(var2);
      byte var5 = this.field_boolean_d ? (byte)(this.field_class_j_a.field_boolean_a ? 100 : 8) : this.field_class_j_a.field_byte_g;
      boolean var6 = this.func_byte_a(var1) <= var5 && this.func_byte_b(var1) <= var5;
      if (var3 <= var5 && var4 <= var5 && var2.field_byte_i == 2 && class_h.func_int_a(0, 9) < 7) {
         return var2;
      } else {
         return var6 ? var1 : null;
      }
   }
}
