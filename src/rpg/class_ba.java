package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ba
public final class class_ba extends class_av {
   // $FF: renamed from: v byte
   private byte field_byte_v;

   public class_ba(class_ae var1, byte var2, byte var3, byte var4, byte var5) {
      super(var2, (byte)(var3 + 5), var4, var5, (byte)2);
      var1.field_array_array_class_ck_a[var3 + 5][var2] = null;
      var1.field_array_array_class_ck_a[var3 + 5][var2 + 1] = null;
      super.field_class_j_a.field_byte_h = 2;
      this.field_byte_v = 0;
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      ++super.field_byte_k;
      ++this.field_byte_v;
      if (this.field_byte_v > 100) {
         super.field_class_j_a.field_byte_h = 0;
      }

      this.func_void_n();
      if (super.field_byte_h == 2) {
         switch(super.field_byte_i) {
         case 1:
            super.field_short_d = (short)(super.field_short_d - 8);
            break;
         case 2:
            super.field_short_d = (short)(super.field_short_d + 8);
         }

         this.func_void_b();
      }

      this.func_void_o();
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      byte var4 = super.field_byte_j;
      super.field_byte_j = 1;
      var3 -= 80;
      super.func_void_a(var1, var2, var3);
      super.field_byte_j = var4;
   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      class_ao var1;
      int var2 = (var1 = class_n.func_class_ao_a()).field_byte_b - (super.field_byte_b - 5 + 3);
      if (super.field_byte_p == 0 && var2 >= -2 && var2 <= 3 && var1.field_byte_a <= super.field_byte_a + 5) {
         this.func_void_q();
      } else {
         if (super.field_byte_o == 0) {
            if (var2 > 3) {
               this.func_void_a((byte)2);
               this.func_void_b((byte)2);
               return;
            }

            if (var2 < -2) {
               this.func_void_a((byte)2);
               this.func_void_b((byte)1);
               return;
            }

            this.func_void_a((byte)1);
            this.func_void_b((byte)2);
         }

      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      class_ao var1 = class_n.func_class_ao_a();
      if (super.field_byte_k == 6) {
         class_n.field_class_ae_a.field_int_e = 2;
         class_n.field_class_ae_a.field_int_f = 3;
      } else if (super.field_byte_k == 7) {
         class_n.field_class_ae_a.field_int_e = -3;
         class_n.field_class_ae_a.field_int_f = -1;
      } else if (super.field_byte_k == 8) {
         class_n.field_class_ae_a.field_int_e = 2;
         class_n.field_class_ae_a.field_int_f = -3;
      }

      if (super.field_byte_k == 5) {
         byte var2 = (byte)(super.field_byte_a + 2);
         byte var3 = (byte)(super.field_byte_a + 5);
         byte var4 = (byte)(super.field_byte_b - 5 + 1);
         byte var5 = (byte)(super.field_byte_b - 5 + 6);
         if (var1.field_byte_a >= var2 && var1.field_byte_a <= var3 && var1.field_byte_b >= var4 && var1.field_byte_b <= var5) {
            var1.func_void_a(this, (byte)2);
            this.field_byte_v = 0;
            super.field_class_j_a.field_byte_h = 2;
         }
      }

   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 0;
   }
}
