package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ak
public final class class_ak extends class_av {
   // $FF: renamed from: v byte
   private byte field_byte_v;
   // $FF: renamed from: w byte
   private byte field_byte_w = 2;

   public class_ak(class_ae var1, byte var2, byte var3, byte var4, byte var5) {
      super(var2, (byte)(var3 + 4), var4, var5, (byte)1);
      var1.field_array_array_class_ck_a[var3 + 4][var2] = null;
      var1.field_array_array_class_ck_a[var3 + 4][var2 + 1] = null;
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

      if (super.field_byte_h == 3) {
         byte[] var1 = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_h[super.field_byte_n * 16 + 12 + (super.field_byte_j - 1)]);
         if (super.field_byte_k >= var1[0]) {
            this.func_void_a(false);
            this.func_void_i();
         }
      } else {
         this.func_void_n();
      }

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
      if (super.field_byte_h != 3) {
         super.field_byte_j = 1;
      }

      var3 -= 64;
      super.func_void_a(var1, var2, var3);
      super.field_byte_j = var4;
   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      class_ao var1;
      int var2 = (var1 = class_n.func_class_ao_a()).field_byte_b - (super.field_byte_b - 4 + 2);
      if (super.field_byte_p == 0 && var2 >= -1 && var2 <= 2 && var1.field_byte_a >= super.field_byte_a - 7) {
         this.func_void_q();
         this.field_byte_w = class_u.field_array_byte_g[this.field_byte_w];
         this.func_void_b(this.field_byte_w);
      } else {
         if (super.field_byte_o == 0) {
            if (var2 > 2) {
               this.func_void_a((byte)2);
               this.func_void_b((byte)2);
               return;
            }

            if (var2 < -1) {
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
      byte var2;
      byte var3;
      byte var4;
      byte var5;
      if (super.field_byte_k == 5 && this.field_byte_w == 1) {
         var2 = (byte)(super.field_byte_a - 7);
         var3 = (byte)(super.field_byte_a - 1);
         var4 = (byte)(super.field_byte_b - 4 + 1);
         var5 = (byte)(super.field_byte_b - 4 + 4);
         if (var1.field_byte_a >= var2 && var1.field_byte_a <= var3 && var1.field_byte_b >= var4 && var1.field_byte_b <= var5) {
            var1.func_void_a(this, (byte)3);
         }

      } else {
         if (super.field_byte_k == 8 && this.field_byte_w == 2) {
            var2 = (byte)(super.field_byte_a - 5);
            var3 = (byte)(super.field_byte_a - 1);
            var4 = (byte)(super.field_byte_b - 4 + 1);
            var5 = (byte)(super.field_byte_b - 4 + 4);
            if (var1.field_byte_a >= var2 && var1.field_byte_a <= var3 && var1.field_byte_b >= var4 && var1.field_byte_b <= var5) {
               var1.func_void_a(this, (byte)2);
               this.field_byte_v = 0;
               super.field_class_j_a.field_byte_h = 2;
            }
         }

      }
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 0;
   }
}
