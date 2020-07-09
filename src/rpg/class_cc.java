package rpg;

// $FF: renamed from: cc
public final class class_cc extends class_av {
   // $FF: renamed from: h byte[]
   private static final byte[] field_array_byte_h = new byte[]{1, 1, 2, 3, 2, 3};
   // $FF: renamed from: i byte[]
   private static final byte[] field_array_byte_i = new byte[]{2, 2, 12, 24, 12, 24};
   // $FF: renamed from: v byte
   private byte field_byte_v = 0;
   // $FF: renamed from: w byte
   private byte field_byte_w;
   // $FF: renamed from: x byte
   private byte field_byte_x;

   public class_cc(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4, (byte)1);
      this.func_void_d(field_array_byte_h[this.field_byte_v]);
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      ++super.field_byte_k;
      class_ao var1 = class_n.func_class_ao_a();
      super.field_byte_f = this.func_byte_a(var1);
      super.field_byte_g = this.func_byte_b(var1);
      this.func_void_n();
      this.func_void_o();
   }

   // $FF: renamed from: n () void
   public final void func_void_n() {
      switch(super.field_byte_h) {
      case 1:
         this.func_void_i();
         return;
      case 2:
         if (super.field_byte_k >= super.field_class_j_a.field_byte_k) {
            this.func_void_a(false);
            this.func_void_i();
            return;
         }
         break;
      case 3:
         if (super.field_byte_k >= this.field_byte_x) {
            this.func_void_a(false);
            ++this.field_byte_v;
            if (this.field_byte_v >= field_array_byte_h.length) {
               this.field_byte_v = 0;
            }

            this.func_void_d(field_array_byte_h[this.field_byte_v]);
            super.field_byte_p = field_array_byte_i[this.field_byte_v];
            super.field_byte_o = field_array_byte_i[this.field_byte_v];
            this.func_void_i();
            return;
         }
         break;
      case 4:
         if (super.field_byte_l < 1) {
            this.func_void_a((byte)1);
         }

         --super.field_byte_l;
         return;
      case 5:
         if (super.field_byte_q < 1) {
            this.func_void_l();
         }

         --super.field_byte_q;
      }

   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      if (super.field_byte_p == 0) {
         switch(this.field_byte_w) {
         case 1:
            if (super.field_byte_f < 4 && super.field_byte_g < 4) {
               this.func_void_q();
               return;
            }
            break;
         case 2:
            if (super.field_byte_f * super.field_byte_g == 0 && super.field_byte_f < 4 && super.field_byte_g < 4) {
               this.func_void_q();
               return;
            }
            break;
         case 3:
            this.func_void_q();
            return;
         }
      }

      if (super.field_byte_o == 0) {
         switch(this.field_byte_w) {
         case 1:
            if (super.field_byte_f < 4 && super.field_byte_g < 4) {
               break;
            }

            this.func_void_a((byte)2);
            super.field_byte_k = 0;
            return;
         case 2:
            if (super.field_byte_f * super.field_byte_g != 0 || super.field_byte_f >= 4 || super.field_byte_g >= 4) {
               this.func_void_a((byte)2);
               super.field_byte_k = 0;
               return;
            }
            break;
         case 3:
            if (super.field_byte_f >= 3 || super.field_byte_g >= 3) {
               this.func_void_a((byte)2);
               super.field_byte_k = 0;
            }
         }
      }

   }

   // $FF: renamed from: o () void
   public final void func_void_o() {
      switch(super.field_byte_h) {
      case 2:
         if (super.field_byte_k == 5) {
            class_ae var1 = class_n.field_class_ae_a;
            class_ao var2 = class_n.func_class_ao_a();
            byte var3 = -1;
            byte var4 = -1;

            byte var5;
            for(var5 = 3; var5 > 0 && !var1.func_boolean_a((int)var3, (int)var4); --var5) {
               if (var2.field_byte_a > super.field_byte_a) {
                  var3 = (byte)class_h.func_int_a(super.field_byte_a, var2.field_byte_a + 1);
               } else {
                  var3 = (byte)class_h.func_int_a(var2.field_byte_a - 1, super.field_byte_a);
               }

               if (var2.field_byte_b > super.field_byte_b) {
                  var4 = (byte)class_h.func_int_a(super.field_byte_b, var2.field_byte_b + 1);
               } else {
                  var4 = (byte)class_h.func_int_a(var2.field_byte_b - 1, super.field_byte_b);
               }
            }

            if (var5 > 0) {
               this.func_void_a((short)(var3 << 4), (short)(var4 << 4));
            }

            return;
         }
         break;
      case 3:
         this.func_void_j();
         return;
      case 4:
      default:
         if (super.field_byte_k >= super.field_class_j_a.field_byte_j) {
            super.field_byte_k = 0;
         }

         if (super.field_byte_p > 0) {
            --super.field_byte_p;
         }

         if (super.field_byte_o > 0) {
            --super.field_byte_o;
         }
         break;
      case 5:
         this.func_void_k();
         return;
      }

   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      class_ao var1 = class_n.func_class_ao_a();
      switch(this.field_byte_w) {
      case 1:
         if (super.field_byte_k == 7) {
            class_ae var4 = class_n.field_class_ae_a;

            for(byte var3 = 1; var3 <= 4; ++var3) {
               if (var4.func_boolean_a(this, var1.field_byte_a + class_u.field_array_byte_a[var3], var1.field_byte_b + class_u.field_array_byte_b[var3])) {
                  this.func_void_a((short)(var1.field_byte_a + class_u.field_array_byte_a[var3] << 4), (short)(var1.field_byte_b + class_u.field_array_byte_b[var3] << 4));
                  break;
               }
            }
         }

         if (super.field_byte_k == 11 && super.field_byte_f + super.field_byte_g <= 1) {
            var1.func_void_a(this, super.field_byte_i);
            return;
         }
         break;
      case 2:
         if (super.field_byte_k == 7) {
            for(byte var2 = 1; var2 <= 4; ++var2) {
               class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + class_u.field_array_byte_a[var2]), (byte)(super.field_byte_b + class_u.field_array_byte_b[var2]), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, var2, (byte)3, (byte)2)));
            }

            return;
         }
         break;
      case 3:
         if (super.field_byte_k == 4 && super.field_byte_f <= 2 && super.field_byte_g <= 2) {
            var1.func_void_a((class_al)this, (short)((short)(super.field_class_j_a.field_short_b * 2)), (byte)super.field_byte_i);
         }
      }

   }

   // $FF: renamed from: k () void
   public final void func_void_k() {
      if (super.field_byte_q > 8) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_y((byte)(super.field_byte_a + class_h.func_int_a(-1, 1)), (byte)(super.field_byte_b + class_h.func_int_a(0, 3)), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]))));
      }

   }

   // $FF: renamed from: d (byte) void
   private final void func_void_d(byte var1) {
      this.field_byte_w = var1;
      int var2 = (var1 - 1) * 4;

      for(int var3 = 0; var3 < 4; ++var3) {
         class_ce.field_array_class_java_lang_Object_h[super.field_byte_n * 16 + 12 + var3] = class_ce.field_array_class_java_lang_Object_i[var2 + var3];
      }

      byte[] var4 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[super.field_byte_n * 16 + 12]);
      this.field_byte_x = var4[0];
   }

   // $FF: renamed from: l () void
   public final void func_void_l() {
      super.func_void_l();
      class_ah.func_void_a((byte)1);
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 24;
   }
}
