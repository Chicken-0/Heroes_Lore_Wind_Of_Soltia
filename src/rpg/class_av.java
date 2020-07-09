package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: av
public abstract class class_av extends class_al {
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: g byte
   public byte field_byte_g;

   public class_av(byte var1, byte var2, byte var3, byte var4, byte var5) {
      super((short)(var1 << 4), (short)(var2 << 4), var3, var4);
      super.field_byte_e = var5;
      this.func_void_g();
   }

   // $FF: renamed from: d () void
   public void func_void_d() {
      ++super.field_byte_k;
      class_ao var1 = class_n.func_class_ao_a();
      this.field_byte_f = this.func_byte_a(var1);
      this.field_byte_g = this.func_byte_b(var1);
      this.func_void_n();
      this.func_void_e();
      this.func_void_o();
   }

   // $FF: renamed from: m () void
   public abstract void func_void_m();

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c + (super.field_byte_e - 1) * 8;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      boolean var6 = false;
      int var7;
      switch(super.field_byte_h) {
      case 2:
         var7 = super.field_byte_n * 16 + 4 + (super.field_byte_j - 1);
         break;
      case 3:
         var7 = super.field_byte_n * 16 + 12 + (super.field_byte_j - 1);
         break;
      case 4:
      default:
         var7 = super.field_byte_n * 16 + 0 + (super.field_byte_j - 1);
         break;
      case 5:
         var7 = super.field_byte_n * 16 + 8 + (super.field_byte_j - 1);
      }

      if (class_ce.field_array_class_java_lang_Object_h[var7] == null) {
         var7 = super.field_byte_n * 16 + 0 + (super.field_byte_j - 1);
      }

      class_as.func_void_b(var1, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[var7]), super.field_byte_k, var4, var5);
      this.func_void_c(var1, var4, var5 - super.field_class_j_a.field_byte_a * 3);
      this.func_void_b(var1, var4, var5);
   }

   // $FF: renamed from: a (int, byte) void
   public final void func_void_a(int var1, byte var2) {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         if (var1 < 0) {
            var1 = 0;
         }

         var1 = var1 * class_u.field_array_array_byte_a[var2][super.field_class_j_a.field_byte_c] / 10;
         super.field_short_a = (short)(super.field_short_a - var1);
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)7, (short)4, (short)var1));
         super.field_class_java_util_Vector_a.addElement(new class_aw((byte)1));
         if (super.field_short_a <= 0) {
            this.func_void_a((byte)5);
            super.field_byte_k = 0;
            this.func_void_m();
         }

      }
   }

   // $FF: renamed from: a (int, boolean, byte, boolean, byte, byte, ao) void
   public final void func_void_a(int var1, boolean var2, byte var3, boolean var4, byte var5, byte var6, class_ao var7) {
      if (super.field_byte_h != 6 && super.field_byte_h != 5) {
         class_bs.field_class_as_a.func_void_a(this, false);
         class_l var8 = (class_l)var7.func_class_ad_a(0);
         byte var9 = var7.func_class_p_a().func_byte_a();
         if ((var1 -= super.field_class_j_a.field_short_c) < 0) {
            var1 = 0;
         }

         var1 = var1 * class_u.field_array_array_byte_a[var9][super.field_class_j_a.field_byte_c] / 10;
         if (var4) {
            var1 += var1 * var8.field_byte_b / 10;
         }

         boolean var10;
         if (!(var10 = class_h.func_int_a(0, 99) < (super.field_class_j_a.field_short_d - (var7.field_short_f + var7.field_byte_o) - var8.field_byte_e / 5 + 10) * 2)) {
            switch(var6) {
            case 3:
               var7.func_void_d(var1 * 30 / 100);
               break;
            case 4:
               var7.func_void_b(var1 / 2);
               break;
            case 8:
               var1 *= 2;
            }

            super.field_class_java_util_Vector_a.addElement(new class_aw(var5));
            this.func_void_b(var1);
            if (super.field_short_a <= 0) {
               this.func_void_m();
            }
         } else {
            super.field_class_java_util_Vector_a.addElement(new class_aw((byte)2));
         }

         if (var10) {
            class_bw.func_void_a((byte)14, false);
         } else if (var4) {
            class_bw.func_void_a((byte)15, false);
         } else {
            class_bw.func_void_a((byte)13, false);
         }
      }
   }

   // $FF: renamed from: l () void
   public void func_void_l() {
      class_n.field_class_ae_a.func_void_a((class_ck)this);
   }
}
